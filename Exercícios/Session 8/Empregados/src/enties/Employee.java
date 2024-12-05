package enties;


public class Employee {

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Double getTax() {
		return Tax;
	}

	public void setTax(Double tax) {
		Tax = tax;
	}

	private String name;
    private Double grossSalary;
    private Double Tax;


    public Double netSalary() {
        return this.getGrossSalary() - (this.getGrossSalary() * this.getTax());
    }

    public void increaseSalary(Double percent) {
        this.setGrossSalary(this.getGrossSalary() + (this.getGrossSalary() * percent));
    }

    public String toString() {
        return this.getName() + ", $ " + String.format("%.2f", netSalary());
    }
}