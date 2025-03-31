public class Character{
    private String name;
    private int health;
    private int XP = 0;
    private String item;

    public Character(int health, String name){
            this.name = name;
            this.health = health;
    }

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
