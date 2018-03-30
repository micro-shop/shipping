package cz.microshop.shipping.repository;

import cz.microshop.shipping.model.Shipping;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface ShippingRepository extends MongoRepository<Shipping, Long> {

    Shipping findByName(String name);
}
