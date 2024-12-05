package entities;


public class Aluno {

    private String name;
    private Double n1;
    private Double n2;
    private Double n3;

    public Double finalGrade() {
        return this.getN1() + this.getN2() + this.getN3();
    }

    public void results() {
        if (finalGrade() < 60.0) {
            System.out.println(this.getName());
            System.out.printf("Final GRADE = "+ finalGrade());
            System.out.println("FAILED");
            double missing = 60 - finalGrade();
            System.out.println("MISSING: "+ missing);
        } else {
            System.out.println(this.getName());
            System.out.printf("Final GRADE = "+ finalGrade());
             System.out.println("\nPASS");
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}

	public Double getN3() {
		return n3;
	}

	public void setN3(Double n3) {
		this.n3 = n3;
	}
}