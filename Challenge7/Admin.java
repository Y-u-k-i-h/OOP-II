package Challenge7;

public class Admin extends Account{
    private String authPassword;

    public Admin(int _id, String _name, String _password) {
        int id = _id;
        String name = _name;
        authPassword = _password;
    }
}
