package com.example.PerfulandiaSPA.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PerfulandiaSPA.Model.perfume;



@RestController
@RequestMapping("/api/v1/carrito")
public class carritoController {
    // Método para agregar un perfume al carrito
@PostMapping("/agregar/{id}")
public String agregarPerfume(@PathVariable int id) {
    private final List<perfume> carrito = new ArrayList<>();
    Perfume perfume = perfumeService.getPerfumeById(id);
    if (perfume != null) {
        carrito.add(perfume);
        return "Perfume agregado al carrito: " + perfume.getNombre();
    }
    return "Perfume no fue agregado";
}

// Método para ver los items del carrito
@GetMapping
public List<Perfume> verCarrito() {
    return carrito;
}

// Método para eliminar items del carrito
@DeleteMapping("/eliminar/{id}")
public String eliminarPerfume(@PathVariable int id) {
    boolean eliminado = carrito.removeIf(perfume -> perfume.getId() == id);
    return eliminado ? "Perfume eliminado del carrito" : "Perfume no estaba en el carrito";
}

// Método para vaciar el carrito
@DeleteMapping("/vaciar")
public String vaciarCarrito() {
    carrito.clear();
    return "Carrito vaciado";
}

// Método para contar los perfumes en el carrito
@GetMapping("/total")
public int totalPerfumes() {
    return carrito.size();
}
    
}
