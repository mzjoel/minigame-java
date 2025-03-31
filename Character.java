public class Character{
    protected String name;
    protected int health;
    protected int XP = 0;
    protected String item;
    protected int attack;
    protected int defense;
    protected int xpGain;

    public Character(){}

    public void takeDamage(int damage){
        if(damage < 0){
            System.out.println("Damage Harus Positif");
            return;
        }
        health -= damage;
        return;
    }
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

}


class MainCharacter extends Character {
    private String role;
    

    public MainCharacter(String name, String role){
        if(role.equalsIgnoreCase("Paladin")){
            this.health = 100;
            this.name = name;
            this.role = "Paladin";
            this.attack = 30;
            this.defense = 20;
            this.xpGain = 5;
        }else if(role.equalsIgnoreCase("Knight")){
            this.health = 100;
            this.name = name;
            this.role = "Knight";
            this.attack = 20;
            this.defense = 20;
            this.xpGain = 15;
        }else if(role.equalsIgnoreCase("Assassin")){
            this.health = 100;
            this.name = name;
            this.role = "Assassins";
            this.attack = 10;
            this.defense = 15;
            this.xpGain = 20;
        }else{
            this.health = 100;
            this.name = name;
            this.role = "Warrior";
            this.attack = 5;
            this.defense = 5;
            this.xpGain = 5;
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