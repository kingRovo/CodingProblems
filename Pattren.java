public class Pattren {
    public static void main(String[] args) {
        for(int i =0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                if(i==1&&j==1) System.out.print("   ");
                else System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
