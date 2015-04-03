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
 * <li>Método 2: Informa se uma palavra é ou não prima através da soma dos valores de seus caracteres.</li>
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
     * Recebe um ano como entrada e retorna se ele é ou não bissexto.
     * 
     * @param ano
     *            ano que será testado.
     * 
     * @return se o ano informado é ou não bissexto.
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
    public Troco calcularMenorTroco(double valorConta, double valorPago) {
        CalculadoraTroco calculadora = new CalculadoraTroco();
        return calculadora.calcularMenorTroco(valorConta, valorPago);
    }
}