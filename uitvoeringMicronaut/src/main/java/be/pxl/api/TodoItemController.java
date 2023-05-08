package be.pxl.api;

import be.pxl.domain.TodoItemDTO;
import be.pxl.domain.TodoItemRequest;
import be.pxl.service.TodoItemService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/todo")
public class TodoItemController {

    @Inject
    TodoItemService todoItemService;

    @Get
    public List<TodoItemDTO> getAllItems() {
        return todoItemService.getAllTodoItems();
    }

    @Post
    public HttpResponse<?> createItem(@Body TodoItemRequest request) {

        return HttpResponse.created(todoItemService.createTodoItem(request));
    }

}
