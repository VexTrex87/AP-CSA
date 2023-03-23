
public class Tester {

	public static void main(String[] args) {
		
		ArithmeticSeq arithSeq = new ArithmeticSeq(2, -6);
		System.out.println(arithSeq.nextTerm());
		System.out.println(arithSeq.nextTerm());
		System.out.println(arithSeq.nextTerm());
		System.out.println(arithSeq.nextTerm());
		System.out.println(arithSeq.nextTerm());
		
		GeometricSeq geoSeq = new GeometricSeq(2, 0.5);
		System.out.println(geoSeq.nextTerm());
		System.out.println(geoSeq.nextTerm());
		System.out.println(geoSeq.nextTerm());
		System.out.println(geoSeq.nextTerm());
		System.out.println(geoSeq.nextTerm());
		
	}

}
