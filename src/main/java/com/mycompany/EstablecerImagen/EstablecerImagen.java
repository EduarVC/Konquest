package com.mycompany.EstablecerImagen;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EstablecerImagen {

    private static ImageIcon imagen;
    private static Icon icono;
    
    //metodo para establecer imagen en un lbl
    public static final void establecerImagen(JLabel lbl, String ruta) {
        EstablecerImagen.imagen = new ImageIcon(ruta);
        EstablecerImagen.icono = new ImageIcon(
                EstablecerImagen.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(),
                        Image.SCALE_DEFAULT));
        lbl.setIcon(EstablecerImagen.icono);
    }
}
