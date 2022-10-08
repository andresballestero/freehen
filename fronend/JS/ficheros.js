


var getData = function () {

    var cliente = document.getElementById("cliente").value;

    if (cliente === "Crear nuevo cliente") {

        overlay.classList.add('active');
        popup.classList.add('active');

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









/*    I N D E X    1     
let ctx = document.getElementById("myChart").getContext("2d")
let labels = ["Huevos", "Gallinas"]
let colorHex = ["#FB3640", "#EFCA08"]

let myChart = new Chart(ctx, {
    type: "pie",
    data: {
        datasets: [
            {
                data: [30, 10], backgroundColor: colorHex,
            },
        ],
        labels: labels,
    },
    options: {
        responsive: true,
        legend: {
            positio: "bottom",
        },
        plugins: {
            datalabels: {
                color: "#fff",
                anchor: "end",
                align: "start",
                offset: -10,
                borderWidth: 2,
                borderColor: "#fff",
                borderRadius: 25,
                backgroundColor: (context) => {
                    return context.dataset.backgroundColor
                },
                font: {
                    weight: "bold",
                    size: "10",
                },
                formatter: (value) => {
                    return value + "%"
                },
            },
        },
    },
})*/


