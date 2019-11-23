package ferdis.personal.project.tool.ppm_tool.repositories;

import ferdis.personal.project.tool.ppm_tool.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

    List<ProjectTask> findByProjectIdentifierOrderByPriority(String id);

    ProjectTask findByProjectSequence(String sequence);
=======

public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {
>>>>>>> b0e983aee93ac7ca31fb2da9ddb198a42a320cd2
}
