package org.wisdom.p2p.test;

import org.wisdom.p2p.MessageFilter;
import org.wisdom.p2p.MessageLogger;
import org.wisdom.p2p.PeerServer;
import org.wisdom.p2p.PeersManager;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception{
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        PeersManager manager = new PeersManager();
        MessageFilter filter = new MessageFilter();
        String[] bootstraps = new String[]{};
        if(System.getenv().containsKey("BOOTSTRAPS")){
            bootstraps = System.getenv().get("BOOTSTRAPS").split(" ");
        }
        String[] trusted = new String[]{};
        if(System.getenv().containsKey("TRUSTED_PEERS")){
            bootstraps = System.getenv().get("TRUSTED_PEERS").split(" ");
        }
        PeerServer server = new PeerServer(System.getenv("P2P_ADDRESS"), bootstraps, trusted);
        server.use(filter).use(new MessageLogger()).use(manager);
        service.scheduleAtFixedRate(server::startHalf, 0, 5, TimeUnit.SECONDS);
        server.startListening();
    }
}