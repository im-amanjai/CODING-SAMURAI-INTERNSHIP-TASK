import java.util.Scanner;
public class Calculator_by_aman {


    //Function to perform Addition.
    public static int add(int a, int b) {
            return a + b;
        }

        //Function to perform Subtraction.
        public static int sub(int a, int b) {
            return a - b;
        }

        //Function to perform Multiplication.
        public static int multiplication(int a, int b) {
            return a * b;
        }

        //Function to perform Division with error handling for division by Zero.
        public static int divide(int a, int b) {
            if (b == 0) {
                System.out.println("This is invalid input, You can not divide any number by 0");
                return 0; // Return some default value or handle the error as needed
            } else {
                return a / b;
            }
        }

        //Function to take user input for two numbers and perform the specified operation.
        public static void input(int a) {
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter First Number: ");
           int b = sc.nextInt();
            System.out.println("Enter Second Number: ");
            int c = sc.nextInt();
            sc.close();
            System.out.print("Result :");

            if (a == 1) {
                System.out.println(add(b, c));
            } else if (a == 2) {
                System.out.println(sub(b, c));
            } else if (a == 3) {
                System.out.println(multiplication(b, c));
            } else if (a == 4) {
                System.out.println(divide(b, c));
            }
        }

    // Function to take user input for selecting an operation or exiting the program.
        public static void inputOperation() {
            Scanner sc = new Scanner(System.in);
            int a;
            a = sc.nextInt();
           if (a<5 && a>0) {
              input(a); // Call input function to perform the selected operation.
            }else if (a == 5){
               System.out.println("Thank you your program ENDs Here");
           } else if (a>5 || a<0) {
               System.out.println("Invalid Input...Please Enter Number Between 1 to 5 ");
               System.out.println("Thank You!!!");}


            sc.close();
        }

        public static void main(String[] args) {
            System.out.println("---------------------------CALCULATOR APPLICATION--------------------------------");
            System.out.println("  ");
            System.out.println("=================Project by--AMAN JAISWAL===================");
            System.out.println("  ");
            System.out.println("Choose the Arithmetic Operation You want To Perform");
            System.out.println("  ");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            inputOperation();  // Start the calculator application by calling inputOperation.
        }
    }


