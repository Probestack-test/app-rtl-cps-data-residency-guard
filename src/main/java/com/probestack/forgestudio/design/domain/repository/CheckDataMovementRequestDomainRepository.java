package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.CheckDataMovementRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for CheckDataMovementRequest domain operations.
 */
public interface CheckDataMovementRequestDomainRepository {
    CheckDataMovementRequest save(CheckDataMovementRequest checkDataMovementRequest);

    Optional<CheckDataMovementRequest> findById(String id);

    List<CheckDataMovementRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
