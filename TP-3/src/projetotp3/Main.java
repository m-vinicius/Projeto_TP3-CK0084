package projetotp3;

public class Main {
	
	public static void main(String[]args){
        Retangulo retangulo = new Retangulo(8,10);
        Circulo circulo = new Circulo(6.4);
        Quadrado quadrado= new Quadrado(5);
        
        
        System.out.println("Circulo");
        System.out.println("Perimetro: "+circulo.Perimetro());
        System.out.println("Area: "+circulo.Area());
        
        System.out.println("Retangulo");
        System.out.println("Perimetro: "+retangulo.Perimetro());
        System.out.println("Area: "+retangulo.Area());
        
        System.out.println("Quadrado");
        System.out.println("Perimetro: "+quadrado.Perimetro());
        System.out.println("Area: "+quadrado.Area());
    }
}
