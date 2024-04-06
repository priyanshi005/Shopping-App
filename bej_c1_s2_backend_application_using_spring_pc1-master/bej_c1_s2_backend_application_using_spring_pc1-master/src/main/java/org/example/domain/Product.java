package org.example.domain;

public class Product {
    private int id;
    private String name;
    private String feedBack;
    private String status;

    public Product(int id, String name, String feedBack, String status) {
        this.id = id;
        this.name = name;
        this.feedBack = feedBack;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", feedBack='" + feedBack + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
