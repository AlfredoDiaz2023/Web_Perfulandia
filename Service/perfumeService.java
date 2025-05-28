package com.example.PerfulandiaSPA.Service;
import com.example.PerfulandiaSPA.Model.perfume;
import com.example.PerfulandiaSPA.Repository.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class perfumeService {
    @Autowired 
    private PerfumeRepository perfumeRepository;
    public List<perfume> getPerfumes(){
        return perfumeRepository.obtenePerfumes();

    }
    public perfume savPerfume(perfume perfum){
        return perfumeRepository.guardar(perfum);

    }
     public perfume getPerfumeId(int id){
        return perfumeRepository.buscarPorId(id);
     }
}
