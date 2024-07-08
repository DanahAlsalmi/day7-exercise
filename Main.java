import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1 - Write a Java method to find the smallest number among three numbers.*/

//        System.out.println("Enter number 1");
//        int num1= input.nextInt();
//        System.out.println("Enter number 2");
//        int num2= input.nextInt();
//        System.out.println("Enter number 3");
//        int num3= input.nextInt();

//        System.out.println("the smallest value is : "+smallest(num1,num2,num3));

        /*2-Write a Java method that check if the entered number is negative or positive or zero.*/

//        System.out.print("Enter number :");
//        int num= input.nextInt();
//
//        System.out.println(check(num));

        /*
            3 - Write a Java method to check whether a string is a valid password. Password rules:
            A password must have at least ten characters.
            A password consists of only letters and digits.
            A password must contain at least two digits.
         */

//        System.out.print(
//                        "1. A password must have at least eight characters.\n" +
//                        "2. A password consists of only letters and digits.\n" +
//                        "3. A password must contain at least two digits \n" +
//                        "Input a password (You are agreeing to the above Terms and Conditions.): ");
//        String password = input.nextLine();
//        System.out.println();
//
//        String pass = (validPassword(password)) ? "Password is valid." : " Sorry , Password is invalid.";
//        System.out.println(pass);


    }//end main

    //Methods
    public static int smallest(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) {
            return num1;

        } else if (num2 < num1 && num2 < num3) {
            return num3;

        } else return num3;

    }

    public static String check(int num) {

        if (num > 0) {
            return "positive";

        } else if (num < 0) {
            return "negative";

        } else return "zero";
    }

    public static boolean validPassword(String password) {
        boolean isValid = true;

        if (password.length() < 8) {
            System.out.println("- A password must have at least 8 characters. ");
            isValid = false;
        }


        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                isValid = false;
                break;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            System.out.println("- it must contain 2 digits at least");
            isValid = false;
        }
        return isValid;
    }
}