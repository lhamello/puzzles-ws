package br.unisc.pos.ws.impl;

import br.unisc.pos.ws.puzzle1.ConversorNumeroRomano;
import br.unisc.pos.ws.puzzle2.Palavra;
import br.unisc.pos.ws.puzzle2.VerificadorPalavraPrima;
import br.unisc.pos.ws.puzzle3.VerificadorAnoBissexto;
import br.unisc.pos.ws.puzzle4.CalculadoraTroco;
import br.unisc.pos.ws.puzzle4.Troco;

/**
 * Curso:<br>
 * Pós Graduação em Engenharia de Software com Ênfase em Soluções de Governo.<br>
 * <br>
 * Disciplina:<br>
 * Software como Serviço: Arquitetura SOE e Web Services.<br>
 * <br>
 * 
 * O trabalho destina-se a implementação de 4 métodos para web service SOAP. Os
 * métodos são os seguintes:<br>
 * <ul>
 * <li>Método 1: Converte números romanos para números inteiros.</li>
 * <li>Método 2: Informa se uma palavra é ou não prima através da soma dos
 * valores de seus caracteres.</li>
 * <li>Método 3: Verifica se um ano é ou não bissexto.</li>
 * <li>Método 4: Calcula o menor número de cédulas e moedas para um troco.</li>
 * </ul>
 * 
 * @author Alexandre Coutinho Evangelista
 * @author Critiano Stein Chaves
 * @author Luiz Henrique Araujo Mello
 * @author Thiago Steigleder Gomes
 */
public class PuzzleSoapWSImpl {

    /**
     * Recebe um número romano e retorna o número inteiro correspondente.
     * <p>
     * Este método é capaz de converter números romanos entre 1 e 3999.
     * 
     * @param numeroRomano
     *            número romano que será convertido.
     * 
     * @return O valor do número romano em um numeral inteiro.
     * 
     * @throws IllegalArgumentException
     *             se o argumento informado for inválido.
     */
    public Integer converterNumeroRomanoParaInteiro(String numeroRomano) {
        ConversorNumeroRomano conversor = new ConversorNumeroRomano();
        return conversor.converterParaInteiro(numeroRomano);
    }

    /**
     * Recebe uma palavra como entrada e retorna se este palavar é ou não prima.
     * <p>
     * Cada letra, da palavra, tem um valor atribuído e a soma dos valores das
     * letras é que irá indicar se a palavra é ou não prima.
     * <p>
     * As letras aceitas são [a-z] minúsculas, com valores entre 1 e 26; e [A-Z]
     * maiúsculas, com valores entre 27 e 52. Não serão aceitos caracteres
     * especiais ou acentuados e também números.
     * 
     * @param palavra
     *            palavra que será testada.
     * 
     * @return Um objeto {@code Palavra} que contém a informação se a palavra é
     *         ou não prima. Também contém a descrição da palavra e a soma dos
     *         valores das letras.
     * 
     * @throws IllegalArgumentException
     *             se a palavra informada conter caracteres inválidos.
     */
    public Palavra consultarPalavraPrima(String palavra) {
        VerificadorPalavraPrima verificador = new VerificadorPalavraPrima();
        return verificador.verificarPalavra(palavra);
    }

    /**
     * Recebe um ano como entrada e retorna se ele é ou não bissexto.
     * 
     * @param ano
     *            ano que será testado.
     * 
     * @return se o ano informado é ou não bissexto.
     * 
     * @throws IllegalArgumentException
     *             se o ano informado for inválido, ou seja, menor ou igual à 0.
     */
    public Boolean verificarAnoBissexto(Integer ano) {
        VerificadorAnoBissexto verificador = new VerificadorAnoBissexto();
        return verificador.verificarAno(ano);
    }

    /**
     * Recebe o valor de uma conta a ser paga e o valor efetivamente pago por
     * ela; então retorna o valor do troco com o menor número de cédulas e
     * moedas possíveis.<br>
     * 
     * @param valorConta
     *            valor da conta que deve ser paga.
     * 
     * @param valorPago
     *            valor efetivamente pago pela conta.
     * 
     * @return Objeto {@code Troco} contendo quantas cédulas e/ou moedas para
     *         cada valor foram usadas para compor o troco. Também retorna o
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