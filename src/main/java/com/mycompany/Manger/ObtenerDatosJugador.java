package com.mycompany.Manger;

import static com.mycompany.JFrame.DatosJugador.panelColor;
import com.mycompany.Personaje.Jugador;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ObtenerDatosJugador {
   private Jugador nuevoJugador; 
   private Color colorSeleccionado;
   private String nombre;
   private String tipo;
   private boolean clrSeleccionado;
   
   public ObtenerDatosJugador(){
       nuevoJugador = new Jugador();
//       datos = new RestriccionesYvalidaciones();
   }
   
   /**
    * Se obtiene 
    * Se muestra el color en el panel
    * @param color
    */
    public void obtenerColor(JColorChooser color){ 
        
        setColorSeleccionado(color.getColor());
        panelColor.setBackground(getColorSeleccionado());
        
        
   }
    /**
     * Establece el nombre agregado
     * @param nombre 
     */
    public void obtenerNombreJugador(JTextField nombre){
        setNombre(nombre.getText());
        nuevoJugador.setNombre(getNombre());
        
    }
    /**
     * Establece el tipo seleccionado
     * @param tipo 
     */
    public void obtenerTipoJugador(JComboBox tipo){
        setTipo((String) tipo.getSelectedItem());
        nuevoJugador.setTipo(getTipo());
    }
    
    //Metodos geters y seters de tipo estaticos 
    public Color getColorSeleccionado() {
        return colorSeleccionado;
    }

    public void setColorSeleccionado(Color colorSeleccionado) {
        this.colorSeleccionado = colorSeleccionado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isClrSeleccionado() {
        return clrSeleccionado;
    }

    public void setClrSeleccionado(boolean clrSeleccionado) {
        this.clrSeleccionado = clrSeleccionado;
    }
    
}
