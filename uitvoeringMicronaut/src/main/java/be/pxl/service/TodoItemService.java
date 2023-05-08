package be.pxl.service;


import be.pxl.domain.TodoItemDTO;
import be.pxl.domain.TodoItemRequest;

import java.util.List;

public interface TodoItemService {
    List<TodoItemDTO> getAllTodoItems();

    Long createTodoItem(TodoItemRequest request);
}
