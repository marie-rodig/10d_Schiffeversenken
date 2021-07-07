


class SIMULATION extends SPIEL
{
    private Timer timer;
    
   
    SIMULATION ()
    {
        timer = new Timer (1000, new ActionListener () 
        {
            
            public void actionPerformed (ActionEvent evt)
            {
                TaktImpulsAusfuehren ();
            }
        })
           {
            
             public void keyPressed(KeyEvent e)
            {
                TasteGedrueckt ((char) e. getKeyCode ());
            }
        };

    }
    void Starten ()
    {
        timer. start ();
    }

    
    void Beenden ()
    {
        timer. stop ();
    }
    
    
    void TasteGedrueckt (char welche)
    {
        System. out. println ("Taste gedrückt: " + welche);
    }
}

