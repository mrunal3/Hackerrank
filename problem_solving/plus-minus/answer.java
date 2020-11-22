import java.util.stream.Collectors;

static void plusMinus(int[] arr) {
      List<Integer> list = new ArrayList<>(arr.length);
      for (int i : arr) {
          list.add(Integer.valueOf(i));
      }

      List<Integer> positive = list.stream().filter(num -> num > 0)
                                  .collect(Collectors.toList());
      List<Integer> negative = list.stream().filter(num -> num < 0)
                                  .collect(Collectors.toList());
      List<Integer> zero = list.stream().filter(num -> num == 0)
                                  .collect(Collectors.toList());        
      System.out.format("%.6f%n",(double)positive.size()/arr.length);
      System.out.format("%.6f%n",(double)negative.size()/arr.length);        
      System.out.format("%.6f",(double)zero.size()/arr.length);
  }
