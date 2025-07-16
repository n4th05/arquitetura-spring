package io.github.n4th05.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String mensagem){
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
