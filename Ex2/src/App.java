import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Geometrica quad = new Quad();
        Geometrica circ = new Circulo();

        Scanner scanner = new Scanner(System.in);
        boolean on=true;
        while (on=true) {
            System.out.println("=================================");
            System.out.println("Praticando - EX2");
            System.out.println("=================================");
            System.out.println("1.Calcular area\n2.Calcular comprimento\n3.sair");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("Area");
                    System.out.println("=================================");
                    System.out.println("Calcular area de qual forma geometrica?");
                    System.out.println("1.Quadrado perfeito\n2.Circulo\n3.sair");
                    op=scanner.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Qual a medida dos lados em metros?");
                            double valor = scanner.nextDouble();
                            quad.area(valor);
                            break;
                        case 2:
                            System.out.println("Qual a medida do raio em metros?");
                            valor = scanner.nextDouble();
                            circ.area(valor);
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("Comprimento");
                    System.out.println("=================================");
                    System.out.println("Calcular comprimento de qual forma geometrica?");
                    System.out.println("1.Quadrado perfeito\n2.Circulo\n3.sair");
                    op=scanner.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Qual a medida dos lados em metros?");
                            double valor = scanner.nextDouble();
                            quad.comprimento(valor);
                            break;
                        case 2:
                            System.out.println("Qual a medida do raio em metros?");
                            valor = scanner.nextDouble();
                            circ.comprimento(valor);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    on=false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
