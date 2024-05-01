import java.util.ArrayList;
import java.util.List;

public class Installation {
    private String category;
    private String location;
    private String name;
    private String type;
    private List<Test> isMade = new ArrayList<>();
    private Site site;

    public Installation(String category, String location, String name, String type, Site site) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
        this.site = site;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Test> getIsMade() {
        return isMade;
    }

   public void addIsMade(Test test){
        isMade.add(test);
   }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return  "category='" + category  +
                ", location='" + location  +
                ", name='" + name  +
                ", type='" + type  +
                ", isMade=" + isMade +
                ", site=" + site;
    }
}
