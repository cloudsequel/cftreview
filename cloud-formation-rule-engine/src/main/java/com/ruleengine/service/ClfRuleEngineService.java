package com.ruleengine.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruleengine.model.AwsPolicy;
import com.ruleengine.model.S3BucketPolicy;
import com.ruleengine.repository.AWSPolicyRepository;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class ClfRuleEngineService {

    @Autowired
    private AWSPolicyRepository awsPolicyRepository;

    @Autowired
    private KieSession session;

    public S3BucketPolicy validateClfScript(S3BucketPolicy s3BucketPolicy) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(s3BucketPolicy);
        awsPolicyRepository.save(new AwsPolicy("S3Bucket", jsonStr, new Date()));

        session.insert(s3BucketPolicy);
        session.setGlobal("globalVar", new ArrayList());
        session.fireAllRules();
        return s3BucketPolicy;
    }

}
