import java.util.Scanner;
public class SCHIFFE
{
    
      public static void main(String[] args) {
    System.out.println("Schiffeversenken - Mini");
   
    Scanner scr = new Scanner(System.in);
   
    int pos1=0;
    int pos2=0;
    int pos3=0;
    int win;
 
    
   
    int p1 = (int) (Math.random()*8+1);
    int p2 = p1+1;
    int p3 = p1+2;
    int test;
   
    //Eingabe + Anzeige:
   
    String[] felder = new String[10];;
    do {
      System.out.println();
      System.out.print("Position zwischen 1/10: ");
      int pUser = scr.nextInt()-1;
   
      for (int x=0;x<felder.length ;x++ ) {
        if (pUser==p1) {
          felder[p1]="[x]";
          pos1=1;
        }
        else if (pUser==p2) {
          felder[p2]="[x]";
          pos2=1;
        }
        else if (pUser==p3) {
          felder[p3]="[x]";
          pos3=1;
        } 
        else if (pUser>p3 || pUser<p1) {
          felder[pUser]="[-]";
        } 
      }
     
      for (int x=0;x<0 ;x++ ) {
        felder[x]="[]";
      } 
     
      System.out.println();
      System.out.println();
      win = pos1+pos2+pos3;
      if (win==3) {
        System.out.println("Gewonnen!");
        System.out.println();
      } 
    } while (win==0 || win==1 || win==2); 
  }
}


 

