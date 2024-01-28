package Models;

public class Game {
    
    public String gameName;

    public Integer releaseYear;

    public String genre;

    public Integer price;

    private String studioName;

    private Integer productNumber;

    public void getProdNumber(Integer productNumber){
        
        this.productNumber = productNumber;
    }

    public void setDevName(String studioName){

        this.studioName = studioName;

    }




}
