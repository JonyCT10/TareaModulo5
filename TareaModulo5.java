

import java.lang.Math;
public class Formas {

    public String color;
    public String forma;
    
    
    public void dibujar(String forma){
        this.forma=forma;
        System.out.println(forma);
    }

    public void establecerColor(String color){
        this.color=color;
    }
     
    public static void main(String[] args) {
       Circulo cir1=new Circulo();
       Linea lin1=new Linea();
       Triangulo tri1=new Triangulo();
       Cuadrado cuad1=new Cuadrado();
       
       
       cir1.calcular_Radio(23.4, Math.PI);
       cir1.dibujar(cir1.forma);
       
       lin1.dibujar(lin1.forma);
       
       tri1.calcularArea(5, 4, 35);
       tri1.dibujar(tri1.forma);
       
       cuad1.calcularArea(45);
       cuad1.dibujar(cuad1.forma);
       
       
    }
}

class Circulo extends Formas{
   
    public double radio;
    public double circunferencia;
    public double pi;
    public String forma="Circulo";
    
    public void calcular_Radio(double circun,double pi){
        this.circunferencia=circun;
        this.pi=pi;
        
        radio= circun/(2*pi);
        System.out.println("El radio de: " + forma +" es: " +radio);
    }
}

class Linea extends Formas{
    
    public double largo=44.4;
    public String forma="Linea";
}

class Triangulo extends Formas{
    
    public double angulo;
    public double lado1;
    public double lado2;
    public String forma="Triangulo";
    
    public void calcularArea(double l1,double l2,double ang){
        this.lado1=l1;
        this.lado2=l2;
        this.angulo=ang;
        
        double radianes= Math.toRadians(ang);
        double area= 0.5 * l1 * l2 * Math.sin(radianes);
    
        System.out.println("El area de: " + forma +" es: " +area);
    }
}

class Cuadrado extends Formas{
    
    public double area;
    public double lado;
    public String forma="Cuadrado";
    

    public void calcularArea(double lado){
        this.lado=lado;
        area=lado*lado;
        System.out.println("El area de: " + forma +" es: " +area);
    }

}


