package Models;

public class Fruits {
    

    public String fruitName;

    // 
    public String fruitColor;

    // 
    public String fruitSize;

    public Integer cost;

    // 
    public Integer calories;

    public Fruits(){

    }

    public Fruits(String fruitName, Integer cost){

        this.fruitName = fruitName;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Fruits [fruitName=" + fruitName + ", fruitColor=" + fruitColor + ", fruitSize=" + fruitSize + ", cost="
                + cost + ", calories=" + calories + "]";
    }

}
