package br.unisc.pos.ws.puzzle4;


public class Troco {

    private Integer cedulaCemReais;
    private Integer cedulaCinquentaReais;
    private Integer cedulaVinteReais;
    private Integer cedulaDezReais;
    private Integer cedulaCincoReais;
    private Integer cedulaDoisReais;
    private Integer moedaCinquentaCentavos;
    private Integer moedaVinteCincoCentavos;
    private Integer moedaDezCentavos;
    private Integer moedaCincoCentavos;
    private Integer moedaUmCentavo;
    private Double valorTroco;
    
    public Troco(int[] valores, Double valorTroco) {
        this.cedulaCemReais = valores[0];
        this.cedulaCinquentaReais = valores[1];
        this.cedulaVinteReais = valores[2];
        this.cedulaDezReais = valores[3];
        this.cedulaCincoReais = valores[4];
        this.cedulaDoisReais = valores[5];
        this.moedaCinquentaCentavos = valores[6];
        this.moedaVinteCincoCentavos = valores[7];
        this.moedaDezCentavos = valores[8];
        this.moedaCincoCentavos = valores[9];
        this.moedaUmCentavo = valores[10];
        this.valorTroco = valorTroco;
    }

    public Integer getCedulaCemReais() {
        return cedulaCemReais;
    }

    public void setCedulaCemReais(Integer cedulaCemReais) {
        this.cedulaCemReais = cedulaCemReais;
    }

    public Integer getCedulaCinquentaReais() {
        return cedulaCinquentaReais;
    }

    public void setCedulaCinquentaReais(Integer cedulaCinquentaReais) {
        this.cedulaCinquentaReais = cedulaCinquentaReais;
    }

    public Integer getCedulaVinteReais() {
        return cedulaVinteReais;
    }

    public void setCedulaVinteReais(Integer cedulaVinteReais) {
        this.cedulaVinteReais = cedulaVinteReais;
    }

    public Integer getCedulaDezReais() {
        return cedulaDezReais;
    }

    public void setCedulaDezReais(Integer cedulaDezReais) {
        this.cedulaDezReais = cedulaDezReais;
    }

    public Integer getCedulaCincoReais() {
        return cedulaCincoReais;
    }

    public void setCedulaCincoReais(Integer cedulaCincoReais) {
        this.cedulaCincoReais = cedulaCincoReais;
    }

    public Integer getCedulaDoisReais() {
        return cedulaDoisReais;
    }

    public void setCedulaDoisReais(Integer cedulaDoisReais) {
        this.cedulaDoisReais = cedulaDoisReais;
    }

    public Integer getMoedaCinquentaCentavos() {
        return moedaCinquentaCentavos;
    }

    public void setMoedaCinquentaCentavos(Integer moedaCinquentaCentavos) {
        this.moedaCinquentaCentavos = moedaCinquentaCentavos;
    }

    public Integer getMoedaVinteCincoCentavos() {
        return moedaVinteCincoCentavos;
    }

    public void setMoedaVinteCincoCentavos(Integer moedaVinteCincoCentavos) {
        this.moedaVinteCincoCentavos = moedaVinteCincoCentavos;
    }

    public Integer getMoedaDezCentavos() {
        return moedaDezCentavos;
    }

    public void setMoedaDezCentavos(Integer moedaDezCentavos) {
        this.moedaDezCentavos = moedaDezCentavos;
    }

    public Integer getMoedaCincoCentavos() {
        return moedaCincoCentavos;
    }

    public void setMoedaCincoCentavos(Integer moedaCincoCentavos) {
        this.moedaCincoCentavos = moedaCincoCentavos;
    }

    public Integer getMoedaUmCentavo() {
        return moedaUmCentavo;
    }

    public void setMoedaUmCentavo(Integer moedaUmCentavo) {
        this.moedaUmCentavo = moedaUmCentavo;
    }
    
    public Double getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(Double valorTroco) {
        this.valorTroco = valorTroco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("100   = ").append(cedulaCemReais).append("\n");
        sb.append("50    = ").append(cedulaCinquentaReais).append("\n");
        sb.append("20    = ").append(cedulaVinteReais).append("\n");
        sb.append("10    = ").append(cedulaDezReais).append("\n");
        sb.append("5     = ").append(cedulaCincoReais).append("\n");
        sb.append("2     = ").append(cedulaDoisReais).append("\n");
        sb.append("0.50  = ").append(moedaCinquentaCentavos).append("\n");
        sb.append("0.25  = ").append(moedaVinteCincoCentavos).append("\n");
        sb.append("0.10  = ").append(moedaDezCentavos).append("\n");
        sb.append("0.05  = ").append(moedaCincoCentavos).append("\n");
        sb.append("0.01  = ").append(moedaUmCentavo).append("\n");
        sb.append("total = ").append(valorTroco).append("\n");
        return sb.toString();
    }
}
