package ru.sapteh.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "gender")
public class Gender {
    @Id
    @Column(name = "Code")
    private char codeGender;
    @Column(name = "Name")
    private String name;


    @OneToMany(mappedBy = "gender")
    Set<Client> setGender;

    @Override
    public String toString() {
        return "Gender{" +
                "codeGender=" + codeGender +
                ", name='" + name + '\'' +
                ", setGender=" + setGender +
                '}';
    }
}
