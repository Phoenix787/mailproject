package com.example.mailproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Size(min = 3, max = 50, message = "Username must be more 3 and less 50 characters")
    private String username;
    @NotNull

    @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Email must be valid")
    private String email;
}
