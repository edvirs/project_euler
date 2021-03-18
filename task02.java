class task02{
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    int x = 0;

    while (x < 4000000){
      x = a + b;
      a = b;
      b = x;
      System.out.println(x);
    }
  }
}
