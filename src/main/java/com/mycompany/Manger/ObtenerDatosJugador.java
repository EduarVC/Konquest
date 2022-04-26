package com.mycompany.Manger;

import static com.mycompany.JFrame.DatosJugador.lblAvisoColor;
import static com.mycompany.JFrame.DatosJugador.panelColor;
import static com.mycompany.Manger.botonAcpDtsJugador.activarBotonAceptar;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ObtenerDatosJugador {
   private static Color colorSeleccionado;
   private static String nombre;
   private static String tipo;
   private static boolean clrSeleccionado;
   public ObtenerDatosJugador(){
       setClrSeleccionado(false);
   }
   /**
    * Se obtiene y Se establece el color seleccionado
    * Se muestra el color en el panel
    * @param color
    */
    public static void obtenerColor(JColorChooser color){ 
        setColorSeleccionado(color.getColor());
        panelColor.setBackground(getColorSeleccionado());
        if(getColorSeleccionado() != Color.WHITE){
            setClrSeleccionado(true);
            lblAvisoColor.setText("");
            activarBotonAceptar();
        }else{
            setClrSeleccionado(false);
            lblAvisoColor.setText("*Campo Obligatorio");
            activarBotonAceptar();
        }
   }
    /**
     * Establece el nombre agregado
     * @param nombre 
     */
    public static void obtenerNombreJugador(JTextField nombre){
        setNombre(nombre.getText());
    }
    /**
     * Establece el tipo seleccionado
     * @param tipo 
     */
    public static void obtenerTipoJugador(JComboBox tipo){
        setTipo((String) tipo.getSelectedItem());
    }
    
    //Metodos geters y seters de tipo estaticos 
    public static Color getColorSeleccionado() {
        return colorSeleccionado;
    }

    public static void setColorSeleccionado(Color colorSeleccionado) {
        ObtenerDatosJugador.colorSeleccionado = colorSeleccionado;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        ObtenerDatosJugador.nombre = nombre;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        ObtenerDatosJugador.tipo = tipo;
    }

    public static boolean isClrSeleccionado() {
        return clrSeleccionado;
    }

    public static void setClrSeleccionado(boolean clrSeleccionado) {
        ObtenerDatosJugador.clrSeleccionado = clrSeleccionado;
    }
    
}
