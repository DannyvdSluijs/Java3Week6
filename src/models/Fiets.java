/**
 * Fiets class
 *
 * @author    Danny van der Sluijs <danny.vandersluijs@student.hu.nl>
 * @version   1.0.0
 * @copyright 2012 Danny van der Sluijs
 */
package models;

import java.util.Calendar;

public class Fiets 
    extends Voertuig
{
    private String type = "";

    /**
     * Constructor
     * @param merk       Het merk van deze object instantie
     * @param nieuwPrijs De nieuwprijs van deze object instantie
     * @param bouwJaar   Het bouwjaar van deze object instantie
     * @param type       Het type van deze object instantie
     * @since 1.0.0
     */
    public Fiets(String merk, double nieuwPrijs, int bouwJaar, String type)
    {
        super(merk, nieuwPrijs, bouwJaar);
        this.type = type;
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

        /* No write off in the first year */
        for(int i = leeftijd - 1; i > 0; i--) {
            currentValue = currentValue * 0.85;
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
        return "fiets van het type " + this.type + "\n" + super.toString();
    }

}
