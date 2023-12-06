package prtc01;

public class Prtc01 {
    public static void main(String[] args) {

//        //int dan = 2;
//        for(int dan=2; dan<=9; dan++)
//            for( int i=1; i<=9; i++){
//            System.out.println(dan+"*" +i+ " = "+(dan*i));
//
//
//
//        for(int i=0; i<=5; i++){
//            for (int k=1; k<5-i; k++){
//                System.out.print("");
//            }
//            for (int j=0; j<i*2+1; j++)
//            System.out.print("*");
//         }
//        System.out.println();


        int i= 0;
        while (true){
            i++;
            System.out.println(i);
            if(i==10){
                break;
            }
        }



        boolean run= true;
        int a= 0;
        while (run){
            a++;
            System.out.println(a);
            if(a==10){
                run = false;

            }
        }
    }
}




