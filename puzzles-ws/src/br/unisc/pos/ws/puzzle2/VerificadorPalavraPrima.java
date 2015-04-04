package br.unisc.pos.ws.puzzle2;

import java.util.HashMap;
import java.util.Map;

/**
 * Um número primo é definido se ele possuir exatamente dois divisores: o número
 * um e ele próprio. São exemplos de números primos: 2, 3, 5, 101, 367 e 523.
 * <p>
 * Neste problema, você deve ler uma palavra composta somente por letras
 * [a-zA-Z]. Cada letra possui um valor específico, a vale 1, b vale 2 e assim
 * por diante, até a letra z que vale 26. Do mesmo modo A vale 27, B vale 28,
 * até a letra Z que vale 52.
 * <p>
 * Esta classe é capaz de definir se uma palavra é prima ou não. Para ela ser
 * prima, a soma dos valores de suas letras deve ser um número primo.
 * 
 * @author Alexandre Coutinho Evangelista
 * @author Critiano Stein Chaves
 * @author Luiz Henrique Araujo Mello
 * @author Thiago Steigleder Gomes
 * 
 * @see <a
 *      href="http://dojopuzzles.com/problemas/exibe/palavras-primas/">http://dojopuzzles.com/problemas/exibe/palavras-primas/</a>
 */
public class VerificadorPalavraPrima {

    private Map<String, Integer> valoresLetras;

    /**
     * Inicializa o valor individual de cada letra.<br>
     * São utilizadas apenas as 26 letras do alfabeto maiúsculas e minúsculas.
     * Caracteres especiais não são considerados, assim como acentuação.<br>
     * <br>
     * 
     * As letras de a-z (minúsculas) tem valor de 1-26.<br>
     * As letras de A-Z (maiúsculas) tem valor de 27-52.
     */
    public VerificadorPalavraPrima() {
        if (valoresLetras == null) {
            valoresLetras = new HashMap<>();

            valoresLetras.put("a", 1);
            valoresLetras.put("b", 2);
            valoresLetras.put("c", 3);
            valoresLetras.put("d", 4);
            valoresLetras.put("e", 5);
            valoresLetras.put("f", 6);
            valoresLetras.put("g", 7);
            valoresLetras.put("h", 8);
            valoresLetras.put("i", 9);
            valoresLetras.put("j", 10);
            valoresLetras.put("k", 11);
            valoresLetras.put("l", 12);
            valoresLetras.put("m", 13);
            valoresLetras.put("n", 14);
            valoresLetras.put("o", 15);
            valoresLetras.put("p", 16);
            valoresLetras.put("q", 17);
            valoresLetras.put("r", 18);
            valoresLetras.put("s", 19);
            valoresLetras.put("t", 20);
            valoresLetras.put("u", 21);
            valoresLetras.put("v", 22);
            valoresLetras.put("w", 23);
            valoresLetras.put("x", 24);
            valoresLetras.put("y", 25);
            valoresLetras.put("z", 26);

            valoresLetras.put("A", 27);
            valoresLetras.put("B", 28);
            valoresLetras.put("C", 29);
            valoresLetras.put("D", 30);
            valoresLetras.put("E", 31);
            valoresLetras.put("F", 32);
            valoresLetras.put("G", 33);
            valoresLetras.put("H", 34);
            valoresLetras.put("I", 35);
            valoresLetras.put("J", 36);
            valoresLetras.put("K", 37);
            valoresLetras.put("L", 38);
            valoresLetras.put("M", 39);
            valoresLetras.put("N", 40);
            valoresLetras.put("O", 41);
            valoresLetras.put("P", 42);
            valoresLetras.put("Q", 43);
            valoresLetras.put("R", 44);
            valoresLetras.put("S", 45);
            valoresLetras.put("T", 46);
            valoresLetras.put("U", 47);
            valoresLetras.put("V", 48);
            valoresLetras.put("W", 49);
            valoresLetras.put("X", 50);
            valoresLetras.put("Y", 51);
            valoresLetras.put("Z", 52);
        }
    }

    /**
     * Verifica se uma palavra é prima a partir da soma de suas letras.
     * 
     * @param palavra
     *            palavra a ser testada.
     * 
     * @return objeto {@code Palavra} dizendo se a palavra informada é prima ou
     *         não.
     * 
     * @throws IllegalArgumentException
     *             se a palavra informada conter caracteres inválidos.
     */
    public Palavra verificarPalavra(String palavra) {
        Integer soma = this.somarPalavra(palavra);
        Boolean primo = this.verificarPalavraPrima(soma);

        Palavra resposta = new Palavra();

        resposta.setDescricao(palavra);
        resposta.setSoma(soma);
        resposta.setPrima(primo);

        return resposta;
    }

    /**
     * Método resposável por somar a palavra.
     * 
     * @param palavra
     *            palavra que terá seus caracteres somados.
     * 
     * @return a soma total dos caracteres da palavra.
     * 
     * @throws IllegalArgumentException
     *             se a palavra informada conter caracteres inválidos.
     */
    private Integer somarPalavra(String palavra) {
        Integer soma = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            Integer valorLetra = valoresLetras.get(c);

            if (valorLetra != null) {
                soma += valorLetra;
            } else {
                throw new IllegalArgumentException("Caracter inválido: [" + c + "]. \n Aceita somente [a-z][A-Z]");
            }
        }

        return soma;
    }

    /**
     * Método resposável por verificar se o número da soma total é primo ou não.
     * 
     * @param soma
     *            valor total da soma.
     * 
     * @return {@code true} se a soma for prima ou {@code false} se não for.
     */
    private Boolean verificarPalavraPrima(Integer soma) {
        boolean resposta = false;

        if (soma == 1 || soma == 2) {
            resposta = true;
        } else {

            if (soma % 2 != 0) {
                resposta = true;

                for (int i = 3; i < soma / 2; i += 2) {

                    if (soma % i == 0) {
                        resposta = false;
                        break;
                    }
                }
            }
        }

        return resposta;
    }

}
