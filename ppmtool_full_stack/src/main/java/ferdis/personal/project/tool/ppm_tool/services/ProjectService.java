package ferdis.personal.project.tool.ppm_tool.services;

import ferdis.personal.project.tool.ppm_tool.domain.Backlog;
import ferdis.personal.project.tool.ppm_tool.domain.Project;
import ferdis.personal.project.tool.ppm_tool.exceptions.ProjectIdException;
import ferdis.personal.project.tool.ppm_tool.repositories.BacklogRepository;
import ferdis.personal.project.tool.ppm_tool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

<<<<<<< HEAD
    @Autowired
    private BacklogRepository backlogRepository;

=======
>>>>>>> b0e983aee93ac7ca31fb2da9ddb198a42a320cd2
    public Project saveOrUpdateProject(Project project) {
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());

            if (project.getId() == null) {
                Backlog backlog = new Backlog();
                project.setBacklog(backlog);
                backlog.setProject(project);
                backlog.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            }

            if (project.getId() != null) {
                project.setBacklog(backlogRepository.findByProjectIdentifier(project.getProjectIdentifier().toUpperCase()));
            }

            return projectRepository.save(project);
<<<<<<< HEAD

=======
>>>>>>> b0e983aee93ac7ca31fb2da9ddb198a42a320cd2
        } catch (Exception e) {
            throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already exists");
        }

    }
<<<<<<< HEAD

    public Project findProjectByIdentifier(String projectId) {
=======
    public Project findProjectByIdentifier(String projectId) {

>>>>>>> b0e983aee93ac7ca31fb2da9ddb198a42a320cd2
        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());

        if (project == null) {
            throw new ProjectIdException("Project ID '" + projectId + "' does not exist");
<<<<<<< HEAD
=======

>>>>>>> b0e983aee93ac7ca31fb2da9ddb198a42a320cd2
        }
        return project;
    }

    public Iterable<Project> findAllProjects() {
        return projectRepository.findAll();
    }

<<<<<<< HEAD
=======

>>>>>>> b0e983aee93ac7ca31fb2da9ddb198a42a320cd2
    public void deleteProjectByIdentifier(String projectid) {
        Project project = projectRepository.findByProjectIdentifier(projectid.toUpperCase());

        if (project == null) {
            throw new ProjectIdException("Cannot Project with ID '" + projectid + "'. This project does not exist");
        }

        projectRepository.delete(project);
    }
}