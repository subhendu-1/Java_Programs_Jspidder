class Overloading1{

public static void m1(int n) {
    System.out.print(n);
}
public static void m1("main()") + n) {
    System.out.print("m1 int" +n);
}
public static void m1(double n) {
    System.out.print("m1 double" +n);
}

public static void main(String[] args){
    byte b = 10;
    m1(b);
    m1('A');
    m1(20.20);
}

}
