package ferdis.personal.project.tool.ppm_tool.repositories;

import ferdis.personal.project.tool.ppm_tool.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;

public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {
}
