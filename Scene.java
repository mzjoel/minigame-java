public class Scene {
    private String description, choiceA, choiceB, choiceC;
    private Scene nextSceneA, nextSceneB, nextSceneC;
    private int damageA, damageB, damageC, XPA, XPB, XPC;

    public Scene(String description, String choiceA, Scene nextSceneA, int damageA, int XPA,
                 String choiceB, Scene nextSceneB, int damageB, int XPB,
                 String choiceC, Scene nextSceneC, int damageC, int XPC) {
        this.description = description;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.nextSceneA = nextSceneA;
        this.nextSceneB = nextSceneB;
        this.nextSceneC = nextSceneC;
        this.damageA = damageA;
        this.damageB = damageB;
        this.damageC = damageC;
        this.XPA = XPA;
        this.XPB = XPB;
        this.XPC = XPC;
    }

    public void displayScene() {
        System.out.println(description);
        if (choiceA != null) {
            System.out.println("A: " + choiceA);
        }
        if (choiceB != null) {
            System.out.println("B: " + choiceB);
        }
        if (choiceC != null) {
            System.out.println("C: " + choiceC);
        }
    }

    public Scene makeChoice(String choice, MainCharacter player) {
    
        choice = choice.trim().toUpperCase();
    
        switch (choice) {
            case "A":
                player.takeDamage(damageA);
                player.addXP(XPA);
                if (nextSceneA == null) {
                    System.out.println("To Be Continued");
                    return null;
                }
                return nextSceneA;
            case "B":
                player.takeDamage(damageB);
                player.addXP(XPB);
                if (nextSceneB == null) {
                    System.out.println("To Be Continued");
                    return null;
                }
                return nextSceneB;
            case "C":
                player.takeDamage(damageC);
                player.addXP(XPC);
                if (nextSceneC == null) {
                    System.out.println("To Be Continued");
                    return null;
                }
                return nextSceneC;
            default:
                System.out.println("Pilihanmu tidak tersedia, tolong input ulang.");
                return null;
        }
    }

    public String getDescription() {
        return description;
    }

    public String optionA() {
        return choiceA;
    }

    public String optionB() {
        return choiceB;
    }

    public String optionC() {
        return choiceC;
    }
}
