package com.mycompany.Manger;

import static com.mycompany.JFrame.DatosJugador.cmbTipo;
import static com.mycompany.JFrame.DatosJugador.lblAvisoCmb;
import static com.mycompany.JFrame.DatosJugador.lblAvisoNombre;
import static com.mycompany.JFrame.DatosJugador.txtNombre;
import static com.mycompany.Manger.botonAcpDtsJugador.activarBotonAceptar;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class RestriccionesYvalidaciones {
    private static boolean validarNombre;
    private static boolean validarTipo;
    
    public RestriccionesYvalidaciones(){
        setValidarNombre(false);
        setValidarTipo(false);
    }
    //Se limita el tamaño del texto ingresado
    public static void limitarTamaño(KeyEvent evt) {

        if (txtNombre.getText().length() == 0) {
            if (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 64
                    || evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96
                    || evt.getKeyChar() >= 123 && evt.getKeyChar() <= 208
                    || evt.getKeyChar() >= 210 && evt.getKeyChar() <= 240
                    || evt.getKeyChar() >= 242 && evt.getKeyChar() <= 255) {
                lblAvisoNombre.setBackground(Color.red);
                lblAvisoNombre.setText("*Caracter no permitido");
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        }
        if (txtNombre.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    //Se valida el campo Nombre Jugador
    public static void validacionLbvVacio() {
        if (txtNombre.getText().isEmpty()) {
            lblAvisoNombre.setText("*Campo obligatorio");
            setValidarNombre(false);
            activarBotonAceptar();
        } else {
            lblAvisoNombre.setText("");
            setValidarNombre(true);
            activarBotonAceptar();
        }
    }

    //Se valida el campo Seleccionar tipo
    public static void validacionCombobox() {
        if (cmbTipo.getSelectedItem() == "Seleccione tipo") {
            lblAvisoCmb.setText("*Campo obligatorio");
            setValidarTipo(false);
            activarBotonAceptar();
        } else {
            lblAvisoCmb.setText("");
            setValidarTipo(true);
            activarBotonAceptar();
        }
    }

    public static boolean isValidarNombre() {
        return validarNombre;
    }

    public static void setValidarNombre(boolean validarNombre) {
        RestriccionesYvalidaciones.validarNombre = validarNombre;
    }

    public static boolean isValidarTipo() {
        return validarTipo;
    }

    public static void setValidarTipo(boolean validarTipo) {
        RestriccionesYvalidaciones.validarTipo = validarTipo;
    }
    
}
