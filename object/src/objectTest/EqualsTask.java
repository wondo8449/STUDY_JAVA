package objectTest;

class Employee {
	private int number;
	private String name;
	
	
	public Employee(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj instanceof Employee) {
			Employee anotherEmployee = (Employee) obj;
			if(anotherEmployee.number == this.number) {
				return true;
			}
		}
		return false;
	}
}

public class EqualsTask {
	public static void main(String[] args) {
		Employee john = new Employee(1, "john");
		System.out.println(john.equals(new Employee(1, "john")));
	}
}
