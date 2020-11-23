function birthdayCakeCandles(candles) {    
    let max = Math.max(...candles);
    return candles.filter((num)=> num === max).length;
}
