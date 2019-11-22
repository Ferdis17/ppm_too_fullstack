package ferdis.personal.project.tool.ppm_tool.repositories;

import ferdis.personal.project.tool.ppm_tool.domain.Backlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {

    Backlog findByProjectIdentifier(String Identifier);
}
