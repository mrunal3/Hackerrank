function miniMaxSum(arr) {
    let sum = 0;
    arr.forEach((num)=> sum += num);    
    console.log(sum - Math.max(...arr), sum - Math.min(...arr));
}
