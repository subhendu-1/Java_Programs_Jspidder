import java.util.*;



/**
 * Add2
 */
public class Add2 {
     public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Sum(n);
     }

     static int Sum(int n){
        if(n == 1) return 1;

        return n + Sum(n-1);
     }
    
}
