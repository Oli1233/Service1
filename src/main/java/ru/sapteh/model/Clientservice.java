package ru.sapteh.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "clientservice")
public class Clientservice {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
 
    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "serviceID")
    private Service service;

    @Column(name = "StartTime")
    private Date startTime;

    @Column(name = "Comment")
    private String comment;

    @Override
    public String toString() {
        return "Clientservice{" +
                "id=" + id +
                ", client=" + client +
                ", service=" + service +
                ", startTime=" + startTime +
                ", comment='" + comment + '\'' +
                '}';
    }
}
