function sortColors(colors) {

    let red = 0;
    let white = 0;
    let blue = colors.length - 1;

    while (white <= blue) {

        if (colors[white] === 0) {

            if (colors[red] !== 0) {
                [colors[red], colors[white]] = [colors[white], colors[red]];
            }

            white++;
            red++;
        }

        else if (colors[white] === 1) {
            white++;
        }

        else {

            if (colors[blue] !== 2) {
                [colors[white], colors[blue]] = [colors[blue], colors[white]];
            }

            blue--;
        }
    }

    return colors;
}

// Driver code
const inputs = [
    [0, 1, 0],
    [1, 1, 0, 2],
    [2, 1, 1, 0, 0],
    [2, 2, 2, 0, 1, 0],
    [2, 1, 1, 0, 1, 0, 2]
];

// Iterate over the inputs and print the sorted array for each
for (let i = 0; i < inputs.length; i++) {

    console.log(i + 1 + ".\tcolors:", arrayToString(inputs[i]), "\n\n\tThe sorted array is:", arrayToString(sortColors(inputs[i])));

    console.log("-".repeat(100));
}