package com.example.PerfulandiaSPA.Repository;
import com.example.PerfulandiaSPA.Model.perfume;

import io.github.lyxnx.compose.ui.tablericons.outline.PerfumeKt;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PerfumeRepository {
    private final List<PerfumeKt> listaPerfumes = new ArrayList<>();

    // Obtener todos los perfumes
    public List<Perfume> obtenerPerfumes() {
        return new ArrayList<>(); // Retorna una copia para evitar modificaciones externas
    }

    // Buscar perfume por ID
    public Optional<Perfume> buscarPorId(int id) {
        return listaPerfumes.stream()
                .filter(p -> p.getIdPerfume() == id)
                .findFirst();
    }

    // Buscar perfume por ISBN
    public Optional<Perfume> buscarPorIsbn(String isbn) {
        return listaPerfumes.stream()
                .filter(p -> p.getIsbn().equals(isbn))
                .findFirst();
    }

    // Guardar nuevo perfume
    public Perfume guardar(Perfume per) {
        int nuevoId = listaPerfumes.stream()
                .mapToInt(Perfume::getIdPerfume)
                .max()
                .orElse(0) + 1;
        per.setIdPerfume(nuevoId);
        listaPerfumes.add(per);
        return per;
    }

    // Actualizar perfume
    public Optional<Perfume> actualizar(Perfume per) {
        for (int i = 0; i < listaPerfumes.size(); i++) {
            if (listaPerfumes.get(i).getIdPerfume() == per.getIdPerfume()) {
                listaPerfumes.set(i, per);
                return Optional.of(per);
            }
        }
        return Optional.empty();
    }

    // Total de perfumes
    public int totalPerfumes() {
        return listaPerfumes.size();
    }

}
