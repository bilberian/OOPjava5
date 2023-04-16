package OOPjava.HW5.Calculator;
import java.io.FileWriter;
import java.io.IOException;


public class ToFile {
    
    public static void toFile(String text) {
    
        try(FileWriter writer = new FileWriter("myFile.txt", false))
        {
            writer.write(text);
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    
    }
}
