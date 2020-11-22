static void staircase(int n) {
    for (int i = 1; i <= n; i++) {
        String hash = "";
        for (int j = n; j > 0; j--) {   
            if (j<=i) {
                hash += "#";
            } else {
                hash += " ";
            }
        }
        System.out.println(hash);
    }
}
