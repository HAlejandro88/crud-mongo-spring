package com.hg.crud.models;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author alejandro.soto
 */
@Document(collection = "products")
public class Product {
    
    @Id
    private String _id;
    
    private String nombre;
    
    private Double price;
    
    private LocalDate expy_date;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getExpy_date() {
        return expy_date;
    }

    public void setExpy_date(LocalDate expy_date) {
        this.expy_date = expy_date;
    }
    
    
}
