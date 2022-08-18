package com.dipanjan;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.dipanjan.primary.Employee;
import com.dipanjan.secondary.Manager;

@Component
public class MyCustomProcessor implements ItemProcessor<Employee, Manager>{
    @Override
    public Manager process(Employee emp) throws Exception {
        System.out.println("MyBatchProcessor : Processing data : "+emp);
        Manager manager = new Manager();
        //manager.setId(emp.getId());
        manager.setName(emp.getName().toUpperCase());
        manager.setSalary(emp.getSalary());
        return manager;
    }
}
