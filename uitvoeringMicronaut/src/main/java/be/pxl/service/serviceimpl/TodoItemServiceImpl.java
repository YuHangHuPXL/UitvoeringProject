package be.pxl.service.serviceimpl;


import be.pxl.domain.TodoItem;
import be.pxl.domain.TodoItemDTO;
import be.pxl.domain.TodoItemRequest;
import be.pxl.repository.TodoItemRepository;
import be.pxl.service.TodoItemService;
import jakarta.inject.Inject;

import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;


public class TodoItemServiceImpl implements TodoItemService {

    @Inject
    private TodoItemRepository todoItemRepository;

    @Override
    public List<TodoItemDTO> getAllTodoItems() {
        Iterable<TodoItem> items = todoItemRepository.findAll();
        return StreamSupport.stream(items.spliterator(), false).map(TodoItemDTO::new).toList();
    }

    @Override
    public Long createTodoItem(TodoItemRequest request) {
        TodoItem item = new TodoItem();
        item.setDescription(request.getDescription());
        return todoItemRepository.save(item).getId();
    }
}
