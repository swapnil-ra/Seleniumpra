package dayy7method;

public class MethodCelsius {


	public static void main(String[] args) {
		float fahrenheit, celsius;
		fahrenheit = 43;
		celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println("Temperature in celsius is: " + celsius);
		System.out.println("***************");
		MethodCelsius m1 = new MethodCelsius();
		m1.temperaturecelsius(47);
		
		m1.temperaturecelsius(40);
		
		m1.temperaturecelsius(45);
		
		m1.temperaturecelsius(50);
		

	}
	public void temperaturecelsius(float f) {
		float res = (f - 32) * 5 / 9;
		System.out.println("Temperature in celsius is: " + res);
}

}
