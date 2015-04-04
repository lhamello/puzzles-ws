package br.unisc.pos.ws.impl;

import br.unisc.pos.ws.puzzle1.ConversorNumeroRomano;
import br.unisc.pos.ws.puzzle2.Palavra;
import br.unisc.pos.ws.puzzle2.VerificadorPalavraPrima;
import br.unisc.pos.ws.puzzle3.VerificadorAnoBissexto;
import br.unisc.pos.ws.puzzle4.CalculadoraTroco;
import br.unisc.pos.ws.puzzle4.Troco;

/**
 * Curso:<br>
 * P�s Gradua��o em Engenharia de Software com �nfase em Solu��es de Governo.<br>
 * <br>
 * Disciplina:<br>
 * Software como Servi�o: Arquitetura SOE e Web Services.<br>
 * <br>
 * 
 * O trabalho destina-se a implementa��o de 4 m�todos para web service SOAP. Os
 * m�todos s�o os seguintes:<br>
 * <ul>
 * <li>M�todo 1: Converte n�meros romanos para n�meros inteiros.</li>
 * <li>M�todo 2: Informa se uma palavra � ou n�o prima atrav�s da soma dos
 * valores de seus caracteres.</li>
 * <li>M�todo 3: Verifica se um ano � ou n�o bissexto.</li>
 * <li>M�todo 4: Calcula o menor n�mero de c�dulas e moedas para um troco.</li>
 * </ul>
 * 
 * @author Alexandre Coutinho Evangelista
 * @author Critiano Stein Chaves
 * @author Luiz Henrique Araujo Mello
 * @author Thiago Steigleder Gomes
 */
public class PuzzleSoapWSImpl {

    /**
     * Recebe um n�mero romano e retorna o n�mero inteiro correspondente.
     * <p>
     * Este m�todo � capaz de converter n�meros romanos entre 1 e 3999.
     * 
     * @param numeroRomano
     *            n�mero romano que ser� convertido.
     * 
     * @return O valor do n�mero romano em um numeral inteiro.
     * 
     * @throws IllegalArgumentException
     *             se o argumento informado for inv�lido.
     */
    public Integer converterNumeroRomanoParaInteiro(String numeroRomano) {
        ConversorNumeroRomano conversor = new ConversorNumeroRomano();
        return conversor.converterParaInteiro(numeroRomano);
    }

    /**
     * Recebe uma palavra como entrada e retorna se este palavar � ou n�o prima.
     * <p>
     * Cada letra, da palavra, tem um valor atribu�do e a soma dos valores das
     * letras � que ir� indicar se a palavra � ou n�o prima.
     * <p>
     * As letras aceitas s�o [a-z] min�sculas, com valores entre 1 e 26; e [A-Z]
     * mai�sculas, com valores entre 27 e 52. N�o ser�o aceitos caracteres
     * especiais ou acentuados e tamb�m n�meros.
     * 
     * @param palavra
     *            palavra que ser� testada.
     * 
     * @return Um objeto {@code Palavra} que cont�m a informa��o se a palavra �
     *         ou n�o prima. Tamb�m cont�m a descri��o da palavra e a soma dos
     *         valores das letras.
     * 
     * @throws IllegalArgumentException
     *             se a palavra informada conter caracteres inv�lidos.
     */
    public Palavra consultarPalavraPrima(String palavra) {
        VerificadorPalavraPrima verificador = new VerificadorPalavraPrima();
        return verificador.verificarPalavra(palavra);
    }

    /**
     * Recebe um ano como entrada e retorna se ele � ou n�o bissexto.
     * 
     * @param ano
     *            ano que ser� testado.
     * 
     * @return se o ano informado � ou n�o bissexto.
     * 
     * @throws IllegalArgumentException
     *             se o ano informado for inv�lido, ou seja, menor ou igual � 0.
     */
    public Boolean verificarAnoBissexto(Integer ano) {
        VerificadorAnoBissexto verificador = new VerificadorAnoBissexto();
        return verificador.verificarAno(ano);
    }

    /**
     * Recebe o valor de uma conta a ser paga e o valor efetivamente pago por
     * ela; ent�o retorna o valor do troco com o menor n�mero de c�dulas e
     * moedas poss�veis.<br>
     * 
     * @param valorConta
     *            valor da conta que deve ser paga.
     * 
     * @param valorPago
     *            valor efetivamente pago pela conta.
     * 
     * @return Objeto {@code Troco} contendo quantas c�dulas e/ou moedas para
     *         cada valor foram usadas para compor o troco. Tamb�m retorna o
     *         valor total do troco.
     * 
     * @throws IllegalArgumentException
     *             se o valor da conta informado for menor ou igual a 0.
     * 
     * @throws IllegalArgumentException
     *             se o valor pago for menor que o valor da conta.
     */
    public Troco calcularMenorTroco(Double valorConta, Double valorPago) {
        CalculadoraTroco calculadora = new CalculadoraTroco();
        return calculadora.calcularMenorTroco(valorConta, valorPago);
    }
}