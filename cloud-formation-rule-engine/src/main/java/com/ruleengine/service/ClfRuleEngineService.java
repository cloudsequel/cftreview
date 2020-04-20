package com.ruleengine.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruleengine.model.AwsPolicy;
import com.ruleengine.model.ScriptPolicy;

import java.util.List;

public interface ClfRuleEngineService {

    List<String> validateClfScript(ScriptPolicy scriptPolicy, String fileName) throws JsonProcessingException;

    List<AwsPolicy> findAllScripts();
}
