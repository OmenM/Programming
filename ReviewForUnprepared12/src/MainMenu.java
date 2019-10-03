import java.util.Scanner;

public class MainMenu {
    public static boolean cont = true;
    Scanner scanner = new Scanner(System.in);
    int userChoice;
    //messages
    String introMessage = "Welcome to the Java help center. Select from one of the following options below.  When you are at the main menu enter '0' to exit.";
    String options = "1. Control Flow\n2. Data Types\n3. Objects\n4. Array List Class\n5. Java I/O\n0. Exit";


    public void mainMenuStart(){
        System.out.println(introMessage);
        System.out.println(options);
        userChoice = scanner.nextInt();
        switch(userChoice){
            case 0:
                System.out.println("Thank you come again");
                cont = false;
                break;
            case 1:
                DataTypes controlFlow = new DataTypes();
                break;
            case 2:
                DataTypes dataTypes = new DataTypes();
                break;
            case 3:
                Objects objects = new Objects() ;
                break;
            case 4:
                ArrayListClass arrayListClass = new ArrayListClass();
                break;
            case 5:
                JavaIO javaIO = new JavaIO();
                break;

        }
    }
}
