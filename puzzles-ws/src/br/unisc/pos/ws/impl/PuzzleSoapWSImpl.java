package br.unisc.pos.ws.impl;

import br.unisc.pos.ws.puzzle1.ConversorNumeroRomano;
import br.unisc.pos.ws.puzzle2.Palavra;
import br.unisc.pos.ws.puzzle2.VerificadorPalavraPrima;
import br.unisc.pos.ws.puzzle3.VerificadorAnoBissexto;
import br.unisc.pos.ws.puzzle4.CalculadoraTroco;
import br.unisc.pos.ws.puzzle4.Troco;

/**
 * P�s Gradua��o em Engenharia de Software com �nfase em Solu��es de Governo.<br>
 * Software como Servi�o: Arquitetura SOE e Web Services.<br>
 * <br>
 * 
 * Implementa��o de 4 m�todos para web service SOAP:<br>
 * <ul>
 * <li>Calcular menor troco</li>
 * <li>Consultar palavra prima</li>
 * <li>Conversor n�mero romano</li>
 * <li>Verificar ano bissexto</li>
 * </ul>
 * 
 * @author Alexandre Coutinho Evangelista
 * @author Critiano Stein Chaves
 * @author Luiz Henrique Araujo Mello
 * @author Thiago Steigleder Gomes
 */
public class PuzzleSoapWSImpl {

    /**
     * Recebe o valor de uma conta a ser paga e o valor efetivamente pago por
     * ela e ent�o devolve o valor do troco com o menor n�mero de c�dulas e
     * moedas poss�veis.
     * 
     * @param valorConta
     *            valor a ser pago.
     * 
     * @param valorPago
     *            valor efetivamente pago.
     * 
     * @return objeto {@code Troco} contendo quantas c�dulas e moedas de cada
     *         valor foram usadas para pagar o troco.
     */
    public Troco calcularMenorTroco(double valorConta, double valorPago) {
        CalculadoraTroco calculadora = new CalculadoraTroco();
        return calculadora.calcularMenorTroco(valorConta, valorPago);
    }

    /**
     * Recebe uma palava como entrada e retorna se esta palavara � ou n�o prima.<br>
     * Al�m disso no retorno � poss�vel verificar a palavra que foi utilizada e
     * tamb�m a soma dos valores das letras desta palavra.
     * 
     * @param palavra
     *            palavra a ser testada.
     * 
     * @return um objeto {@code Palavara} que cont�m a informa��o de que se a
     *         palavra � ou n�o prima.
     */
    public Palavra consultarPalavraPrima(String palavra) {
        VerificadorPalavraPrima verificador = new VerificadorPalavraPrima();
        return verificador.verificarPalavra(palavra);
    }

    /**
     * Recebe um n�mero romano e retorna o seu valor para um n�mero inteiro.
     * 
     * @param numeroRomano
     *            n�mero romano que ser� convertido.
     * 
     * @return o valor do n�mero romano em um numeral inteiro.
     */
    public Integer converterNumeroRomanoParaInteiro(String numeroRomano) {
        ConversorNumeroRomano conversor = new ConversorNumeroRomano();
        return conversor.converterParaInteiro(numeroRomano);
    }

    /**
     * Recebe um ano como entrada e retorna se ele � ou n�o bissexto.
     * 
     * @param ano
     *            ano que ser� testado.
     * 
     * @return se o ano informado � ou n�o bissexto.
     */
    public Boolean verificarAnoBissexto(Integer ano) {
        VerificadorAnoBissexto verificador = new VerificadorAnoBissexto();
        return verificador.verificarAno(ano);
    }
}