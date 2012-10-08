/**
 * Main application, Prakticum Week 1, 2 & 3.
 *
 * @author    Danny van der Sluijs <danny.vandersluijs@student.hu.nl>
 * @version   1.0.0
 * @copyright 2012 Danny van der Sluijs
 */
import models.*;

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
        System.out.println(a1);
        System.out.println(f1);
        System.out.println(c1);
        System.out.println("--------------------------------------");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("--------------------------------------");
        try {
            e1.koop(a1);
            e1.koop(f1);
            e1.koop(c1);
        } catch (KoopException e) {
            e.printStackTrace();
        }
        System.out.println(e1);
        System.out.println("--------------------------------------"); 
        
        try{
            e1.koop(a2);
        } catch(KoopException e) {
            System.out.println(e.toString());
        }
        System.out.println("--------------------------------------");
        
        try{
            e1.verkoop(a2, e2);
        } catch(KoopException e) {
            System.out.println(e.toString());
        }
        System.out.println("--------------------------------------");
        
        try{
            e1.verkoop(a1, e2);
        } catch(KoopException e) {
            System.out.println(e.toString());
        }
        System.out.println("--------------------------------------");
        
        try{
            e1.verkoop(c1, e2);
        } catch(KoopException e){ 
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------------");
        System.out.println(e1);
        System.out.println(e2);
    }

}