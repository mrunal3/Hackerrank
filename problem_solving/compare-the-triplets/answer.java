static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> result = new ArrayList<Integer>();
    int aScore = 0;
    int bScore = 0;        
    for (int i = 0; i < a.size(); i++) {            
        if(a.get(i) > b.get(i)){                
            aScore += 1;
        } else if(a.get(i) < b.get(i)){              
            bScore += 1; 
        }
    }
    result.add(aScore);
    result.add(bScore);
    return result;
}
