package io.github.n4th05.arquiteturaspring.montadora;

public class Motor {

    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipoMotor;


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getCavalos() {
        return cavalos;
    }
    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }
    public Integer getCilindros() {
        return cilindros;
    }
    public void setCilindros(Integer cilindrada) {
        this.cilindros = cilindrada;
    }
    public Double getLitragem() {
        return litragem;
    }
    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    @Override
    public String toString() {
        return " = modelo:" + modelo + ", cavalos:" + cavalos + ", cilindros:" + cilindros + ", litragem:"
                + litragem + ", tipo Motor:" + tipoMotor + "";
    }
    
}
