package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.CheckDataMovementRequestDomainRepository;
import com.probestack.forgestudio.design.model.CheckDataMovementRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.CheckDataMovementRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.CheckDataMovementRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CheckDataMovementRequestMongoPersistenceAdapter implements CheckDataMovementRequestDomainRepository {
    private final CheckDataMovementRequestMongoRepository repository;

    public CheckDataMovementRequestMongoPersistenceAdapter(
            CheckDataMovementRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CheckDataMovementRequest save(CheckDataMovementRequest checkDataMovementRequest) {
        CheckDataMovementRequestDocument document = toDocument(checkDataMovementRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<CheckDataMovementRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<CheckDataMovementRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private CheckDataMovementRequestDocument toDocument(
            CheckDataMovementRequest checkDataMovementRequest) {
        CheckDataMovementRequestDocument document = new CheckDataMovementRequestDocument();
        BeanUtils.copyProperties(checkDataMovementRequest, document);
        return document;
    }

    private CheckDataMovementRequest toDomain(CheckDataMovementRequestDocument document) {
        CheckDataMovementRequest domain = new CheckDataMovementRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
