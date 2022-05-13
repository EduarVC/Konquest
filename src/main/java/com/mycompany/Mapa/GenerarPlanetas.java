package com.mycompany.Mapa;

import static com.mycompany.JFrame.JFrameMapa.spCantidadNavesZombie;
import static com.mycompany.JFrame.JFrameMapa.spPorcentageMuerte;
import static com.mycompany.JFrame.JFrameMapa.spProdiccion;
import com.mycompany.Planeta.PlanetaFantasma;
import com.mycompany.Planeta.PlanetaNeutral;
import com.mycompany.Planeta.PlanetaZombie;

public class GenerarPlanetas {
    
    public GenerarPlanetas(){
    }
    
    public void generarPlanetaNeutral(Mapa mapa) {
        PlanetaNeutral nuevoPlaneta = new PlanetaNeutral();
        float porcentaje = (float) spPorcentageMuerte.getValue();
        for (int i = 0; i < mapa.getCantidadPlanetasNeutrales(); i++) {
            nuevoPlaneta.setPorcentajeMuerte(porcentaje);
            nuevoPlaneta.setProduccion((int) spProdiccion.getValue());
            nuevoPlaneta.setNombrePlaneta(ObtenerNombrePlaneta());
            mapa.getListaPlanetaNeutral().agregar(nuevoPlaneta);
        }
        
        
    }

    private String ObtenerNombrePlaneta() {
        String abecedarioMinuscula = "abcdefghijklmnopqrstuvwxyz";
        String abecedarioMayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caracteres = abecedarioMinuscula + abecedarioMayuscula;
        int tamañoNombre = (int) Math.random() * 3 + 1;
        String nombre = "";
        for (int i = 0; i < tamañoNombre; i++) {
            int posicion = (int) Math.random() * caracteres.length();
            char caracter = caracteres.charAt(posicion);
            nombre += caracter;
        }
        return nombre;
    }
    
    public void generarPlanetasZombie(Mapa mapa){
        PlanetaZombie nuevoPlaneta = new PlanetaZombie();
        float porcentaje = obtenerPorcentage();
        for (int i = 0; i < mapa.getCantidadPlanetasZimbie(); i++) {
            nuevoPlaneta.setCantidadNavesMandar((int) spCantidadNavesZombie.getValue());
            nuevoPlaneta.setPorcentajeMuerte(porcentaje);
            nuevoPlaneta.setNombrePlaneta(ObtenerNombrePlaneta());
            mapa.getListaPlanetasZombie().agregar(nuevoPlaneta);
        }
        
        
    }

    public void generarPlanetasFantasma(Mapa mapa){
        PlanetaFantasma nuevoPlaneta = new PlanetaFantasma();
        float porcentaje = (float) spPorcentageMuerte.getValue();
        for (int i = 0; i < mapa.getCantidadPlanetasFantasma(); i++) {
            nuevoPlaneta.setNombrePlaneta(ObtenerNombrePlaneta());
            nuevoPlaneta.setPorcentajeMuerte(porcentaje);
            nuevoPlaneta.setProduccion((int) spProdiccion.getValue());
            mapa.getListaPlanetasFantasma().agregar(nuevoPlaneta);
        }
        
        
    }
    public float obtenerPorcentage() {
        float porcentaje = (float) Math.random();
        return porcentaje;
    }
}
