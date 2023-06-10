import model.Monster;
import model.Character;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Kérd meg a felhasználót, hogy adja meg a karaktere nevét és ezt olvasd be egy változóba!
        // (Használj Scannert!)

        System.out.println("Give the name of your caracter");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Character player = new Character(name);
        // Példányosíts egy Charactert (hívd meg a konstruktorát) ezzel a változóval!
        // Írd ki: Welcome, [játékos neve]!

        System.out.println("Welcome " + player);
        // Készíts egy 3 hosszúságú tömböt Monster-ekből!

        Monster[] monsters = new Monster[3];

        // Töltsd fel szörnyekkel! Példa: monsters[0] = new Monster("Goblin", 50);

        monsters[0] = new Monster("Goblin", 50);
        monsters[1] = new Monster("Troll", 60);
        monsters[2] = new Monster("Dragon", 70);

        // Készíts egy gameOver nevű logikai változót, állítds az értékét false-ra!

        boolean gameOver = false;

        // Írj egy ciklust, ami addig tart amíg nincs vége a játéknek (amíg a gameOver nem true) ÉS
        // amíg a karakter élete 0-nál nagyobb!

        while (gameOver != true && player.getHealth() > 0) {


            // Írd ki: Choose a monster to fight of quit:

            System.out.println("Choose a monster to fight of quit:");
            // Írd ki: 0: Quit
            System.out.println("0: quit");
            // Írd ki a Monstereket tartalmazó tömb összes elemének a nevét ebben a formátumban:
            // 1: Goblin
            // 2: Troll
            // 3: Dragon
            System.out.println("1: Goblin");
            System.out.println("2: Troll");
            System.out.println("3: Dragon");

            // Olvasd be egy choice nevű változóba a felhasználótól, hogy mit választ: kilép vagy valamelyik
            // szörnnyel harcol!


            int choice = scanner.nextInt();

            // Ha azt választja, hogy kilép (0), írd ki: Thanks for playing! Goodbye.
            if (choice == 0) {
                System.out.println("Tanks for playing! Goodbye");
                gameOver = true;
            }
            // És állítsd be a gameOver változó értékét true-ra!

            // Ha jó inputot ad meg (1 és tömb hossza között) és harcol:
            // Tárold el egy Monster típusú változóban, hogy melyiket választotta a felhasználó!
            if (choice > 0 && choice <= monsters.length) {
                Monster choice1 = monsters[choice - 1];

                while (choice1.getHealth() > 0 && player.getHealth() > 0) {
                    player.attack(choice1);
                    if (choice1.getHealth() > 0) {
                        choice1.attack(player);
                    }
                }
            }

            // Írj egy ciklust, ami addig megy, amíg a szörny és a játékos élete is nagyobb mint 0!
            // Támadja meg a felhasználó karaktere a szörnyet!
            // Ha a szörny élete továbbra is nagyobb, mint 0, akkor a szörny támadjon vissza!

            // Ha rossz inputot ad meg, írd ki: Invalid choice!
            if (choice < 0 || choice > monsters.length) {
                System.out.println("Invalid choice!");
            }
        }
    }
}
