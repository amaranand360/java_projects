
import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        System.out.println("Enter your serve year in your company");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a>5) {
            System.out.println("they are eligble for bonus");
            System.out.println("Enter your salary");
            int s = input.nextInt();
            System.out.println("Your new modified salary "+(s+(s*5)/100));
        } else {
            System.out.println("they are not eligble for bonus");
        }
    }
} 