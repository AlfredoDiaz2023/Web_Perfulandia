package com.example.PerfulandiaSPA.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor // Genera un constructor con todos los campos.
@NoArgsConstructor // Genera un constructor con todos los campos.
public class perfume {

    private int idPerfume;
    private String isbn;
    private String nombrePerfume;
    private String marcaPerfume;
    private String descripcionPerfume;
    private int precioPerfume;

    
}
