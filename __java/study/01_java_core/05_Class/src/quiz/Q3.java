package quiz;

public class Q3 {
	double base = 5.0;
	double height = 3.5;
	
	double getArea() {
		return (base*height) / 2;
	}
	double getHypotenuse() {
		return Math.sqrt(base*base + height*height);
	}
	double getPerimeter() {
		return base + height + getHypotenuse();
	}

	public static void main(String[] args) {
		Q3 q3 = new Q3();
		System.out.printf("삼각형의 넓이:%.2f\n",q3.getArea());
		System.out.printf("빗변길이:%.2f\n", q3.getHypotenuse());
		System.out.printf("둘레길이:%.2f\n", q3.getPerimeter());
	}
}
