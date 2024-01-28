import java.util.ArrayList;

public class Java {

    public static void main(String[] args) {
        
        ArrayList<MovieObj> moviesList = new ArrayList<>();

        MovieObj movieObj;
                                    //                0                           1  //Obj
        movieObj = new MovieObj();  // [{"Superman","Action, Sci Fiction"},{"Batman","Action,Crime"}]
        // moviesList.add(movieObj1);
        

        movieObj.movieName = "Superman";
        movieObj.genre = "Action, Sci-Fiction";

        moviesList.add(movieObj);

        // System.out.println(moviesList);
        
        
        // MovieObj movieObj;
        movieObj = new MovieObj();
        // moviesList.add(movieObj2);

        movieObj.movieName = "Batman";
        movieObj.genre = "Action, Crime";

        moviesList.add(movieObj);

        System.out.println(moviesList);




    }
    
}
