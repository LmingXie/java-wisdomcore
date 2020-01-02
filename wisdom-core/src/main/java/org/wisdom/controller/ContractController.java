package org.wisdom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wisdom.ApiResult.APIResult;
import org.wisdom.keystore.wallet.KeystoreAction;
import org.wisdom.service.ContractService;

@RestController
public class ContractController {

    @Autowired
    ContractService contractService;

    @RequestMapping(method = RequestMethod.GET, value = "/ParseContractTx")
    public Object ParseContractTx(@RequestParam(value = "txhash") String txhash) {
        if (txhash.equals("") || txhash == "") {
            return APIResult.newFailed("The transaction hash cannot be null");
        }
        return contractService.getParseContractTx(txhash.trim());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/RLPContractTx")
    public Object getRLPContractTx(@RequestParam(value = "txhash") String txhash) {
        if (txhash.equals("") || txhash == "") {
            return APIResult.newFailed("The transaction hash cannot be null");
        }
        return contractService.getRLPContractTx(txhash.trim());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ParseContractAddress")
    public Object ParseContractAddress(@RequestParam(value = "address") String address) {
        if(KeystoreAction.verifyAddress(address)!=0){
            return APIResult.newFailed("Invalid address");
        }
        return contractService.getParseContractAddress(KeystoreAction.addressToPubkeyHash(address));
    }
}