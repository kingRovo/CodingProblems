
import java.util.*; 
import java.io.*;

class FindIntersaction {

  public static String FindIntersection(String[] strArr) {
    String[] str1 = strArr[0].split(", ");
    String[] str2 = strArr[1].split(", ");
    String rslt = "";
    
    for(int i = 0; i < str1.length; i++)
      for(int j = 0; j < str2.length; j++){
        if(str1[i].equals(str2[j])){
          if(rslt.length() == 0){
            rslt = str1[i];
          }
          else{
            rslt = rslt + "," + str1[i];
          }
        }
      }
    
    if(rslt.length() == 0){
      return "false";
    }
    
    return rslt;
  }

  public static void main (String[] args) {  
    
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}