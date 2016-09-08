import java.io.Console;

public class PsychologicalTest {


    private static String question1 = "You walk into the wood. You are not alone, Who would be with you?";
    private static String question2 = "You continue to walk. You see an animal. What animal would it be?";
    private static String question3 = "Describe the interaction between you and that animal is it a passive or aggressive?";
    private static String question4 = "You keep walking and you find yourself front of your dream house. How big is this house?";
    private static String question5 = "Your dream house is it fenced or not?";
    private static String question6 = "You enter inside the house. You see the dining room and the table. Describe what you see on that table.";
    private static String question7 = "You exit the house through a back door. You find a cup on the ground. Of which material is this cup?";
    private static String question8 = "What would you do with this cup?";
    private static String question9 = "You keep walking in the back of your house until you find a water area, is it a stream, a river, or a lake?";
    private static String question10 = "Did you go across this water area?";


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        System.out.println("Please be honest in every answer you give and follow the instructions bellow for the most optimum results:");
        System.out.println("");
        System.out.println("");
        System.out.println("1- Read carfully every question and imagine the scences.");      
        System.out.println("2- Do not think too much. answer as the first thing that comes to your mind.");
        System.out.println("");
        System.out.println("");
        System.out.println("Once all the questions are answered, we will print the analysis.");        

        System.out.println("");
        System.out.println("");

        Console console = System.console();

        console.readLine("Press enter when you are ready...");  

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 1 : "+question1);        
        String answer1_1 = console.readLine("Please give your answer:");

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 2 : "+question2);        
        String answer1_2 = console.readLine("Please give your answer:");

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 3 : "+question3);        
        String answer1_3 = console.readLine("Please give your answer:");

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 4 : "+question4);
        String answer1_4 = console.readLine("Please give your answer:");

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 5 : "+question5);
        String answer1_5 = console.readLine("Please give your answer:");

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 6 : "+question6);        
        String answer1_6 = console.readLine("Please give your answer:");

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 7 : "+question7);        
        String answer1_7 = console.readLine("Please give your answer:");

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 8 : "+question8);        
        String answer1_8 = console.readLine("Please give your answer:");

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 9 : "+question9);        
        String answer1_9 = console.readLine("Please give your answer:");

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println("Question 10 : "+question10);        
        String answer1_10 = console.readLine("Please give your answer:");



        String answer1 = "The person you are walking with is the most important person in your life : ";

        String answer2 = "The size of the animal you find represent the size of your problems : ";

        String answer3 = "The interaction you have with the animal represents how you deal with this problems : ";

        String answer4 = "The size of your dream house represent your desire to solve this problems : ";

        String answer5 = "If there is no fence, you are gestfull : "; 

        String answer6 = "If your answer includes flowers, food or people, you are usually happy : ";

        String answer7 = "The cup material represent the durability of your relationship with the person you pointed in the answer 1 : ";

        String answer8 = "Dealing with the cup represents your behavior towards the person in answer 1 : ";

        String answer9 = "The volume of the water is proportional to your libido : ";

        String answer10 = "Crossing the water means the desire to satisfy your libido : ";

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        System.out.println(" Here are the results :");

        System.out.println("");
        System.out.println("");

        System.out.println(" Answer 1  : "+answer1+" "+answer1_1);
        System.out.println(" Answer 2  : "+answer2+" "+answer1_2);
        System.out.println(" Answer 3  : "+answer3+" "+answer1_3);
        System.out.println(" Answer 4  : "+answer4+" "+answer1_4);
        System.out.println(" Answer 5  : "+answer5+" "+answer1_5);
        System.out.println(" Answer 6  : "+answer6+" "+answer1_6);
        System.out.println(" Answer 7  : "+answer7+" "+answer1_7);
        System.out.println(" Answer 8  : "+answer8+" "+answer1_8);
        System.out.println(" Answer 9  : "+answer9+" "+answer1_9);
        System.out.println(" Answer 10 : "+answer10+" "+answer1_10);

        System.out.println("");
        System.out.println("");

        System.out.println("Thank you for showing my application to people you know");
    
 	}
}