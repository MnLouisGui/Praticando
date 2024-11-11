public class Quad extends Geometrica{
    double produto;
    double lado;
    @Override
    public void area(double valor){
        this.lado = valor;
        produto = lado*lado;
        System.out.println("=================================");
        System.out.println("Quadrado");
        System.out.println("=================================");
        System.out.println("Area é: "+produto+"m^2");
    }
    @Override
    public void comprimento(double valor){
        this.lado = valor;
        produto = lado*4;
        System.out.println("=================================");
        System.out.println("Quadrado");
        System.out.println("=================================");
        System.out.println("Comprimento é: "+produto+"m");
    }
}
