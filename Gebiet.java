
public class Gebiet
{
    // Eigenschaften
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

 
gebietwurdebeschossen (){
 return gebietwurdebeschossen;
    
}

 public boolean Schiff() {
     return schiffIstAufGebiet;
 }
}
}