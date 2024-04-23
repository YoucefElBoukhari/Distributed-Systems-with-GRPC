package ma.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.grpc.service.BankGrpcservice;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(5555)
                .addService(new BankGrpcservice())
                .build();
        server.start();
        server.awaitTermination();
    }
}
