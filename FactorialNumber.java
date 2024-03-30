import java.util.Scanner;
public class FactorialNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int  num = input.nextInt(); // 12 input

        float factorial = fact(num);
        System.out.println("Factorial number is: "+factorial);

    }
    static int fact (int n){
        int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)*n;
        return output;
    }
}