package com.mycompany.Manger;

import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Personaje.Jugador;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ManagerMapa {
    
    public void inicializarTabla(JTable tabla){
        String[] jugadores = new String[2];
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) tabla.getModel();
        NodoDoble<Jugador> recorrer = getListaJugadores().getInicio();
       
        while(recorrer != null){
            jugadores[0] = recorrer.getContenido().getNombre();
            jugadores[1] = recorrer.getContenido().getTipo();
            modelo.addRow(jugadores);
            tabla.setForeground(recorrer.getContenido().getColorAsignado());
            
//            tabla.setBackground(recorrer.getContenido().getColorAsignado());
            recorrer = recorrer.getSiguiente();
        }
    }
    public void InicializarTablaElimar(JTable tabla){
        int contador = 1;
        String[] jugadores = new String[4];
        
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) tabla.getModel();
        NodoDoble<Jugador> recorrer = getListaJugadores().getInicio();
        modelo.getDataVector().removeAllElements();
        while(recorrer != null){
            
            jugadores[0] = Integer.toString(contador);
            jugadores[1] = recorrer.getContenido().getNombre();
            jugadores[2] = recorrer.getContenido().getTipo();
            jugadores[3] = Integer.toString(recorrer.getContenido().getCantidadPlanetas());
            modelo.addRow(jugadores);
            tabla.setForeground(recorrer.getContenido().getColorAsignado());
            recorrer = recorrer.getSiguiente();
            contador++;
        }
    }
     
}
