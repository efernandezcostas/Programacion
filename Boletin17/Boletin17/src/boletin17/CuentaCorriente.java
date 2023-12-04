/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

/**
 *
 * @author dam1
 */
public class CuentaCorriente extends Conta {
    
    private float interese=1.5f;

    public CuentaCorriente(Persoa person, long numeroConta) {
        super(person, numeroConta);
    }
    
    public void setInterese(float interese){
        this.interese=interese;
    }
    
}
