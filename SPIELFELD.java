 
 
 
public class SPIELFELD
{
    private Gebiet [][] feld;
    
    public Spielfeld()
    {
        feld = new Gebiet [10] [10];
        for (int x = 0; x < 10;)
        for (int y= 0; y < 10;)
        feld[x][y] = new Gebiet [10][10];
    }
    {
        feld [1][2].setzeSchiff();
        feld [2][2].setzeSchiff();
        feld [2][3].setzeSchiff();
        
        
        
    
    }
    {
         class SPIELFELD extends SPIEL {

    private SCHIFF[][] spielfeld1, 
                       spielfeld2, 
                       spielfeldAktuell; 
                       
    private int xAktuell, yAktuell; 
    public SPIELFELD(){
        super();
        spielfeld1 = new SCHIFF[10][10]; 
        for(int x=0; x<10; x++){
            for(int y=0; y<10; y++){
                spielfeld1[x][y] = new SCHIFF(20+x*36+12+10, 125+y*36+12); 
            }
        }

        spielfeld2 = new SCHIFF[10][10];

        for(int x=0; x<10; x++){
            for(int y=0; y<10; y++){
                spielfeld2[x][y] = new SCHIFF(20+360+30+x*36+12+20, 125+y*36+12); 
        }

        spielfeldAktuell = spielfeld1; 
        xAktuell = 0; 
        yAktuell = 0; 
        spielfeldAktuell[xAktuell][yAktuell].setzeFarbe("rot");
    }

    @Override
    public void tick; {}

    @Override
    public void tasteReagieren; int code ; {
        if ( code == 26 && yAktuell > 0 ) { 
            spielfeldAktuell[xAktuell][yAktuell].setzeFarbe("grau");
            spielfeldAktuell[xAktuell][--yAktuell].setzeFarbe("rot"); 
        } else if ( code == 27 && xAktuell < 9 ) {
            spielfeldAktuell[xAktuell][yAktuell].setzeFarbe("grau");
            spielfeldAktuell[++xAktuell][yAktuell].setzeFarbe("rot"); 
        } else if ( code == 28 && yAktuell < 9 ) { 
            spielfeldAktuell[xAktuell][yAktuell].setzeFarbe("grau"); 
            spielfeldAktuell[xAktuell][++yAktuell].setzeFarbe("rot"); 
        } else if ( code == 29 && xAktuell > 0 ) { 
            spielfeldAktuell[xAktuell][yAktuell].setzeFarbe("grau");
            spielfeldAktuell[--xAktuell][yAktuell].setzeFarbe("rot"); 
        } else if ( code == 31 ) { 
            spielfeldAktuell[xAktuell][yAktuell].setzeFarbe("grau");
            
            spielfeldAktuell = spielfeldAktuell == spielfeld1 ? spielfeld2 : spielfeld1;  
            xAktuell = 0; 
            yAktuell = 0; 
            spielfeldAktuell[xAktuell][yAktuell].setzeFarbe("rot");
            
        }
    }

}