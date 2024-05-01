import java.util.ArrayList;
import java.util.List;

public class Test {
    private int code;
    private String title;
    private List<Athlete> participate;
    private List<Installation> where;

    public Test(int code, String title) {
        this.code = code;
        this.title = title;
        this.participate = new ArrayList<>();
        where = new ArrayList<>();
    }

    public void addInstallation(Installation installation) {
        where.add(installation);
    }

    public List<Installation> getWhere() {
        return where;
    }

    public void addAthlete(Athlete athlete) {
        participate.add(athlete);
    }

    public List<Athlete> getParticipate() {
        return participate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  "code=" + code +
                ", title='" + title  +
                ", participate=" + participate +
                ", where=" + where;
    }
}
