package domain.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate dateInit = LocalDate.now();
    private final LocalDate dateFinal = dateInit.plusDays(45);
    private Set<Dev> devs = new HashSet<>();
    private  Set<Atividades> contents = new LinkedHashSet<>();

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Bootcamp() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateInit() {
        return dateInit;
    }

    public LocalDate getDateFinal() {
        return dateFinal;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public Set<Atividades> getContents() {
        return contents;
    }

    public void addDev(Dev dev){
        devs.add(dev);
    }
    public void removeDev(Dev dev){
        devs.remove(dev);
    }

    public void addActivity(Atividades activity){
        contents.add(activity);
    }
    public void removeActivity(Atividades activity){
        contents.remove(activity);
    }


}
