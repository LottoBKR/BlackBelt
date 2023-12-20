package com.bkr.blackbelt.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "programs")
@Data
public class Program extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 20, message = "Title must have between 2 and 20 characters.")
    @NotEmpty
    private String title;

    @Size(min = 2, max = 20)
    @NotEmpty(message = "TV Station must not be empty.")
    private String tvStation;

    @Size(min = 5, max = 255, message = "Description must have between 2 and 255 characters.")
    private String description;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
}
