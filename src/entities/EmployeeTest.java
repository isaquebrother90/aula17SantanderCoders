package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int employeesNumber = sc.nextInt();
		
		for(int i = 0; i < employeesNumber; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(position(list, id)!=null) { // Tirando position, chamando o método
				// hasId, e tirando o !=null, é possível verificar se o id é repetido,
				// mas pra isso é necessário ativar o método hasId que está comentado.
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int idd) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == idd) {
				return i;
			}
		}
		
		return null;
		
	}
	
	/*
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	*/

}




