package tech.getarrays.employermanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employermanager.model.Employee;
import tech.getarrays.employermanager.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

  //Je creé un constructeur
    @Autowired
    public  EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    //Enregistrement d'un employer

    public Employee addEmployee(Employee employee){
        //UUID.randomUUID() Permet de rendre un identifiant unique, le matricule de l'emploie doit etre unique
        employee.setEmployeeCode(UUID.randomUUID().toString());
        //Enregistrement du matricule de l'employée
        return employeeRepo.save(employee);
    }

    // Liste des employees

    public List<Employee> findAllEmployee(Employee employee){

        return employeeRepo.findAll();
    }

    //Modification d'un employee

    public Employee updateEmploye(Employee employee){
        return employeeRepo.save(employee);
    }


    //Supprimer un  employee, cette methode est differente des autres et return rien

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }


}
