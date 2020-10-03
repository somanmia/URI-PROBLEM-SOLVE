public class Main{
public static void main(String[]args){

int row,col;
int data=0;
int data2=0;
int data3=10;
int data4=12;
char []arr={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
int ck=0;
for(row=0;row<20;row++){
    for(col=0;col<39;col++){
        if(row==0 || row==2 || row==19){
            System.out.print("-");
        }else if(col==0 || col==38|| col==12 || col==22){
            System.out.print("|");
        }
       else if(row==1){

            if(col==1 || col==2 || col==13|| col==14 ||col==20 || col==21 || col==23 || col==24 || col==36 || col==37||(col>=10 && col<=11)){
                System.out.print(" ");
            }else if(col==3){
                System.out.print("decimal");
            }else if(col==15){
               System.out.print("octal");
            }else if(col==25){
               System.out.print("Hexadecimal");
            }


        }

        else if(row>=3 && row<=10){
            if(col==7){
                System.out.printf("%d",data);
                data++;
            }else if(col==17){
               System.out.printf("%d",data2);
               data2++;
            }else if((col>=1 && col<=6) || (col>=8 && col<=11) || (col>=13 && col<=16)|| (col>=18 && col<=21)){
                System.out.print(" ");
            }


        }
        if(row==11 || row==12){
             if(col==7 && row==11){
                System.out.print("8");

            }else if(col==7 && row==12){
                System.out.print("9");

            }else if(col==16 && row==11)
            {

                System.out.print("10");
            }
            else if(col==16 && row==12)
            {

                System.out.print("11");
            }
            else if((col>=1 && col<=6) ||(col>=8 && col<=11) ||(col>=13 && col<=15) ||(col>=18 && col<=21)){
                System.out.print(" ");
            }
        }

       else if(row>=13 && row<=18){
            if(col==6){
                System.out.printf("%d",data3);
                data3++;
            }else if(col==16){
               System.out.printf("%d",data4);
               data4++;
            }else if((col>=1 && col<=6) ||(col>=8 && col<=11) ||(col>=13 && col<=15) ||(col>=18 && col<=21)){
                System.out.print(" ");
            }
        }

      if(row>=3 && row<=18){
            if(col==30){

            System.out.printf("%c",arr[ck]);
            ck++;

            }else if((col>=23 && col<=29)||(col>=31 && col<=37)){
                 System.out.print(" ");
            }
        }

    }
    System.out.print("\n");
}





}


}
