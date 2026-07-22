class Account {
    public String name;
    protected String email;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

     public void getPassword(String password) {
        System.out.println("Password is : " + this.password);
    }
}

public class Demo {
    public static void main(String args[]) {

        Account my = new Account();
        my.name = "Gogan";
        my.setPassword("007");
        my.email = "gogan07@gmail.com";

        my.getPassword(null);


    }
}