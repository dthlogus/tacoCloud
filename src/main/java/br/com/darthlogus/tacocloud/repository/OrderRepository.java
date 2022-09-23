package br.com.darthlogus.tacocloud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.darthlogus.tacocloud.model.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
