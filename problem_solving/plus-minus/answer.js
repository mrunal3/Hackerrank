function plusMinus(arr) {
    let negative = arr.filter((x)=>x<0);    
    let positive = arr.filter((x)=>x>0);
    let zero = arr.filter((x)=>x==0);
    console.log(fixdigits(positive.length/arr.length));
    console.log(fixdigits(negative.length/arr.length));
    console.log(fixdigits(zero.length/arr.length));    
}

function fixdigits(x) {
  return Number.parseFloat(x).toFixed(6);
}
