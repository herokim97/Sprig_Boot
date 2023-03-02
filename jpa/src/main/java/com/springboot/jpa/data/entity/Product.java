package com.springboot.jpa.data.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;


    public void setUpdatedAt(LocalDateTime now)
    {
        this.updateAt = now;
    }
    public LocalDateTime getUpdateAt()
    {
        return updateAt;
    }
    public void setCreateAt(LocalDateTime now)
    {
        this.createAt = now;
    }
    public LocalDateTime getCreateAt()
    {
        return createAt;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }
    public Integer getPrice()
    {
        return price;
    }

    public void setNumber(Long number)
    {
        this.number = number;
    }

    public Long getNumber()
    {
        return number;
    }

    public void setStock(Integer stock)
    {
        this.stock = stock;
    }

    public Integer getStock()
    {
        return stock;
    }
}