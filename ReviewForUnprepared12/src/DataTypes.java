import java.util.Scanner;

public class DataTypes {
    private boolean stayInData = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Messages
    private final String GREETMESSAGE = "Data Types Options:\n1. Primitive Operators \n2. Comparable Operators";
    private final String DATATYPES = "There are 2 kinds of data types in Java";
    private final String PRIMITIVES = "There are 8 primitives in Java\n boolean ; byte\n char ; short\n int ; long\n float ; double";
    private final String COMPARATIVES = "Comparatives";

    public DataTypes() {
        dataTypesStart();
    }

    private void dataTypesStart(){
        while(stayInData){
            System.out.println(GREETMESSAGE);
            userChoice = scanner.nextInt();
            switch(userChoice){
                case 0:
                    stayInData = false;
                    break;
                case 1:
                    printDataTypes();
                    break;
                case 2:
                    System.out.println("asdf");
                    break;

            }
        }
    }

    private void printDataTypes(){
        System.out.println(DATATYPES);
        System.out.println(GREETMESSAGE);
    }


}