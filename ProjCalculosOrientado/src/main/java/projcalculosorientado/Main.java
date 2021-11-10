
package projcalculosorientado;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Calculos objCalculo1 = new Calculos();
        
        objCalculo1.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor Inteiro: "));
        objCalculo1.valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor qualquer: "));
        objCalculo1.soma();
        objCalculo1.subtracao();
        objCalculo1.divisao();
        objCalculo1.multiplicacao();
        objCalculo1.restoDaDivisao();
        objCalculo1.potencia();
        objCalculo1.raiz();
        
        JOptionPane.showMessageDialog(null, "Resultados" +
            "\nSoma: " + objCalculo1.soma() + 
            "\nSubtração: " + objCalculo1.subtracao() + 
            "\nDivisão: " + objCalculo1.divisao() +
            "\nMultiplicação: " + objCalculo1.multiplicacao() + 
            "\nResto da Divisão: " + objCalculo1.restoDaDivisao() +
            "\nPotência: " + objCalculo1.potencia() + 
            "\nRaiz: " + objCalculo1.raiz());
    }
}
