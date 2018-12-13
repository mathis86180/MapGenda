package fr.diginamic.formation.mapgenda.model;

public class Event {

    private Integer id;
    private String name;
    private String description;
    private Double posX;
    private Double posY;

    public Event(Integer id, String name, String description, Double posX, Double posY) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.posX = posX;
        this.posY = posY;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPosX() {
        return posX;
    }

    public void setPosX(Double posX) {
        this.posX = posX;
    }

    public Double getPosY() {
        return posY;
    }

    public void setPosY(Double posY) {
        this.posY = posY;
    }
}
