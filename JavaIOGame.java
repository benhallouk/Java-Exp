import java.io.Console;

public class JavaIOGame { 

    public static void main (String args[]){

        String[] numbers = new String[]{"1","2","3","4","5","6","7","8"};
        
        
        int randomNumber = (int)(Math.random() * 8 + 1);

        System.out.println("The random number is : "+randomNumber);

        Console console = System.console();

        String givenNumber = console.readLine("Choose a number between 1 and 8 :");
        
        boolean correctNumber = false;

        for(int index=0;index<8;index++){
            if(givenNumber==numbers[index]){
                correctNumber = true;
            }
        }

        if(correctNumber){
            int number = Integer.parseInt(givenNumber);
        
            if(randomNumber==number) System.out.println("You win!");
            else System.out.println("You lose!");
        }
        else{
            System.out.println("Try again with a valid number");
        }
    }
    
}