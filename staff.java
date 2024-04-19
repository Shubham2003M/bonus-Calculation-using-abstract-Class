
class Staff extends Employee {
	 // Member variables
	public int id;
	public String name;
	public int	experience;
	public double salary;
	public double rating;
	public double bonus;
	
	// Constructor
    public Staff(int id, String name, int experience, double salary, double rating) {
    	this.id = id;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
        this.rating = rating;

}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	public void calculateSalary() {
        // Calculate bonus based on experience and rating
        if (experience <= 2) {
            bonus = rating * 2000;
        } else if (experience > 2 && experience <= 5) {
            bonus = rating * 4000;
        }

        // Print staff details and bonus
        System.out.println("Staff id = " + id + ", name = " + name + " receives bonus of Rs." + bonus);
        // Total salary includes salary and bonus
        double totalSalary = salary + bonus;
        System.out.println("Your total salary of this month = " + totalSalary);
    }


	
	 


		
		
}
