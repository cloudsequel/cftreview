package com.ruleengine.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruleengine.model.AwsPolicy;
import com.ruleengine.model.S3BucketPolicy;
import com.ruleengine.service.ClfRuleEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clf")
public class ClfRuleEngineController {

    @Autowired
    private ClfRuleEngineService clfRuleEngineService;

    @RequestMapping(method = RequestMethod.POST, value = "/validate")
    public ResponseEntity<List<String>> validateClfScript(@RequestBody S3BucketPolicy s3BucketPolicy) throws JsonProcessingException {
        return new ResponseEntity<>(clfRuleEngineService.validateClfScript(s3BucketPolicy), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAllScripts")
    public ResponseEntity<List<AwsPolicy>> getAllClfScript() {
        return new ResponseEntity<>(clfRuleEngineService.findAllScripts(), HttpStatus.OK);
    }
}
