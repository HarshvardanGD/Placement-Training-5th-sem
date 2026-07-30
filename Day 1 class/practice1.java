import java.util.Scanner;

class friend{
    String phno;
    String name;
    
    friend(String name, String phno){
         this.phno=phno;
         this.name=name;
    }
}

public class practice1{
    static void main(){
        friend[] f = new friend[5];
        int i; String str1; String str2;
        Scanner input= new Scanner(System.in);
        for(i=0;i<5;i++){
            str1=input.next();
            str2=input.next();
            f[i]=new friend(str1,str2);
        }
        for(i=0;i<5;i++){
            System.out.println();
        }
    }
}