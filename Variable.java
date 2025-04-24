class Variable{
  static int m=100;
  void add(){
      int n=90;
      System.out.println("value of n: "+n);
   }
  public static void main(String[]args){
    int data=50;
    // static int m=100
    System.out.println("data value is "+data);
    System.out.println("value of m: "+m);
    //add();
    Variable v1=new Variable();
    v1.add();
   }
}