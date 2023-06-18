package stratego;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MovimientosDeFichas {
    FichasTableroHeroes fichastableroheroes;
    vistatablero tablero;
    private HashMap<String, String> posicionesPersonajes;
    private JButton[][] botones;
    
    public MovimientosDeFichas(vistatablero tablero){
        this.tablero=tablero;
        
        
    }
    
  
    public void seClickeo(java.awt.event.ActionEvent evt){
        if(evt.getSource() instanceof JButton){
            JOptionPane.showMessageDialog(null, "Sirveeee");
        
    }
        
    }

    public boolean validarMovimiento(int filaDeFichaSeleccionada, int columnaDeFichaSeleccionada, int filaDeFichaDestino, int columnaDeFichaDestino) {
        if(filaDeFichaSeleccionada == filaDeFichaDestino && columnaDeFichaSeleccionada == columnaDeFichaDestino){
            
            int diferenciaEntreFilas = Math.abs(filaDeFichaDestino-filaDeFichaSeleccionada);
            int diferenciaEntreColumnas = Math.abs(columnaDeFichaDestino-columnaDeFichaSeleccionada);
            
            if(diferenciaEntreFilas>0 && diferenciaEntreColumnas>0){
                return true;
            }else if(diferenciaEntreFilas==0 && diferenciaEntreColumnas > 0){
                return true;
            }
            
        }
        return false;
    }
    
    
    public HashMap<String,String> guardarValoresFichas(vistatablero tablero){
        int numerodeposicion=1;
    this.posicionesPersonajes.put(tablero.c1.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c2.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c3.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c4.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c5.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c6.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c7.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c8.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c9.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c10.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c11.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c12.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c13.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c14.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c15.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c16.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c17.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c18.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c19.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c20.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c21.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c22.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c23.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c24.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c25.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c26.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c27.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c28.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c29.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c30.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c31.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c32.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c33.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c34.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c35.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c36.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c37.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c38.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c39.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    this.posicionesPersonajes.put(tablero.c40.getText(),String.valueOf(numerodeposicion));
    numerodeposicion++;
    
    
    return posicionesPersonajes;
}
    
    
    public void moverFicha(){
        
        
    }
    
            
        
    
}
