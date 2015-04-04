package br.unisc.pos.ws.puzzle1;

import java.util.HashMap;
import java.util.Map;

/**
 * O sistema de numera��o romana (ou n�meros romanos) desenvolveu-se na Roma
 * Antiga e utilizou-se em todo o seu Imp�rio. Neste sistema as cifras
 * escrevem-se com determinadas letras, que representam os n�meros. As letras
 * s�o sempre mai�sculas, j� que no alfabeto romano n�o existem as min�sculas,
 * as letras s�o I, V, X, L, C, D e M.
 * <p>
 * Esta classe tem por objetivo converter n�meros romanos em n�meros inteiros.
 * <p>
 * As regras para a forma��o dos n�meros romanos s�o apresentadas a seguir.
 * <p>
 * Cada letra corresponde a um determinado valor:
 * <ul>
 * <li>I = 1</li>
 * <li>V = 5</li>
 * <li>X = 10</li>
 * <li>L = 50</li>
 * <li>C = 100</li>
 * <li>D = 500</li>
 * <li>M = 1000</li>
 * </ul>
 * 
 * Agrupando as letras acima, podemos representar os n�meros de acordo com um
 * conjunto de regras:
 * <ul>
 * Com exce��o de V, L e D, os outros numerais podem se repetir no m�ximo tr�s
 * vezes:
 * <li>III = 3</li>
 * <li>XXX = 30</li>
 * <li>CCC = 300</li>
 * <li>MMM = 3000</li>
 * </ul>
 * <ul>
 * Quando escritos � direita de numerais maiores, I, X e C somam-se aos valores
 * dos primeiros:
 * <li>VIII = 5 + 1 + 1 + 1 = 8</li>
 * <li>LXII = 50 + 10 + 1 + 1 = 62</li>
 * <li>CLVIII = 158</li>
 * <li>MCXX = 1000 + 100 + 10 + 10 = 1120</li>
 * </ul>
 * <ul>
 * Mas se os numerais I, X e C estiverem � esquerda dos maiores, seus valores
 * s�o subtra�dos como, por exemplo, em:
 * <li>IV = 5 - 1 = 4</li>
 * <li>IX = 10 - 1 = 9</li>
 * <li>XC = 100 - 10 = 90</li> </ul>
 * </ul>
 * 
 * @author Alexandre Coutinho Evangelista
 * @author Critiano Stein Chaves
 * @author Luiz Henrique Araujo Mello
 * @author Thiago Steigleder Gomes
 * 
 * @see <a
 *      href="http://dojopuzzles.com/problemas/exibe/numeros-romanos/">http://dojopuzzles.com/problemas/exibe/numeros-romanos/</a>
 */
public class ConversorNumeroRomano {

    private final String REGEX_NUM_ROMANO = "(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
    private Map<String, Integer> numerosRomanos;

    /**
     * Inicializa o mapa de n�meros romanos com o valor individual de cada
     * n�mero romano:
     * <ul>
     * <li>I = 1</li>
     * <li>V = 5</li>
     * <li>X = 10</li>
     * <li>L = 50</li>
     * <li>C = 100</li>
     * <li>D = 500</li>
     * <li>M = 1000</li>
     * </ul>
     */
    public ConversorNumeroRomano() {
        if (numerosRomanos == null) {
            numerosRomanos = new HashMap<>();

            numerosRomanos.put("I", 1);
            numerosRomanos.put("V", 5);
            numerosRomanos.put("X", 10);
            numerosRomanos.put("L", 50);
            numerosRomanos.put("C", 100);
            numerosRomanos.put("D", 500);
            numerosRomanos.put("M", 1000);
        }
    }

    /**
     * Converte uma string contendo um n�mero romano para o valor inteiro
     * correspondente.
     * 
     * @param numeroRomano
     *            string contendo um n�mero romano.
     * 
     * @return valor inteiro para o n�mero romano informado.
     * 
     * @throws IllegalArgumentException
     *             se o valor informado for branco, nulo ou inv�lido.
     */
    public Integer converterParaInteiro(String numeroRomano) {
        Integer valorAcumulado = 0;

        this.verificarArgumento(numeroRomano);

        if (numeroRomano.length() == 1) {
            valorAcumulado = this.consultarValorCaracter(0, numeroRomano);
        } else {
            for (int i = 0; i < numeroRomano.length() - 1; i++) {
                Integer valorCaracterAtual = this.consultarValorCaracter(i, numeroRomano);
                Integer valorCaracterProximo = this.consultarValorCaracter((i + 1), numeroRomano);

                if (valorCaracterAtual >= valorCaracterProximo) {
                    valorAcumulado += valorCaracterAtual;
                } else {
                    valorAcumulado -= valorCaracterAtual;
                }
            }

            valorAcumulado += this.consultarValorCaracter(numeroRomano.length() - 1, numeroRomano);
        }

        return valorAcumulado;
    }

    /**
     * Buscar valor (inteiro) de um caracter na string informada com um n�mero
     * romano.
     * 
     * @param indice
     *            �ndice do caracter que ser� avaliado.
     * 
     * @param numeroRomano
     *            n�mero romano onde o caracter ser� extra�do para ser buscado
     *            seu valor.
     * 
     * @return o valor inteiro de um caracter que faz parte do n�mero romano
     *         informado.
     */
    private Integer consultarValorCaracter(int indice, String numeroRomano) {
        char caracter = numeroRomano.charAt(indice);
        return numerosRomanos.get("" + caracter);
    }

    /**
     * Verifica se o valor informado � um n�mero romano v�lido.
     * 
     * @param numeroRomano
     *            argumento testado.
     * 
     * @throws IllegalArgumentException
     *             se o argumento for inv�lido.
     */
    private void verificarArgumento(String numeroRomano) {
        if (numeroRomano == null || numeroRomano.isEmpty() || !numeroRomano.matches(REGEX_NUM_ROMANO)) {
            throw new IllegalArgumentException("Argumento inv�lido: " + numeroRomano + ".");
        }
    }

}