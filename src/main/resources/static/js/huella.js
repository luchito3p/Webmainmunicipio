// A $( document ).ready() block.
$( document ).ready(function() {
    listUsers();
});


async function listUsers() {

    const tableBody_users = document.querySelector("#tableBody_users");
         

        console.log("Antes del fetch");
        const respuesta = await fetch('http://localhost:8080/api/Huella', {
             method: 'GET', //metodo HTTP
              headers: {   //aca decimos que devuelve un JSON
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
               }
             });
            const users =  await respuesta.json();
            console.log("despues del fetch");
            

            console.log("antes de tabla");
        let content = ``;
        users.forEach((user, index) => {
            
            const tr = document.createElement("tr");
            //tr.classList.add("tr_usuario");
            tr.innerHTML = `
                <tr>
                    <td>${index + 1}</td>
                    <td>${user.nombre}</td>
                    <td>${user.apellido}</td>
                    <td>${user.curso}</td>
                    <td>${user.Huella}</td>
                    <td>
                        <button class="btn btn.sm btn-danger" onclick="eliminarId(${user.id})"><i class="fa-solid fa-trash-can"></i></button>
                    </td>
                </tr>`;
                
            tableBody_users.append (tr);
            
});


    //funcion para recargar pagina
}


//funcion para eliminar salida

function eliminarId(idSal){
    idSalida = document.querySelector("user.id");
    console.log("voy a eliminar el id " + idSal);
    if (confirm("¿desea eliminar esta salida")){

        console.log("eliminando salida" +idSal);
        try{

            respuesta = fetch('api/Huella/eliminar/' + idSal,{
                method:'DELETE',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }
            });
            console.log("Respuesta HTTP: " + respuesta.status);
        }
        catch (error){
            console.log("Error en borrado: " + error);
        }
        console.log("Huella eliminada")

    }

    location.reload();






}