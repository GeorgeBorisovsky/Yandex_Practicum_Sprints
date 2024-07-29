package sprint_4.theme_4.ChatBot;

public class RecyclableMaterial {
    private int code;
    MaterialType type;
    boolean isRecyclable;
    String description;

    // объявите переменные с правильными модификаторами

    public  RecyclableMaterial(int code, MaterialType type, boolean isRecyclable, String description) {
        this.code = code;
        this.type = type;
        this.isRecyclable = isRecyclable;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public MaterialType getType() {
        return type;
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public String getDescription() {
        return description;
    }
}
