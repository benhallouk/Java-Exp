public class YourName {
  
  private static String name = "Amine";
  private static String surname = "Benhallouk";
  
  private static int age = 30;
  
  public static void main(String[] args) {
    System.out.println("Your name is :"+name);
		System.out.println("You surname is :"+surname);
    System.out.println("Your age is :"+age);
    
    if(age>20){
      System.out.println("You are old");
    }
    else{
      System.out.println("You are young");
    }
   
    int num = 1;
    //example of "or" while(num==1 || num==3)
    //example of "and" while(num==1 && num==3)
    while(num<5){
    	System.out.println("Vive RAJA");
      num++;
    }    
    System.out.println(num);
        
    for(int index=1;index<5;index++)
    {
      System.out.println("Vive OCS");
    }
    
    
    /*
    	Print your personal data sush as:
      	- name
        - surname
        - sex
        - age
        - adreess
        
        
      make some logic that you display:
      	- hello kity for age under 4 years and sex is female
        - hello boy for any age under 16 and sex male
        - hi lady for age above 18 and sex is femal
        - for anything else hi
    */
    
    
	}
   
}