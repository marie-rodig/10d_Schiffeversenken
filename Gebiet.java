
public class Gebiet extends SPIELFELD
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

    private boolean gebietwurdebeschossen;
    private boolean schiffIstAufGebiet;
    private boolean versenkeschiff;

   //Konstruktor
    public Gebiet()
    {
        gebietwurdebeschossen=false;
        schiffIstAufGebiet=false;
    }

    //Methoden
    public boolean beschiessefeld () 
{
    {
      gebietwurdebeschossen=true;
      if (schiffIstAufGebiet) {
      versenkeschiff();
      return true;
      }
      else return false;
          }
 }
public boolean versenkeschiff () 


    {
      gebietwurdebeschossen=true;
      if (schiffIstAufGebiet) {
      versenkeschiff();
      return true;
    }
    else return false;
}
   
 public boolean setzeSchiff (){
   schiffIstAufGebiet=true;
 }

 public void setzeSchiff(){
     schiffIstAufGebiet=false;
     }

 
Gebietwurdebeschossen (){
  return gebietwurdebeschossen;
    
}

 public boolean Schiff() {
     return schiffIstAufGebiet;
 }

}



