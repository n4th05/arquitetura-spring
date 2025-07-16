package io.github.n4th05.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.n4th05.arquiteturaspring.montadora.CarroStatus;
import io.github.n4th05.arquiteturaspring.montadora.Chave;
import io.github.n4th05.arquiteturaspring.montadora.HondaHRV;
import io.github.n4th05.arquiteturaspring.montadora.Motor;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    //@Qualifier("motorEletrico") //significa que o motorEletrico que vai ser injetado no motor👇(Qualifier é o nome do Bean).
    @Eletrico
    private Motor motor;
    
    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
