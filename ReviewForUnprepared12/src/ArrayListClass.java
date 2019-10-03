import java.util.Scanner;

public class ArrayListClass {

        private boolean stayArrayList = true;
        private int userChoice;
        Scanner scanner = new Scanner(System.in);
        //Messages
        private final String GREETMESSAGE = "Array List Class Options\n1. What it does.\n2. How to instantiate it.\n3. Basic Methods it contains\n0. Exit To Main Menu.";
        private final String ARRAYLIST = "Array Lists are re-sizable arrangement of Java elements that expands or shrinks when elements are removed.";
        private final String ARRAYLISTDO = "ArrayLists create a list of inserted elements but cannot be used with primitives such as 'int, char etc.' ";
        private final String INSTANTIATE = "Here's how to instantiate an ArrayList";
        private final String ARRAYLISTEXAMPLE = "ArrayList<String> ex = new ArrayList<>();\n ex.add('1');\n ex.add('2');\n ex.add('3');";



        public ArrayListClass() {
            arrayListStart();
        }

        private void arrayListStart(){
            while(stayArrayList){
                System.out.println(GREETMESSAGE);
                userChoice = scanner.nextInt();
                switch(userChoice){
                    case 0:
                        stayArrayList = false;
                        break;
                    case 1:
                        printArrayListDo();
                        break;
                    case 2:
                        printInstantiate();
                        break;
                }
            }
        }

        private void printArrayListDo(){
            System.out.println(ARRAYLIST);
            System.out.println(ARRAYLISTDO);

        }
        private void printInstantiate(){
            System.out.println(INSTANTIATE);
            System.out.println(ARRAYLISTEXAMPLE);

        }

    }
