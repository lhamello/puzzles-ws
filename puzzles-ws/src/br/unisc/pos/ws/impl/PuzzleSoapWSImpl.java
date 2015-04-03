package br.unisc.pos.ws.impl;

import br.unisc.pos.ws.puzzle1.ConversorNumeroRomano;
import br.unisc.pos.ws.puzzle2.Palavra;
import br.unisc.pos.ws.puzzle2.VerificadorPalavraPrima;
import br.unisc.pos.ws.puzzle3.VerificadorAnoBissexto;
import br.unisc.pos.ws.puzzle4.CalculadoraTroco;
import br.unisc.pos.ws.puzzle4.Troco;

/**
 * Pós Graduação em Engenharia de Software com Ênfase em Soluções de Governo.<br>
 * Software como Serviço: Arquitetura SOE e Web Services.<br>
 * <br>
 * 
 * Implementação de 4 métodos para web service SOAP:<br>
 * <ul>
 * <li>Calcular menor troco</li>
 * <li>Consultar palavra prima</li>
 * <li>Conversor número romano</li>
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
     * ela e então devolve o valor do troco com o menor número de cédulas e
     * moedas possíveis.
     * 
     * @param valorConta
     *            valor a ser pago.
     * 
     * @param valorPago
     *            valor efetivamente pago.
     * 
     * @return objeto {@code Troco} contendo quantas cédulas e moedas de cada
     *         valor foram usadas para pagar o troco.
     */
    public Troco calcularMenorTroco(double valorConta, double valorPago) {
        CalculadoraTroco calculadora = new CalculadoraTroco();
        return calculadora.calcularMenorTroco(valorConta, valorPago);
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
}