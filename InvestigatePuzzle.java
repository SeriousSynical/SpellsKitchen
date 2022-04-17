
import java.util.Scanner;
public class InvestigatePuzzle {
    static boolean firstRun = true;
    static String rugState = "crooked";
    static String paintingState = "";
    static String drawersState = "";
    static boolean safeFound = false;
    static String colorGuess = "";
    static int codeGuess = 000;
    static boolean colorFound = false;
    static boolean colorSuccess = false;
    static boolean codeFound = false;
    static boolean codeSuccess = false;
    static int codeGuesses = 0;
    static boolean ok = false;
    public static void main(String[] args) {
        // This main method only exists for testing purposes, for the actual game InvestigatePuzzle.start(); will be the call.
        start();
        }

    public static void start(){
        String investigateChoice;
        int userIntChoice = 0;
        String mainTextDisplay = "";
        Scanner kb = new Scanner(System.in);
        do{
        if(firstRun){
            mainTextDisplay = "You entered the room. \nThere are three noticeable objects, a desk with drawers, a painting, and a crooked rug.";
        }else if(safeFound){
            mainTextDisplay = "There are three noticeable objects, a desk with drawers, a painting, and a safe in the floor."+paintingState+drawersState;
        }else{
            mainTextDisplay = "There are three noticeable objects, a desk with drawers, a painting, and a "+rugState+" rug."+paintingState+drawersState;
        }
        firstRun = false;
        System.out.println(mainTextDisplay);
        System.out.print("Which object do you want to investigate? Or say 'return' if you want to return to the main room.\n");
        investigateChoice = kb.nextLine();
        investigateChoice.toLowerCase();
        if(investigateChoice.equals("painting")){
            do{
                System.out.println("You look at the painting, do you want to..:\n1: Remove the painting\n2: Inspect the painting\n3: Go back");
                do{
                    if(kb.hasNextInt()){
                        userIntChoice = kb.nextInt();
                        kb.nextLine();
                        ok = true;
                    }else{
                        System.out.println("Try entering an integer.");
                        kb.nextLine();
                    }
                }while(!ok);
                switch(userIntChoice){
                    case 1:
                        System.out.println("You remove the painting, there is nothing behind it. You feel as though that was a terrible decision.\nYou put the painting back.");
                    break;
                    case 2:
                        System.out.println("You look closely at the painting, you notice that every color used is a shade of blue.");
                        paintingState = "\nYou've investigated the painting.";
                        colorFound = true;
                    break;
                    case 3:
                        System.out.println("You return to the room overview.");
                        // put a method call to start();
                    break;
                    default:
                        System.out.println("Please select an integer from 1 to 3.");
                    break;
                }
            }while(userIntChoice!=3);
        }else if(investigateChoice.equals("rug")&&!safeFound){
            do{
                if(!safeFound){
                System.out.println("You investigate the "+rugState+" rug, do you want to..:\n1: Straighten the rug\n2: Remove the rug\n3: Go back");
                do{
                    if(kb.hasNextInt()){
                        userIntChoice = kb.nextInt();
                        kb.nextLine();
                        ok = true;
                    }else{
                        System.out.println("Try entering an integer.");
                        kb.nextLine();
                    }
                }while(!ok);
                switch(userIntChoice){
                case 1:
                        System.out.println("You straighten the rug.\n Much better.");
                        rugState = "straightened";
                    break;
                case 2:
                        System.out.println("You remove the rug and find a safe built into the floor.\nThe safe seems to have a 3 digit code and a panel that is able to cycle through colors.");
                        safeFound = true;
                    break;
                case 3:
                        System.out.println("You return to the room overview.");
                    break;
                default:
                        System.out.println("Please select an integer from 1 to 3.");
                    break;
                    }
                
                }else{
                    if(codeSuccess&&colorSuccess){
                        // "You received a FINAL_PUZZLE_ITEM" SHOULD BE CHANGED BEFORE FINAL PUSH. THIS IS JUST PLACEHOLDER.
                        System.out.println("You entered the correct color and code, and opened the safe.\nYou received a FINAL_PUZZLE_ITEM.");
                        userIntChoice = 3;
                        // Add final puzzle item to inventory and return to main room.
                    }else{
                            System.out.println("You check the safe, do you want to..:\n1: Input the color\n2: Input the code\n3: Go back");
                            do{
                                if(kb.hasNextInt()){
                                    userIntChoice = kb.nextInt();
                                    kb.nextLine();
                                    ok = true;
                                }else{
                                    System.out.println("Try entering an integer.");
                                    kb.nextLine();
                                }
                            }while(!ok);
                            switch(userIntChoice){
                            case 1:
                                    if(colorFound){
                                        System.out.print("Please enter the color you discovered about the painting: ");
                                        colorGuess = kb.nextLine();
                                        colorGuess.toLowerCase();
                                        if(colorGuess.equals("blue")){
                                            System.out.println("You cycled the panel to "+colorGuess+". You hear a click.");
                                            colorSuccess = true;
                                        }else{
                                            System.out.println("You cycled the panel to "+colorGuess+". You don't hear any feedback from the safe.");
                                            colorSuccess = false;
                                        }
                                    }else{
                                        System.out.println("You do not have the information to solve this yet.");
                                    }
                                break;
                            case 2:
                                    if(codeFound){
                                        System.out.print("Please enter the 3 digit code: ");
                                        do{
                                            if(kb.hasNextInt()){
                                                codeGuess = kb.nextInt();
                                                kb.nextLine();
                                                ok = true;
                                            }else{
                                                System.out.println("Try entering an integer.");
                                                kb.nextLine();
                                            }
                                        }while(!ok);
                                        if(codeGuess == 432){
                                            System.out.println("You entered the code "+codeGuess+". You hear a click.");
                                            codeSuccess = true;
                                        }else{
                                            System.out.println("You entered the code "+codeGuess+". You don't hear any feedback from the safe.");
                                            codeGuesses++;
                                            if(codeGuesses>=2){
                                                // Remove the inventory text if we decide to not add the paper to inventory.
                                                System.out.println("Tip: Do you remember the slip of paper you got from the desk? Try checking your inventory.");
                                            }
                                            codeSuccess = false;
                                        }
                                    }else{
                                        System.out.println("You do not have the information to solve this yet.");
                                    }
                                break;
                            case 3:
                                    System.out.println("You return to the room overview.");
                                break;
                            default:
                                    System.out.println("Please select an integer from 1 to 3.");
                                break;
                                }
                }
            }
            }while(userIntChoice!=3);
            }else if(safeFound&&(investigateChoice.equals("rug")||investigateChoice.equals("safe"))){
                if(codeSuccess&&colorSuccess){
                    // "You received a FINAL_PUZZLE_ITEM" SHOULD BE CHANGED BEFORE FINAL PUSH. THIS IS JUST PLACEHOLDER.
                    System.out.println("You entered the correct color and code, and opened the safe.\nYou received a FINAL_PUZZLE_ITEM.");
                    // Add final puzzle item to inventory and return to main room.
                }else{
                    do{
                        System.out.println("You check the safe, do you want to..:\n1: Input the color\n2: Input the code\n3: Go back");
                        do{
                            if(kb.hasNextInt()){
                                userIntChoice = kb.nextInt();
                                kb.nextLine();
                                ok = true;
                            }else{
                                System.out.println("Try entering an integer.");
                                kb.nextLine();
                            }
                        }while(!ok);
                        switch(userIntChoice){
                        case 1:
                                if(colorFound){
                                    System.out.print("Please enter the color you discovered about the painting: ");
                                    colorGuess = kb.nextLine();
                                    colorGuess.toLowerCase();
                                    if(colorGuess.equals("blue")){
                                        System.out.println("You cycled the panel to "+colorGuess+". You hear a click.");
                                        colorSuccess = true;
                                    }else{
                                        System.out.println("You cycled the panel to "+colorGuess+". You don't hear any feedback from the safe.");
                                        colorSuccess = false;
                                    }
                                }else{
                                    System.out.println("You do not have the information to solve this yet.");
                                }
                            break;
                        case 2:
                                if(codeFound){
                                    System.out.print("Please enter the 3 digit code: ");
                                    do{
                                        if(kb.hasNextInt()){
                                            codeGuess = kb.nextInt();
                                            kb.nextLine();
                                            ok = true;
                                        }else{
                                            System.out.println("Try entering an integer.");
                                            kb.nextLine();
                                        }
                                    }while(!ok);
                                    if(codeGuess == 432){
                                        System.out.println("You entered the code "+codeGuess+". You hear a click.");
                                        codeSuccess = true;
                                    }else{
                                        System.out.println("You entered the code "+codeGuess+". You don't hear any feedback from the safe.");
                                        codeGuesses++;
                                        if(codeGuesses>=2){
                                            // Remove the inventory text if we decide to not add the paper to inventory.
                                            System.out.println("Tip: Do you remember the slip of paper you got from the desk? Try checking your inventory.");
                                        }
                                        codeSuccess = false;
                                    }
                                }else{
                                    System.out.println("You do not have the information to solve this yet.");
                                }
                            break;
                        case 3:
                                System.out.println("You return to the room overview.");
                            break;
                        default:
                                System.out.println("Please select an integer from 1 to 3.");
                            break;
                            }
                        
                    }while(userIntChoice!=3);
                }
            }else if(investigateChoice.equals("desk")||investigateChoice.equals("drawers")||investigateChoice.equals("desk with drawers")){
                do{
                    System.out.println("You check the desk, do you want to..:\n1: Search the drawers\n2: Go back");
                    do{
                        if(kb.hasNextInt()){
                            userIntChoice = kb.nextInt();
                            kb.nextLine();
                            ok = true;
                        }else{
                            System.out.println("Try entering an integer.");
                            kb.nextLine();
                        }
                    }while(!ok);
                    switch(userIntChoice){
                    case 1:
                            System.out.println("You search every drawer thoroughly, you find a piece of paper with the time 4:32 written down.");
                            drawersState = "\nYou've searched the desk.";
                            codeFound = true;
                            //Add to inventory?
                        break;
                    case 2:
                            System.out.println("You return to the room overview.");
                            // put a method call to start();
                        break;
                    default:
                            System.out.println("Please select an integer, either 1 or 2.");
                        break;
                        }
                    
                }while(userIntChoice!=2);
            }else{
                if(!safeFound){
                    System.out.println("Please enter any of the following: 'rug' , 'painting' , 'desk' 'drawers' 'desk with drawers' , or 'return' to go back to the main room.");
                }else{
                    System.out.println("Please enter any of the following: 'safe' 'rug' , 'painting' , 'desk' 'drawers' 'desk with drawers' , or 'return' to go back to the main room.");
                }
            }
            }while(!investigateChoice.equals("return"));
            kb.close();
    }
}
