package Models;

public class Anime {
    
    String animeName;

    String activity;

    Integer rating;

    public Anime() {
    }

    public Anime(String animeName, Integer rating) {
        this.animeName = animeName;
        this.rating = rating;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }


    
}
