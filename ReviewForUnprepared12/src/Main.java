public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();

        while(MainMenu.cont) {
            mainMenu.mainMenuStart();
        }

    }
}
