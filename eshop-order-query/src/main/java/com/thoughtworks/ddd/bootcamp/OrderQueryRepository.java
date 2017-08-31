package com.thoughtworks.ddd.bootcamp;

import com.thoughtworks.domain.model.OrderView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderQueryRepository extends CrudRepository<OrderView, String> {
}
