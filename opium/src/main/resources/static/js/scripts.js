
document.addEventListener("DOMContentLoaded", () => {
    const addToCartButtons = document.querySelectorAll(".add-to-cart");
    const cartCounter = document.getElementById("cart-counter");

    addToCartButtons.forEach(button => {
        button.addEventListener("click", () => {
            alert("Produto adicionado ao carrinho!");
            let currentCount = parseInt(cartCounter.innerText) || 0;
            cartCounter.innerText = currentCount + 1;
        });
    });
});


function validateCadastroForm() {
    const nome = document.getElementById("nome").value;
    const email = document.getElementById("email").value;

    if (!nome || !email) {
        alert("Por favor, preencha todos os campos!");
        return false;
    }

    alert("Cadastro realizado com sucesso!");
    return true;
}


function finalizarCompra() {
    const totalItems = document.querySelectorAll("table tr").length - 1; // Ignora o cabeçalho

    if (totalItems <= 0) {
        alert("Seu carrinho está vazio!");
        return;
    }

    alert("Compra finalizada com sucesso!");
}
