
<<<<<<< HEAD
import java. awt. event. *;

/**
 * Rahmenklasse des Spiels.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class SPIEL extends SIMULATION

{

    
    SCHLANGE schlange;
    RANDSYMBOL randsymbol;
     /**
     * Baut die Basiselemente auf.
     */
    SPIEL ()
    {
        schiff = new SCHIFF (0, 0, 'O');
        spielfeldrand = new RANDSYMBOL ();
    }
    
 
    void TaktImpulsAusfuehren ()
    {
        if (( rumpf. XPositionGeben() <= spielfeldrand. XMaxGeben())
        && (rumpf. XPositionGeben() >= spielfeldrand. XMinGeben())
        && (rumpf. YPositionSetzen() <= spielfeldrand. YMaxGeben())
        && (rumpf. YPositionGeben() >= spielfeldrand. YMinGeben()))
        {
        schlange. Bewegen ();
    }
    else
{
    Anhalten ();
    spielfeldrand. EndemeldungSetzen ("GameOver- über Spielfeldrand");
}
}
    
    void TasteGedrueckt (char welche);
    {
        switch (welche)
        {
          case 'S':
          case 's':
            Starten ();
            break;
          case 'P':
          case 'p':
            SchiffSetzen ();
            break;
          case KeyEvent. VK_DOWN:
          case KeyEvent. VK_KP_DOWN:
            schiff. RichtungSetzen ('S');
            break;
          case KeyEvent. VK_LEFT:
            schiff. RichtungSetzen ('W');
            break;
          case KeyEvent. VK_RIGHT:
            schiff. RichtungSetzen ('O');
            break;
          case KeyEvent. VK_UP:
            schiff. RichtungSetzen ('N');
            break;
          default:
            //System. out. println ("Taste: " + (0 + (int) welche));
        }
=======
/**
 * Beschreiben Sie hier die Klasse SPIEL.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SPIEL
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse SPIEL
     */
    public SPIEL()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
>>>>>>> 8e63cb8e88e5f1446cab647a2ab20590fdbbcd94
    }
}
