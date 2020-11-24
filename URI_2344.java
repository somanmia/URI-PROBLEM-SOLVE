import java.util.Scanner;
public class Main{
public static void main(String[]args){
 Scanner input=new Scanner(System.in);
  int num;
  while(input.hasNextInt()){
       num=input.nextInt();
     if(num==0){
      System.out.println("E");

}else if(num>=1 && num<=35){
     System.out.println("D");
}else if(num>=36 && num<=60){
    System.out.println("C");
}else if(num>=61 && num<=85){
    System.out.println("B");

}else if(num>=86 && num<=100){
   System.out.println("A");
}
}


}



}
