package com.day3;

/**
 * Created by lgm
 * on 2020/3/27.
 */
public enum Color {
    BLUE("蓝色"), RED("红色"), YELLOW("黄色");
    int a;
    int b=20;
    private final String name;
    Color(String name) {
        this.name =name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}
