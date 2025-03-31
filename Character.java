import java.util.Scanner;

public class Character{
    protected String name;
    protected int health;
    protected int XP = 0;
    protected String item;
    protected int attack;
    protected int defense;
    protected int xpGain;

    public Character(){}


    public void addXP(int additionalXP){
        XP += additionalXP;
        return;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public String getItem(){
        return item;
    }

    public int getXP(){
        return XP;
    }
    public void setItem(String item){
        this.item = item;
    }

    public int takeDamage(int damage){
        if(damage < 0){
            System.out.println("Damage Harus Positif");
            return damage;
        }
        health -= damage;
        return damage;
    }


}


class MainCharacter extends Character {
    private String role;

    public MainCharacter(String name, String role){
        switch(role.toLowerCase()){
            case "paladin":
            case "1":
                this.health = 100;
                this.name = name;
                this.role = "Paladin";
                this.attack = 30;
                this.defense = 20;
                this.xpGain = 5;
                break;
            case "knight":
            case "2":
                this.health = 100;
                this.name = name;
                this.role = "Knight";
                this.attack = 20;
                this.defense = 20;
                this.xpGain = 15;
                break;
            case "Assassin":
            case "3":
                this.health = 100;
                this.name = name;
                this.role = "Assassin";
                this.attack = 10;
                this.defense = 15;
                this.xpGain = 20;
                break;
            default:
                this.health = 100;
                this.name = name;
                this.role = "Warrior";
                this.attack = 5;
                this.defense = 5;
                this.xpGain = 5;
                break;


        }
    }

    public String Role(){
        return role;
    }

    public int attackDamage(){
        return attack;
    }

    public int Defense(){
        return defense;
    }

    public int getXP(){
        return xpGain;
    }

    public static MainCharacter introduction(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di Mini Geme OOP Java !\nSilahkan lengkapi biodata dibawah ini");
        System.out.print("Nama: ");
        String userName = scanner.nextLine();
        System.out.println("Pada game ini terdiri dari 3 role karakter\n 1. Paladin \n 2. Knight \n 3. Assassin \nPilih role yang kamu inginkan !");
        String userRole = scanner.nextLine();

        MainCharacter mainCharacter = new MainCharacter(userName, userRole);

        System.out.println("\n ==== Biodata Karakter ==== ");
        System.out.println("Nama: "+mainCharacter.getName());
        System.out.println("Role: "+mainCharacter.Role());
        System.out.println("Health: "+mainCharacter.getHealth());
        System.out.println("Level Attack: "+mainCharacter.attackDamage());
        System.out.println("Tingkat Defense: "+mainCharacter.Defense());
        System.out.println("Selamat Berpetualang");

        return mainCharacter;
    }
}

class VillainCharacter extends Character{
    public VillainCharacter(String name, int XP){
        this.name = name;
        this.health = 100;
        this.attack = 3;
        this.XP = XP;
    }
    public int attack(){ return attack;}
}