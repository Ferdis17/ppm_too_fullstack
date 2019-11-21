package ferdis.personal.project.tool.ppm_tool.services;

import ferdis.personal.project.tool.ppm_tool.domain.ProjectTask;
import ferdis.personal.project.tool.ppm_tool.repositories.BacklogRepository;
import ferdis.personal.project.tool.ppm_tool.repositories.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private BacklogRepository backlogRepository;

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask addProjectTask(String projectIdentifier, ProjectTask projectTask){

        return projectTaskRepository.save(projectTask);
    }
}
