static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    int appleData = 0;
    int orangeData = 0;
    for (int apple : apples) {
        if(checkHomeRange(apple, a, s, t)) {
            appleData += 1;
        }
    }
    for (int orange : oranges) {
        if(checkHomeRange(orange, b, s, t)) {
            orangeData += 1;
        }
    }
    System.out.println(appleData);
    System.out.println(orangeData);
}

static boolean checkHomeRange(int fruit_location,int tree_location,int home_range0, int home_range1){
    boolean confirm = false;
    int location = tree_location + fruit_location;
    confirm = (home_range0 <= location && location <= home_range1);
    return confirm;
}
