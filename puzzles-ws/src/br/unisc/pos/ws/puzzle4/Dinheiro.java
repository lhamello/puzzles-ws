package br.unisc.pos.ws.puzzle4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dinheiro {

    private BigDecimal valor;

    public Dinheiro(double dValor) {
        valor = new BigDecimal(dValor).setScale(2, RoundingMode.HALF_UP);
    }

    public void subtrair(double subtraendo) {
        valor = valor.subtract(new BigDecimal(subtraendo).setScale(2, RoundingMode.HALF_UP));
    }

    public boolean comparar(double comparador) {
        boolean resposta = false;

        if (valor.compareTo(new BigDecimal(comparador)) == 0) {
            resposta = true;
        }

        return resposta;
    }

    public int dividir(double divisor) {
        BigDecimal[] valores = valor.divideAndRemainder(new BigDecimal(divisor).setScale(2, RoundingMode.HALF_UP));
        valor = valores[1];
        return valores[0].intValue();
    }
    
    public double doubleValue() {
        return valor.doubleValue();
    }
}
