import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the class number:");
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                Class1 c1 = new Class1();
                c1.display();
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
        }
        scanner.close();
        System.out.println("**********Exit**********");
    }
}
