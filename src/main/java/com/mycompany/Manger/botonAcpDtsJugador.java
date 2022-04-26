package com.mycompany.Manger;

import static com.mycompany.JFrame.DatosJugador.btnGuardar;
import static com.mycompany.Manger.ObtenerDatosJugador.isClrSeleccionado;
import static com.mycompany.Manger.RestriccionesYvalidaciones.isValidarNombre;
import static com.mycompany.Manger.RestriccionesYvalidaciones.isValidarTipo;

public class botonAcpDtsJugador {
    
    //Activacion del boton Guardar datos del jugador
    public static void activarBotonAceptar(){
        if(isValidarTipo() && isValidarNombre() && isClrSeleccionado()){
            btnGuardar.setEnabled(true);
        }else{
            btnGuardar.setEnabled(false);
        }
    }
}
