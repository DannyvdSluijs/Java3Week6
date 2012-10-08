Practicum opgave week 6. 
==========
 
 * Neem de klassen Eigenaar, Goed, Voertuig, Auto, Fiets en Computer van week 3. 
 Pas deze klassen aan zodat men een object van klasse Eigenaar kan serializeren met behulp van 
 ObjectOutputStream. 
 * Schrijf voor klasse Eigenaar een methode public void saveToFile(String
 filename)throws IOException.  In deze methode wordt een object geserializeerd en 
 weggeschreven naar een file.  Maak ook een main‐programma waarin een instantie van klasse 
 Eigenaar wordt gemaakt die een aantal goederen koopt en vervolgens wordt weggeschreven naar 
 een file. 
 * Maak ook een methode public static Eigenaar readFromFile(String filename)throws
 IOException, ClassNotFoundException . In deze methodenwordt een object 
 gedeserialiseerd en gelezen als uit een file. Schrijf ook een main programma waarin de het object 
 van onderdeel b. weer wordt ingelezen en vervolgens middels toString() wordt afgedrukt.  
 * Breidt onderdeel c. uit. Dit programma vraagt de gebruiker om een filenaam. Indien een niet 
 bestaande file wordt gegeven dan krijgt de gebruiker nogmaals de kans om een filenaam op te 
 geven. Na drie mislukte pogingen stopt het programma. Vang daartoe de 
 FileNotFoundException. 
 * Onderzoek wat er gebeurt indien je de naam van een file opgeeft die niet gemaakt is met 
 ObjectOutputStream of die wel gemaakt is met ObjectOutputStream maar geen 
 objecten van klasse Eigenaar bevat.  Zorg ervoor dat je tweede testprogramma in dat geval een 
 geschikte foutmelding geeft  en daarna stopt. 
