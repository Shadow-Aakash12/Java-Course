public class App {


    int x = 2;

    Integer x1 = 2;

    String name = "Aakash";

    public static void main(String[] args) {

        User user = new User();
        user.name = "Aakash";
        user.role = "Dev";

        System.out.println("Name : " + user.name);
        System.out.println("Role : " + user.role);

        System.out.println("User : " + user); // Since user is a custom datatype it acts as a call by reference!!


    }

    
}