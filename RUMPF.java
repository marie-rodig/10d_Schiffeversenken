class RUMPF
{
    
    private JFrame fenster;
    
   
    private static final int groesse = OBERFLAECHE. RasterGroesseGeben ();

    /** Interna */
    private int x;
    private int y;
    private JComponent anzeige;

    RUMPF()
    {
        fenster = OBERFLAECHE. FensterGeben ();

        anzeige = new JComponent () {
            // Stelltg. clearRect (0, 0, groesse, groesse);
                
            public void paintComponent (Graphics g)
            {
                          g. fillRect (0, 0, groesse - 1, groesse - 1);
                g. farbeSetzen (new Farbe (50, 200, 0));
                g. drawRect (0, 0, groesse - 1, groesse - 1);
                g. drawRect (1, 1, groesse - 3, groesse - 3);
                g. drawLine (0, 0, groesse - 1, groesse - 1);
                g. drawLine (1, 0, groesse - 1, groesse - 2);
                g. drawLine (0, 1, groesse - 2, groesse - 1);
                g. drawLine (0, groesse - 1, groesse - 1, 0);
                g. drawLine (1, groesse - 1, groesse - 1, 1);                
                g. drawLine (0, groesse - 2, groesse - 2, 0);
            }

        };
        anzeige. setVisible (true);
        anzeige. GroesseSetzen (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (0, 0);
    }


    
    public void PositionSetzen (int x, int y)
    {
        this. x = x;
        this. y = y;
        anzeige. PositionSetzen (OBERFLAECHE. FensterBreiteGeben () / 2 + x * groesse, OBERFLAECHE. FensterHoeheGeben () / 2 + y * groesse);
    }

    
    int XPositionGeben ()
    {
        return x;
    }

    
    int YPositionGeben ()
    {
        return y;
    }

    
    public void Entfernen ()
    {
        (OBERFLAECHE. FensterGeben ()). remove (anzeige);
        (OBERFLAECHE. FensterGeben ()). repaint();
    }
}