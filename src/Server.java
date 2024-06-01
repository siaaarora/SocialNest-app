import java.io.IOException;

/**
 * Server
 *
 * The main server class that controls all the client connections.
 */

public class Server extends Thread {
    public static void main(String[] args) throws IOException {

        int port = 4242;
        ServerInitializer serverInitializer = new ServerInitializer(port);
        serverInitializer.start();

        if (Welcome.logout) {
            return;
        }
    }
}
