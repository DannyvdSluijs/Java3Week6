/**
 * Eigenaar class
 *
 * @author    Danny van der Sluijs <danny.vandersluijs@student.hu.nl>
 * @version   1.0.0
 * @copyright 2012 Danny van der Sluijs
 */
package models;
import java.util.*;

public class Eigenaar
{

    private String naam = "";

    private double budget;
    
    private ArrayList<Goed> goederen = new ArrayList<Goed>();

    public Eigenaar(String naam, double budget)
    {
        this.naam = naam;
        this.budget = budget;
    }
    
    public void koop(Goed g)
        throws KoopException
    {
        /* We can't buy when our budget doesn't allow for it */
        if (this.budget < g.getWaarde()) {
            throw new KoopException("budget van " + this.naam + " niet toereikend");
        }
        
        this.budget -= g.getWaarde();
        this.goederen.add(g);
    }
    
    public void verkoop(Goed g, Eigenaar koper)
        throws KoopException
    {
        
        /* We can't sale if we dont own it */
        if (!this.goederen.contains(g)) {
            throw new KoopException(this.naam + " heeft het goed niet in zijn bezit");
        }
        /* Throws KoopException when buyer doesn't have sufficient budget. */
        koper.koop(g);
        
        this.budget += g.getWaarde();
        this.goederen.remove(g);
    }
    
    public String getNaam()
    {
        return this.naam;
    }
    
    public String getGoederen()
    {   
        String returnString = "";
        ListIterator listItr = this.goederen.listIterator();
        while(listItr.hasNext()){
            returnString += "*" + listItr.next() + "\n";
        }
        return returnString;
    }
    
    public String toString()
    {
        return "Eigenaar heet " + this.naam + " en heeft als budget " + this.budget + "\n" +
            "en bezit de volgende goederen:\n" + this.getGoederen();
    }

}
