package com.mycompany.Mapa;

import com.mycompany.ControlJuego.AccionBotones;
import static com.mycompany.JFrame.JFrameDisMapa.lblFondoMapa;
import static com.mycompany.JFrame.JFramePrincipal.getMatriz;
import java.awt.Color;
import javax.swing.JScrollPane;

public class DibujarMapa {
    public void establecerMapa(JScrollPane panel){
        
        int x = 20;
        int y = 20;
        
        for (int i = 0; i < getMatriz().length; i++) {
            for (int j = 0; j < getMatriz()[i].length; j++) {
                if(getMatriz()[i][j].getText() != ""){
                    getMatriz()[i][j].setForeground(Color.WHITE);
                    getMatriz()[i][j].setText(".");
                    
                }
                AccionBotones accion = new AccionBotones();
                getMatriz()[i][j].addActionListener(accion);
                getMatriz()[i][j].setBounds(x, y, 45, 45);
                lblFondoMapa.add(getMatriz()[i][j]);
                y += 50;
            }
            x += 50;
            y = 20;
        }
        
    }
}
