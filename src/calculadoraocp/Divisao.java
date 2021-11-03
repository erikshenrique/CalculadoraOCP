package calculadoraocp;

/**
 *
 * @author eriks_henrique
 */
public class Divisao implements Operacao {
    
    private double esquerda;
    private double direita; 
    private double resultado = 0.0; 
    
    public Divisao (double esquerda, double direita) {
        this.direita  = direita;
        this.esquerda = esquerda;
    }
    
    @Override
    public void calculo() {
        if(direita != 0) {
            resultado = esquerda/direita;
        }
    }

    public double getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(double esquerda) {
        this.esquerda = esquerda;
    }

    public double getDireita() {
        return direita;
    }

    public void setDireita(double direita) {
        this.direita = direita;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
}
