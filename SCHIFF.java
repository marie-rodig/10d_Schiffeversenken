

class SCHIFF
{
   //Eigfenschaften
   private boolean schiffwurdebeschossen;
   private boolean schiffistaufgebiet;
   private boolean
    SCHIFF schiff;
   RUMPF [] rumpf;
    
    
    SCHIFF (int x, int y, char richtung)
    {
        SCHIFF = new SCHIFFESYMBOL ();
        schiff. AusrichtungSetzen (richtung);
        schiff. PositionSetzen(x, y);
        rumpf = new RUMPFSYMBOL [5];
        for (int i = 0; i < rumpf. length; i++)
        {
            rumpf [i] = new RUMPFSYMBOL ();
        }
        switch (richtung)
        {
          case 'O':
            for (int i = 0; i < rumpf. length; i++)
            {
                rumpf [i]. PositionSetzen (x - (rumpf. length - i), y);
            }
            break;
          case 'N':
            for (int i = 0; i < rumpf. length; i++)
            {
                rumpf [i]. PositionSetzen (x, y + (rumpf. length - i));
            }
            break;
          case 'W':
            for (int i = 0; i < rumpf. length; i++)
            {
                rumpf [i]. PositionSetzen (x + (rumpf. length - i), y);
            }
            break;
          case 'S':
            for (int i = 0; i < rumpf. length; i++)
            {
                rumpf [i]. PositionSetzen (x, y - (rumpf. length - i));
            }
            break;
        }
        
    }
    
      void RichtungSetzen (char richtungNeu)
    {
        kopf. AusrichtungSetzen (richtungNeu);
       
    }
  {int XPositionGeben;
  
  return schiff.XPositionGeben();
  }
}
    
   
   


 
