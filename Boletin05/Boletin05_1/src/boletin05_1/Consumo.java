package boletin05_1;

public class Consumo {
    
	private float km;
	private float litros;
	private float vMed;
	private float pGas;
    
	public Consumo(){
	}
    
	public Consumo(float km,float litros,float vMed,float pGas){
    	this.km=km;
    	this.litros=litros;
    	this.vMed=vMed;
    	this.pGas=pGas;   	 
	}
    
	public void setKm(float km){
    	this.km=km;
	}
    
	public void setLitros(float litros){
    	this.litros=litros;
	}
    
	public void setVMed(float vMed){
    	this.vMed=vMed;
	}
    
	public void setPGas(float pGas){
    	this.pGas=pGas;
	}
    
	public void getTempo(){
    	System.out.print("O tempo en realizar o viaxe é: "+(km/vMed)+".\n");
	}
    
	public void getConsumoMedio(){
    	System.out.print("O consumo medio de gasolina é: "+((litros/km)*100)+" L cada 100km.\n");
	}
    
	public void getConsumoEuros(){
    	System.out.print("O consumo medio de euros é: "+(((litros/km)*100)*pGas)+" € cada 100km.\n\n");
	}
    
    
    
    
}
