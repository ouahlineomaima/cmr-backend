package com.cmr.wassini.Models;

import jakarta.persistence.*;

@Entity
public class Defunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CIN;
    @Column
    private boolean isRetired;
    @Column
    private boolean hasChildren;
}