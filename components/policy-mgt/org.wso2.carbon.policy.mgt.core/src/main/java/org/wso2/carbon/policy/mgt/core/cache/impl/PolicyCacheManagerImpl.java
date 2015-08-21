/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.wso2.carbon.policy.mgt.core.cache.impl;

import org.wso2.carbon.device.mgt.core.policy.mgt.policy.Policy;
import org.wso2.carbon.policy.mgt.core.cache.PolicyCacheManager;

import java.util.List;

public class PolicyCacheManagerImpl implements PolicyCacheManager {

    @Override
    public void addAllPolicies(List<Policy> policies) {

    }

    @Override
    public void updateAllPolicies(List<Policy> policies) {

    }

    @Override
    public List<Policy> getAllPolicies() {
        return null;
    }

    @Override
    public void removeAllPolicies() {

    }

    @Override
    public void addPolicy(Policy policy) {

    }

    @Override
    public void updatePolicy(Policy policy) {

    }

    @Override
    public void removePolicy(int policyId) {

    }

    @Override
    public Policy getPolicy(int policyId) {
        return null;
    }

    @Override
    public void addPolicyToDevice(int deviceId, int policyId) {

    }

    @Override
    public List<Integer> getPolicyAppliedDeviceIds(int policyId) {
        return null;
    }

    @Override
    public int getPolicyIdOfDevice(int deviceId) {
        return 0;
    }
}
