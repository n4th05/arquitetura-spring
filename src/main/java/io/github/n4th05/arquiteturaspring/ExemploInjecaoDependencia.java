package io.github.n4th05.arquiteturaspring;

import java.sql.Connection;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import io.github.n4th05.arquiteturaspring.todos.MailSender;
import io.github.n4th05.arquiteturaspring.todos.TodoController;
import io.github.n4th05.arquiteturaspring.todos.TodoRepository;
import io.github.n4th05.arquiteturaspring.todos.TodoService;
import io.github.n4th05.arquiteturaspring.todos.TodoValidator;
import jakarta.persistence.EntityManager;

public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws Exception {
        // Exemplo de injeção de dependência com DataSource

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null; 

        TodoRepository repository = null; //new SimpleJpaRepository<TodoEntity, Integer>();
        TodoValidator todoValidator = new TodoValidator(repository);
        MailSender sender = new MailSender();

        TodoService todoService = new TodoService(repository, todoValidator, sender);

        TodoController todoController = new TodoController(todoService);
    }
}
