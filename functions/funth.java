import java.util.Scanner;

public class funth{
    //function defaction.
    // public static void printName(String name)  // return type is void function taking a using one parameter.
    // {
    //     System.out.println("Your Good name is "+ name+"!");
    // }
    
    public static void main(String[] args) {
        // System.out.println("Enter your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        //printName(name);            //function calling.
        System.out.print("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //swap(a, b);
        int ans =product(a,b);
        System.out.println("power = "+ans);
    }

    // public static void swap(int a,int b){
    //     System.out.println("Before swap a= "+a+" and b= "+b);
    //     int temp = a;
    //     a=b;
    //     b=temp;
    //     System.out.println("after swap a= "+a+" and b= "+b);
    //}

    static int product(int base,int expo){
        int pow=1;
        for(int i=1;i<=expo;i++){
            pow = pow*base;
        }
        return pow;
    }
}