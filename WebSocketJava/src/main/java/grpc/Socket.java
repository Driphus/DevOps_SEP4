package grpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Socket {


    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

        //WebsocketClient client = new WebsocketClient("wss://iotnet.teracom.dk/app?token=vnoVQQAAABFpb3RuZXQudGVyYWNvbS5ka44TEFZ6iw5hEImHN64AWw0=");
        Server server = ServerBuilder.forPort(4242).addService(new SocketImpl()).build();
        server.start();
        server.awaitTermination();

    }
}