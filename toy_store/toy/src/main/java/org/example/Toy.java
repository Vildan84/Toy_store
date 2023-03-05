package org.example;

public class Toy {
    private String name;
    private String color;
    private Integer rate;

    Toy(String name, String color, Integer rate){
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

    public String toyInfo(){
        return String.format("Name:%s/ Color:%s/ Rate:%d", this.name, this.color, this.rate);
    }
}
