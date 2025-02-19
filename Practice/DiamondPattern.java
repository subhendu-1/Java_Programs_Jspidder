// class Pattern2
// {
// 	public static void main(String[] args) 
// 	{
// 		int n = 5;
// 		for(int i = 1; i <= n; i++){
// 			for(int j = 1; j <= n-i; j++){
// 				System.out.print(" ");
// 			}

// 			for(int j = 1; j <= i*2-1; j++){
// 				if(j == 1 || j == i*2-1 || i == n){
// 				    System.out.print("*");
// 				}else{
// 					System.out.print(" ");
// 				}
// 			}
// 			System.out.println();
// 		}
// 		System.out.println("Hello World!");
// 	}
// }



import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();
        
        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= (2 * i - 1); j++) {
                if(j == 1 || j == (2*i-1)){
                   System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= (2 * i - 1); j++) {
                if(j == 1 || j == (2*i-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

