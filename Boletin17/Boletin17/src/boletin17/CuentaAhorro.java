/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

/**
 *
 * @author dam1
 */
public class CuentaAhorro extends Conta {
    
    private float intereseVariable;
    private double saldoMinimo=1000;
    
    public CuentaAhorro(Persoa person, long numeroConta, float intereseVariable){
        super(person, numeroConta);
        this.intereseVariable=intereseVariable;
        
        setSaldo(saldoMinimo);
    }
    
    public void setIntereseVariable (float intereseVariable){
        this.intereseVariable=intereseVariable;
    }

    
    
}
