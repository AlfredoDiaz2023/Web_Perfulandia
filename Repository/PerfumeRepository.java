package com.example.PerfulandiaSPA.Repository;
import com.example.PerfulandiaSPA.Model.perfume;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class PerfumeRepository {
    private List<perfume> listaPerfumes = new ArrayList<>();
    public PerfumeRepository(){
        listaLibros.add()
    }
    //metodo que retorna todo los perfumes 
    public List<perfume> obtenePerfumes(){
        return listaPerfumes;
    }
    //busca un perfume por su id 
    public perfume buscarPorId(int id){
        for (perfume Perfume: listaPerfumes){
            if(Perfume.getIdPerfume()==id){
                return Perfume;
            }
        }
        return null;
    }
    // Buscar un perfume por su isbn
    public perfume buscarPorIsbn(String isbn) {
        for (perfume perfum : listaPerfumes) {
            if (perfum.getIsbn().equals(isbn)) {
                return perfum;
            }
        }
        return null;
    }
    /**
     * @param per
     * @return
     */
    public perfume guardar(perfume per) {
        // Generar nuevo ID secuencial
        long nuevoId = 1;
        for (perfume l : listaPerfumes) {
            if (l.getIdPerfume() >= nuevoId) {
                nuevoId = l.getIdPerfume() + 1;
            }
        }
        perfume perfum = new perfume();
        perfum.setIdPerfume((int)nuevoId);
        perfum.setIsbn(per.getIsbn());
        perfum.setNombrePerfume(per.getNombrePerfume());
        perfum.setMarcaPerfume(per.getMarcaPerfume());
        perfum.setDescripcionPerfume(per.getDescripcionPerfume());
        perfum.setPrecioPerfume(per.getPrecioPerfume());
        listaPerfumes.add(perfum);
        return perfum;
    }
    public perfume actualizar(perfume per){
        int id = 0;
        int idPosicion = 0;
        for (int i = 0; i < listaPerfumes.size(); i++) {
            if(listaPerfumes.get(i),getIdPerfume()==per.getIdPerfume()){
                i = per.getIdPerfume();
                idPosicion = i;
            }
            
        }
        perfume perfume1 = new perfume();
        perfume1.setIdPerfume(id);
        perfume1.setIsbn(per.getIsbn());
        perfume1.setNombrePerfume(per.getNombrePerfume());
        perfume1.setMarcaPerfume(per.getMarcaPerfume());
        perfume1.setDescripcionPerfume(per.getDescripcionPerfume());
        perfume1.setPrecioPerfume(per.getPrecioPerfume());
         listaPerfumes.set(idPosicion, perfume1);
         return perfume1;
         listaPerfumes.removeIf(x ->x.getIdPerfume() ==id);

    }
    public int totalLibro(){
        return listaPerfumes.size();
    }




}
