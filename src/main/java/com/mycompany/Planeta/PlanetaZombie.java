package com.mycompany.Planeta;

public class PlanetaZombie extends Planeta{

    private int cantidadNavesMandar;
    private float porcentajeMuerte;
    
    public PlanetaZombie(){
        setCategoria("Zombie");
        setTipo("Zombie");
    }
    
    @Override
    public void posicionarPlaneta() {
        //Al Azar
    }

    public int getCantidadNavesMandar() {
        return cantidadNavesMandar;
    }

    public void setCantidadNavesMandar(int cantidadNavesMandar) {
        this.cantidadNavesMandar = cantidadNavesMandar;
    }

    public float getPorcentajeMuerte() {
        return porcentajeMuerte;
    }

    public void setPorcentajeMuerte(float porcentajeMuerte) {
        this.porcentajeMuerte = porcentajeMuerte;
    }
    
}
