package io.liqiangz.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Netty application.
 * @author liqiangz
 */
@SpringBootApplication
public class NettyApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NettyApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        EchoServer echoServer = new EchoServer(8080);
        echoServer.start();
    }
}
