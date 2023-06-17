package pro.sky.Employees_Spring_Mockito.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.Employees_Spring_Mockito.model.Employee;
import pro.sky.Employees_Spring_Mockito.service.DepartmentService;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}/salary/max")
    public Employee maxSalary(@PathVariable int id) {
        return departmentService.maxSalary(id);
    }
    @GetMapping("{id}/salary/min")
    public Employee minSalary(@PathVariable int id) {
        return departmentService.minSalary(id);
    }
    @GetMapping("/{id}/salary/sum")
    public int salarySumByDepartment(@PathVariable int id){
        return departmentService.salarySumByDepartment(id);
    }
    @GetMapping( "/{id}/employees")
    public Collection<Employee> allByDepartment(@PathVariable int id) {
        return departmentService.allByDepartment(id);
    }
    @GetMapping("/employees")
    public Map<Integer, List<Employee>> all() {
        return departmentService.all();
    }

}
