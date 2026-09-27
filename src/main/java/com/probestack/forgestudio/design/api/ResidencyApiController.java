package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CheckDataMovementRequest;
import com.probestack.forgestudio.design.model.DefineResidencyPolicyRequest;
import com.probestack.forgestudio.design.model.GenerateAuditEvidenceRequest;
import com.probestack.forgestudio.design.model.MovementDecision;
import com.probestack.forgestudio.design.model.ResidencyEvidence;
import com.probestack.forgestudio.design.model.ResidencyMap;
import com.probestack.forgestudio.design.model.ResidencyPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ResidencyService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")
@Controller
@RequestMapping("${openapi.dataResidencyGuard.base-path:/v1}")
public class ResidencyApiController implements ResidencyApi {

    private static final Logger log = LoggerFactory.getLogger(ResidencyApiController.class);

    private final ResidencyService residencyService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ResidencyApiController(ResidencyService residencyService, GeneratedRequestValidator generatedRequestValidator) {
        this.residencyService = residencyService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<MovementDecision> checkDataMovement(@RequestBody() CheckDataMovementRequest checkDataMovementRequest) {
        log.info("Processing checkDataMovement request");
        try {
            generatedRequestValidator.validate("checkDataMovement", checkDataMovementRequest);
            var response = residencyService.checkDataMovement(checkDataMovementRequest);
            log.info("checkDataMovement completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process checkDataMovement: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<ResidencyPolicy> defineResidencyPolicy(@RequestBody() DefineResidencyPolicyRequest defineResidencyPolicyRequest) {
        log.info("Processing defineResidencyPolicy request");
        try {
            generatedRequestValidator.validate("defineResidencyPolicy", defineResidencyPolicyRequest);
            var response = residencyService.defineResidencyPolicy(defineResidencyPolicyRequest);
            log.info("defineResidencyPolicy completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process defineResidencyPolicy: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<ResidencyEvidence> generateAuditEvidence(@RequestBody() GenerateAuditEvidenceRequest generateAuditEvidenceRequest) {
        log.info("Processing generateAuditEvidence request");
        try {
            generatedRequestValidator.validate("generateAuditEvidence", generateAuditEvidenceRequest);
            var response = residencyService.generateAuditEvidence(generateAuditEvidenceRequest);
            log.info("generateAuditEvidence completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process generateAuditEvidence: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<ResidencyMap> getResidencyMap(@RequestParam(value = "dataClassification", required = false) String dataClassification, @RequestParam(value = "includeViolations", required = false, defaultValue = "true") Boolean includeViolations, @RequestParam(value = "framework", required = false) String framework) {
        log.info("Processing getResidencyMap request");
        try {
            var response = residencyService.getResidencyMap(dataClassification, includeViolations, framework);
            log.info("getResidencyMap completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getResidencyMap: {}", e.getMessage(), e);
            throw e;
        }
    }
}
