public class ViajeAuto {
    void main() {
        double distanciaKm = 360.0;
        double rendimientoKmPorLitro = 12.0;
        double precioPorLitro = 24.50;
        double presupuesto = 1000.0;

        double litrosNecesarios = distanciaKm / rendimientoKmPorLitro;
        double costoTotal = litrosNecesarios * precioPorLitro;
        double dineroRestante = presupuesto - costoTotal;

        System.out.println("Litros de gasolina necesarios: " + litrosNecesarios + " L");
        System.out.println("Costo total del combustible: $" + costoTotal);
        System.out.println("Dinero restante del presupuesto: $" + dineroRestante);
    }
}

