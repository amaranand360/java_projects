import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which table you want");
        int n = sc.nextInt();
        for(int i = 1;i<11;i++){
            System.out.println(i +"*"+n+"="+i*n);
        }
    }
   
}