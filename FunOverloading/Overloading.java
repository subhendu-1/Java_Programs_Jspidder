class Overloading{

    public static void main() {
        System.out.println("main()");
    }

    public static void m1(int n,double m){
        System.out.println(n+m);
    }

    public static void m1(int n,double m){
        System.out.println(n+m);
    }

    public static void main(String []args){
        m(20,20.3);
        m1(20.8,200);
        m1(10,20);
    }
}
