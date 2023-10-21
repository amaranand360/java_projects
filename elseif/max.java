import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max;
        if(x>y && x>z){
             max = x;
        }
        else if(y>z && y>x){
             max = y;
        }
        else {
            max = z;
        }
        System.out.println("The maximum number ="+max);
    }
}