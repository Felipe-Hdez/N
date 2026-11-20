public class Papeleria {
    void main () {
            int cuadernos = 5;
            double precioCuaderno = 35.0;

            int lapices = 8;
            double precioLapiz = 7.0;

            int borradores = 3;
            double precioBorrador = 12.0;

            double totalCompra = (cuadernos * precioCuaderno) +
                    (lapices * precioLapiz) + (borradores * precioBorrador);
            double dineroRecibido = 500.0;
            double cambio = dineroRecibido - totalCompra;

        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Dinero recibido: $" + dineroRecibido);
        System.out.println("Cambio a entregar: $" + cambio);
        }
    }
