public static int birthdayCakeCandles(List<Integer> candles) {
// Write your code here
    int max = Collections.frequency(candles, Collections.max(candles));
    return max;
}
