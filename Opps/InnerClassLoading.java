package Opps;
class ClassLoading {
    public static void main(){
        

        InnerClassLoading.m1();
        InnerClassLoading.m2();


        
    }
}

/**
 * InnerClassLoading
 */
public class InnerClassLoading {

    int i;
    static int j;

    static void m1(){
        System.out.println(j);
       // System.out.println(i); // here give error because here reference error because not static method can't be referenced from static method
    }

    void m2(){
        System.out.println(i); // here this is execute because non static method can be reference from same calss
        System.out.println(j);
    }
}
