package cz.microshop.shipping.service;

import cz.microshop.shipping.model.Shipping;
import cz.microshop.shipping.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingService {

    @Autowired
    private ShippingRepository shippingRepository;

    public List<Shipping> findAll() {
        return shippingRepository.findAll();
    }

    public Shipping findByName(String name) {
        return shippingRepository.findByName(name);
    }
}
