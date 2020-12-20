import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         long M,result;
         int X;
         while(true){
               X=input.nextInt();
               M=input.nextInt();
               if(X==0 && M==0){
                   break;
               }
               result=X*M;
               System.out.println(result);
         }
    }
   
}
