package writemessage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;
import java.util.Scanner;

public class WriteMessage {

    public static void main(String[] args) {
        String message; // declare string
        Scanner sc = new Scanner(System.in); // create a new Scanner for user to enter data
        Path file = Paths.get("C:\\src\\message.txt");//file will be saved in local folder
        
        System.out.println("Write your message here and Enter to save it");
        message = sc.nextLine(); // user enters data
        byte[] data = message.getBytes(); // saves the data
        OutputStream output = null; // output stream sends data to an output destination

        try { // file read/write have possible exceptions
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE)); // creates the file
            output.write(data); // writes to the notepad
            output.flush();//sends or flushes the any pending data
            output.close();//close the file
        } catch (Exception e) { // catches any error occur
            System.out.println("Message: " + e); // 
        }
    }
}

/**
 *
 * @author 30023737 EROL A'NIL
 */
