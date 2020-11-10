package tr.gov.csb.edenetim.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.gov.csb.edenetim.entity.Deniz;

@Repository
public interface DenizRepository extends CrudRepository<Deniz, Long> {
}