import java.util.*;

public class Solution {

    static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
          this.name = name;
          this.health = health;
          this.damagePerAttack = damagePerAttack;
        }
      }

public static String fightClub(Fighter fighter1, Fighter fighter2) {
    while (fighter1.health > 0 && fighter2.health > 0) {
        fighter2.health -= fighter1.damagePerAttack;
        if (fighter2.health <= 0) {
            return fighter1.name;
        }
        fighter1.health -= fighter2.damagePerAttack;
        if (fighter1.health <= 0) {
            return fighter2.name;
        }
    }
    return null; // should not happen
}


    public static void main(String args[]) {
        assert fightClub(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4)).equals("Lew") : "Expect \"Lew\" for (Lew,10,2) and (Harry,5,4)";
        System.out.println("All test cases in main function passed");
    }
}

