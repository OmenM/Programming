import java.util.Scanner;

public class DataTypes {
    private boolean stayInData = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Messages
    private final String GREETMESSAGE = "";
    private final String IFSTATEMENTS = "";
    private final String IFSTATEMENTSEXAMPLE = "";

    public DataTypes () {dataTypesStart(); }

    private void dataTypesStart(){
        while(stayInData){
            System.out.println(GREETMESSAGE);
            userChoice = scanner.nextInt();
            switch(userChoice){
                case 0:
                    stayInData = false;
                    break;
                case 1:
                    printIfMessages();
                case 2:
                    System.out.println("Data");
            }
        }
    }

    private void printIfMessages(){
        System.out.println(IFSTATEMENTS);
        System.out.println(IFSTATEMENTSEXAMPLE);
    }


}
