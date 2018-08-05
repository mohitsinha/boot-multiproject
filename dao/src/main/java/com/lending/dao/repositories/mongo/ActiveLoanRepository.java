package com.lending.dao.repositories.mongo;

import com.lending.dao.models.mongo.ActiveLoan;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.UUID;

public interface ActiveLoanRepository extends ReactiveMongoRepository<ActiveLoan, UUID> {
}
