

public class User {

    private String username;
    private int age;
    private boolean gender;



    public User(String username, int age, boolean gender){
        this.username = username;
        this.age = age;
        this.gender = gender;
    }


    public String display(){
        String result = "Hello Dear " + this.username+ "Your age is: "+ this.age;
        return result;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}