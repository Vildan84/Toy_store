package org.example;

public class Toy {
    private String name;
    private String color;
    private Integer rate;
    final Integer id;

    Toy(int ID, String name, String color, Integer rate){
        this.id = ID;
        this.name = name;
        this.color = color;
        this.rate = rate;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getId() {
        return id;
    }

    public String toyInfo(){
        return String.format("ID:%d, Name:%s / Color:%s / Rate:%d", this.id, this.name, this.color, this.rate);
    }
}
