package fundamentos;

public class Temperatura {
	
    public static void main(String[] args) {
        // ( °F - 32) x 5/9 = °C

        final double Fator = 5.0 / 9.0;
        final double Ajuste = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - Ajuste) * Fator;
        System.out.println("O resultado é " + celsius + " ° C." );


        double fahrenheit1 = 0;
        double celsius1 = (fahrenheit1 - Ajuste) * Fator;
        System.out.println("O resultado é " + celsius1 + " ° C." );
    }

}


