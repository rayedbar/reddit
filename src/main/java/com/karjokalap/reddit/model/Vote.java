package com.karjokalap.reddit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Vote implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private int vote;
}
