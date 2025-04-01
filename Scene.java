import java.util.Scanner;

public class Scene {
    private String description;
    private String questions;
    private String answer;
    private Scene nextScene;
    private int xp;

    public Scene(String description, String questions, String answer, int xp, Scene nextScene) {
        this.description = description;
        this.questions = questions;
        this.answer = answer.trim().toUpperCase(); // Normalisasi jawaban
        this.xp = xp;
        this.nextScene = nextScene;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public Scene play(MainCharacter player, VillainCharacter villain) {
        System.out.println(description);
        while (true) {
            if (player.getHealth() <= 0) {
                System.out.println("You Lose !!!");
                return null;
            }
        
            System.out.println(questions);
            System.out.print("Jawaban: ");

            if (!scanner.hasNextLine()) {
                System.out.println("Input tidak ada. Game Berhenti");
                return null;
            }

            String choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals(answer)) {
                int attack = 100;
                System.out.println("Jawabanmu Benar! Kamu mengalahkan " + villain.getName() + " dengan Hit: " + attack);
                villain.hit(attack);
                player.increaseXp(villain.getXp());
                player.checkStatus();
                if (nextScene == null) {
                    System.out.println("To Be Continued...");
    
                    return null;
                }
                return nextScene;
            }

            int attack = 5;
            player.hit(attack);
            System.out.println("Jawabanmu Salah! Kamu diserang oleh " + villain.getName() + " dengan serangan " + attack);
            player.checkStatus();

            if (player.getHealth() <= 0) {
                System.out.println("Game Over! Kamu kehabisan nyawa.");
                return null;
            }
        }
    }
}

