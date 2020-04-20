package com.ruleengine.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruleengine.model.AwsPolicy;
import com.ruleengine.model.ScriptPolicy;
import com.ruleengine.service.ClfRuleEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clf")
public class ClfRuleEngineController {

    @Autowired
    private ClfRuleEngineService clfRuleEngineService;

    @PostMapping(value = "/validate")
    public ResponseEntity<List<String>> validateClfScript(@RequestBody ScriptPolicy scriptPolicy,
                                                          @RequestParam(name = "fileName") final String fileName) throws JsonProcessingException {
        return new ResponseEntity<>(clfRuleEngineService.validateClfScript(scriptPolicy, fileName), HttpStatus.OK);
    }

    @GetMapping(value = "/getAllScripts")
    public ResponseEntity<List<AwsPolicy>> getAllClfScript() {
        return new ResponseEntity<>(clfRuleEngineService.findAllScripts(), HttpStatus.OK);
    }
}
