package com.mycompany.Mapa;

import static com.mycompany.JFrame.JFrameMapa.checkMapaCiego;
import static com.mycompany.JFrame.JFrameMapa.checkProduccionAcumulativa;
import static com.mycompany.JFrame.JFrameMapa.chkbAlAzar;
import static com.mycompany.JFrame.JFrameMapa.spAltura;
import static com.mycompany.JFrame.JFrameMapa.spAnchura;
import static com.mycompany.JFrame.JFrameMapa.spPlanetasFantasma;
import static com.mycompany.JFrame.JFrameMapa.spPlanetasNeutrales;
import static com.mycompany.JFrame.JFrameMapa.spPlanetasZombie;
import static com.mycompany.JFrame.JFrameMapa.txtNombreMapa;
import static com.mycompany.JFrame.JFramePrincipal.getListaMapas;

public class CapturaDatosMapa {
    private GenerarPlanetas generar;
    
    public CapturaDatosMapa(){
        generar = new GenerarPlanetas();
    }
    
    public void capturarDatosMapaNuevo(){
        Mapa nuevoMapa = new Mapa();
        nuevoMapa.setNombreMapa(txtNombreMapa.getText());
        nuevoMapa.setAlto((int) spAltura.getValue());
        nuevoMapa.setAncho((int) spAnchura.getValue());
        nuevoMapa.setCantidadPlanetasNeutrales((int) spPlanetasNeutrales.getValue());
        nuevoMapa.setCantidadPlanetasFantasma((int) spPlanetasFantasma.getValue());
        nuevoMapa.setCantidadPlanetasZimbie((int) spPlanetasZombie.getValue());
        nuevoMapa.setMapaCiego(mapaCiego());
        nuevoMapa.setAlAzar(alAzar());
        nuevoMapa.setProduccionAcumulativa(porAcumulacion());
        generar.generarPlanetaNeutral(nuevoMapa);
        generar.generarPlanetasZombie(nuevoMapa);
        generar.generarPlanetasFantasma(nuevoMapa);
        
        getListaMapas().agregar(nuevoMapa);
        
    }


    private boolean mapaCiego() {
        return checkMapaCiego.isSelected();
    }

    private boolean alAzar() {
        return chkbAlAzar.isSelected();
    }

    private boolean porAcumulacion() {
        return checkProduccionAcumulativa.isSelected();
    }
    
    
}
