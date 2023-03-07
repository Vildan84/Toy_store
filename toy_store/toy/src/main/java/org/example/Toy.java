package org.example;

public class Toy {
    private String name;
    private String color;
    private Integer rate;
    final Integer id;
    private Integer remain;

    Toy(int ID, String name, String color, Integer rate, Integer remain){
        this.id = ID;
        this.name = name;
        this.color = color;
        this.rate = rate;
        this.remain = remain;

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

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    public String toyInfo(){
        return String.format("ID:%d, Name:%s / Color:%s / Rate:%d / Remain:%d", this.id, this.name, this.color,
                this.rate, this.remain);
    }
}
