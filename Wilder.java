public class Wilder {
    private String firstName;
    private boolean aware;

    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoIAm() {
        return "Je m'appelle " + this.firstName + " et "+ (this.aware ? "je suis" : "je ne suis pas") + " aware";
    }
}
