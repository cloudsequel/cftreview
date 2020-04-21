package com.ruleengine.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruleengine.model.AwsPolicy;
import com.ruleengine.model.ScriptPolicy;
import com.ruleengine.repository.AWSPolicyRepository;
import com.ruleengine.service.ClfRuleEngineService;
import com.ruleengine.util.JsonUtil;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ClfRuleEngineServiceImpl implements ClfRuleEngineService {

    @Autowired
    private AWSPolicyRepository awsPolicyRepository;

    @Autowired
    private KieSession session;

    public List<String> validateClfScript(ScriptPolicy scriptPolicy, String fileName) throws JsonProcessingException {
        awsPolicyRepository.save(new AwsPolicy("S3Bucket", JsonUtil.convertObjectToJson(scriptPolicy), fileName, new Date()));
        List<String> errorMessages = new ArrayList();
        session.insert(scriptPolicy);
        session.setGlobal("globalVar", errorMessages);
        session.fireAllRules();
        return errorMessages;
    }

    public List<AwsPolicy> findAllScripts() {
        return (List<AwsPolicy>) awsPolicyRepository.findAll();
    }
}