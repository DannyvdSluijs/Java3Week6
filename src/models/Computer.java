/**
 * Computer class
 *
 * @author    Danny van der Sluijs <danny.vandersluijs@student.hu.nl>
 * @version   1.0.0
 * @copyright 2012 Danny van der Sluijs
 */
package models;
import java.util.Calendar;

public class Computer
    implements Goed
{

    private String merk = "";

    private double nieuwPrijs;

    private int bouwJaar;

    /**
     * Constructor
     * @param merk       Het merk van deze object instantie
     * @param nieuwPrijs De nieuwprijs van deze object instantie
     * @param bouwJaar   Het bouwjaar van deze object instantie
     * @since 1.0.0
     */
    public Computer(String merk, double nieuwPrijs, int bouwJaar)
    {
        this.merk = merk;
        this.nieuwPrijs = nieuwPrijs;
        this.bouwJaar = bouwJaar;
    }

    /**
     * Haal de huidige waarde op van deze object instantie, gebaseerd op de nieuwprijs en bouwjaar
     * @return De huidige waarde
     * @since 1.0.0
     */
    public double getWaarde()
    {
        /* Calculate age */
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int leeftijd = currentYear - this.bouwJaar;
        
        /* Calculate write off percentage */
        double currentValue = this.nieuwPrijs;
        for(int i = leeftijd; i > 0; i--) {
            currentValue = currentValue * 0.6;
        }
        return currentValue;
    }

    /**
     * Deze object instantie gepresenteerd als String
     * @return De huidige object instantie gepresenteerd als String
     * @since 1.0.0
     */
    public String toString()
    {
        return "computer van het merk " + this.merk + "\n" + 
            "nieuwprijs was " + this.nieuwPrijs + "\n" +
            "bouwjaar is " + this.bouwJaar + "\n" +
            "huidige waarde is " + this.getWaarde();
    }

}
