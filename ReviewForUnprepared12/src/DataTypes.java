import java.util.Scanner;

public class DataTypes {
    private boolean stayInData = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Messages
    private final String GREETMESSAGE = "asdf";
    private final String DATATYPES = "asdf";
    private final String PRIMITIVES = "asdf";

    public DataTypes() {
        dataTypesStart();
    }

    private void dataTypesStart(){
        while(stayInData){
            System.out.println();
            userChoice = scanner.nextInt();
            switch(userChoice){
                case 0:
                    stayInData = false;
                    break;
                case 1:
                    printIfMessages();
                    break;
                case 2:
                    System.out.println("");
                    break;

            }
        }
    }

    private void printIfMessages(){
        System.out.println();
        System.out.println();
    }


}