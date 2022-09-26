package br.com.darthlogus.tacocloud.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import br.com.darthlogus.tacocloud.model.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
