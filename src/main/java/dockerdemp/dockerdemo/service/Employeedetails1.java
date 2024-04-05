package dockerdemp.dockerdemo.service;

import dockerdemp.dockerdemo.Entity.Employeedata;

import java.util.Optional;

public interface Employeedetails1
{
   public Optional<Employeedata> getdetails(Integer id);

    public Employeedata Createdata(Employeedata data);
}
