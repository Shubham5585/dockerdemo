package dockerdemp.dockerdemo.Controller;

import dockerdemp.dockerdemo.Entity.Employeedata;
import dockerdemp.dockerdemo.service.Employeedetails1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Employee")
public class edetails
{

    @GetMapping("/Test")
    public   String  testing ( )
    {
        return   "working for test";
    }
    @Autowired
    Employeedetails1 employee;
    @PostMapping("/put")
    public Employeedata createdataemployee(@RequestBody Employeedata request )
    {
       this.employee.Createdata(request);
       return request;

    }
    @GetMapping("/get/{id}")
    public Optional<Employeedata> getEmployeeDetails(@PathVariable Integer id)
    {
        return   this.employee.getdetails(id);

    }
}
