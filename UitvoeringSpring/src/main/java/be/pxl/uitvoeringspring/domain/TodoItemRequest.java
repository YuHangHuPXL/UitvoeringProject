package be.pxl.uitvoeringspring.domain;

public class TodoItemRequest {
    private Long id;
    private String description;

    public TodoItemRequest(String description) {
        this.description = description;
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
