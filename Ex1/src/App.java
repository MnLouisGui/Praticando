import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario gerente = new Gerente(1000.0, "Jacinto");
        Funcionario programador = new Programador("Valter", 1500);

        Scanner scanner = new Scanner(System.in);
        boolean on=true;
        while (on=true) {
            System.out.println("=================================");
            System.out.println("Praticando - EX1");
            System.out.println("=================================");
            System.out.println("1.Ver dados\n2.Aumentar salário\n3.sair");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("Ver dados");
                    System.out.println("=================================");
                    System.out.println("Ver dados de qual funcionário?");
                    System.out.println("1.Gerente\n2.Progamador\n3.sair");
                    op=scanner.nextInt();
                    switch (op) {
                        case 1:
                            gerente.dados();
                            break;
                        case 2:
                            programador.dados();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("Aumentar salário");
                    System.out.println("=================================");
                    System.out.println("Aumentar salário de qual funcionário?");
                    System.out.println("1.Gerente +10%\n2.Progamador+20%\n3.sair");
                    op=scanner.nextInt();
                    switch (op) {
                        case 1:
                            gerente.aumentar();
                            break;
                        case 2:
                            programador.aumentar();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    on=false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
