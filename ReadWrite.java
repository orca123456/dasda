import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReadWrite {
    public static void main(String[] args) {

// writing text to a file        
// ctrl + / Shorcut sa comment
    //     try {
       
    //         File main = new File("main.text");
    //         FileWriter writer = new FileWriter(main);

    //         writer.write("Hello Worlds, Never been there.\n");
    //         writer.write("Hello Worlds, Never been there.\n");
    //         writer.write("Hello Worlds, Never been there.\n");
    //         writer.close();

    //         System.out.println("Nisulod na ang data sa file.");
    
    //   } catch (Exception e) {
    //     System.out.println("Nar error sya");
    //   }

// reading text in file
         
    try { 
        File main = new File("main.text");
        Scanner scan = new Scanner(main);

        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

     } catch (Exception e) {
        //TODO: handle execption
     }

    }
}