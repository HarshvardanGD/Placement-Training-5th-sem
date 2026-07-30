import java.util.Scanner;
public class date_validation{
    public static void main(String[] Args){
        Scanner sc= new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (year>=1000 && year<=9999){
            if (month>=1 && month<=12){
                if((date>=1 && date<=31) && (month==1 || month==3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)){
                    System.out.println("Valid");
                }else if ((date>=1 && date<=30) && (month==4 || month==6 || month == 9 || month == 11)) {
                    System.out.println("Valid");
                }else if ((date>=1 && date<=28) && (month==2)) {
                    System.out.println("Valid");
                }else if ((date==29 && month==2) && (year%4==0 && year%100!=0 || year%400==0)) {
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Date Invalid");
                }
            }else{
                System.out.println("Month Invalid");
            }
        }else{
            System.out.println("Year Invlaid");
        }
    }
}