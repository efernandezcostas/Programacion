/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

/**
 *
 * @author dam1
 */
public class Conta {
    
    private long numeroConta;
    private double saldo=0;
    private Persoa person;
    
    // Constructor
    public Conta (Persoa person,long numeroConta){
        this.numeroConta=numeroConta;
        this.person=person;
    }
    // Métodos de acceso
    public long getNumeroConta(){
        return numeroConta;
    }
    
    public void setNumeroConta(long numeroConta){
        this.numeroConta=numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getPerson() {
        return person;
    }

    public void setPerson(Persoa person) {
        this.person = person;
    }
    
    
    // Métodos
    public void ingresar (double saldo){
        this.saldo+=saldo;
        System.out.println("Su saldo es: "+saldo+" €");
    }
    
    public void retirar (double saldo){
        if (this.saldo>saldo){
            this.saldo-=saldo;
            System.out.println("Su saldo es: "+saldo);
        }else{
            System.out.println("No hay suficiente dinero: "+this.saldo);  
        }
    }
    
    public void actualizarSaldo(){
        
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + ", person=" + person + '}';
    }

    
    
    
    
    
}
