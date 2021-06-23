
public class GEBIET
{
    // Eigenschaften
    private boolean feldwurdebeschossen;
    private boolean schiffIstAufFeld;

   //Konstruktor
    public Gebiet()
    {
        feldwurdebeschossen=false;
        schiffIstAufFeld=false;
    }

    //Methoden
    public boolean beschiessefeld () 
{
    {
      feldwurdebeschossen=true;
      if (schiffIstAufFeld) {
      versenkeSchiff();
      return true;
      }
      else return false;
          }
 }

 public void setzeSchiff (){
   schiffIstAufFeld=true;
 }

 public void setzteSchiff(){
     schiffIstAufFeld=false;
     }
public boolean 
 
isFeldWurdeBeschossen (){
 return feldWurdeBeschossen;
    
}

 public boolean isSchiff() {
     return schiffIstAufFeld;
 }