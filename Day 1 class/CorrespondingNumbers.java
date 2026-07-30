import java.util.Scanner;

public class CorrespondingNumbers{
    public static void main(String[] Args){
        String[] numberWords = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if (number >= 0 && number < numberWords.length) {
            System.out.println(numberWords[number]);
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}