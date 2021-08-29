import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
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
        System.out.println(
                "4.Leetcode179. Given a list of non-negative integers nums, arrange them such that they form the largest number.");
        System.out.println("Note: The result may be very large, so you need to return a string instead of an integer.");
        System.out.println(
                "5.Leetcode124. A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.");
        System.out.println("The path sum of a path is the sum of the node's values in the path.");
        System.out.println("Given the root of a binary tree, return the maximum path sum of any path.");
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
                String testString = "{{[(}]}}";
                System.out.println(isValidParentheses(testString));
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

    private static boolean isValidParentheses(String testString) {
        int n = testString.length();
        if (n % 2 == 1) {
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = testString.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    private static String arrangeLargestNumber() {

    }
}
