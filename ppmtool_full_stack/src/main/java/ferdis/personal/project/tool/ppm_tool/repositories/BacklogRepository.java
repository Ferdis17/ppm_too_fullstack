package ferdis.personal.project.tool.ppm_tool.repositories;

<<<<<<< HEAD
import ferdis.personal.project.tool.ppm_tool.domain.Backlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {

    Backlog findByProjectIdentifier(String Identifier);
=======
public interface BacklogRepository {
>>>>>>> b0e983aee93ac7ca31fb2da9ddb198a42a320cd2
}
