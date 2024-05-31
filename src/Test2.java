public class Test2 {

  //  public static void main(String[] args) {
  //      int a= 10;
  //
  //    String firstName = "chang yong";
  //    String secondName = "Sung";
  //    String phone = " iphone";
  //    String status = " happy";
  //    System.out.println("나는" + secondName + firstName + "입니다");
  //    System.out.println(phone + " is " + status);
  //
  //    System.out.println(firstName.length());
  //  }
  //      public static void main(String[] args){
  //          String a = "hello";
  //          String b = new String("hello");
  //
  //          System.out.println(a.equals(b));
  //          System.out.println(a == b);

  // g를 올리면 값이 없어서 -1 (0부터 시작하기 때문), l을 올리면 2가 나옴 !넣으면 11이 나옴
  //    public static void main(String[] args) {
  //    String a = "Hello World!";
  //    System.out.println(a.indexOf("World!"));
  //  }

  // ESTSOFT 를 b라는 변수에 담고
  //        SOFT단어가 포함되어있는지 코드를 작성하세요.
  //  public static void main(String[] args) {
  //    String b = "EASTSOFT";
  //    System.out.println(b.contains("SOFT"));
  //  }

  //  public static void main(String[] args){
  //    String findChar = "What is your hobby";
  //    System.out.println(findChar.charAt(13));
  //  }

  //  public static void main(String[] args) {
  //    String a = "Hello World!";
  //    System.out.println(a.replaceAll("World","Java"));
  //  }

  //      public static void main(String[] args) {
  //        String a = "a,b,c,d";
  //        String[] result = a.split(":");
  //      }

  //  public static void main(String[] args) {
  //    String name1 = "Tim";
  //    int age1 = 30;
  //
  //    String name2 = "Anna";
  //    int age2 = 45;
  //
  //    String.format("%s의 나이는 %s세 입니다", name1, age1);
  //    String.format("%s의 나이는 %s세 입니다", name2, age2);
  //  }

  //    public static void main(String[] args) {
  //
  //    StringBuffer sb = new StringBuffer();
  //    sb.append("Hello");
  //    sb.insert(0, "World");
  //    sb.insert(0, "World");
  //    sb.insert(0, "World");
  //    sb.insert(0, "World");
  //    System.out.println();
  //  }

  // 100개의 원소를 가진 정수배열 arr를 만드시오

  //  public static void main(String[] args) {
  //
  //    int[] arr = new int[100];
  //    System.out.println(arr[0]);
  //  }

  //  public static void main(String[] args) {
  //
  //    int x = 5;
  //    int y = 5;
  //
  //    System.out.println("전위 증가 연산자:" + (++x));
  //    System.out.println("후위 증가 연산자:" + (y++));
  //
  //    System.out.println("=================");
  //    System.out.println("x는" + x);
  //    System.out.println("y는" + y);
  //  }

  public static void main(String[] args) {

    int a = 100;
    int b = 100;

    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
  }
}
