package ky.edu.uce.pa.grupo.u2;

import java.time.LocalDateTime;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import ky.edu.uce.pa.grupo.u2.pedidos.application.PedidoService;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

@QuarkusMain 
public class Main implements QuarkusApplication {


    @Inject 
    private PedidoService pedidoService;
    
    public static void main(String... args) {
        Quarkus.run(Main.class, args);
    }


    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello from Quarkus!");
        
        //Create

        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba");
        pedido.setPrecio(100.0);
        pedido.setFecha(LocalDateTime.now());

        this.pedidoService.guardar(pedido);

        //Read
        Pedido pedido2 = this.pedidoService.buscarPorId(3);
        System.out.println("Pedido encontrado: " + pedido2); 
        

        //Update
        System.out.println("Actualizando pedido...");
        pedido2.setPrecio(150.0);
        pedido2.setProducto("Producto actualizado");

        Pedido pedido3 = this.pedidoService.buscarPorId(1);
        System.out.println("Pedido actualizado: " + pedido3);

        //Delete
        this.pedidoService.eliminar(3);

        return 0;

    }


    
}
