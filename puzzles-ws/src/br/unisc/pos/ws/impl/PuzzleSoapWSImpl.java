package br.unisc.pos.ws.impl;

import br.unisc.pos.ws.puzzle1.ConversorNumeroRomano;
import br.unisc.pos.ws.puzzle2.Palavra;
import br.unisc.pos.ws.puzzle2.VerificadorPalavraPrima;

/**
 * P�s Gradua��o em Engenharia de Software com �nfase em Solu��es de Governo.<br>
 * Software como Servi�o: Arquitetura SOE e Web Services.<br>
 * <br>
 * 
 * Implementa��o de 4 m�todos para web service SOAP:<br>
 * <ul>
 * <li>Consultar Palavra Prima</li>
 * <li>Conversor N�mero Romano</li>
 * </ul>
 * 
 * @author Alexandre Coutinho Evangelista
 * @author Critiano Stein Chaves
 * @author Luiz Henrique Araujo Mello
 * @author Thiago Steigleder Gomes
 */
public class PuzzleSoapWSImpl {

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

}