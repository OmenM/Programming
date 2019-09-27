import java.util.Scanner;

public class ArrayListClass {

        private boolean stayInControl = true;
        private int userChoice;
        Scanner scanner = new Scanner(System.in);
        //Messages
        private final String GREETMESSAGE = "sad";
        private final String IFSTATEMENTS = "";
        private final String IFSTATEMENTSEXAMPLE = "";

        public ArrayListClass() {
            controlFlowStart();
        }

        private void controlFlowStart(){
            while(stayInControl){
                System.out.println(GREETMESSAGE);
                userChoice = scanner.nextInt();
                switch(userChoice){
                    case 0:
                        stayInControl = false;
                        break;
                    case 1:
                        printIfMessages();
                    case 2:
                        System.out.println("loops");
                }
            }
        }

        private void printIfMessages(){
            System.out.println(IFSTATEMENTS);
            System.out.println(IFSTATEMENTSEXAMPLE);
        }


    }
