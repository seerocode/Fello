import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader bReader = new BufferedReader(new FileReader("hello2.txt"))) {
            String line;

            while ((line = bReader.readLine()) != null) {

                // Replace a string with another string
                String replaceLine = line.replaceAll("(?i)hello", "goodbye");
                System.out.println(replaceLine);

            } //end of while loop
        } catch (IOException e) {

            e.printStackTrace();

        } //end of catch


    } //end of main method

} //end of class
