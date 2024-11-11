public abstract class Funcionario {
    double salario;
    String nome;
    Funcionario(String nome, double salario){
        this.salario=salario;
        this.nome=nome;
    }

    public abstract void dados(){

    }
    public abstract void aumentar(){

    }
}
