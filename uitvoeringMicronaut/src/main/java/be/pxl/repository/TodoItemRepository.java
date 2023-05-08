package be.pxl.repository;

import be.pxl.domain.TodoItem;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
    TodoItem findTodoItemById(Long id);
}
