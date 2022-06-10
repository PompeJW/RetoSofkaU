package models;

public class Questions {

    private String level;
    private String description;
    private Answers[] answers;

    public Questions(String level, String description, Answers[] answers) {
        this.level = level;
        this.description = description;
        this.answers = answers;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Answers[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answers[] answers) {
        this.answers = answers;
    }
}
