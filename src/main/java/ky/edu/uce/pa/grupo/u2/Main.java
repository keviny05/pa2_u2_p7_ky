package ky.edu.uce.pa.grupo.u2;


import java.util.Optional;

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

        Optional<Pedido> pedido = pedidoService.buscarPorId(3);

        if( pedido.isPresent()){
            System.out.println("Pedido encontrado: " + pedido);
        }

        //Read by number
        Optional<Pedido> pedido2 = pedidoService.buscarPorNumero("3");

        if( pedido.isPresent()){
            System.out.println("Pedido encontrado por numero: " + pedido2.get());
        } else{
            System.out.println("Pedido no encontrado por numero");
        }


        return 0;

    }


    
}
