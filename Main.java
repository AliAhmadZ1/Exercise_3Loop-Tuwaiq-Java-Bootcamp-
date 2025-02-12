import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //-------------------------------------------------------------------------------------------------
        //1.Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that
        //number.
        //If the number is a multiple of 5, you need to print "Buzz" instead of that
        //number.
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
        //instead of that number.

        int num1 = 1;
        while (num1 <= 100) {
            if (num1 % 3 == 0 && num1 % 5 == 0) { //first the longest condition then smaller
                System.out.println("FizzBuzz");
            } else if (num1 % 5 == 0) {
                System.out.println("Buzz");
            } else if (num1 % 3 == 0) {
                System.out.println("Fizz");
            } else
                System.out.println(num1);
            num1++;
        }


        //-------------------------------------------------------------------------------------------------
        //2.Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox Expected Output: Reverse
        //string: xof nworb kciuq ehT

//        System.out.println("Please enter a string to reverse: ");
//        String txt= input.next();
//        char pick;
//        String reverse = "";
//        for (int i = 0; i < txt.length(); i++) {
//            pick= txt.charAt(i); //to pick one character
//            reverse = pick+reverse;
//        }
//        System.out.println("The reverse word is: "+reverse);


        //-------------------------------------------------------------------------------------------------
        //3.Write a program to find the factorial value of any number entered
        //through the keyboard.

//        System.out.println("Please enter a number to find the factorial: ");
//        int num2 = input.nextInt();
//        int sum2 = 1;
//        for (int i = num2; i > 0; i--) {
//            sum2 = sum2 * i;
//        }
//        System.out.println("The Factorial of " + num2 + "! is: " + sum2);

        //-------------------------------------------------------------------------------------------------
        //4.Two numbers are entered through the keyboard. Write a program to find
        //the value of one number raised to the power of another. (Do not use Java
        //built-in method)

//        System.out.println("Please enter to number first is the number and second is the power of first: ");
//        System.out.println("first");
//        int first_4 = input.nextInt();
//        System.out.println("second");
//        int second_4 = input.nextInt();
//        int result = 1;
//        for (int i = 0; i < second_4; i++) {
//            result = result * first_4;
//        }
//        System.out.println("The exponention of " + first_4 + " with power of " + second_4 + " is: " + result);

        //-------------------------------------------------------------------------------------------------
        //5.Write a program that reads a set of integers, and then prints the sum of
        //the even and odd integers.

//        int num5 = 0;
//        int odd5 = 0;
//        int even5 = 0;
//        System.out.println("Sum of even & odd calculator: ");
//        do {
//            System.out.println("Please enter a number or 0 to Exit: ");
//            num5 = input.nextInt();
//            if (num5 % 2 == 0 && num5 != 0)
//                even5 = even5 + num5;
//            if (num5 % 2 != 0)
//                odd5 = odd5 + num5;
//        } while (num5 != 0);
//        System.out.println("The sum of even numbers: " + even5);
//        System.out.println("The sum of odd numbers: " + odd5);

        //-------------------------------------------------------------------------------------------------
        //6.Write a program that prompts the user to input a positive integer. It
        //should then output a message indicating whether the number is a prime
        //number.

//        boolean prime = true;
//        int check=1;
//        System.out.println("Please enter a number to check if it is a prime number");
//        int num6=input.nextInt();
//        for (int i = 2; i < num6/2; i++) {
//            check = num6 % i;
//            if (check==0) {
//                prime = false;
//                break;
//            }
//        }
//        if (prime)
//            System.out.println("The number is a prime");
//        else
//            System.out.println("The number isn't prime");

        //-------------------------------------------------------------------------------------------------
        //7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.
        //Expected Output:
        //Week 1
        //Day1
        //Day2
        //Day3
        //Day4
        //Day5
        //Day6
        //Day7
        //Week 2
        //Day1
        //Day2
        //...
//
//        String Week = "Week-> ";
//        String Day="Day- ";
//        for (int i = 1; i < 5; i++) {
//            System.out.println(Week+i);
//            for (int j = 1; j < 8; j++) {
//                System.out.println(Day+j);
//            }
//        }

        //8.Write a program that's check if the word is a palindrome or not. hint: A
        //string is said to be a palindrome if it is the same if we start reading it from
        //left to right or right to left.

//        System.out.println("Please enter a string to check if is palindrome or not: ");
//        String txt8 = input.next();
//        char pick8;
//        String reverse8 = "";
//        for (int i = 0; i < txt8.length(); i++) {
//            pick8 = txt8.charAt(i);
//            reverse8 = pick8 + reverse8;
//        }
//        if (reverse8.equals(txt8))
//            System.out.println("The word is: Palindrome");
//        else
//            System.out.println("The word is : Not Palindrome");
    }
}
