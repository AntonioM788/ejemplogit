public class Cuadrado extends Figura{

double base;
double altura;

public Cuadrado(double base, double altura){

this.base = base;
this.altura = altura;
}

@Override
public double area(){

return base*altura
}



