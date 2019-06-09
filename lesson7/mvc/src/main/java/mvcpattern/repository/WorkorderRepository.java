package mvcpattern.repository;

import mvcpattern.entity.Workorder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkorderRepository extends CrudRepository<Workorder, Long> {

}
