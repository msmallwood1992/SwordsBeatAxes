package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Employee;

public class EmployeeServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<Employee> allEmployees = new ArrayList<>();
		allEmployees.add(new Employee(34,"Sally Jones", "sjones@gmail.com"));
		allEmployees.add(new Employee(56,"Kermit McNealy", "kmcneal@gmail.com"));
		allEmployees.add(new Employee(31,"Kylo Ren", "kren@gmail.com"));
		allEmployees.add(new Employee(44,"Big Jilm", "bjilm@gmail.com"));
		
		ObjectMapper om = new ObjectMapper();
		String employeeString = om.writeValueAsString(allEmployees);
		employeeString = "{\"employees\":"+employeeString+"}";
		
		PrintWriter pw = response.getWriter();
		pw.write(employeeString);
		
		
	}
}
