package br.unisc.pos.ws.puzzle3;

/**
 * A cada 4 anos, a diferença de horas entre o ano solar e o do calendário
 * convencional completa cerca de 24 horas (mais exatamente: 23 horas, 15
 * minutos e 864 milésimos de segundo). Para compensar essa diferença e evitar
 * um descompasso em relação às estações do ano, insere-se um dia extra no
 * calendário e o mês de fevereiro fica com 29 dias. Essa correção é
 * especialmente importante para atividades atreladas às estações, como a
 * agricultura e até mesmo as festas religiosas.
 * <p>
 * Um determinado ano é bissexto se:
 * <ul>
 * <li>O ano for divisível por 4, mas não divisível por 100, exceto se ele for
 * também divisível por 400.</li>
 * </ul>
 * 
 * Exemplos:
 * <p>
 * São bissextos por exemplo:
 * <ul>
 * <li>1600</li>
 * <li>1732</li>
 * <li>1888</li>
 * <li>1944</li>
 * <li>2008</li>
 * </ul>
 * 
 * <p>
 * Não são bissextos por exemplo:
 * <ul>
 * <li>1742</li>
 * <li>1889</li>
 * <li>1951</li>
 * <li>2011</li>
 * </ul>
 * 
 * Esta classe tem por objetivo identificar se um ano é ou não bissexto.
 * 
 * @author Alexandre Coutinho Evangelista
 * @author Critiano Stein Chaves
 * @author Luiz Henrique Araujo Mello
 * @author Thiago Steigleder Gomes
 * 
 * @see <a
 *      href="http://dojopuzzles.com/problemas/exibe/ano-bissexto/">http://dojopuzzles.com/problemas/exibe/ano-bissexto/</a>
 */
public class VerificadorAnoBissexto {

    /**
     * Testa se um ano é ou não bissexto.<br>
     * É considera um ano bissexto:
     * <ul>
     * <li>Aquele em qua a divisão dele mesmo por 400 apresentar resto igual a
     * 0,</li>
     * <li>ou aquele em que a divisão dele mesmo por 4 apresentar resto igual a
     * 0 e também sua divisão por 100 apresentar resto diferente de 0.</li>
     * </ul>
     * 
     * @param ano
     *            ano a ser testado.
     * 
     * @return {@code true} se o ano for bissextou ou {@code false} se não for.
     */
    public Boolean verificarAno(Integer ano) {
        boolean resposta = false;

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            resposta = true;
        }

        return resposta;
    }

}
