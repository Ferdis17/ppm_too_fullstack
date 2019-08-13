package ferdis.personal.project.tool.ppm_tool.repositories;

import ferdis.personal.project.tool.ppm_tool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    public Project findByProjectIdentifier(String projectId);

    @Override
    public Iterable<Project> findAll();


}
