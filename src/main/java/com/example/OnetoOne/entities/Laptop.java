package com.example.OnetoOne.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
    @Id
    private String lid;
    private String lname;
    @OneToOne
    @JoinColumn(name = "stu_id")
    private Student student;
    @Override
    public String toString() {
        return "Laptop{" +
                "Laptop Id='" + lid + '\'' +
                ", L Name='" + lname + '\'' +
                '}';
    }
}
