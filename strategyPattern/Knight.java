public class Knight implements Type {
    public String attack() {
        SwingSword swingSword = new SwingSword();

        return "KNIGHT IS ATTACKING:\n" + swingSword.AttackEnemy();
    }

    public String defend() {
        CastMagicBarrier castMagicBarrier = new CastMagicBarrier();
        Dodge dodge = new Dodge();
        Shield shield = new Shield();

        return "KNIGHT IS DEFENDING:\nKnight is " + shield.DefendYourself() +
                "\nKnight is " + dodge.DefendYourself() + "\nKnight is " + castMagicBarrier.DefendYourself();
    }
}
