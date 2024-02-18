public class Wizard implements Type {
    public String attack() {
        CastSpell castSpell = new CastSpell();
        return "WIZARD IS ATTACKING:\n" + castSpell.AttackEnemy();
    }

    public String defend() {
        CastMagicBarrier castMagicBarrier = new CastMagicBarrier();

        return "WIZARD IS DEFENDING:\nWizard is " + castMagicBarrier.DefendYourself();
    }
}
