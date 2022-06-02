package javaEssential.lessons.l3.models;

public class Route {
    private long id;
    private String startPlace;
    private String endPlace;

    public Route(long id, String startPlace, String endPlace) {
        this.id = id;
        this.startPlace = startPlace;
        this.endPlace = endPlace;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", startPlace='" + startPlace + '\'' +
                ", endPlace='" + endPlace + '\'' +
                '}';
    }
}
