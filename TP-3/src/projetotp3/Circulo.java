package projetotp3;

public class Circulo implements formaGeom{
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
}

public double Perimetro1() {
	return (raio = 1)*3.14*2; 
}

public double Perimetro(){
    return raio*3.14*2;
}

public double Area(){
    return (raio*raio)*3.14;
}

}
