public class Gerente extends Funcionario{
    public Gerente(double salario, String nome){
        super(nome, salario);
    }

    @Override
    public void dados(){
        System.out.println("=================================");
        System.out.println("Gerente\nNome:"+nome+"\nSalário: "+salario);
        System.out.println("=================================");
    }
    @Override
    public void aumentar(){
        this.salario=salario*1.1;
    }
}
