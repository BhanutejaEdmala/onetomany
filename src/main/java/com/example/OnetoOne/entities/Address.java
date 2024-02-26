package com.example.OnetoOne.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    private String state;
    private String dist;
    @ManyToOne
    @JoinColumn(name = "std_id")
    private Student student;
    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", dist='" + dist + '\'' +
                '}';
    }
}
