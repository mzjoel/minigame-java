import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainCharacter mainCharacter = MainCharacter.introduction();
        VillainCharacter snake = new VillainCharacter("Ular Raksasa", 10);

        Scene snakeScene = new Scene(
            "Kamu sedang menghadapi " + snake.getName() + " untuk mengalahkannya kamu harus bisa menjawab soal dengan benar. Tapi jika kamu gagal menjawab soal kamu akan diserang",
            "1. Apa yang membedakan void method dan value method?\n A. Void method mengembalikan nilai, sedangkan value method tidak mengembalikan nilai\n B. Void method tidak mengembalikan nilai, sedangkan value method mengembalikan nilai\n C. Void method dan value method keduanya mengembalikan\n D. Value method hanya bisa digunakan dalam class statis",
            "A", 
            snake.getXp(), 
            null
        );

        


        Story story = new Story(snakeScene, mainCharacter, snake);
        story.start();

        scanner.close();
    }
}
