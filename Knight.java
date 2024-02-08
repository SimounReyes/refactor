public class Knight implements Type{
    public String attack(){
        String att = "Knight attacks with a sword!";
        return att;
    }

    public String defend(){
        String def = "";
        def += "Using a shield to defend!\n";
        def += "Dodgin to avoid attack!\n";
        def += "Creating a magic barrier for defense!";
       	
        return def;
    }
}