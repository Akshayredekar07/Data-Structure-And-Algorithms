function findMissingNumbers(arr) {
    let n = arr.length;
    let diff = arr[0] - 0;

    for (let i = 0; i < n; i++) {
        while (diff < arr[i] - i) {
            console.log(i + diff);
            diff++;
        }
    }
}

let arr = [6, 7, 8, 9, 11, 12, 15, 16, 17, 18, 19];
findMissingNumbers(arr);
