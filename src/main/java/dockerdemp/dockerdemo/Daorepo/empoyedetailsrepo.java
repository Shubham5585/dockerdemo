package dockerdemp.dockerdemo.Daorepo;

import dockerdemp.dockerdemo.Entity.Employeedata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empoyedetailsrepo extends JpaRepository<Employeedata,Integer>
{

}
