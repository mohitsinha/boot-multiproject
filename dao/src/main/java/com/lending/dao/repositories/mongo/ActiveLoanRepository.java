package com.lending.dao.repositories.mongo;

import com.lending.dao.models.mongo.ActiveLoan;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ActiveLoanRepository extends ReactiveMongoRepository<ActiveLoan, ObjectId> {
}
