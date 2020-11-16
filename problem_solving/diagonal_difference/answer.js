function diagonalDifference(arr) {
    // Write your code here
    let fDiagonal = 0;
    let bDiagonal = 0;
    arr.forEach((ar, ind)=>{
        fDiagonal += ar[ind];        
        bDiagonal += ar.reverse()[ind];          
    });    
    return Math.abs(fDiagonal - bDiagonal)    
}
