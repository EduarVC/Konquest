package com.mycompany.Planeta;

import com.mycompany.Planeta.Planeta;

public class PlanetaInicial {
    private static Planeta planetaInicial;
    
    public static Planeta obtenerPlanetaInicial(){
        
        return getPlanetaInicial();
    }

    public static Planeta getPlanetaInicial() {
        return planetaInicial;
    }

    public static void setPlanetaInicial(Planeta planetaInicial) {
        PlanetaInicial.planetaInicial = planetaInicial;
    }
    
}
