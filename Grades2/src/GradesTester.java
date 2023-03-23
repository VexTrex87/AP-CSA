
public class GradesTester {

	public static void main(String[] args) {
		Grades grades = new Grades("Andrew Guilas", 5);
		int sum = grades.getSum();
		System.out.println("Sum: " + sum);
        grades.getAverage();
	}

}
