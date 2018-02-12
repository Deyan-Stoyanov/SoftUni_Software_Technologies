package projectrider.bindingModel;

public class ProjectBindingModel {
    private Integer id;
    private String title;


    private String description;
    private long budget;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public long getBudget() {
        return budget;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }
}
