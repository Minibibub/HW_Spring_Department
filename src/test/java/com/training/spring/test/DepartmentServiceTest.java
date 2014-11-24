package com.training.spring.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Department;
import com.training.spring.service.DepartmentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hibernate.xml"})
public class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	
//	@Test
//	public void testFindDepartmentByIdShouldFoundData() {
//		
//		Department department = departmentService.findDepartmentById(1);
//		System.out.println(department);
//			
//	}
	
//	@Test
//	public void findAllDepartmentShouldFoundData() {
//		
//		List<Department> department = departmentService.findAllDepartment();
//		System.out.println(department);
//		
//	}
	
//	@Test
//	public void testSaveDepartment() {
//		
//		Department department = new Department();
//		department.setName("HR");
//		departmentService.saveDepartment(department);
//	}
	
//	@Test
//	public void testUpdateDepartment() {
//		
//		Department department = departmentService.findDepartmentById(3);
//		department.setName("Com");
//		departmentService.updateDepartment(department);
//	}
	
//	@Test
//	public void testDeleteDepartment() {
//		
//		Department department = departmentService.findDepartmentById(3);
//		departmentService.deleteDepartment(department);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
