

public class SPIELER extends SPIELFELD
{
    abstract class SPIELER  {
    protected Spielfeld sp;
    private int hoehe,breite;

 
    public SPIELER() {
    }
    
    public SPIELER(SPIELER sp1) {
        this(sp1.getSpielfeld());
    }
    
    public int Spielfeld (){
        if(sp != null) {
            this.sp = sp;
            hoehe = sp.getHoehe();
            breite = sp.getBreite();
        }
    }
    
    abstract public void init(int mode);

    public SPIELER() {
    }
    
    public int Spielfeld  (int y) {
        if(sp !=  null) {
            this.sp =sp;
            hoehe = sp.getHoehe();
            breite = sp.getBreite();
        }
    }
    
    abstract public void init(int mode);


    public Spielfeld getSpielfeld() {
        return sp;
    }
    
    public void setSpielfeld(Spielfeld sp) {
        if(sp != null) {
            this.sp = sp;
        }
    }
}
}


