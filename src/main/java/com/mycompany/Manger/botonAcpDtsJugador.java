package com.mycompany.Manger;

import com.mycompany.Establecer.EstablecerDatos;
import static com.mycompany.JFrame.DatosJugador.btnGuardar;
import static com.mycompany.JFrame.DatosJugador.cmbTipo;
import static com.mycompany.JFrame.DatosJugador.cmbTipoPlaneta;
import static com.mycompany.JFrame.DatosJugador.coloresSeleccion;
import static com.mycompany.JFrame.DatosJugador.panelColor;
import static com.mycompany.JFrame.DatosJugador.txtNombre;
import static com.mycompany.JFrame.DatosJugador.txtNombrePlaneta;
import static com.mycompany.JFrame.JFramePrincipal.cmbListaJugadores;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import com.mycompany.Listas.ListaException;
import com.mycompany.Listas.TiposPlanetasDisponibles;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.ObtenerPlaneta;
import com.mycompany.Planeta.Planeta;
import com.mycompany.Planeta.PlanetaJugador;

public class botonAcpDtsJugador {
    private ObtenerPlaneta obtenerPlaneta;
    private TiposPlanetasDisponibles modificarTipos;
    
    public botonAcpDtsJugador(){
        modificarTipos = new TiposPlanetasDisponibles();
        obtenerPlaneta = new ObtenerPlaneta();
    }
    //Activacion del boton Guardar datos del jugador
    public void activarBotonAceptar(boolean validaNombre, boolean validarTipo, boolean validarColor, boolean validarNombrePlaneta){
        
        if(validaNombre && validarTipo && validarColor && validarNombrePlaneta){
            btnGuardar.setEnabled(true);
        }else{
            btnGuardar.setEnabled(false);
        }
    }
    
    //Se guardan los datos del jugador
    public void guardarDatosJugador() throws ListaException{
        Jugador nuevoJugador = new Jugador();
        nuevoJugador.setNombre(txtNombre.getText());
        nuevoJugador.setColorAsignado(coloresSeleccion.getColor());
        panelColor.setBackground(coloresSeleccion.getColor());
        nuevoJugador.setTipo((String) cmbTipo.getSelectedItem());
        nuevoJugador.setCantidadPlanetas(1);
        Planeta nuevoPlaneta  = new PlanetaJugador();
        nuevoPlaneta = obtenerPlaneta.obtenerPlaneta((String) cmbTipoPlaneta.getSelectedItem());
        nuevoPlaneta.setNombrePlaneta(txtNombrePlaneta.getText());
        nuevoJugador.getPlanetasJugador().agregar(nuevoPlaneta);
        modificarTipos.eliminarTipoLista((String) cmbTipoPlaneta.getSelectedItem());
        getListaJugadores().agregar(nuevoJugador);
        EstablecerDatos establecer = new EstablecerDatos();
        establecer.establecerJugadoresCombobox(cmbListaJugadores, getListaJugadores());
    }

    
}
