import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Factura {
    private static final AtomicInteger autoInc = new AtomicInteger(2);
    private LocalDateTime fechaEmision;
    private String numFactura, cliente;
    private List<String> articulos;
    private List<Double> precioUnitario;
    private List<Integer> cantidad;
    private double subtotal;
    private double iva;
    private double total;

    public Factura(String cliente) {
        numFactura = String.format("%04d", autoInc.incrementAndGet());
        fechaEmision = LocalDateTime.now();
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.precioUnitario = new ArrayList<>();
        this.cantidad = new ArrayList<>();
        this.subtotal = 0;
        this.iva = 0;
        this.total = 0;
    }

    public void agregarArticulo(String articulo, double precioUnitario, int cantidad) {
        this.articulos.add(articulo);
        this.precioUnitario.add(precioUnitario);
        this.cantidad.add(cantidad);
    }

    public void calcularSubtotal() {
        double tempSubtotal = 0;
        for (int i = 0; i < articulos.size(); i++) {
            tempSubtotal += precioUnitario.get(i) * cantidad.get(i);
        }
        this.subtotal = tempSubtotal;
    }

    public void calcularIVA(double IVA) {
        this.iva = this.subtotal * IVA;
    }

    public void calcularTotal() {
        this.total = this.subtotal + this.iva;
    }
}
