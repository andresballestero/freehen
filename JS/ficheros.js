var getData = function () {

    var cliente = document.getElementById("cliente").value,
        fecha = document.getElementById("fecha").value,
        cantidad = document.getElementById("cantidad").value,
        ValorUnitario = document.getElementById("valor-unitario").value,
        cliente = document.getElementById("cliente").value,
        producto = document.getElementById("Producto").value,

        overlay = document.getElementById('overlay'),
        popup = document.getElementById('popup'),
        btnCerrarPopup = document.getElementById('btn-cerrar-popup');



    if (cliente === "Crear nuevo cliente") {

        overlay.classList.add('active');
        popup.classList.add('active');

    } else {

        var valorTotal = cantidad * ValorUnitario;
        //console.log(fecha + " " + cantidad + " " + ValorUnitario + " " + cliente + " " + producto + " " + valorTotal)
        window.alert("Venta Creada con Exito, Valor Total: $" + valorTotal + " para " + cliente);

    }


    // var valorTotal = cantidad * ValorUnitario;
    // //console.log(fecha + " " + cantidad + " " + ValorUnitario + " " + cliente + " " + producto + " " + valorTotal)
    // window.alert("Venta Creada con Exito, Valor Total: $" + valorTotal + " para " + cliente);
}

// var ButtonCrear = document.getElementById('Crear'),
//     ButtonBuscar = document.getElementById('button-buscar');


// ButtonCrear.addEventListener('click', function () {

//     var fecha = document.getElementById("fecha").value;
//     var cantidad = document.getElementById("cantidad").value;
//     var ValorUnitario = document.getElementById("valor-unitario").value;
//     var cliente = document.getElementById("cliente").value;
//     var producto = document.getElementById("Producto").value;
//     var valorTotal = cantidad * ValorUnitario;
//     //console.log(fecha + " " + cantidad + " " + ValorUnitario + " " + cliente + " " + producto + " " + valorTotal)
//     window.alert("Venta Creada con Exito, Valor Total: $" + valorTotal + " para " + cliente);

// });

