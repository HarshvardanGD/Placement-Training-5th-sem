import java.util.Scanner;
public class factors{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        int count=0;
        for(i=1;i<=n/2;i++){
            if(n%i==0){
                count+=i;
            }
        }
        System.out.println(count);
        if (count>n){
            System.out.println("abundant");   
        }if (count<n){
            System.out.println("Deficient");
        }if (count==n){
            System.out.println("Perfect");
        }
    }
}