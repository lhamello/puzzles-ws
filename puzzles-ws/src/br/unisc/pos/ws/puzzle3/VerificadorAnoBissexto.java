package br.unisc.pos.ws.puzzle3;

public class VerificadorAnoBissexto {

    public Boolean verificarAno(Integer ano) {
        boolean resposta = false;

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            resposta = true;
        }

        return resposta;
    }

}
