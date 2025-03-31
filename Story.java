import java.util.Scanner;

public class Story {
    private Scene startScene;
    private MainCharacter player;
    private Scanner scanner;

    public Story(Scene startingScene, MainCharacter player) {
        this.startScene = startingScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (startScene != null) {
            startScene.displayScene();
            System.out.print("Pilih A, B, atau C: ");
            String choice = scanner.nextLine();
            Scene nextScene = startScene.makeChoice(choice, player);

            if (nextScene == null) {
                System.out.println("To Be Continue");
                break; // Keluar dari loop
            }

            startScene = nextScene;
        }
    }

    public void playerInformation(){
        System.out.println("INFORMASI");
        System.out.println("Nama: "+ player.getName());
        System.out.println("HP: "+player.getHealth());
        System.out.println("XP: "+player.getXP());
    }
}

