package br.unisc.pos.ws.impl;

import br.unisc.pos.ws.ConversorNumeroRomano;

public class PuzzleSoapWSImpl {
    
    public Integer converterNumeroRomanoParaInteiro(String numeroRomano) {
        ConversorNumeroRomano conversor = new ConversorNumeroRomano();
        return conversor.converterParaInteiro(numeroRomano);
    }
    
}