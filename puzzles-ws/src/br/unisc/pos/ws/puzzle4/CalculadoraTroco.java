package br.unisc.pos.ws.puzzle4;


public class CalculadoraTroco {

    private static final double[] valoresTroco = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 0.50, 0.25, 0.10, 0.05, 0.01 };

    public Troco calcularMenorTroco(double valorConta, double valorPago) {
        this.validarValores(valorConta, valorPago);

        Dinheiro dinheiroTroco = new Dinheiro(valorPago);
        dinheiroTroco.subtrair(valorConta);

        return this.calcularRetorno(dinheiroTroco);
    }

    private Troco calcularRetorno(Dinheiro dinheiroTroco) {
        int valores[] = new int[11];
        double valorTroco = dinheiroTroco.doubleValue();
        
        for (int i = 0; i < valoresTroco.length; i++) {
            if (!dinheiroTroco.comparar(0)) {
                valores[i] = dinheiroTroco.dividir(valoresTroco[i]);
            }
        }

        return new Troco(valores, valorTroco);
    }

    private void validarValores(double valorConta, double valorPago) {
        if (valorConta < 0) {
            throw new IllegalArgumentException("Valor da conta deve ser maior que 0.");
        }

        if (valorPago < valorConta) {
            throw new IllegalArgumentException("Valor pago deve ser maior ou igual ao valor da conta.");
        }
    }
}
