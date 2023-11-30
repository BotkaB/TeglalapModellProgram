/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import javax.swing.JOptionPane;
import modell.Teglalap;

/**
 *
 * @author BotkaBianka(SZOFT_F_
 */
public class JOP_Megjelenito extends Megjelenito{
  private Teglalap tegla;
  
  
    public JOP_Megjelenito() {
         
        //String uzenet="A következő felugróban bekérünk 1 adatot.";
        
       // String cim="Beírt érték";
        
        int icoTipus=JOptionPane.ERROR_MESSAGE;
        
      // JOptionPane.showMessageDialog(null, "Szeva JOP");
       
        
       // uzenet=JOptionPane.showInputDialog("írj be valamit.");
        
       // JOptionPane.showMessageDialog(null, uzenet,  cim, icoTipus);
        
        // inicializalas();
        
        // feladat();
    }
  @Override
    public void inicializalas() {
        String u=JOptionPane.showInputDialog("\'A\' oldal: ");
        int a = Integer.parseInt(u);
        String x=JOptionPane.showInputDialog("\'B\' oldal: ");
        int b = Integer.parseInt(x);
        tegla = new Teglalap(a, b);
    }    
      
    
  @Override
    public void feladat() {
        String s="A téglalap területe, kerülete: ";
     
       s+=String.format("\tT: %.3f\n", tegla.terulet());
       s+=String.format("\tK: %.3f\n", tegla.kerulet());
       JOptionPane.showMessageDialog(null, s);
    }
    }

   
   
    

