package com.mycompany.Planeta;

public class PlanetaFantasma extends Planeta{

    private int produccion;
    private float porcentajeMuerte;
    
    public PlanetaFantasma(){
        setCategoria("Fantasma");
        setTipo("Fantasma");
    }
    
    @Override
    public void posicionarPlaneta() {
        //Al azar
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    public float getPorcentajeMuerte() {
        return porcentajeMuerte;
    }

    public void setPorcentajeMuerte(float porcentajeMuerte) {
        this.porcentajeMuerte = porcentajeMuerte;
    }
    
}
