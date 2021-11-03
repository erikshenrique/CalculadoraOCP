package calculadoraocp;
import java.security.InvalidParameterException;

/**
 *
 * @author eriks_henrique
 */
public class CalculadoraOCP {

    public static void main(String[] args) {
        //CalculadoraOCP calcula = new CalculadoraOCP();
    }
    
    public void calculadora (Operacao operacao) {
        if(operacao == null) {
            throw new InvalidParameterException ("Não foi possível detectar a operação");
        }
        operacao.calculo();
    }
    
}
