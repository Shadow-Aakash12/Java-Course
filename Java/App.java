public class App {

    
    int x = 2;
    
    Integer a = 4;
    

    public static void main(String[] args){
        System.out.println("Hello");

        

        App app = new App();
        app.consoleIt();

        Cube cube = new Cube();
        cube.mathCube();

        
        
    }

    void consoleIt(){
        System.out.println("X : " + (x + x));
    }
    

}