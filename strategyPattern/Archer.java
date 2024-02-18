public class Archer implements Type {
    public String attack() {
        ShootArrows shootArrows = new ShootArrows();
        return "ARCHER IS ATTACKING:\n" + shootArrows.AttackEnemy();

    }

    public String defend() {
        Shield shield = new Shield();

        return "ARCHER IS DEFENDING:\nArcher is " + shield.DefendYourself();
    }
}
