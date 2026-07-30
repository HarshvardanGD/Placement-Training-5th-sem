public class greatest {
    public static void main(String[] args) {
        int n1= 10;
        int n2= 20;
        int n3= 30;
        if (n1>n2){
            if (n1>n3){
                System.out.println(n1);
            }else{
                System.out.println(n3);
            }
        }else{
            if (n2>n3){
                System.out.println(n2);
            }else{
                System.out.println(n3);
            }
        }
    }
}
