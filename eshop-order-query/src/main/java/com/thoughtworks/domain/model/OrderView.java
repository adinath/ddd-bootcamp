package com.thoughtworks.domain.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class OrderView {

    @Id
    private String id;

    @Transient
    private List<Item> items;

    public OrderView() {
    }

    public OrderView(String id, List<Item> items) {

        this.id = id;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "OrderView{" +
                "id='" + id + '\'' +
                ", items=" + items +
                '}';
    }
}
