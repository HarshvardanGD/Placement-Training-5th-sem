import java.util.Scanner;
public class sumOfOddandEven {
    public int main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int AbsDiff=0;
        int sumOdd = 0;
        int sumEven = 0;
        while(n > 0) {
            int digit = n % 10;
            if(digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            n /= 10;
        }
        if(sumEven>sumOdd){
            AbsDiff=sumEven-sumOdd;
        }else{
            AbsDiff=sumOdd-sumEven;
        }
        return AbsDiff;
    }
}