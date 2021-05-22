package tech.getarrays.employermanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employermanager.model.Employee;

// Il a besoin du type de l'id  <Employee, Long>
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    // Dans repository, la methode deleteEmployeeById n'existe, c'est ont rajoute cette ligne
    //pour pouvoir supprimer un employee
    void deleteEmployeeById(Long id);
}
