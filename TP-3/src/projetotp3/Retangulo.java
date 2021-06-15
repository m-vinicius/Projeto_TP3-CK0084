package projetotp3;

public class Retangulo implements formaGeom{
	
	private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
    	this.base = base;
    	this.altura = altura;
    }
    public double Perimetro(){
    	return (base*2)+(altura*2);
    }
    public double Area(){
        return (base*altura);
     }      
}
