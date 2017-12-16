package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.todolist;

public class Task {
    private String date, category, description;
    private int color;
    Task(String date, String category, String description, int color){
        this.date = date;
        this.category = category;
        this.description = description;
        this.color = color;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
