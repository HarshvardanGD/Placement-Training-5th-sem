public class fibonacci_series{
    public static void main(String[] args) {
        int n=10;
        int a =0, b=1; int c;
        System.out.println("0");
        System.out.println("1");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
}