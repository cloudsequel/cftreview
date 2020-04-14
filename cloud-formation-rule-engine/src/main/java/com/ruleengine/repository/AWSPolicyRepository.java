package com.ruleengine.repository;

import com.ruleengine.model.AwsPolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AWSPolicyRepository extends CrudRepository<AwsPolicy, Integer> {
}
