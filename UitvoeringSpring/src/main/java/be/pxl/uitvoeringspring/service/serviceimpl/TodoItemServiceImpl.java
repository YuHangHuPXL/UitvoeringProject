package be.pxl.uitvoeringspring.service.serviceimpl;

import be.pxl.uitvoeringspring.domain.TodoItem;
import be.pxl.uitvoeringspring.domain.TodoItemDTO;
import be.pxl.uitvoeringspring.domain.TodoItemRequest;
import be.pxl.uitvoeringspring.repository.TodoItemRepository;
import be.pxl.uitvoeringspring.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TodoItemServiceImpl implements TodoItemService {

    @Autowired
    private TodoItemRepository todoItemRepository;
    @Override
    public List<TodoItemDTO> getAllTodoItems() {
        return todoItemRepository.findAll().stream().map(TodoItemDTO::new).toList();
    }

    @Override
    public Long createTodoItem(TodoItemRequest request) {
        TodoItem item = new TodoItem();
        item.setDescription(request.getDescription());
        return todoItemRepository.save(item).getId();

    }
}
