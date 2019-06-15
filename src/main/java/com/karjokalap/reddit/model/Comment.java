package com.karjokalap.reddit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Comment implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String body;

    @ManyToOne
    private Link link;
}
