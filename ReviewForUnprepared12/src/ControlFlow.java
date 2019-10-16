import java.util.Scanner;

public class ControlFlow {
    private boolean stayInControl = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Messages
    private final String GREETMESSAGE = "Control Flow Options:\n1. if/else if/ else statements\n2. while loop, for loops\n3. switch statement\n0. exit to main menu";
    private final String IFSTATEMENTS = "If statements are used in java to let the system make decisions.  It creates branching programs.  If statements are based on booleans.  If the condition is true then the block of code will execute.  If the statement is false the block of code will be skipped over and the program continues to run.  ";
    private final String IFSTATEMENTSEXAMPLE = "Example:\nif(condition){\n\tblock of code\n}";
    private final String WHILELOOPS = "While Loops run and execute a block of code while the condition is true.";
    private final String WHILESYNTAX = "while (condition) {\n BLOCK OF CODE \n }";

    public ControlFlow() {
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
                    break;
                case 2:
                    System.out.println("loops");
                    break;
                case 3 :
                    printLoopMessages();
                    break;
            }
        }
    }

    private void printIfMessages(){
        System.out.println(IFSTATEMENTS);
        System.out.println(IFSTATEMENTSEXAMPLE);
    }
    private void printLoopMessages(){
        System.out.println(WHILELOOPS);
        System.out.println(WHILESYNTAX);

    }


}