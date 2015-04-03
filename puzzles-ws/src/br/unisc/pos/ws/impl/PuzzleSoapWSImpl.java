package br.unisc.pos.ws.impl;

import br.unisc.pos.ws.puzzle1.ConversorNumeroRomano;
import br.unisc.pos.ws.puzzle2.Palavra;
import br.unisc.pos.ws.puzzle2.VerificadorPalavraPrima;

public class PuzzleSoapWSImpl {
    
    public Integer converterNumeroRomanoParaInteiro(String numeroRomano) {
        ConversorNumeroRomano conversor = new ConversorNumeroRomano();
        return conversor.converterParaInteiro(numeroRomano);
    }
    
    public Palavra consultarPalavraPrima(String palavra) {
        VerificadorPalavraPrima verificador = new VerificadorPalavraPrima();
        return verificador.verificarPalavra(palavra);
    }
    
}