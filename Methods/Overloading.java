public class Overloading {
  public static void main(String[]args){
    // fun(67);
    // fun("hello bhumi");
    int ans = sum(12, 34);
    // int ans = sum(3, 5, 6);
    System.out.println(ans);
  }
  static int sum(int a,int b){
    return a + b;
  }

  static int sum(int a,int b,int c){
    return a + b + c;
  }

  // static void fun(int a){
  //   System.out.println(a);
  // }
  // static void fun(String name){
  //   System.out.println(name);
  // }
}

