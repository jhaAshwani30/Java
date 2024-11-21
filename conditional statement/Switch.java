// Make a calculator Take 2 number (a & b) from the user and an operations as follows:
// 1: +(Addition) a + b
// 2: -(Subtraction) a - b
// 3: *(Multiplaction) a * b
// 4: /(Division) a / b
// 5: %(Remainder) a % b
// Calculate the result according to the operation given and display it to the user...........



import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number1");
          int number1 = sc.nextInt();
          System.out.println("Enter number2");
          int number2 = sc.nextInt();

           System.out.println("choose operator");
           System.out.println("1: +(ADDITION)");
           System.out.println("2: -(SUBTACTION)");
           System.out.println("3: *(MULTIPLACTION)");
           System.out.println("4: /(DIVISION)");
           System.out.println("5 %(REMAINDER)");
           int operation = sc.nextInt();

           switch (operation) {
               case 1:
                   System.out.println((number1 + number2)+ "ADDITION");

                   break;
               case 2:
                   System.out.println((number1 - number2)+ "Subtraction");

                   break;
               case 3:
                   System.out.println((number1 * number2)+ "Multiplication");

                   break;
               case 4:
                   System.out.println((number1 % number2)+ "DIVISION");

                   break;
               case 5:
                   System.out.println((number1 / number2)+ "Remainder");

              default:
                break;
         }
    }
}
