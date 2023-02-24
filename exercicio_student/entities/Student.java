package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public void isApproved() {
		double missing = finalGrade() - 60.0;
		if (missing >= 0) {
			System.out.println("PASS");
		} else {
			missing = Math.abs(missing);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", missing);
		}
	}
	
	public String toString() {
		return String.format("%.2f", finalGrade());
	}

}
