package br.unisc.pos.ws.impl;

import br.unisc.pos.ws.puzzle1.ConversorNumeroRomano;
import br.unisc.pos.ws.puzzle2.Palavra;
import br.unisc.pos.ws.puzzle2.VerificadorPalavraPrima;

/**
 * Pós Graduação em Engenharia de Software com Ênfase em Soluções de Governo.<br>
 * Software como Serviço: Arquitetura SOE e Web Services.<br>
 * <br>
 * 
 * Implementação de 4 métodos para web service SOAP:<br>
 * <ul>
 * <li>Consultar Palavra Prima</li>
 * <li>Conversor Número Romano</li>
 * </ul>
 * 
 * @author Alexandre Coutinho Evangelista
 * @author Critiano Stein Chaves
 * @author Luiz Henrique Araujo Mello
 * @author Thiago Steigleder Gomes
 */
public class PuzzleSoapWSImpl {

    /**
     * Recebe uma palava como entrada e retorna se esta palavara é ou não prima.<br>
     * Além disso no retorno é possível verificar a palavra que foi utilizada e
     * também a soma dos valores das letras desta palavra.
     * 
     * @param palavra
     *            palavra a ser testada.
     * 
     * @return um objeto {@code Palavara} que contém a informação de que se a
     *         palavra é ou não prima.
     */
    public Palavra consultarPalavraPrima(String palavra) {
        VerificadorPalavraPrima verificador = new VerificadorPalavraPrima();
        return verificador.verificarPalavra(palavra);
    }

    /**
     * Recebe um número romano e retorna o seu valor para um número inteiro.
     * 
     * @param numeroRomano
     *            número romano que será convertido.
     * 
     * @return o valor do número romano em um numeral inteiro.
     */
    public Integer converterNumeroRomanoParaInteiro(String numeroRomano) {
        ConversorNumeroRomano conversor = new ConversorNumeroRomano();
        return conversor.converterParaInteiro(numeroRomano);
    }

}