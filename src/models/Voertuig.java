/**
 * Voertuig class
 *
 * @author    Danny van der Sluijs <danny.vandersluijs@student.hu.nl>
 * @version   1.0.0
 * @copyright 2012 Danny van der Sluijs
 */
package models;

public abstract class Voertuig
    implements Goed
{
    private String merk = "";

    protected double nieuwPrijs;

    protected int bouwJaar;

    public Voertuig(String merk, double nieuwPrijs, int bouwJaar)
    {
        this.merk = merk;
        this.nieuwPrijs = nieuwPrijs;
        this.bouwJaar = bouwJaar;
    }

    public String toString()
    {
        return "merk is " + this.merk + "\n" + 
            "nieuwprijs was " + this.nieuwPrijs + "\n" +
            "bouwjaar is " + this.bouwJaar + "\n" +
            "huidige waarde is " + this.getWaarde();
    }

}
