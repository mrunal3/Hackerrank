def diagonalDifference(arr):
    # Write your code here
    fDiagonal = 0
    bDiagonal = 0
    diff = 0    
    for i in range(len(arr)):
        ar = arr[i]     
        fDiagonal += ar[i] 
        
        ar.reverse()
        bDiagonal += ar[i]
    diff = abs(fDiagonal - bDiagonal)
    return diff
