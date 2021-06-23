
import java. awt. event. *;


class SPIEL extends Gebiet
{
    
    SCHIFFE schiffe;
    
    int punkte;
    
    
    RANDSYMBOL spielfeldrand;
    
    
    SPIEL ()
    {
        schiffe = new SCHIFFE(0, 0, 'O');
        spielfeldrand = new RANDSYMBOL ();
        punkte = 0;
    }
    
    
    void TaktImpulsAusfuehren ()
    {
        if ((schiffe. XPositionGeben() <= spielfeldrand. XMaxGeben()) 
        && (schiffe. XPositionGeben() >= spielfeldrand. XMinGeben()) 
        && (schiffe. YPositionGeben() <= spielfeldrand. YMaxGeben()) 
        && (schiffe. YPositionGeben() >= spielfeldrand. YMinGeben()) 
        && ! schiffe. KopfInRumpf())
        {
            punkte = punkte + 1;
        }
        else
        {
            Anhalten ();
            if (schlange. KopfInRumpf())
            {
                spielfeldrand.EndemeldungSetzen("Game Over - Schlange hat sich selbst gebissen");
            }
            else
            {
                spielfeldrand.EndemeldungSetzen("Game Over - Schlange über Spielfeldrand");
            }
        }
    }
    
    /**
     * Wertet die Tasteneingaben aus.
     * @param welche Tastencode
     */
    void TasteGedrueckt (char welche)
    {
        switch (welche)
        {
          case 'S':
          case 's':
            Starten ();
            break;
          case 'P':
          case 'p':
            Anhalten ();
            break;
          case KeyEvent. VK_DOWN:
          case KeyEvent. VK_KP_DOWN:
            schlange. RichtungSetzen ('S');
            break;
          case KeyEvent. VK_LEFT:
            schlange. RichtungSetzen ('W');
            break;
          case KeyEvent. VK_RIGHT:
            schlange. RichtungSetzen ('O');
            break;
          case KeyEvent. VK_UP:
            schlange. RichtungSetzen ('N');
            break;
          default:
            //System. out. println ("Taste: " + (0 + (int) welche));
        }
    }
}
