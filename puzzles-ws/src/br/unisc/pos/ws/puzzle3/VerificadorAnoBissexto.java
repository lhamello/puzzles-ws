package br.unisc.pos.ws.puzzle3;

/**
 * A cada 4 anos, a diferen�a de horas entre o ano solar e o do calend�rio
 * convencional completa cerca de 24 horas (mais exatamente: 23 horas, 15
 * minutos e 864 mil�simos de segundo). Para compensar essa diferen�a e evitar
 * um descompasso em rela��o �s esta��es do ano, insere-se um dia extra no
 * calend�rio e o m�s de fevereiro fica com 29 dias. Essa corre��o �
 * especialmente importante para atividades atreladas �s esta��es, como a
 * agricultura e at� mesmo as festas religiosas.
 * <p>
 * Um determinado ano � bissexto se:
 * <ul>
 * <li>O ano for divis�vel por 4, mas n�o divis�vel por 100, exceto se ele for
 * tamb�m divis�vel por 400.</li>
 * </ul>
 * 
 * Exemplos:
 * <p>
 * S�o bissextos por exemplo:
 * <ul>
 * <li>1600</li>
 * <li>1732</li>
 * <li>1888</li>
 * <li>1944</li>
 * <li>2008</li>
 * </ul>
 * 
 * <p>
 * N�o s�o bissextos por exemplo:
 * <ul>
 * <li>1742</li>
 * <li>1889</li>
 * <li>1951</li>
 * <li>2011</li>
 * </ul>
 * 
 * Esta classe tem por objetivo identificar se um ano � ou n�o bissexto.
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
     * Testa se um ano � ou n�o bissexto.<br>
     * � considera um ano bissexto:
     * <ul>
     * <li>Aquele em qua a divis�o dele mesmo por 400 apresentar resto igual a
     * 0,</li>
     * <li>ou aquele em que a divis�o dele mesmo por 4 apresentar resto igual a
     * 0 e tamb�m sua divis�o por 100 apresentar resto diferente de 0.</li>
     * </ul>
     * 
     * @param ano
     *            ano a ser testado.
     * 
     * @return {@code true} se o ano for bissextou ou {@code false} se n�o for.
     */
    public Boolean verificarAno(Integer ano) {
        boolean resposta = false;

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            resposta = true;
        }

        return resposta;
    }

}
