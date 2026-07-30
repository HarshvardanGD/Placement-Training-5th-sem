import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int found=0;
        for(int i = 2 ; i*i <= n; i++){
            if(n%i==0){
                found+=1;
                break;
            }
            else{
                found=0;
            }
        }
        if (found==0 && n!=1){
            System.out.println("is a prime");
        }else{
            System.out.println("Not a prime");
        }
    }
}