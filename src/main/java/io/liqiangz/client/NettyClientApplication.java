package io.liqiangz.client;

import io.liqiangz.server.EchoServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Netty application.
 * @author liqiangz
 */
@SpringBootApplication
public class NettyClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NettyClientApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        EchoClient echoServer = new EchoClient("127.0.0.1",8080);
        echoServer.start();
    }
}
