import java.util.Scanner;

public class Class1 {

    public void display() {
        System.out.println("Select a question:");
        System.out.println("1. 打印出所有的水仙花数（一个三位数，其各位数字立方和等于该数本身。例：153=1*1*1+5*5*5+3*3*3）");
        System.out.println(
                "2.Leetcode169. Given an array nums of size n, return the majority element.\nThe majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.");
        System.out.println("3.");
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
                break;
            case "3":
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

    public void countNarcissisticNumber() {

    }
}
