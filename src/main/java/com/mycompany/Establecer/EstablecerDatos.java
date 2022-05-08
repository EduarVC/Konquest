package com.mycompany.Establecer;

import com.mycompany.Listas.ListaDobleEnlazada;
import com.mycompany.Listas.ListaException;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Personaje.Jugador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class EstablecerDatos {

    public EstablecerDatos(){
        
    }
    public void establecerJugadoresCombobox(JComboBox cmbListaJugadores, ListaDobleEnlazada<Jugador> listajugadores) throws ListaException {
        listajugadores.mostrarLista();
        
        cmbListaJugadores.removeAllItems();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbListaJugadores.getModel();
        NodoDoble<Jugador> recorrer = listajugadores.getInicio();
        while (recorrer != null) {
            model.addElement(recorrer.getContenido().getNombre());
            recorrer.getContenido().getPlanetasJugador().mostrarLista();
            recorrer = recorrer.getSiguiente();
        }
    }
    
}
