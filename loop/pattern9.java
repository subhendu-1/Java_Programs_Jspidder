package loop;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 1; i <= n; i++) {
            // Print 'S'
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == (n + 1) / 2 || (j == 1 && i < (n + 1) / 2) || (j == n && i > (n + 1) / 2)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("   "); 

            // Print 'U'
            for (int j = 1; j <= n; j++) {
                if (i == n || j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("   ");

            // Print 'B'
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i == (n + 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("   ");

            // Print 'H'
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == (n + 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("   ");

            // Print 'E'
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || i == (n + 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("   ");

            // Print 'N'
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("   ");

            // Print 'D'
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("   ");

            // Print 'U' 
            for (int j = 1; j <= n; j++) {
                if (i == n || j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            //  next row 
            System.out.println();
        }
    }
}
