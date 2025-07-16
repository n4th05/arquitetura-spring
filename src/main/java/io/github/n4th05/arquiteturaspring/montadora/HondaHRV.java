package io.github.n4th05.arquiteturaspring.montadora;

import java.awt.Color;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLACK.toString());
        setMontadora(Montadora.HONDA);
    }
    
}
