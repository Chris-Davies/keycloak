/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.keycloak.storage.federated;

import org.keycloak.models.FederatedIdentityModel;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

import java.util.Set;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface UserBrokerLinkFederatedStorage {
    String getUserByFederatedIdentity(FederatedIdentityModel socialLink, RealmModel realm);
    public void addFederatedIdentity(RealmModel realm, UserModel user, FederatedIdentityModel socialLink);
    public boolean removeFederatedIdentity(RealmModel realm, UserModel user, String socialProvider);
    void updateFederatedIdentity(RealmModel realm, UserModel federatedUser, FederatedIdentityModel federatedIdentityModel);
    Set<FederatedIdentityModel> getFederatedIdentities(UserModel user, RealmModel realm);
    FederatedIdentityModel getFederatedIdentity(UserModel user, String socialProvider, RealmModel realm);
}
