package WildCodeSchool;

public class Wilder {
    //attibuts
    private String firstName;
    private boolean aware;

    //constructeurs
    public Wilder(String firstName, boolean aware){
        this.firstName = firstName;
        this.aware = aware;
    }

    //getters
    public String getFirstName(){
     return this.firstName;
    }

    public boolean isAware(){
        return this.aware;
    }

    //setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setAware(boolean aware){
        this.aware = aware;
    }

    //méthode
    public String whoAmI(){
        if (this.aware){
            return "Je m'appelle " + this.firstName + " et je suis aware";
        } else {
            return "Je m'appelle " + this.firstName + " et je ne suis pas aware";
        }
    }
}
