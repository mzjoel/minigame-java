import java.util.Scanner;

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player){
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start(){play();}
    public void play(){
        Scene currentScene = startScene;
        while(currentScene != null){
            currentScene.displayScene();
            System.out.print("Mana yang kamu pilih: ");
            String option = scanner.nextLine().trim();
            if(option.isEmpty()){
                System.out.println("Input Kamu Kosong");
                continue;
            }if(option.equalsIgnoreCase("EXIT")){
                System.out.println("Permainan berakhir. Terimas Kasih");
                break;
            }
            if(option.equalsIgnoreCase("INFO")){
                playerInformation();
                continue;
            }
            Scene nextScene = currentScene.makeChoice(option, player);
            if(nextScene == null)    {
                continue;
            }

            currentScene = nextScene;
            
        }
    }

    public void playerInformation(){
        System.out.println("INFORMASI");
        System.out.println("Nama: "+ player.getName());
        System.out.println("HP: "+player.getHealth());
        System.out.println("XP: "+player.getXP());
    }
}

