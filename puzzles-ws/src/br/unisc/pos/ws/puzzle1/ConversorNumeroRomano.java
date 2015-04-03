package br.unisc.pos.ws.puzzle1;

import java.util.HashMap;
import java.util.Map;

public class ConversorNumeroRomano {
    
    private final String REGEX_NUM_ROMANO = "(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
    private Map<String, Integer> numerosRomanos;

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
                Integer valorCaracterProximo = this.consultarValorCaracter((i+1), numeroRomano);
                
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