public class Nomina {
    void main () {

    int horasNormales = 40;
    double pagoPorHora = 95.0;
    int horasAdicionales = 6;
    double bonoProductividad = 450.0;
    double porcentajeDeduccion = 0.08;

    double pagoHorasNormales = horasNormales * pagoPorHora;
    double pagoHorasAdicionales = horasAdicionales * (pagoPorHora * 2);
    double ingresoAntesDeduccion = pagoHorasNormales + pagoHorasAdicionales + bonoProductividad;
    double montoDescontado = ingresoAntesDeduccion * porcentajeDeduccion;
    double salarioFinal = ingresoAntesDeduccion - montoDescontado;

        System.out.println("Pago por horas normales: $" + pagoHorasNormales);
        System.out.println("Pago por horas adicionales: $" + pagoHorasAdicionales);
        System.out.println("Ingreso antes de la deducción: $" + ingresoAntesDeduccion);
        System.out.println("Monto descontado (8%): $" + montoDescontado);
        System.out.println("Salario final a recibir: $" + salarioFinal);
}
  }

