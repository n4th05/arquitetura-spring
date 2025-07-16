package io.github.n4th05.arquiteturaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.github.n4th05.arquiteturaspring.todos.TodoEntity;
import io.github.n4th05.arquiteturaspring.todos.TodoValidator;

@Lazy(false) // A injeção de dependência só será realizada quando o bean for utilizado, ou seja, quando o método utilizar() for chamado.
@Component
@Scope("singleton") // é o padrão, ou seja, o Spring irá criar apenas uma instância desse bean e reutilizá-la em toda a aplicação.
// @Scope("request")
// @Scope("session")
// @Scope("application")
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

   // @Autowired // Essa é a injeção de dependência mais recomendada, no caso de acesso a propriedade(via construtor)
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }

}
