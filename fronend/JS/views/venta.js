const VENTA = new venta();

document.addEventListener("DOMContentLoaded", event =>{
    const ventaForm = document.querySelector("#form-venta")

    function loadVentaTable(){
        const table = document.querySelector("tbody")
        table.innerHTML ="";
        VENTA.findAll().then(venta => {
            venta.forEach(venta =>{
                const row = document.createElement("tr");
                const cells = [
                    document.createElement("td"),
                    document.createElement("td"),
                    document.createElement("td"),
                    document.createElement("td"),
                    document.createElement("td"),
                    document.createElement("td")
                ];
                const buttons = [
                    document.createElement("button"),
                    document.createElement("button")
                ];
                buttons[0].textContent = "Eliminar";
                buttons[0].addEventListener("click", event => {
                    ventaForm.id.value = venta.id;
                    ventaForm.fecha.value = venta.fecha;
                    ventaForm.cliente.value = venta.cliente;
                    ventaForm.producto.value = venta.producto;
                    ventaForm.cantidad.value = venta.cantidad;
                    ventaForm.valorunitario.value = venta.valorunitario;
                    ventaForm.valortotal.value = venta.valortotal;
                }, false);
                buttons[1].textContent = "Editar";
                buttons[1].addEventListener("click", event => {
                    VENTA.deleteByID(venta.id).then(venta =>{
                        row.remove();
                        alert('Venta "' + venta.fecha + '" eliminada');
                    }).catch(()=>{
                        alert('Venta no eliminada');
                    });
                }, false);
                cells[0].textContent = venta.id;
                cells[1].textContent = venta.fecha;
                cells[2].textContent = venta.cliente;
                cells[3].textContent = venta.producto;
                cells[4].textContent = venta.cantidad;
                cells[5].textContent = venta.valorunitario;
                cells[6].textContent = venta.valortotal;
                

                cells[7].append(...buttons);
                row.append(...cells);
                table.append(row);
            });
        });
    }

    loadVentaTable();

    ventaForm.addEventListener("submit", event =>{
        event.preventDefault();
        const venta = {
            id: ventaForm.id.value,
            fecha: ventaForm.fecha.value,
            cliente: ventaForm.cliente.value,
            producto: ventaForm.producto.value,
            cantidad: ventaForm.cantidad.value,
            valorunitario: ventaForm.valorunitario.value,
            valortotal: ventaForm.valortotal.value,
        };
        VENTA[venta.id == 0 ? "insert" : "update"](venta).then(venta =>{
            ventaForm.reset();
            loadVentaTable();
            alert('Venta "' + venta.fecha + '" creada');
        }).catch(()=>{
            alert('venta no creada');
        });
    }, false);

}, false);
