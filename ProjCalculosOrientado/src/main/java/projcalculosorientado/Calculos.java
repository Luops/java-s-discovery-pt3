
package projcalculosorientado;


public class Calculos {
    public int valor1;
    public double valor2;
    
    public double soma(){
        double resultadoSoma = this.valor1 + this.valor2;
        return resultadoSoma;
    }
    public double subtracao(){
        double resultadoSubtracao = this.valor1 - this.valor2;
        return resultadoSubtracao;
    }
    public double divisao(){
        double resutladoDivisao = this.valor1 / this.valor2;
        return resutladoDivisao;
    }
    public double multiplicacao(){
        double resultadoMultiplicacao = this.valor1 * this.valor2;
        return resultadoMultiplicacao;
    }
    public double restoDaDivisao(){
        double resultadoRestoDaDivisao = this.valor1 % this.valor2;
        return resultadoRestoDaDivisao;
    }
    public double potencia(){
        double resultadoPotencia = Math.pow(valor1, valor2);
        return resultadoPotencia;
    }
    public double raiz(){
        double resultadoRaiz = Math.pow(valor1, 1/valor2);
        return resultadoRaiz;
    }
}
