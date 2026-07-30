import java.util.Scanner;
public class Prime_BTW_Numbers{
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int i;
        for(int num = n1 ; num <= n2; num++){
            for(i=2;i*i<=num;i++){
                if(num%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}