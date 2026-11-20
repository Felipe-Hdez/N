public class Imprenta {
    void main () {

    int CantidadPlayeras = 120;
    double CostoProduccionUnitario = 85.0;
    double PrecioVentaUnitario = 140.0;

    double GastoElectricidad = 350.0;
    double GastoTransporte = 500.0;

    double CostoProduccionTotal = CantidadPlayeras * CostoProduccionUnitario;
    double GastosAdicionales = GastoElectricidad + GastoTransporte;
    double IngresoTotalVentas = CantidadPlayeras * PrecioVentaUnitario;
    double GananciaFinal = IngresoTotalVentas - (CostoProduccionTotal + GastosAdicionales);


        System.out.println("Costo de producción: $" + CostoProduccionTotal);
        System.out.println("Gastos adicionales: $" + GastosAdicionales);
        System.out.println("Ingreso total por ventas: $" + IngresoTotalVentas);
        System.out.println("Ganancia final: $" + GananciaFinal);
}
    }

