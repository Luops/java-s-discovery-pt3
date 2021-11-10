package projcalculosestruturados;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro qualquer: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor qualquer: "));

        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;
        double restoDaDivisao = valor1 % valor2;
        double potencia = Math.pow(valor1, valor2);
        double raiz = Math.pow(valor1, 1 / valor2);

        /*Mostrar na tela*/
        JOptionPane.showMessageDialog(null, "Resultados"
                + "\nValor 1: " + valor1
                + "\nValor 2: " + valor2
                + "\nSoma: " + soma
                + "\nSubtração: " + subtracao
                + "\nMultiplicação: " + multiplicacao
                + "\nDivisão: " + divisao
                + "\nResto da Divisão: " + restoDaDivisao
                + "\nPotência: " + potencia
                + "\nRaiz: " + raiz);

    }
}
