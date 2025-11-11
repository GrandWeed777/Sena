package metodos.convertirgrados;

public class ConversorTemperatura {
    public double conversorFahren(double celcius){
        double fahrenheit = (celcius * 9 / 5) + 32;
        return fahrenheit;
    }

    public double conversorkelvin(double celciusk){
        double kelvin = celciusk + 273.15;
        return kelvin;
    }

    public void mostrarBienvenida(){
        System.out.println("Bienvenido al conversor!");
    }
    
    public void mostrarResultadof(double resultadof){
        System.out.print("La conversion a fahrenheit es: " + resultadof);
    }
    public void mostrarResultadokk(double resultadok){
        System.out.print("La conversion kelvin es:  " + resultadok);
    }
}
