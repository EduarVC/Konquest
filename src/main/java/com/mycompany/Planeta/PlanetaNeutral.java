package com.mycompany.Planeta;

public class PlanetaNeutral extends Planeta{
    private int produccion;
    private float porcentajeMuerte;
    
    public PlanetaNeutral(){
        setCategoria("Neutral");
        setTipo("Neutro");
        
    }
    
    @Override
    public void posicionarPlaneta() {
       //Al Azar   -------->  Verdader
       //Manual    ........>  Falso
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
