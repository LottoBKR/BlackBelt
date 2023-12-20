package com.bkr.blackbelt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min = 2, max = 30, message = "Name must have between 2 and 30 characters")
    @NotEmpty(message = "This field is mandatory")
    private String name;

    @Email(message = "Enter a valid E-Mail")
    private String email;

    @Size(min = 8, max = 16, message = "Password must have between 8 and 16 characters")
    @NotEmpty
    private String password;

    @Transient
    private String passwordConfirm;
}
