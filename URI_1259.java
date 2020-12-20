import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,N,even=0,odd=0;
        N=input.nextInt();
        int array[]=new int[N];
        for(i=0;i<N;i++){
             array[i]=input.nextInt();
             if(array[i]%2==0){
                 even++;
             }else{
                 odd++;
             }
        }
        int ck=0;
        int ck1=0;
       int evenarray[]=new int[even];
       int oddarray[]=new int[odd];
       for(int j=0;j<N;j++){
            if(array[j]%2==0){
                 evenarray[ck]=array[j];
                 ck++;
            }else if(array[j]%2==1){
                 oddarray[ck1]=array[j];ck1++;
            }
       }
       
       Arrays.sort(evenarray);
       for(int evenprint=0;evenprint<evenarray.length;evenprint++){
           System.out.println(evenarray[evenprint]);
       }
       
       Arrays.sort(oddarray);
       for(int oddprint=oddarray.length-1;oddprint>=0;oddprint--){
              System.out.println(oddarray[oddprint]);
       }
    }
}
