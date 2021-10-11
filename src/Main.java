import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Enter the class number:");
        // start();
        // System.out.println("**********Exit**********");
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = 5;
        int tmp[] = new int[n];
        for (int i = 0; i < n; ++i) {
            tmp[i] = a[n - i - 1];
        }
        for (int i = 0; i < n; ++i) {
            a[i] = tmp[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(tmp));
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                Class1 c1 = new Class1();
                c1.display();
                c1.select();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            case "9":
                break;
            case "10":
                break;
            case "11":
                break;
            case "12":
                break;
            case "13":
                break;
            case "14":
                break;
            case "15":
                break;
            default:
                System.out.println("Invalid option, please enter a number between 1-15!");
                start();
        }
        scanner.close();
    }
}
