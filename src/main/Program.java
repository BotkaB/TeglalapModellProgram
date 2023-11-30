package main;

import nezet.CUI_Megjelenito;
import nezet.JOP_Megjelenito;
import nezet.Megjelenito;

public class Program {

    public static void main(String[] args) {
        //new CUI_Megjelenito();
        //new JOP_Megjelenito();
        
        /*Az ős bármely utódjára hivatkozhat.*/
        //Megjelenito megj;
       // megj=new CUI_Megjelenito();
       // megj=new JOP_Megjelenito();
        
/*Közös tömbben is tárolható.*/
        Megjelenito[] megjelenitok={new CUI_Megjelenito(),new JOP_Megjelenito() };
        for (Megjelenito megj:megjelenitok){
        megj.inicializalas();
        megj.feladat();
        }
    }
    
}
