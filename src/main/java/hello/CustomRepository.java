package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomRepository extends CrudRepository<Custom, Long> {
    List<Custom> findByLastName(String lastName);
}
