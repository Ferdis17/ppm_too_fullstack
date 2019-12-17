package ferdis.personal.project.tool.ppm_tool.repositories;

import ferdis.personal.project.tool.ppm_tool.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Long>{

    User findByUserName(String userName);
    User getById(Long id);
}
