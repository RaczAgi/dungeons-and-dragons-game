package model;

public class Monster {
    protected String name;
    protected int health;

    // Vegyél fel két fieldet: name (String) és health (int)

    // Írj egy két paraméteres kosntruktort ami beállítja az attribútumok értékeit!
    public Monster(String name, int healt){
this.name = name;
this.health = healt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Character player) {
        // Írd ki: [szörny neve] attacks [játékos neve]!
        System.out.println(name + " attacks " + player.name);

        // Csökkentsd a játékos életét 20-szal!
player.health = player.health-20;
        // Írd ki: Dealt 20 damage to [játékos neve]!
        System.out.println("Dealt 20 damage to " + player.name);
        // Ha a játékos élete 0 vagy kisebb, írd ki: [játékos neve] has been defeated!
if (player.health <= 0) {
    System.out.println(player.name + "has been defeated!");
}
    }
}