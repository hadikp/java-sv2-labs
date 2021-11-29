package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    private boolean oneHit(Character attacker, Character defender) {
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
            return true;
        }
        return false;
    }

    public Character fight(Character one, Character other) {
        do{
            oneHit(one, other);
            round++;
            String oneS = String.format("Axewarior: %d", one.getActualPrimaryDamage());
            String twoS = String.format("Archer sebzés: %d", other.getActualPrimaryDamage());
            System.out.println(oneS);
            System.out.println(twoS);
        } while (oneHit(other, one));
        if (one.isAlive()) {
            return one;
        } else {
            return other;
        }
    }

    public int getRound() {
        return round;
    }


}
