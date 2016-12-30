import java.io.*; // Needed for File and IOException
import java.util.*; // Needed for Scanner class

public class Fello {

    public static void main(String[] args) {

        // Start of try/catch block
        try {

            // Open file
            File file = new File("hello2.txt");
            Scanner txtFile = new Scanner(file);

            // While loop to print each line
            while (txtFile.hasNextLine()) {

                // Read a line
                String readLine = txtFile.nextLine();
                // Replace a string with another string
                String replaceLine = readLine.replaceAll("(?i)hello", "cheese burger");
                // Print each line
                System.out.println(replaceLine);

            } // end of while loop

            txtFile.close();

        } catch (Exception e) {

            // Print stacktrace if exception found
            e.printStackTrace();

        } // End of catch

    } // End of main

} // End of class
