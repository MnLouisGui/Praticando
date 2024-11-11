public class Programador extends Funcionario    {
    public Programador( String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void dados(){
        System.out.println("=================================");
        System.out.println("Programador\nNome:"+nome+"\nSalário: "+salario);
        System.out.println("=================================");
    }
    @Override
    public void aumentar(){
        this.salario=salario*1.2;
    }
    
}
