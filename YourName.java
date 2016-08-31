public class YourName {
  
  private static String name = "Mouhssine";
  private static String surname = "Benhallouk";
  private static String Sex = "Male";
  private static int age = 34;
  private static String Adress = "Entree 3 rue du Haut des vignes 54320 Maxville";
  
  public static void main(String[] args) {
    System.out.println("My Personal Data :");
    System.out.println("my name is :"+name);
  	System.out.println("my surname is :"+surname);
    System.out.println("my sex is :"+Sex);
    System.out.println("my age is :"+age);
    System.out.println("my adress is :"+Adress);
    
    // string sex = while(sex==male || sex==female)
    
    
    if(age<4 && Sex=="female")
      System.out.println("hello kitty");
    
     if(age<16 && Sex=="Male")
      System.out.println("hello boy");
    
     if(age>18 && Sex=="female")
      System.out.println("hello lady");
    
     if(age>16 && Sex=="Male")
      System.out.println("hi");
    
    
    
    
    
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