package dockerdemp.dockerdemo.ServiceImple;

import dockerdemp.dockerdemo.Daorepo.empoyedetailsrepo;
import dockerdemp.dockerdemo.Entity.Employeedata;
import dockerdemp.dockerdemo.service.Employeedetails1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Employeedetails implements Employeedetails1
{
    @Autowired
    private empoyedetailsrepo Erepo;
    @Override
    public Optional<Employeedata> getdetails(Integer id) {
        return Erepo.findById(id);
    }

    @Override
    public Employeedata Createdata(Employeedata data) {
        return Erepo.save(data);
    }
}
