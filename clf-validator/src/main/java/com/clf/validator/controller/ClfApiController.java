package com.clf.validator.controller;

import com.clf.validator.model.S3Bucket;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clf/validate")
public class ClfApiController {

    @PostMapping("entity")
    public ResponseEntity<S3Bucket> fetchSearchResults(S3Bucket s3Bucket) {
        return new ResponseEntity<>(s3Bucket, HttpStatus.OK);
    }

}
