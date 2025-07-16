package io.github.n4th05.arquiteturaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import io.github.n4th05.arquiteturaspring.todos.MailSender;

@Configuration
public class ConfiguracaoAcessoEmail {

    @Autowired
    private AppProperties properties;

    //@Bean
    public MailSender mailSender(){
        return null;
    }
}
