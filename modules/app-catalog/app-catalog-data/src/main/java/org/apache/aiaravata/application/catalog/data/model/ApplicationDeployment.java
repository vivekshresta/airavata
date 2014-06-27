/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.aiaravata.application.catalog.data.model;

import javax.persistence.*;

@Entity
@Table(name = "APPLICATION_DEPLOYMENT")
public class ApplicationDeployment {
    @Id
    @Column(name = "DEPLOYMENT_ID")
    private String deployementID;
    @Column(name = "APP_MODULE_ID")
    private String appModuleID;
    @Column(name = "COMPUTE_HOST_ID")
    private String hostID;
    @Column(name = "EXECUTABLE_PATH")
    private String executablePath;
    @Column(name = "APPLICATION_DESC")
    private String applicationDesc;
    @Column(name = "APPLICATION_VERSION")
    private String applicationVersion;
    @Column(name = "MODULE_LOAD_STRING")
    private String moduleLoadString;
    @Column(name = "ENV_MODULE_LOAD_CMD")
    private String envModuleLoaString;

    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name = "APP_MODULE_ID")
    private ApplicationModule applicationModule;

    public String getDeployementID() {
        return deployementID;
    }

    public void setDeployementID(String deployementID) {
        this.deployementID = deployementID;
    }

    public String getAppModuleID() {
        return appModuleID;
    }

    public void setAppModuleID(String appModuleID) {
        this.appModuleID = appModuleID;
    }

    public String getHostID() {
        return hostID;
    }

    public void setHostID(String hostID) {
        this.hostID = hostID;
    }

    public String getExecutablePath() {
        return executablePath;
    }

    public void setExecutablePath(String executablePath) {
        this.executablePath = executablePath;
    }

    public String getApplicationDesc() {
        return applicationDesc;
    }

    public void setApplicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc;
    }

    public String getApplicationVersion() {
        return applicationVersion;
    }

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    public String getModuleLoadString() {
        return moduleLoadString;
    }

    public void setModuleLoadString(String moduleLoadString) {
        this.moduleLoadString = moduleLoadString;
    }

    public String getEnvModuleLoaString() {
        return envModuleLoaString;
    }

    public void setEnvModuleLoaString(String envModuleLoaString) {
        this.envModuleLoaString = envModuleLoaString;
    }

    public ApplicationModule getApplicationModule() {
        return applicationModule;
    }

    public void setApplicationModule(ApplicationModule applicationModule) {
        this.applicationModule = applicationModule;
    }
}
