import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

       

        // ArrayList<Integer> numbers = new ArrayList<>();

        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);

        // System.out.println("Number : " + numbers);


        ArrayList<User> users = new ArrayList<>();

        User user;

        user = new User();
        

        user.name = "Aakash";
        user.role = "Dev";
        user.age = 22;

        users.add(user);

        user = new User();

        user.name = "Vinayak";
        user.role = "Dev";
        user.age = 23;

        users.add(user);


        // System.out.println("User : " + user.name);
        // System.out.println("Role : " + user.role);
        // System.out.println("Age : " + user.age);

        System.out.println(users);
        

    }



}