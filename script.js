function convert() {
    const celsius = document.getElementById("celsius").value;
    if (celsius === "" || isNaN(celsius)) {
        document.getElementById("result").innerText = "Invalid input! Enter a number.";
        return;
    }
    const fahrenheit = (celsius * 9 / 5) + 32;
    document.getElementById("result").innerText = `Fahrenheit: ${fahrenheit.toFixed(2)}`;
}