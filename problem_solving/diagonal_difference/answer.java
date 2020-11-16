public static int diagonalDifference(List<List<Integer>> arr) {
  // Write your code here
    int diff = 0;
    int fDiagonal = 0;
    int bDiagonal = 0;        
    for (int i = 0; i < arr.size(); i++) {            
        List<Integer> a = arr.get(i);
        fDiagonal += a.get(i);            
        Collections.reverse(a);            
        bDiagonal += a.get(i);
    }
    diff = Math.abs(fDiagonal - bDiagonal);        
    return diff;
}
