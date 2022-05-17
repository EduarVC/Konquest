package com.mycompany.Planeta;

public class ObtenerPlaneta {
    private PlanetaJugador planetaInicial;
    
    public PlanetaJugador obtenerPlaneta(String tipoPlaneta){
        
        switch (tipoPlaneta) {
            case "Agua":
                planetaInicial = new Agua();
                break;
            case "Fuego":
                planetaInicial = new Fuego();
                break;
            case "Hielo":
                planetaInicial = new Hielo();
                break;
            case "Hierro":
                planetaInicial = new Hierro();
                break;
            case "Lava":
                planetaInicial = new Lava();
                break;
            case "Tierra":
                planetaInicial = new Tierra();
                break;
            case "Viento": 
                planetaInicial = new Viento();
                break;
            case "Piedra":
                planetaInicial = new Piedra();
                break;
            default:
                throw new AssertionError();
        }
        
        return planetaInicial;
    }
    
}
