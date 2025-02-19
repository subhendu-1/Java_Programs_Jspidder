
import java.util.*;

package Recursion;

/**
 * Print1to10
 */
public class Print1to10 {

     public static void main(){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Display(1,n);
     }

     static void Display(int i,int n){
        if(i > n ) return;
        System.out.println(i);
        Display(i+1, n);
     }
}