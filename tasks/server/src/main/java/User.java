

public class User {

    private String username;
    private int age;
    private boolean gender;



    public User(String username, int age, boolean gender){
        this.username = username;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Dear " + this.username+ "! You were connected to our server. \n Your age: "+ this.age;
    }
}