package drilltwo;
public class SubstringDemo 
{
   public static void main(String[] args) 
   {
      String strInput = "REST ASSURED";
      String[] split = strInput.split(" ");
      String strOutput = strInput.substring(0, strInput.length()-1);
      String result = split[0].substring(0, 2);
      
      
      System.out.println(result +" "+ split[1]);
   }
}
