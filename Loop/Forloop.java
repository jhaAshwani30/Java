// Print the table of a number input by the user

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<11;i++){
            System.out.println(i*n);
            sc.close();
        }

    }
}
