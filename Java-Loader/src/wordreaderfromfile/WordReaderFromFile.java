
package wordreaderfromfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordReaderFromFile {

    public static void main(String[] args) {
        Path file = Paths.get("C:\\src\\message.txt"); //Where the Saved File
        InputStream input = null; // Declare input as stream

        try { // tries to create a steam and tries to read the file from the path
            input = Files.newInputStream(file); 
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String message = reader.readLine();

            System.out.println("the Message from the file is: ");
            System.out.println(message);// reads the saved file from file
            input.close();
            
        } catch (IOException e) {//Catches exception error and Prints it to console
            System.out.println(e);
        }
    }
}
/**
 *
 * @author 30023737
 */
