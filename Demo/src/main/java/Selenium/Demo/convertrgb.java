package Selenium.Demo;

public class convertrgb {

	public static String convertRgbToHex(String rgb) {
		 String[] numbers = rgb.replace("rgb(", "").replace("rgb(", "").replace(")", "").split(", ");
	        int r = Integer.parseInt(numbers[0]);
	        int g = Integer.parseInt(numbers[1]);
	        int b = Integer.parseInt(numbers[2]);
	        return String.format("#%02x%02x%02x",r,g,b);
	}

	
}
