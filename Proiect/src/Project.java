import java.util.*;
import java.util.Random;
import java.lang.Integer;

public class Project {

    static Scanner clasa = new Scanner(System.in);
    static Random lupta = new Random();

    public static void main(String[] args) {

        System.out.println("Welcome. Tell me your name...");
        String nume = clasa.nextLine();


        System.out.println("Nice, " + nume + ". Now choose your class... You can choose between Warrior(w), Mage(m) or Archer(a)");
        Character character = null;
        String characterClass = clasa.nextLine();
        delay dl = new delay();
        dl.delay();


        if (characterClass.equals("w")) {
            System.out.println("This is your true self...");
            dl.delay();
            character = new Warrior();
        } else if (characterClass.equals("m")) {
            System.out.println("This is your true self...");
            dl.delay();
            character = new Mage();
        } else if (characterClass.equals("a")) {
            System.out.println("This is your true self...");
            dl.delay();
            character = new Archer();
        } else {
            System.out.println("This is not you. Away!");}


            System.out.println(character.Name);
            System.out.println("HP: " + character.HP);
            System.out.println("Weapon: " + character.Weapon);
            System.out.println("Base Attack: " + character.baseAttack);
            System.out.println("\n");

            dl.delay();
            System.out.println("This is your enemy... Good luck!");
            dl.delay();
            Enemy en = new Enemy();
            System.out.println("Name: " + en.Name);
            System.out.println("HP: " + en.HP);
            System.out.println("Weapon: " + en.Weapon);
            System.out.println("Base Attack: " + en.baseAttack);
            System.out.println("\n");

            dl.delay();





            Narator n = new Narator();
            System.out.println(n.spune());
        }

    }








    class delay {
        public void delay() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    class Narator {
        public String nareaza = "Welcome, adventurer";

        public String spune() {
            return nareaza;
        }

    }

    class Character {
        protected int HP;
        protected String Weapon;
        protected int baseAttack;

        public Character(int HP, String Weapon, int baseAttack, String Name) {
            this.HP = HP;
            this.Weapon = Weapon;
            this.baseAttack = baseAttack;
            this.Name = Name;
        }

        protected String Name;
    }

    class Enemy extends Character {
        public Enemy() {
            super(75, "Mace", 7, "Goblin");
        }
    }

    class Warrior extends Character {

        public Warrior() {
            super(100, "Axe", 10, "Warrior");
        }
    }

    class Mage extends Character {
        public Mage() {
            super(50, "Staff", 2, "Mage");
        }
    }

    class Archer extends Character {
        public Archer() {
            super(75, "Bow", 5, "Archer");
        }
    }

    class Dice {
        private final Random random = new Random();

        public int roll(int max) {
            return 1 + random.nextInt(max);
        }

        public int roll6() {
            return roll(6);
        }

    }


