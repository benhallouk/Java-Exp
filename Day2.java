public class Day2 {  
  //value types
  private static boolean isMale = false;
  private static char letterA = 'A';
  private static int numberOne = 1;
  
  //refferance type
  private static String address = "Rue 31";
  //array of integer
  private static int[] numbers = new int[5];
  //array of string
  private static String[] boysName = new String[5];
  //Or ny object

    
  public static void main(String[] args) {
    
    System.out.println("You first char in the address is " + address.charAt(1));    
    System.out.println("You char is " + letterA);   
    
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;
    
    if(isMale){
      System.out.println("You are a male");
    }
    else{
      System.out.println("You are a female");
    }         
    
    for(int index=0;index<5;index++){
      System.out.println("In index "+index+" You have the value "+numbers[index]);
    }
    
 	}
}