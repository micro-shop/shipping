package cz.microshop.shipping.controller;

import cz.microshop.shipping.model.Shipping;
import cz.microshop.shipping.service.ShippingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    ShippingService shippingService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<ArrayList<Shipping>> findAll()   {
        return new ResponseEntity<>((ArrayList<Shipping>) shippingService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Shipping> find(@RequestParam String name)   {
        return new ResponseEntity<>(shippingService.findByName(name), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Shipping> save(@RequestBody Shipping shipping)   {
        return new ResponseEntity<>(shippingService.save(shipping), HttpStatus.OK);
    }
}
