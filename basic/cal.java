import java.util.Scanner;
public class cal {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the oprands");
    char op = sc.next().charAt(0);

    //if (op == '+' || op == '-' || op == '*' || op == '/' ) {
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result;
       { switch (op) {
        case '+':
            result = a+b; 
            break;
        case '-':
           result = a-b; 
            break;    
        case '*':
          result = a*b; 
            break;
        case '/':
         result = a/b; 
             break;             
        default:
        System.out.println("invalid/ please enter valid operator\n");
            break;
       } 
    }
    System.out.println("Tne result = " + result); 

}
}