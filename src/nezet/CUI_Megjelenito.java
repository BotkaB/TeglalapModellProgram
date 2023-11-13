package nezet;

import java.util.Scanner;
import modell.Teglalap;

public class CUI_Megjelenito {
    
    private static Scanner sc = new Scanner(System.in);

    private Teglalap tegla;
    
    public CUI_Megjelenito() {
        inicializalas();
        
        feladat();
    }

    private void inicializalas() {
        int a = bekerEgeszt("\'A\' oldal: ");
        int b = bekerEgeszt("\'B\' oldal: ");
        tegla = new Teglalap(a, b);
    }

    private int bekerEgeszt(String kerdes) {
        System.out.print(kerdes);
        return sc.nextInt();
    }

    private void feladat() {
        System.out.println("A téglalap területe, kerülete: ");
        System.out.printf("\tT: %.3f\n", tegla.terulet());
        System.out.printf("\tK: %.3f\n", tegla.kerulet());
    }
    
    
}
