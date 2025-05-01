package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name= "vegetable", schema = "fsweb")
public class Vegetable extends Plant{
    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;
}
