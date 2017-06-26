package Model;

import java.util.List;

/**
 * Created by Андрей on 25.06.2017.
 */
public class Developer {
    private int id;
    private List<Skill> sklls;

    public List<Skill> getSklls() {
        return sklls;
    }

    public void setSklls(List<Skill> sklls) {
        this.sklls = sklls;
    }

    public Developer(int id) {
        this.id = id;

    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", sklls=" + sklls +
                '}';
    }
}
