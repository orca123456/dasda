import java.io.File;
import java.io.IOException;

class fileCreation {
    public static void main(String[] args) {

        File textFile = new File("main.txt"); 
        try { 
            if (textFile.createNewFile()){
            System.out.println("file created succsessfully");   
            } else {         
            System.out.println("file existing");
            }
        } catch (IOException e) {
         System.out.println("File unsecessfully created");
         // System.out.println(e.printStackTrace());
        }
    } 
}