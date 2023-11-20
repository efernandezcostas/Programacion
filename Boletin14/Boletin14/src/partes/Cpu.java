/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partes;

/**
 *
 * @author dam1
 */
public class Cpu {
    
    private String marca;
    private int velocidade;
    private float precio;

    public Cpu(String marca, int velocidade, float precio) {
        this.marca = marca;
        this.velocidade = velocidade;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cpu{" + "marca=" + marca + ", velocidade=" + velocidade + ", precio=" + precio + '}';
    }
    
    
    
}
