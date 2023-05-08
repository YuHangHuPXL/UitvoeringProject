package be.pxl.uitvoeringspring.api;

import be.pxl.uitvoeringspring.domain.TodoItemDTO;
import be.pxl.uitvoeringspring.domain.TodoItemRequest;
import be.pxl.uitvoeringspring.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoItemController {

    @Autowired
    private TodoItemService todoItemService;

    @GetMapping
    public List<TodoItemDTO> getAllItems() {
        return todoItemService.getAllTodoItems();
    }

    @PostMapping
    public ResponseEntity<?> createItem(@RequestBody TodoItemRequest request) {
        return new ResponseEntity<>( todoItemService.createTodoItem(request), HttpStatus.CREATED);
    }

}
