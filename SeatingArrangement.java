import java.util.*;
public class SeatingArrangement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers Of Seats ");
        int n =sc.nextInt();
        for(int i =0;i<n;i++){
            System.out.print("Seat Number : ");
            int seatN = sc.nextInt();
            int prtn = seatN%12;
            if(prtn>6||prtn==0){
                int RightseatPos = prtn%6;
                switch(RightseatPos){
                    case 0: System.out.println(seatN-11+"WS");break;
                    case 1: System.out.println(seatN-1+"WS");break;
                    case 2: System.out.println(seatN-3+"MS");break;
                    case 3: System.out.println(seatN-5+"AS");break;
                    case 4: System.out.println(seatN-7+"AS");break;
                    case 5: System.out.println(seatN-9+"MS");break;
                }
            }
            else if(prtn<6||prtn==0){
                int LeftseatPos = prtn%6;
                switch(LeftseatPos){

                    case 0:System.out.println(seatN+1+"WS");break;
                    case 1:System.out.println(seatN+11+"WS");break;
                    case 2:System.out.println(seatN+9+"MS");break;
                    case 3:System.out.println(seatN+7+"AS");break;
                    case 4:System.out.println(seatN+5+"AS");break;
                    case 5:System.out.println(seatN+3+"MS");break;

                }
            }
        }
    }
    
}
