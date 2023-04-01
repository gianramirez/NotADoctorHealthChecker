package NotaDoctor.NotADoctor.repositories;

import NotaDoctor.NotADoctor.models.Symptoms;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SymptomsRepository extends CrudRepository<Symptoms, Long>{
    Optional<Symptoms> findSymptomsById(Long id);
}
