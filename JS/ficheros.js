var getData = function () {
    var fecha = document.getElementById("fecha").value;
    var cantidad = document.getElementById("cantidad").value;
    var ValorUnitario = document.getElementById("valor-unitario").value;
    var cliente = document.getElementById("cliente").value;
    var producto = document.getElementById("Producto").value;
    var valorTotal = cantidad * ValorUnitario;
    //console.log(fecha + " " + cantidad + " " + ValorUnitario + " " + cliente + " " + producto + " " + valorTotal)
    window.alert("Venta Creada con Exito, Valor Total: $" + valorTotal + " para " + cliente);
}

