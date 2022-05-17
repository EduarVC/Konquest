package com.mycompany.Mapa;

import static com.mycompany.JFrame.JFrameMapa.checkMostrarEstadisticas;
import static com.mycompany.JFrame.JFrameMapa.checkMostrarNaves;
import static com.mycompany.JFrame.JFrameMapa.spCantidadNavesZombie;
import static com.mycompany.JFrame.JFrameMapa.spPorcentageMuerte;
import static com.mycompany.JFrame.JFrameMapa.spProdiccion;
import static com.mycompany.JFrame.JFramePrincipal.getListaMapas;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Planeta.PlanetaFantasma;
import com.mycompany.Planeta.PlanetaNeutral;
import com.mycompany.Planeta.PlanetaZombie;

public class GenerarPlanetas {

    public GenerarPlanetas() {
    }

    //Se generan los planetas Neutrales
    public void generarPlanetaNeutral(Mapa mapa) {
        NodoDoble<Mapa> recorrer = getListaMapas().getInicio();

        while (recorrer != null) {
            if (recorrer.getContenido() == mapa) {
                float porcentaje = (float) spPorcentageMuerte.getValue();
                for (int i = 0; i < recorrer.getContenido().getCantidadPlanetasNeutrales(); i++) {
                    PlanetaNeutral nuevoPlaneta = new PlanetaNeutral();
                    nuevoPlaneta.setPorcentajeMuerte(porcentaje);
                    nuevoPlaneta.setProduccion((int) spProdiccion.getValue());
                    nuevoPlaneta.setNombrePlaneta(ObtenerNombrePlaneta());
                    nuevoPlaneta.setMostrarEstadisticas(mostrarEstadisticas());
                    nuevoPlaneta.setMostrarNaves(mostrarNaves());
                    recorrer.getContenido().getListaPlanetaNeutral().agregar(nuevoPlaneta);
                }
                
            }
            recorrer = recorrer.getSiguiente();
        }

    }

    //Se generan el nombre de los planetas
    private String ObtenerNombrePlaneta() {
        String abecedarioMinuscula = "abcdefghijklmnopqrstuvwxyz";
        String abecedarioMayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caracteres = abecedarioMinuscula + abecedarioMayuscula;
        int tamañoNombre = (int) (Math.random() * 3 + 1);
        String nombre = "";
        for (int i = 0; i < tamañoNombre; i++) {
            int posicion = (int) (Math.random() * caracteres.length());
            char caracter = caracteres.charAt(posicion);
            nombre += caracter;
        }
        return nombre;
    }

    //Se generan los planetas Zombie
    public void generarPlanetasZombie(Mapa mapa) {
        
        float porcentaje = obtenerPorcentage();
        for (int i = 0; i < mapa.getCantidadPlanetasZimbie(); i++) {
            PlanetaZombie nuevoPlaneta = new PlanetaZombie();
            nuevoPlaneta.setCantidadNavesMandar((int) spCantidadNavesZombie.getValue());
            nuevoPlaneta.setPorcentajeMuerte(porcentaje);
            nuevoPlaneta.setNombrePlaneta(ObtenerNombrePlaneta());
            mapa.getListaPlanetasZombie().agregar(nuevoPlaneta);
        }

    }

    //Se generan los planetas fantasma
    public void generarPlanetasFantasma(Mapa mapa) {
        
        float porcentaje = (float) spPorcentageMuerte.getValue();
        for (int i = 0; i < mapa.getCantidadPlanetasFantasma(); i++) {
            PlanetaFantasma nuevoPlaneta = new PlanetaFantasma();
            nuevoPlaneta.setNombrePlaneta(ObtenerNombrePlaneta());
            nuevoPlaneta.setPorcentajeMuerte(porcentaje);
            nuevoPlaneta.setProduccion((int) spProdiccion.getValue());
            nuevoPlaneta.setMostrarEstadisticas(mostrarEstadisticas());
            nuevoPlaneta.setMostrarNaves(mostrarNaves());
            mapa.getListaPlanetasFantasma().agregar(nuevoPlaneta);
        }

    }

    //Se obtiene el porcentaje de muerte de los planetas
    public float obtenerPorcentage() {
        float porcentaje = (float) Math.random();
        return porcentaje;
    }

    public boolean mostrarEstadisticas() {
        return checkMostrarEstadisticas.isSelected();
    }

    public boolean mostrarNaves() {
        return checkMostrarNaves.isSelected();
    }
}
