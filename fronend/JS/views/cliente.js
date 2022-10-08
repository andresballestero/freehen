const CLIENTE = new cliente();

document.querySelector("#crear-cliente").addEventListener("submit", event => {
    event.preventDefault();
    CATEGORY.insert({
        name: event.target.name.value,
        description: event.target.description.value,
    }).then(cliente => {
        event.target.reset();
        loadclienteTable();
        alert('cliente "' + cliente.name + '" registrado');
    }).catch(() => {
        alert('cliente no registrada')
    });
}, false);
