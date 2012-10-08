/**
 * Main application, Prakticum Week 1, 2 & 3.
 *
 * @author    Danny van der Sluijs <danny.vandersluijs@student.hu.nl>
 * @version   1.0.0
 * @copyright 2012 Danny van der Sluijs
 */
import models.*;
import java.io.*;

public class Start {

    /**
     * Main function: 
     *
     * @param arg Main arguments
     */
    public static void main (String[] arg) {
        Eigenaar e1 = new Eigenaar("Eric", 20000);
        Eigenaar e2 = new Eigenaar("Hans", 15000);
        Auto a1 = new Auto("Citroen", 25000, 2009, "26 GR NJ");
        Auto a2 = new Auto("Renault", 30000, 2010, "71 JH KD");
        Fiets f1 = new Fiets("Gazelle", 1190, 2012, "mountainbike");
        Computer c1 = new Computer("HP", 2000, 2009);
        
        try {
            e1.koop(a1);
            e1.koop(f1);
            e1.koop(c1);
        } catch (KoopException e) {}
        try {
            e1.koop(a2);
        } catch (KoopException e) {}
        try {
            e1.verkoop(a2, e2);
        } catch (KoopException e) {}
        try {
            e1.verkoop(a1, e2);
        } catch (KoopException e) {}
        try {
            e1.verkoop(c1, e2);
        } catch (KoopException e) {}
        
        /* Save object to file */
        try {
            e1.saveToFile("/tmp/eigenaarOne.ser");
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
        
        /* Read object from file */
        Eigenaar e3 = null;
        try {
            e3 = Eigenaar.readFromFile("/tmp/eigenaarOne.ser");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(e3.toString());
        
        /* Request a filename, and try to read */
        Eigenaar e4;
        int tries = 0;
        while (true) {
            System.out.println("Provide the object filename, then press <return>");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String filename = null;
            try {
                filename = in.readLine();
                tries++;
            } catch (IOException e) {
                System.out.println("Something went wront while trying to read from input");
                return;
            }
            
            try {
                e4 = Eigenaar.readFromFile(filename);
                System.out.println(e4.toString());
                return;
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                /* Stop on third failure */
                if (tries == 3) {
                    System.out.println("Tried three times, giving up.");
                    return;
                }
            } catch (ClassNotFoundException e) {
                System.out.println(e.getClass() + " " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Unable to deserialize from file.");
                return;
            }
        }
        
    }

}