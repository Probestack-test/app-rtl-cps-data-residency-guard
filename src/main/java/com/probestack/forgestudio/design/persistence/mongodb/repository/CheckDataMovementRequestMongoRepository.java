package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.CheckDataMovementRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for CheckDataMovementRequest documents.
 */
public interface CheckDataMovementRequestMongoRepository extends MongoRepository<CheckDataMovementRequestDocument, String> {
}
