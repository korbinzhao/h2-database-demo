package com.example.h2databasedemo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="girl")
public class Girl {

    @Column(name="id")
    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private Integer id;

    @Column(name="cupsize")
    @NotBlank(message = "cupSize必传")
    private String cupSize;

    @Column(name="age")
    @Min(value = 18, message = "未成年少女禁止入门")
    @NotNull
//    @Max()
//    @Length()
    private Integer age;

    @Column(name="money")
    @NotNull(message = "money必传")
    private Double money;

//    public Girl() {
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

//    @Override
//    public String toString() {
//        return "Girl{" +
//                "id=" + id +
//                ", cupSize='" + cupSize + '\'' +
//                ", age=" + age +
//                ", money=" + money +
//                '}';
//    }
}
