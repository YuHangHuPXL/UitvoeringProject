package be.pxl.uitvoeringspring.service;

import be.pxl.uitvoeringspring.domain.TodoItem;
import be.pxl.uitvoeringspring.domain.TodoItemDTO;
import be.pxl.uitvoeringspring.domain.TodoItemRequest;

import java.util.List;

public interface TodoItemService {
    List<TodoItemDTO> getAllTodoItems();

    Long createTodoItem(TodoItemRequest request);
}
