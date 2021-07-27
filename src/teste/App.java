package teste;
import java.util.Scanner;
import br.edu.iftm.lista.*;

public class App {
    public static void main(String[] args) throws Exception {

        FilaPrioridade<Object> fila = new FilaPrioridade<Object>();
        String prioridade = "verde";
        String nome = "Inválido";
        String data = "01/01/2021";
        String sintoma = "Descreva o sintoma";

        String i = "";
        int j = 0;
        int contador = 0;

        System.out.print("Digite 'começar' para inicar e 'sair' para finalizar a sessão: ");
        Scanner sc = new Scanner(System.in);
        while (!i.equalsIgnoreCase("sair")) {
            contador = 0;
            i = sc.next();
            if (!i.equalsIgnoreCase("sair") && j == 0) {
                System.out.print("Digite o nome do paciente: ");
                nome = sc.next();
                j = 1;
            } else if (!i.equalsIgnoreCase("sair") && j == 1) {
                System.out.print("Digite a prioridade (vermelho > amarelo > verde): ");
                prioridade = sc.next();
                j = 2;
            } else if (!i.equalsIgnoreCase("sair") && j == 2) {
                System.out.print("Digite a data de nascimento: ");
                data = sc.next();
                j = 3;
            } else if (!i.equalsIgnoreCase("sair") && j == 3) {
                System.out.print("Digite os sintomas: ");
                sintoma = sc.next();
                Paciente paciente = new Paciente(nome, prioridade, sintoma, data);
                nome = "Inválido";
                data = "01/01/2021";
                sintoma = "Insira o sintoma";
                prioridade = "verde";
                fila.enfileiraComPrioridade(paciente);
                j = 0;
                contador = 10;
            } else {
                if (contador != 10) {
                    Paciente pacienteInconpleto = new Paciente(nome, prioridade, sintoma, data);
                    fila.enfileiraComPrioridade(pacienteInconpleto);
                    sc.close();
                }
                sc.close();
            }
            System.out.print("Digite 'continuar' ou 'sair' para finalizar: ");
        }

        System.out.println("\n\n" + "Pacientes de acordo com sua prioridade:");
        System.out.println("\n" + fila);

        fila.desenfileira();

        System.out.println("\n" + "Remover o paciente com maior prioridade:");
        System.out.println("\n" + fila);
    }
}