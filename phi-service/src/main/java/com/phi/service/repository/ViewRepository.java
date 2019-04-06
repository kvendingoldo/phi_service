package com.phi.service.repository;

import com.phi.service.model.View;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ViewRepository extends MongoRepository<View, String> {

}
