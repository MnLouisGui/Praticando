public class Circulo extends Geometrica{
    double produto;
    double raio;
    @Override
    public void area(double valor){
        this.raio = valor;
        produto = 3.14*(raio*raio);
        System.out.println("=================================");
        System.out.println("Circulo | Pi = 3,14");
        System.out.println("=================================");
        System.out.println("Area é: "+produto+"m^2");
    }
    @Override
    public void comprimento(double valor){
        this.raio = valor;
        produto = 2*3.14*raio;
        System.out.println("=================================");
        System.out.println("Circulo | Pi = 3,14");
        System.out.println("=================================");
        System.out.println("Comprimento é: "+produto+"m");
    }
}
