package be.pxl.uitvoeringspring.domain;

public class TodoItemDTO {
    private Long id;
    private String description;

    public TodoItemDTO(TodoItem todoItem) {
        this.id = todoItem.getId();
        this.description = todoItem.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
