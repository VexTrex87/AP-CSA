public class Victim {
	String sex;
	String boneType;
	int age;
	double boneLength;
	
	public Victim(String sex, String boneType, int age, double boneLength) {
		this.sex = sex;
		this.boneType = boneType;
		this.age = age;
		this.boneLength = boneLength;
	}
	
	public boolean isValidSex() {
		if (sex.equals("F") || sex.equals("M")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isValidBone() {
		if (boneType.equals("F") ||
			boneType.equals("T") ||
			boneType.equals("H") ||
			boneType.equals("R"))
		{
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return sex + " " + boneType + " " + age + " " + boneLength;
	}
	
	public double getHeight() {
		boolean validSex = isValidSex();
		if (validSex == false) {
			System.out.println("Wrong Sex code");
			return 0;
		}
		
		boolean validBone = isValidBone();
		if (validBone == false) {
			System.out.println("Wrong Bone Code");
			return 0;
		}
		
		double height;
		if (sex.equals("M")) {
			if (boneType.equals("F")) {
				height = 69.089 + 2.238 * boneLength;
			} else if (boneType.equals("T")) {
				height = 81.688 + 2.232 * boneLength;
			} else if (boneType.equals("T")) {
				height = 73.570 + 2.970 * boneLength;
			} else {
				height = 80.405 + 2.650 * boneLength;
			}
		} else {
			if (boneType.equals("F")) {
				height = 61.412 + 2.317 * boneLength;
			} else if (boneType.equals("T")) {
				height = 72.572 + 2.533 * boneLength;
			} else if (boneType.equals("T")) {
				height = 64.977 + 3.144 * boneLength;
			} else {
				height = 73.502 + 3.876 * boneLength;
			}
		}
		
		if (age > 30) {
			height -= (age - 30) * 0.06;
		}
		
		return height;
	
	}
	
}
