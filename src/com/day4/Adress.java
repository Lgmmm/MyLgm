package com.day4;

import java.util.Objects;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class Adress implements Cloneable {
    String name;
    String type;

    @Override
    public boolean equals(Object o) {
            if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(name, adress.name) &&
                Objects.equals(type, adress.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    public Adress(String name, String type) {
        this.name = name;
        this.type =type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Adress{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
