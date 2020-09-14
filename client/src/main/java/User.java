import com.google.gson.Gson;

public class User {

    private String username;
    private int age;
    private boolean gender;



    public User(String username, int age, boolean gender){
        this.username = username;
        this.age = age;
        this.gender = gender;
    }

    public String toJSON(){
        Gson json = new Gson();
        String result = json.toJson(this);
        return result;
    }


    public static void main(String[] args) {
        User u1 = new User("akar", 16,false);
        System.out.println(u1.toJSON());
    }

}
