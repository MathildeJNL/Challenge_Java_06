package WildCodeSchool;

public class Classroom {
    public static void main(String[] args){
        //instance
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);
        //on récupère l'instance de j-c et on utilisa sa méthode(whoAmI)
        System.out.println(jeanClaude.whoAmI());
        System.out.println(henri.whoAmI());
    }
}
