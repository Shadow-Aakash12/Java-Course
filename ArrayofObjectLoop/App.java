import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App{

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1,2,3);

        System.out.println(numbers);

        // Hobby hobby = new Hobby();

        ArrayList<Hobby> hobbies = new ArrayList<>();

        // Obj1

        Hobby hb1 = new Hobby();

        hb1.name = "Aakash";
        hb1.skillName = "GameDev";
        hb1.exp = 2;

        hobbies.add(hb1);

        // Obj2
        Hobby hb2 = new Hobby();

        hb2.name = "Vinayak";
        hb2.skillName = "FrontEnd";
        hb2.exp = 1;
        
        hobbies.add(hb2);

        // Obj3 
        Hobby hb3 = new Hobby();

        hb3.name = "Bruno";
        hb3.skillName = "Dev";
        hb3.exp = 2;

        hobbies.add(hb3);

        // Obj4 
        Hobby hb4 = new Hobby();

        hb4.name = "Aashish";
        hb4.skillName = "Dev";
        hb4.exp = 2;

        hobbies.add(hb3);

        // System.out.println(hobbies);

        App app = new App();

        app.hobbiesListPrint(hobbies);



    }


    void hobbiesListPrint(ArrayList<Hobby> hobbies){

        int count = 1;

        for (int i = 0; i < hobbies.size(); i++,count++) {

            System.out.println("Hobbies : " + count +" : " + hobbies.get(i));
            
        }

    }
}