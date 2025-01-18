package com.bms.db.api.bms_db_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    UUID id;
    String firstName;
    String lastName;
    int Contatc
}
