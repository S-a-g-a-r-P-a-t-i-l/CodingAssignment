
const originalArray = [];

while (true) {
    const input = prompt("Enter a value (or click Cancel to stop):");


    if (input === null || input.trim() === "") {
        break;
    }


    const value = parseFloat(input);
    if (!isNaN(value)) {
        originalArray.push(value);
    } else {
        alert("Invalid input. Please enter a number.");
    }
}


originalArray.sort((a, b) => b - a);

console.log("Array Sorted in Descending Order:", originalArray);
