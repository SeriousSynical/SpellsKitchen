import java.util.Scanner;
import java.util.ArrayList;

import java.util.Random;

public class NumberPuzzle //extends character
{
    public void NumberPuzzle(Rooms room) {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        //variables
        int randomNumber;
        int guessedNumber;
        String message;
        boolean correct = false;


        //random number generator
        randomNumber = random.nextInt(1000) + 1;

        

        try 
        {
           //random insult generator
            ArrayList<String> insultList = new ArrayList<String>();
            insultList.add("Wrong number fool...");
            insultList.add("Your mom could guessed better...");
            insultList.add("Don't you have a brain?");
            insultList.add("Lost your head?");
            insultList.add("Disgrace...");
            insultList.add("Did you fail school? Twice?");
            insultList.add("Are you even trying?");
            insultList.add("HAHAHAAAAA how dumb...");
            insultList.add("WRONG");
            insultList.add("We are going to be here a while...");
            insultList.add("Sure, take your time...");
            insultList.add("Care to ask your mother?");
            insultList.add("I outta take a nap...continue...");
            
            
            
            //System.out.println(x);
            System.out.println("You see a cabinet with a crow a top");
            System.out.println("      ███████");  
            System.out.println("  ██████  ████");
            System.out.println("██████████████");   
            System.out.println("      ████████");  
            System.out.println("      ██████████"); 
            System.out.println("      ████████████████"); 
            System.out.println("      ██████████████████████ "); 
            System.out.println("      ████████████████████████████"); 
            System.out.println("        ████████████████████████████");                                   
            System.out.println("        ██████████████████████████████████"); 
            System.out.println("          ██████████████████████████████████"); 
            System.out.println("             ████████████████████████████████████████████"); 
            System.out.println("                  ███████████████████████████████████"); 
            System.out.println("                      ████████████████");   
            System.out.println("                          ██    ██"); 
            System.out.println("                          ██    ██"); 
            System.out.println("                          ██    ██");                                        
            System.out.println("                      ██████████████"); 
            System.out.println();
            System.out.println("\t \t░█████╗░██████╗░░█████╗░░██╗░░░░░░░██╗");
            System.out.println("\t \t██╔══██╗██╔══██╗██╔══██╗░██║░░██╗░░██║");
            System.out.println("\t \t██║░░╚═╝██████╔╝██║░░██║░╚██╗████╗██╔╝");
            System.out.println("\t \t██║░░██╗██╔══██╗██║░░██║░░████╔═████║░");
            System.out.println("\t \t╚█████╔╝██║░░██║╚█████╔╝░░╚██╔╝░╚██╔╝░");
            System.out.println("\t \t░╚════╝░╚═╝░░╚═╝░╚════╝░░░░╚═╝░░░╚═╝░░");
            System.out.println("");
                            

                                            
            System.out.println("Crow: Get the right number and I will give you a clue to get into that freezer.... ");

            do
            {
                System.out.println("Crow: Guess a number again between 1-1000.....");
                guessedNumber = kb.nextInt();
                

                if(guessedNumber < randomNumber)//guess is low
                {
                
                    int randomInsult = (int) (Math.random()*insultList.size());
                    
                    message = "Crow: " + guessedNumber + " is to low... " + insultList.get(randomInsult);
                    System.out.println(message);
                }
                else if(guessedNumber > randomNumber)//guess is high
                {
                    
                    int randomInsult = (int) (Math.random()*insultList.size());
                    
                    message = "Crow: " + guessedNumber + " is to high... " + insultList.get(randomInsult);
                    System.out.println(message);
                }
                else//guess is correct
                {
                    message = "Crow: At last " + guessedNumber + " is to correct...\n Now all you need to know is... 24 " +
                            "goes before! HAHAHAHAHAHA ";
                    System.out.println(message);
                    System.out.println("");
                    correct = true;

                }
            }while(correct == false); 
        } 
        catch (Exception e) 
        {
            guessedNumber = randomNumber;
            System.out.println("Incorrect Input Type you FOOL... I said guess a number.");
            System.out.println("Come back when you've cleared your head....");
            System.out.println("");
            kb.nextLine();
            
        }


    }  
}
