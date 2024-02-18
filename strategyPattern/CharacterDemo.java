public class CharacterDemo {
   public static void main(String[] args) {
      Character characterK = new Character(new Knight());
      Character characterW = new Character(new Wizard());
      Character characterA = new Character(new Archer());

      // System.out.println(characterA.defend());

      System.out.println(characterK.attack() + "\n\n" + characterK.defend());
      System.out.println("\n-----------------------------------------------\n");
      System.out.println(characterW.attack() + "\n\n" + characterW.defend());
      System.out.println("\n-----------------------------------------------\n");
      System.out.println(characterA.attack() + "\n\n" + characterA.defend());

   }
}
