package com.mycompany.Listas;

import static com.mycompany.JFrame.JFramePrincipal.getListaTiposPlanetas;
import static com.mycompany.JFrame.JFramePrincipal.setListaTiposPlanetas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class TiposPlanetasDisponibles {

    private String[] tipos;

    public TiposPlanetasDisponibles() {
        tipos = new String[8];
        tipos[0] = "Agua";
        tipos[1] = "Fuego";
        tipos[2] = "Hielo";
        tipos[3] = "Hierro";
        tipos[4] = "Lava";
        tipos[5] = "Piedra";
        tipos[6] = "Tierra";
        tipos[7] = "Viento";
    }

    public void definirTiposPrincipio(JComboBox tiposPlanetas) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) tiposPlanetas.getModel();
        for (int i = 0; i < getListaTiposPlanetas().length; i++) {
            model.addElement(getListaTiposPlanetas()[i]);
        }
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public void eliminarTipoLista(String tipoSeleccionado) {
        String[] nuevoListado = new String[getListaTiposPlanetas().length - 1];
        System.out.println(tipoSeleccionado);
        int contador = 0;
        for (int i = 0; i < getListaTiposPlanetas().length; i++) {

            if (!getListaTiposPlanetas()[i].equals(tipoSeleccionado)) {
                System.out.println(getListaTiposPlanetas()[i]);
                nuevoListado[contador] = getListaTiposPlanetas()[i];
                contador++;
            }
        }
        setListaTiposPlanetas(nuevoListado);
    }

    public void añadirTipoLista(String tipoAñadir) {
        String[] nuevoListado = new String[getListaTiposPlanetas().length + 1];
        System.out.println(tipoAñadir);
        for (int i = 0; i < nuevoListado.length; i++) {
            if (i == nuevoListado.length - 1) {
                nuevoListado[i] = tipoAñadir;
            } else {
                nuevoListado[i] = getListaTiposPlanetas()[i];
            }
        }
        setListaTiposPlanetas(nuevoListado);
    }
}
