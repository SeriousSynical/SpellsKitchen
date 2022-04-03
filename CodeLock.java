import java.util.Scanner;

public class CodeLock{
public void passcode(Player player, Rooms room) {

    int choice = 1;
    Scanner s = new Scanner(System.in);
    int answer = 249564;
    int input;
    do {

        System.out.println("Please enter the 6 digit code");
        input = s.nextInt();

        if (input == answer) {
            System.out.println("Welcome Chef");
            System.out.println(room.roomName + " Is now open");
            room.locked = false;
            choice=2;
        } else {
            System.out.println("Incorrect Passcode");
            System.out.println("Would you like to try again?");
            System.out.println("1: Yes | 2: No");


            choice = s.nextInt();
        }

    }
    while (choice==1);

    System.out.println("Goodbye");
    }
}
