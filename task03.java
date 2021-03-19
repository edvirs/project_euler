class task03{
  public static void main(String[] args) {
    long num = 600_851_475_143L;
    int x = 2;

    while (num!=1){
      x++;
      if (num%x == 0){
        num = num/x;
      }

    }
    System.out.println(x);
  }
}
