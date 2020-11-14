import java.util.ArrayList;

public class User extends ArrayList<Integer> {
    String name;
    String pass;
    String city;
    int age;

    public User(String name, String pass, String city, int age) {
        this.name = name;
        this.pass = pass;
        this.city = city;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
