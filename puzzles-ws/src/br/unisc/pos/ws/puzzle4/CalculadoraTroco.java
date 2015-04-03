package br.unisc.pos.ws.puzzle4;

/**
 * Funcionários de empresas comerciais que trabalham como caixa tem uma grande
 * responsabilidade em suas mãos. A maior parte do tempo de seu expediente de
 * trabalho é gasto recebendo valores de clientes e, em alguns casos, fornecendo
 * troco.
 * <p>
 * Esta classe tem como objetivo ler o valor total a ser pago e o valor
 * efetivamente pago, informando o menor número de cédulas e moedas que devem
 * ser fornecidas como troco.
 * <p>
 * Deve-se considerar que há
 * <ul>
 * Cédulas de
 * <li>R$100,00</li>
 * <li>R$50,00</li>
 * <li>R$20,00</li>
 * <li>R$10,00</li>
 * <li>R$5,00</li>
 * <li>R$2,00</li>
 * </ul>
 * <ul>
 * Moedas de
 * <li>R$0,50</li>
 * <li>R$0,25</li>
 * <li>R$0,10</li>
 * <li>R$0,05</li>
 * <li>R$0,01</li>
 * </ul>
 * 
 * @author Alexandre Coutinho Evangelista
 * @author Critiano Stein Chaves
 * @author Luiz Henrique Araujo Mello
 * @author Thiago Steigleder Gomes
 * 
 * @see <a
 *      href="http://dojopuzzles.com/problemas/exibe/troco/">http://dojopuzzles.com/problemas/exibe/troco/</a>
 */
public class CalculadoraTroco {

    /**
     * Array contendo os valores de troco possíveis.
     */
    private static final double[] valoresTroco = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 0.50, 0.25, 0.10, 0.05, 0.01 };

    /**
     * Recebe o valor da conta e o valor efetivamente pago e retorna o troco.
     * 
     * @param valorConta
     *            valor da conta.
     * 
     * @param valorPago
     *            valor efetivamente pago.
     * 
     * @return Objeto {@code Troco} contendo quantas cédulas e/ou moedas para
     *         cada valor foram usadas para compor o troco. Também retorna o
     *         valor total do troco.
     * 
     * @throws IllegalArgumentException
     *             se o valor da conta, informado, for menor que 0.
     * 
     * @throws IllegalArgumentException
     *             se o valor efetivamente pago pela conta, informado, seja
     *             menor que o valor da conta.
     */
    public Troco calcularMenorTroco(double valorConta, double valorPago) {
        this.validarValores(valorConta, valorPago);

        Dinheiro dinheiroTroco = new Dinheiro(valorPago);
        dinheiroTroco.subtrair(valorConta);

        return this.calcularRetorno(dinheiroTroco);
    }

    /**
     * Calcula as cédulas e moedas que comporão o troco.
     * 
     * @param dinheiroTroco
     *            valor do troco.
     * 
     * @return Objeto {@code Troco} contendo quantas cédulas e/ou moedas para
     *         cada valor foram usadas para compor o troco. Também retorna o
     *         valor total do troco.
     */
    private Troco calcularRetorno(Dinheiro dinheiroTroco) {
        int valores[] = new int[11];
        double valorTroco = dinheiroTroco.doubleValue();

        for (int i = 0; i < valoresTroco.length; i++) {
            if (!dinheiroTroco.comparar(0)) {
                valores[i] = dinheiroTroco.dividir(valoresTroco[i]);
            }
        }

        return new Troco(valores, valorTroco);
    }

    /**
     * Efetua as validações dos parâmetros informados.
     * 
     * @param valorConta
     *            valor da conta.
     * 
     * @param valorPago
     *            valor efetivamente pago pela conta.
     * 
     * @throws IllegalArgumentException
     *             se o valor da conta, informado, for menor que 0.
     * 
     * @throws IllegalArgumentException
     *             se o valor efetivamente pago pela conta, informado, seja
     *             menor que o valor da conta.
     */
    private void validarValores(double valorConta, double valorPago) {
        if (valorConta < 0) {
            throw new IllegalArgumentException("Valor da conta deve ser maior que 0.");
        }

        if (valorPago < valorConta) {
            throw new IllegalArgumentException("Valor pago deve ser maior ou igual ao valor da conta.");
        }
    }
}
