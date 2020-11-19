function compareTriplets(a, b) {
    let aScore = 0;
    let bScore = 0;
    a.forEach((item, ind)=>{
        if (item > b[ind]) {
            aScore += 1;
        } else if (item < b[ind]) {
            bScore += 1;
        }
    });   
    return [ aScore, bScore];
}
