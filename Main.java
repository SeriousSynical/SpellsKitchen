import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        run();

    }

    public static void run() {

        // Initialization
        boolean flag;
        boolean[] array = {true};
        int pronounsInt = 0;
        String name = null;
        Pronouns pronouns = null;
        Scanner keyboard = new Scanner(System.in);

        // Prompt Name & Pronouns
        flag = true;
        do {

            try {

                System.out.print("What is your name? \nName: ");
                name = keyboard.nextLine();
                flag = false;

            } catch (Exception e) {

                System.out.println("Invalid input. Try again.");

            }

        } while (flag);
        System.out.println();

        flag = true;
        do {

            try {

                System.out.print("What are your pronouns? \n1: he/him \n2: she/her \n3: they/them \nPronouns: ");
                pronounsInt = keyboard.nextInt();
                if (pronounsInt == 1) {

                    pronouns = Pronouns.masculine;
                    flag = false;

                } else if (pronounsInt == 2) {

                    pronouns = Pronouns.feminine;
                    flag = false;

                } else if (pronounsInt == 3) {

                    pronouns = Pronouns.nonBinary;
                    flag = false;

                } else {

                    System.out.println("Input out of bounds. Try again.");

                }

            } catch (Exception e) {

                System.out.println("Invalid input. Try again.");
                keyboard.nextLine();

            }

        } while (flag);
        System.out.println(keyboard.nextLine());

    }

}