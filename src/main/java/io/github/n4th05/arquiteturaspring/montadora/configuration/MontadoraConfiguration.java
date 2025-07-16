package io.github.n4th05.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import io.github.n4th05.arquiteturaspring.montadora.Motor;
import io.github.n4th05.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado") // não é obrigatório colocar o "nome".
    @Primary //significa que esse é o motor padrão, ou seja, se não for especificado qual motor usar, esse será o escolhido.
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("TH-40");
        motor.setLitragem(1.4);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }
}
