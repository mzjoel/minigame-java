import java.util.Scanner;

public class Character{
    protected String name;
    protected int health;
    protected int xp = 0;
    protected int power;
    protected String item;

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getXp(){
        return xp;
    }

    public int hit(int attack){
        if(attack < 0){
            return health;
        }
        health -= attack;
        return health;
    }
    

    public void increaseXp(int addXp){
        if(addXp < 0){
            return;
        }
        this.xp += addXp;
    }

    public void recoveryHP(int hp){
        this.health += hp;
    }

    public void increasePower(int damage){
        this.power += damage;
    }

    public void checkStatus(){
        System.out.println("Status "+getName());
        System.out.println("HP: "+getHealth());
        System.out.println("XP: "+getXp());
    }


}


class MainCharacter extends Character {
    private String role;

    public String Role(){
        return role;
    }

    public MainCharacter(String name, String role){
        switch(role.toLowerCase()){
            case "paladin":
            case "1":
                this.health = 100;
                this.name = name;
                this.role = "Paladin";
                break;
            case "knight":
            case "2":
                this.health = 100;
                this.name = name;
                this.role = "Knight";
                break;
            case "Assassin":
            case "3":
                this.health = 100;
                this.name = name;
                this.role = "Assassin";
                break;
            default:
                this.health = 100;
                this.name = name;
                this.role = "Warrior";
                break;


        }
    }

    public static MainCharacter introduction(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di Mini Geme OOP Java !\nSilahkan lengkapi biodata dibawah ini");
        System.out.print("Nama: ");
        String userName = scanner.nextLine();
        System.out.println("Pada game ini terdiri dari 3 role karakter\n 1. Paladin \n 2. Knight \n 3. Assassin \nPilih role yang kamu inginkan !");
        String userRole = scanner.nextLine();

        MainCharacter mainCharacter = new MainCharacter(userName, userRole);

        System.out.println(mainCharacter.getName()+" telah memilih sebagai "+mainCharacter.Role());
        return mainCharacter;
    }

}

class VillainCharacter extends Character{
    public int bonusXp;

    public VillainCharacter(String name, int bonusXp){
        this.name = name;
        this.health = 100;
        this.xp = bonusXp;
    }
}