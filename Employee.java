package tka.practiceQuestions;

// Question: A company wants to maintain employee information and calculate employee salaries.
public class Employee {
	private int employeeId;
	private String empName;
	private double basicSalary;

	Employee(int employeeId, String empName, double basicSalary) {
		this.employeeId = employeeId;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}

	public int get_employeeId() {
		return employeeId;
	}

	public String get_empName() {
		return empName;
	}

	public void get_basicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void calculateSalary() {
		double HRA = basicSalary * 0.20;
		double DA = basicSalary * 0.10;
		double totalSalary = basicSalary + HRA + DA;

		System.out.println("Employee ID : " + employeeId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("HRA : " + HRA);
		System.out.println("DA : " + DA);
		System.out.println("Total Salary : " + totalSalary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(513, "Ram", 50000.0);
		emp.calculateSalary();

	}
}
