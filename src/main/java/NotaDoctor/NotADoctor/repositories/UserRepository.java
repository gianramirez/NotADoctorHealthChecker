package NotaDoctor.NotADoctor.repositories;

import NotaDoctor.NotADoctor.models.usermodels.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByName(String name);
}
