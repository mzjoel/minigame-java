public class Story {
    private Scene currentScene;
    private MainCharacter player;
    private VillainCharacter villain;

    public Story(Scene startingScene, MainCharacter player, VillainCharacter villain) {
        this.currentScene = startingScene;
        this.player = player;
        this.villain = villain;
    }

    public void start() {
        while (currentScene != null) {
            currentScene = currentScene.play(player, villain);
        }
    }
}
