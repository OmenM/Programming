import java.util.Scanner;


public class DataTypes {
    private boolean stayInData = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Messages
    private final String GREETMESSAGE = "";
    private final String PRIMITIVETYPES = "There are 8 primitive types in Java : boolean, byte, char, short, int, long, float and double.";
    private final String PRIMITIVEOPERATORS = "";

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
                    printPrimitiveTypes();
                case 2:

            }
        }
    }

    private void printPrimitiveTypes(){
        System.out.println(PRIMITIVETYPES);

    }


}
