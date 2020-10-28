/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.baccan.iotaclient;

import lombok.extern.slf4j.Slf4j;
import org.iota.jota.IotaAPI;
import org.iota.jota.dto.response.GetNodeInfoResponse;

/**
 *
 * @author Matteo Baccan <matteo@baccan.it>
 */
@Slf4j
public class IotaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start test
        log.info("Start");

        // Connect to DEV IOTA node
        IotaAPI api = new IotaAPI.Builder()
                .protocol("https")
                .host("nodes.devnet.iota.org")
                .port(443)
                .build();

        // Get Node info
        GetNodeInfoResponse response = api.getNodeInfo();

        // Log Info
        log.info("[{}]", response);

        // Enf
        log.info("End");
    }

}
