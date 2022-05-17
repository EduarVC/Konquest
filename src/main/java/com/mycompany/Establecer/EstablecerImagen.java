package com.mycompany.Establecer;

import static com.mycompany.JFrame.JFramePrincipal.cmbTipoMapa;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EstablecerImagen {

    private static ImageIcon imagen;
    private static Icon icono;
    
    //metodo para establecer imagen en un lbl
    public final void establecerImagen(JLabel lbl, String ruta) {
        EstablecerImagen.imagen = new ImageIcon(getClass().getResource(ruta));
        EstablecerImagen.icono = new ImageIcon(
                EstablecerImagen.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(),
                        Image.SCALE_DEFAULT));
        lbl.setIcon(EstablecerImagen.icono);
    }
    
    public void esteblecerImagenMapa(JLabel lbl){
        String ruta = null;
        switch (cmbTipoMapa.getSelectedIndex()) {
            case 0:
                ruta = "/InvacionEspacial.jpg";
                break;
            case 1:
                ruta = "/Galaxia.jpg";
                break;
            case 2:
                ruta = "/FondoNave_1.jpg";
                break;
            default:
                break;
        }
        establecerImagen(lbl, ruta);
    }
}
