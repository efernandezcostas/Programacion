
package boletinextra03_1;

import javax.swing.JOptionPane;


public class Conta {
    
    private String nomeCliente;
    private String numConta;
    private double tipoInterese;
    private double saldo;
    
    public Conta(){
    }
    
    public Conta(String nomeCliente,String numConta,double tipoInterese, double saldo){
        this.nomeCliente=nomeCliente;
        this.numConta=numConta;
        this.saldo=saldo;
        this.tipoInterese=tipoInterese;
    }
    
    public void setNomeCliente (){
        nomeCliente=JOptionPane.showInputDialog("Nome do cliente: ");
    }
    
    public void setNumConta (){
        numConta=nomeCliente=JOptionPane.showInputDialog("Número de conta: ");
    }
    
    public void setTipoInterese(){
        tipoInterese=Double.parseDouble(JOptionPane.showInputDialog("Tipo de interese: "));    
    }
    
    public void setSaldo(){
        saldo= Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial: "));
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public String getNumConta(){
        return numConta;
    }
    
    public double getTipoInterese(){
        return tipoInterese;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void ingresar(){
        saldo+=Double.parseDouble(JOptionPane.showInputDialog("Cantidade a ingresar: "));
    }
    
    public void retirar(){
        saldo-=Double.parseDouble(JOptionPane.showInputDialog("Cantidade a retirar: "));;
    }
    
    public void transferencia (double saldoCuentaDestino,double importe){
        saldo-=importe;
        saldoCuentaDestino+=importe;
        JOptionPane.showConfirmDialog(null, "El saldo de la cuenta origen es de "+saldo+" €.");
        JOptionPane.showConfirmDialog(null, "El saldo de la cuenta origen es de "+saldoCuentaDestino+" €.");
        
    }
}
