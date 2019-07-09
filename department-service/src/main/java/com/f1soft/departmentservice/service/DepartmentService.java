package com.f1soft.departmentservice.service;

import com.f1soft.departmentservice.entities.Department;
import com.f1soft.departmentservice.requestDTO.DepartmentSetupDTO;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(DepartmentSetupDTO departmentSetupDTO);
    List<Department> fetchAllDepartment();
    Department deleteDepartment(Long id);
}
