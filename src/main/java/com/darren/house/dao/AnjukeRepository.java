package com.darren.house.dao;

import com.darren.house.domain.Anjuke;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnjukeRepository extends MongoRepository<Anjuke, String> {
}
