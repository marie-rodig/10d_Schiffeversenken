

import java. awt. event. *;

/**
 * Rahmenklasse des Spiels.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class SPIEL extends SIMULATION

{

    
    SCHIFF schiff;
    RANDSYMBOL randsymbol;
     /**
     * Baut die Basiselemente auf.
     */
    SPIEL ()
    {
        schiff = new SCHIFF (0, 0, 'O');
        spielfeldrand = new RANDSYMBOL ();
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
    }
}