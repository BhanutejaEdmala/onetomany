package com.example.OnetoOne.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private String id;
    private String name;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<>();
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
