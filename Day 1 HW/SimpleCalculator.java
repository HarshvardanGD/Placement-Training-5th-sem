import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[] Args){
        int n1= 10;
        int n2= 20;
        Scanner sc= new Scanner(System.in);
        char operator= sc.next().charAt(0);
        if (operator=='+'){
            System.out.println(n1+n2);
        }else if (operator=='-'){
            System.out.println(n1-n2);
        }else if (operator=='*'){
            System.out.println(n1*n2);
        }else if (operator=='/'){
            System.out.println(n1/n2);
        }else{
            System.out.println("Invalid Operator");
        }
    }
}