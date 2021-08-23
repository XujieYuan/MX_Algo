import java.util.ArrayList;
import java.util.Scanner;

public class Class1 {

    public void display() {
        System.out.println("Select a question:");
        System.out.println("1. 打印出所有的水仙花数（一个三位数，其各位数字立方和等于该数本身。例：153=1*1*1+5*5*5+3*3*3）");
        System.out.println(
                "2.Leetcode169. Given an array nums of size n, return the majority element.\nThe majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.");
        System.out.println(
                "3.Leetcode20. Valid Parentheses. Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.");
        System.out.println("An input string is valid if:");
        System.out.println("(1)Open brackets must be closed by the same type of brackets.");
        System.out.println("(2)Open brackets must be closed in the correct order.");
        System.out.println("4.");
        System.out.println("5.");
    }

    public void select() {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                countNarcissisticNumber();
                break;
            case "2":
                int[] testArray = { 3, 2, 3, 9, 9, 9, 9 };
                System.out.println(returnMajorityElement(testArray));
                break;
            case "3":
                String testString = "{{[()]}}";
                validParentheses(testString);
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                System.out.println("Invalid option, please enter a number between 1-15!");
                select();
        }
        scanner.close();
    }

    private static void countNarcissisticNumber() {
        ArrayList<Integer> narcissisticNumbers = new ArrayList<>();
        for (int i = 100; i <= 999; i++) {
            if (isNarcissisticNumber(i))
                narcissisticNumbers.add(i);
        }
        System.out.println(narcissisticNumbers);
    }

    private static boolean isNarcissisticNumber(int narcissisticNumber) {
        int m;
        int n = narcissisticNumber;
        int sum;
        m = n / 100;
        n -= m * 100;
        sum = m * m * m;
        m = n / 10;
        n -= m * 10;
        sum += m * m * m + n * n * n;
        return (sum == narcissisticNumber);
    }

    private static int returnMajorityElement(int[] testArray) {
        int n = testArray.length / 2;
        for (int num1 : testArray) {
            int times = 0;
            for (int num2 : testArray) {
                if (num1 == num2)
                    times++;
            }
            if (times > n) {
                return num1;
            }
        }
        return -1;
    }

    private static boolean validParentheses(String testString) {
        boolean validP = false;
        return validP;
    }
}
