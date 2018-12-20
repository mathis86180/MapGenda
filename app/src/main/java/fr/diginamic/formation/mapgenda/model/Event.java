package fr.diginamic.formation.mapgenda.model;

import java.util.Date;

public class Event {

    private Integer id;
    private String name;
    private String description;
    private Double posX;
    private Double posY;
    private Date startingDate;
    private Date endingDate;

    /**
     *
     * @param id
     * @param name
     * @param description
     * @param posX
     * @param posY
     */
    public Event(Integer id, String name, String description, Double posX, Double posY, Date startingDate, Date endingDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.posX = posX;
        this.posY = posY;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
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

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }
}
