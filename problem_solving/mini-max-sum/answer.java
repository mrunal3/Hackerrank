static void miniMaxSum(int[] arr) {
    long sum = 0;
    for(long x : arr) {
        sum += x;
    }
    long maxSum = sum - Arrays.stream(arr).max().getAsInt();
    long minSum = sum - Arrays.stream(arr).min().getAsInt();       
    System.out.print(maxSum + " " + minSum);
}
