import java.util.HashMap;
import java.util.Map;

public class Room {
    
    private String id;
    private String name;
    private String description;
    private Map<String, String> directions = new HashMap<>();

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, String> getDirections() {
        return this.directions;
    }

    public void setDirections(Map<String, String> directions) {
        this.directions = directions;
    }

}
