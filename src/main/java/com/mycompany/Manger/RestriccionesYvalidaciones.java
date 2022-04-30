package com.mycompany.Manger;

import static com.mycompany.JFrame.DatosJugador.cmbTipo;
import static com.mycompany.JFrame.DatosJugador.lblAvisoCmb;
import static com.mycompany.JFrame.DatosJugador.lblAvisoColor;
import static com.mycompany.JFrame.DatosJugador.lblAvisoNombre;
import static com.mycompany.JFrame.DatosJugador.txtNombre;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class RestriccionesYvalidaciones {

    private boolean validarNombre;
    private boolean validarTipo;
    private boolean validarColor;
    private botonAcpDtsJugador botonAceptar;
    private ObtenerDatosJugador datos;

    public RestriccionesYvalidaciones() {
        datos = new ObtenerDatosJugador();
    }

    //Se limita el tamaño del texto ingresado
    public void limitarTamaño(KeyEvent evt) {

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
    public void validacionLbvVacio() {

        botonAceptar = new botonAcpDtsJugador();
        if (txtNombre.getText().isEmpty()) {
            lblAvisoNombre.setText("*Campo obligatorio");
            setValidarNombre(false);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), datos.isClrSeleccionado());
        } else {
            lblAvisoNombre.setText("");
            setValidarNombre(true);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), datos.isClrSeleccionado());
        }
    }

    //Se valida el campo Seleccionar tipo
    public void validacionCombobox() {
        botonAceptar = new botonAcpDtsJugador();
        if (cmbTipo.getSelectedItem() == "Seleccione tipo") {
            lblAvisoCmb.setText("*Campo obligatorio");
            setValidarTipo(false);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), isValidarColor());
        } else {
            lblAvisoCmb.setText("");
            setValidarTipo(true);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), isValidarColor());
        }
    }

    public void validarColor() {
        if (datos.getColorSeleccionado() != Color.WHITE) {
            setValidarColor(true);
            lblAvisoColor.setText("");
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), isValidarColor());
        } else {
            setValidarColor(false);
            lblAvisoColor.setText("*Campo Obligatorio");
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), isValidarColor());
        }
    }

    public void reestablecerComponentes() {
        setValidarColor(false);
        setValidarNombre(false);
        setValidarTipo(false);
    }

    public boolean isValidarNombre() {
        return validarNombre;
    }

    public void setValidarNombre(boolean validarNombre) {
        this.validarNombre = validarNombre;
    }

    public boolean isValidarTipo() {
        return validarTipo;
    }

    public void setValidarTipo(boolean validarTipo) {
        this.validarTipo = validarTipo;
    }

    public boolean isValidarColor() {
        return validarColor;
    }

    public void setValidarColor(boolean validarColor) {
        this.validarColor = validarColor;
    }

}
