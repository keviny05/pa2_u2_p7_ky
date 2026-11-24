package ky.edu.uce.pa.grupo.u2;

import java.time.LocalDateTime;

import ky.edu.uce.pa.grupo.u2.pedidos.application.ClienteService;
import ky.edu.uce.pa.grupo.u2.pedidos.application.EnvioService;
import ky.edu.uce.pa.grupo.u2.pedidos.application.FacturaService;
import ky.edu.uce.pa.grupo.u2.pedidos.application.PagoService;
import ky.edu.uce.pa.grupo.u2.pedidos.application.PedidoService;
import ky.edu.uce.pa.grupo.u2.pedidos.application.ProductoService;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Envio;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private ClienteService clienteService;

    @Inject
    private ProductoService productoService;

    @Inject
    private PedidoService pedidoService;

    @Inject
    private PagoService pagoService;

    @Inject
    private FacturaService facturaService;

    @Inject
    private EnvioService envioService;

    public static void main(String... args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello from Quarkus!");

        // Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Cliente de prueba");
        cliente.setEmail("cliente@prueba.com");
        cliente.setTelefono("0999999999");
        cliente.setDireccion("Quito, Ecuador");
        this.clienteService.guardar(cliente);

        // Producto
        Producto producto = new Producto();
        producto.setNombre("Producto de prueba");
        producto.setPrecio(100.0);
        producto.setStock(10);
        this.productoService.guardar(producto);

        // Pedido
        Pedido pedido = new Pedido();
        pedido.setProducto(producto.getNombre());
        pedido.setPrecio(producto.getPrecio());
        this.pedidoService.guardar(pedido);
        String pedidoId = String.valueOf(pedido.getId());

        // Pago
        Pago pago = new Pago();
        pago.setPedidoId(pedidoId);
        pago.setMetodo(Pago.Metodo.TARJETA);
        pago.setMonto(pedido.getPrecio());
        this.pagoService.guardar(pago);

        // Factura
        Factura factura = new Factura();
        factura.setPedidoId(pedidoId);
        factura.setNumeroFactura("FAC-0001");
        factura.setFechaEmision(LocalDateTime.now());
        factura.setTotal(pedido.getPrecio());
        this.facturaService.guardar(factura);

        // Envio
        Envio envio = new Envio();
        envio.setPedidoId(pedidoId);
        envio.setRepartidorId("REP-001");
        envio.setNumeroGuia("GUIA-0001");
        this.envioService.guardar(envio);

        System.out.println("Registros creados: cliente=" + cliente.getId()
                + ", producto=" + producto.getId()
                + ", pedido=" + pedido.getId()
                + ", pago=" + pago.getId()
                + ", factura=" + factura.getId()
                + ", envio=" + envio.getId());

        return 0;
    }

}