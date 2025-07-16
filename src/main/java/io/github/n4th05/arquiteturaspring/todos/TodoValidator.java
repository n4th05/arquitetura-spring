package io.github.n4th05.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
        if(existeTodoComEssaDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe um Todo com essa descrição!");
        }
    }

    private boolean existeTodoComEssaDescricao(String descricao){
        return repository.existsByDescricao(descricao);
    }
}
