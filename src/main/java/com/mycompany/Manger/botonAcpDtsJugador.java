package com.mycompany.Manger;

import com.mycompany.Establecer.EstablecerDatos;
import static com.mycompany.JFrame.DatosJugador.btnGuardar;
import static com.mycompany.JFrame.DatosJugador.cmbTipo;
import static com.mycompany.JFrame.DatosJugador.coloresSeleccion;
import static com.mycompany.JFrame.DatosJugador.panelColor;
import static com.mycompany.JFrame.DatosJugador.txtNombre;
import static com.mycompany.JFrame.JFramePrincipal.cmbListaJugadores;
import com.mycompany.Listas.ListaDobleEnlazada;
import com.mycompany.Listas.ListaException;
import com.mycompany.Listas.ListaJugadores;
import com.mycompany.Personaje.Jugador;
import static com.mycompany.Personaje.PlanetaInicial.obtenerPlanetaInicial;

public class botonAcpDtsJugador {
    public botonAcpDtsJugador(){
        
    }
    //Activacion del boton Guardar datos del jugador
    public void activarBotonAceptar(boolean validaNombre, boolean validarTipo, boolean validarColor){
        
        if(validaNombre && validarTipo && validarColor){
            btnGuardar.setEnabled(true);
        }else{
            btnGuardar.setEnabled(false);
        }
    }
    
    public void guardarDatosJugador() throws ListaException{
        Jugador nuevoJugador = new Jugador();
        nuevoJugador.setNombre(txtNombre.getText());
        nuevoJugador.setColorAsignado(coloresSeleccion.getColor());
        panelColor.setBackground(coloresSeleccion.getColor());
        nuevoJugador.setTipo((String) cmbTipo.getSelectedItem());
        nuevoJugador.setCantidadPlanetas(1);
        ListaDobleEnlazada nuevoPlaneta = new ListaDobleEnlazada();
        nuevoPlaneta.agregar(obtenerPlanetaInicial());
        nuevoJugador.setPlanetasJugador(nuevoPlaneta);
        
        ListaDobleEnlazada<Jugador> nuevo;
        nuevo = new ListaDobleEnlazada<>();
        nuevo.agregar(nuevoJugador);
        ListaJugadores listaJug = new ListaJugadores();
        listaJug.setListaJugadores(nuevo);
        nuevo.mostrarLisra();
        EstablecerDatos establecer = new EstablecerDatos();
        establecer.establecerJugadoresCombobox(cmbListaJugadores, listaJug.getListaJugadores());
        listaJug.getListaJugadores().mostrarLisra();
    }

    
}
