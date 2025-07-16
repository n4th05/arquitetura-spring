package io.github.n4th05.arquiteturaspring.montadora;

public class Carro {
    
    private String modelo;
    private String cor;
    private Motor motor;
    private Montadora montadora;


    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Montadora getMontadora() {
        return montadora;
    }
    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    public CarroStatus darIgnicao(Chave chave) {
        if(chave.getMontadora() != this.montadora){
            return new CarroStatus("Não é possível ligar o carro com essa chave");
        }
        return new CarroStatus("Carro ligado. Rodando com o motor" + motor);
    }

}
