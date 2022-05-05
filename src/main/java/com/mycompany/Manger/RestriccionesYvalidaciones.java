package com.mycompany.Manger;

import static com.mycompany.JFrame.DatosJugador.cmbModo;
import static com.mycompany.JFrame.DatosJugador.cmbTipo;
import static com.mycompany.JFrame.DatosJugador.lblAvisoCmb;
import static com.mycompany.JFrame.DatosJugador.lblAvisoColor;
import static com.mycompany.JFrame.DatosJugador.lblAvisoNombre;
import static com.mycompany.JFrame.DatosJugador.lblAvisoNombrePlaneta;
import static com.mycompany.JFrame.DatosJugador.txtNombre;
import static com.mycompany.JFrame.DatosJugador.txtNombrePlaneta;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class RestriccionesYvalidaciones {

    private boolean validarNombre;
    private boolean validarTipo;
    private boolean validarColor;
    private boolean validarNombrePlaneta;
    private botonAcpDtsJugador botonAceptar;
    private ObtenerDatosJugador datos;

    public RestriccionesYvalidaciones() {
        datos = new ObtenerDatosJugador();
        botonAceptar = new botonAcpDtsJugador();
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

    public void limitarTamañoNombrePlaneta(KeyEvent evt){
      if (txtNombrePlaneta.getText().length() == 0 || txtNombrePlaneta.getText().length() == 1 || txtNombrePlaneta.getText().length() == 2) {
            if (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 64
                    || evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96
                    || evt.getKeyChar() >= 123 && evt.getKeyChar() <= 208
                    || evt.getKeyChar() >= 210 && evt.getKeyChar() <= 240
                    || evt.getKeyChar() >= 242 && evt.getKeyChar() <= 255) {
                lblAvisoNombrePlaneta.setBackground(Color.red);
                lblAvisoNombrePlaneta.setText("*Caracter no permitido");
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        }
        if (txtNombrePlaneta.getText().length() >= 3) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
      
    }
    //Se valida el campo Nombre Jugador
    public void validacionLbvVacio() {
        if (txtNombre.getText().isEmpty()) {
            lblAvisoNombre.setText("*Campo obligatorio");
            setValidarNombre(false);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), datos.isClrSeleccionado(), isValidarNombrePlaneta());
        } else {
            lblAvisoNombre.setText("");
            setValidarNombre(true);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), datos.isClrSeleccionado(), isValidarNombrePlaneta());
        }
    }
    //Se valida el campo nombre planeta
    public void validacionTxtNombrePlaneta(){
        if(txtNombrePlaneta.getText().isEmpty()){
            lblAvisoNombrePlaneta.setText("*Campo obligatorio");
            setValidarNombrePlaneta(false);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), datos.isClrSeleccionado(), isValidarNombrePlaneta());
        }else{
            lblAvisoNombrePlaneta.setText("");
            setValidarNombrePlaneta(true);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), datos.isClrSeleccionado(), isValidarNombrePlaneta());
        }
    }
    
    //Se valida el campo Seleccionar tipo
    public void validacionCombobox() {
        if (cmbTipo.getSelectedItem() == "Seleccione tipo") {
            cmbModo.setEnabled(false);
            lblAvisoCmb.setText("*Campo obligatorio");
            setValidarTipo(false);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), isValidarColor(), isValidarNombrePlaneta());
        } else {
            lblAvisoCmb.setText("");
            setValidarTipo(true);
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), isValidarColor(), isValidarNombrePlaneta());
        }
        if(cmbTipo.getSelectedItem() == "Inteligencia Artificial"){
            cmbModo.setEnabled(true);
        }else if(cmbTipo.getSelectedItem() == "Humano"){
             cmbModo.setEnabled(false);
        }
    }
    //se valida el color seleccionado 
    public void validarColor() {
        if (datos.getColorSeleccionado() != Color.WHITE) {
            setValidarColor(true);
            lblAvisoColor.setText("");
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), isValidarColor(), isValidarNombrePlaneta());
        } else {
            setValidarColor(false);
            lblAvisoColor.setText("*Campo Obligatorio");
            botonAceptar.activarBotonAceptar(isValidarNombre(), isValidarTipo(), isValidarColor(), isValidarNombrePlaneta());
        }
    }

    public void reestablecerComponentes() {
        setValidarColor(false);
        setValidarNombre(false);
        setValidarTipo(false);
        setValidarNombrePlaneta(false);
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

    public boolean isValidarNombrePlaneta() {
        return validarNombrePlaneta;
    }

    public void setValidarNombrePlaneta(boolean validarNombrePlaneta) {
        this.validarNombrePlaneta = validarNombrePlaneta;
    }
    
}
