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

CREATE TABLE GATEWAY
(
        GATEWAY_ID VARCHAR(255),
        GATEWAY_NAME VARCHAR(255),
	      DOMAIN VARCHAR(255),
	      EMAIL_ADDRESS VARCHAR(255),
        GATEWAY_ACRONYM varchar(255),
        GATEWAY_ADMIN_EMAIL varchar(255),
        GATEWAY_ADMIN_FIRST_NAME varchar(255),
        GATEWAY_APPROVAL_STATUS varchar(255),
        GATEWAY_PUBLIC_ABSTRACT varchar(255),
        GATEWAY_URL varchar(255),
        GATEWAY_ADMIN_LAST_NAME varchar(255),
        IDENTITY_SERVER_PASSWORD_TOKEN varchar(255),
        IDENTITY_SERVER_USERNAME varchar(255),
        GATEWAY_REVIEW_PROPOSAL_DESCRIPTION varchar(255),
        DECLINED_REASON varchar(255),
        OAUTH_CLIENT_SECRET varchar(255),
        OAUTH_CLIENT_ID varchar(255),
        REQUEST_CREATION_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        REQUESTER_USERNAME VARCHAR(255),
        PRIMARY KEY (GATEWAY_ID)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE NOTIFICATION
(
        NOTIFICATION_ID VARCHAR(255) NOT NULL,
        GATEWAY_ID VARCHAR(255),
        TITLE VARCHAR(255),
        PRIORITY VARCHAR(255),
        NOTIFICATION_MESSAGE VARCHAR(4096) NOT NULL,
        PUBLISHED_DATE TIMESTAMP,
        EXPIRATION_DATE TIMESTAMP,
        CREATION_DATE TIMESTAMP,
        PRIMARY KEY (NOTIFICATION_ID)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE USERS
(
        AIRAVATA_INTERNAL_USER_ID VARCHAR(255) NOT NULL,
        USER_NAME VARCHAR(255),
        PASSWORD VARCHAR(255),
        GATEWAY_ID VARCHAR(255) NOT NULL,
        PRIMARY KEY (GATEWAY_ID, USER_NAME),
        FOREIGN KEY (GATEWAY_ID) REFERENCES GATEWAY(GATEWAY_ID) ON DELETE CASCADE,
        UNIQUE (AIRAVATA_INTERNAL_USER_ID)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE GATEWAY_WORKER
(
        GATEWAY_ID VARCHAR(255) NOT NULL,
        USER_NAME VARCHAR(255),
        PRIMARY KEY (GATEWAY_ID, USER_NAME),
        FOREIGN KEY (GATEWAY_ID) REFERENCES GATEWAY(GATEWAY_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE PROJECT
(
        GATEWAY_ID VARCHAR(255) NOT NULL,
        USER_NAME VARCHAR(255),
        PROJECT_NAME VARCHAR(255),
        PROJECT_ID VARCHAR(255),
        DESCRIPTION VARCHAR(255),
        CREATION_TIME TIMESTAMP DEFAULT NOW(),
        PRIMARY KEY (PROJECT_ID),
        FOREIGN KEY (GATEWAY_ID) REFERENCES GATEWAY(GATEWAY_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE PROJECT_USER
(
        PROJECT_ID VARCHAR(255) NOT NULL,
        USER_NAME VARCHAR(255) NOT NULL,
        PRIMARY KEY (PROJECT_ID,USER_NAME),
        FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT(PROJECT_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE EXPERIMENT (
        EXPERIMENT_ID varchar(255),
        PROJECT_ID varchar(255) NOT NULL,
        GATEWAY_ID varchar(255),
        EXPERIMENT_TYPE varchar(255),
        USER_NAME varchar(255),
        EXPERIMENT_NAME varchar(255),
        CREATION_TIME timestamp DEFAULT NOW(),
        DESCRIPTION varchar(255),
        EXECUTION_ID varchar(255),
        GATEWAY_EXECUTION_ID varchar(255),
        GATEWAY_INSTANCE_ID varchar(255),
        ENABLE_EMAIL_NOTIFICATION tinyint(1),
        EMAIL_ADDRESSES text,
        PRIMARY KEY (EXPERIMENT_ID),
        FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT(PROJECT_ID) ON DELETE CASCADE,
        EXPERIMENT_DATA_DIR_SIZE BIGINT DEFAULT 0
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE EXPERIMENT_INPUT
(
        EXPERIMENT_ID varchar(255) NOT NULL,
        INPUT_NAME varchar(255),
        INPUT_VALUE text,
        DATA_TYPE varchar(255),
        APPLICATION_ARGUMENT varchar(255),
        STANDARD_INPUT tinyint(1),
        USER_FRIENDLY_DESCRIPTION varchar(255),
        METADATA varchar(4096),
        INPUT_ORDER int(11),
        IS_REQUIRED tinyint(1),
        REQUIRED_TO_ADDED_TO_CMD tinyint(1),
        DATA_STAGED tinyint(1),
        STORAGE_RESOURCE_ID varchar(255),
        IS_READ_ONLY tinyint(1),
        OVERRIDE_FILENAME VARCHAR(255),
        PRIMARY KEY(EXPERIMENT_ID,INPUT_NAME),
        FOREIGN KEY (EXPERIMENT_ID) REFERENCES EXPERIMENT(EXPERIMENT_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE EXPERIMENT_OUTPUT
(
        EXPERIMENT_ID varchar(255) NOT NULL,
        OUTPUT_NAME varchar(255),
        OUTPUT_VALUE text,
        DATA_TYPE varchar(255),
        APPLICATION_ARGUMENT varchar(255),
        IS_REQUIRED tinyint(1),
        REQUIRED_TO_ADDED_TO_CMD tinyint(1),
        DATA_MOVEMENT tinyint(1),
        LOCATION varchar(255),
        SEARCH_QUERY varchar(255),
        OUTPUT_STREAMING SMALLINT,
        STORAGE_RESOURCE_ID varchar(255),
        METADATA varchar(4096),
        PRIMARY KEY(EXPERIMENT_ID,OUTPUT_NAME),
        FOREIGN KEY (EXPERIMENT_ID) REFERENCES EXPERIMENT(EXPERIMENT_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE EXPERIMENT_STATUS (
        STATUS_ID varchar(255),
        EXPERIMENT_ID varchar(255) NOT NULL,
        STATE varchar(255),
        TIME_OF_STATE_CHANGE TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
        REASON LONGTEXT,
        PRIMARY KEY (STATUS_ID, EXPERIMENT_ID),
        FOREIGN KEY (EXPERIMENT_ID) REFERENCES EXPERIMENT(EXPERIMENT_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE EXPERIMENT_ERROR (
        ERROR_ID varchar(255),
        EXPERIMENT_ID varchar(255) NOT NULL,
        CREATION_TIME timestamp DEFAULT NOW(),
        ACTUAL_ERROR_MESSAGE text,
        USER_FRIENDLY_MESSAGE text,
        TRANSIENT_OR_PERSISTENT tinyint(1),
        ROOT_CAUSE_ERROR_ID_LIST text,
        PRIMARY KEY (ERROR_ID, EXPERIMENT_ID),
        FOREIGN KEY (EXPERIMENT_ID) REFERENCES EXPERIMENT(EXPERIMENT_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE USER_CONFIGURATION_DATA (
        EXPERIMENT_ID varchar(255) NOT NULL,
        AIRAVATA_AUTO_SCHEDULE tinyint(1),
        OVERRIDE_MANUAL_SCHEDULED_PARAMS tinyint(1),
        SHARE_EXPERIMENT_PUBLICALLY tinyint(1),
        THROTTLE_RESOURCES tinyint(1),
        USER_DN varchar(255),
        GENERATE_CERT tinyint(1),
        RESOURCE_HOST_ID varchar(255),
        TOTAL_CPU_COUNT int(11),
        NODE_COUNT int(11),
        NUMBER_OF_THREADS int(11),
        QUEUE_NAME varchar(255),
        WALL_TIME_LIMIT int(11),
        TOTAL_PHYSICAL_MEMORY int(11),
        STATIC_WORKING_DIR varchar(255),
        OVERRIDE_LOGIN_USER_NAME varchar(255),
        OVERRIDE_SCRATCH_LOCATION varchar(255),
        OVERRIDE_ALLOCATION_PROJECT_NUMBER varchar(255),
        STORAGE_RESOURCE_ID varchar(255),
        EXPERIMENT_DATA_DIR VARCHAR (512),
        GROUP_RESOURCE_PROFILE_ID VARCHAR(255) DEFAULT NULL,
        IS_USE_USER_CR_PREF TINYINT(1),
        PRIMARY KEY (EXPERIMENT_ID),
        FOREIGN KEY (EXPERIMENT_ID) REFERENCES EXPERIMENT(EXPERIMENT_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE VIEW LATEST_EXPERIMENT_STATUS AS
  select ES1.EXPERIMENT_ID AS EXPERIMENT_ID, ES1.STATE AS STATE, ES1.TIME_OF_STATE_CHANGE AS TIME_OF_STATE_CHANGE
  from EXPERIMENT_STATUS ES1 LEFT JOIN EXPERIMENT_STATUS ES2 ON (ES1.EXPERIMENT_ID = ES2.EXPERIMENT_ID
    AND ES1.TIME_OF_STATE_CHANGE < ES2.TIME_OF_STATE_CHANGE)  WHERE ES2.TIME_OF_STATE_CHANGE is NULL;

CREATE VIEW EXPERIMENT_SUMMARY AS
  select E.EXPERIMENT_ID AS EXPERIMENT_ID, E.PROJECT_ID AS PROJECT_ID, E.GATEWAY_ID AS GATEWAY_ID,
  E.USER_NAME AS USER_NAME, E.EXECUTION_ID AS EXECUTION_ID, E.EXPERIMENT_NAME AS EXPERIMENT_NAME,
  E.CREATION_TIME AS CREATION_TIME, E.DESCRIPTION AS DESCRIPTION, ES.STATE AS STATE, UD.RESOURCE_HOST_ID
  AS RESOURCE_HOST_ID, ES.TIME_OF_STATE_CHANGE AS TIME_OF_STATE_CHANGE
    from ((EXPERIMENT E left join LATEST_EXPERIMENT_STATUS ES on((E.EXPERIMENT_ID = ES.EXPERIMENT_ID)))
    left join USER_CONFIGURATION_DATA UD on((E.EXPERIMENT_ID = UD.EXPERIMENT_ID))) where 1;


CREATE TABLE PROCESS (
        PROCESS_ID varchar(255),
        EXPERIMENT_ID varchar(255) NOT NULL,
        CREATION_TIME  TIMESTAMP DEFAULT NOW(),
        LAST_UPDATE_TIME TIMESTAMP DEFAULT '0000-00-00 00:00:00',
        PROCESS_DETAIL text,
        APPLICATION_INTERFACE_ID varchar(255),
        TASK_DAG TEXT,
        APPLICATION_DEPLOYMENT_ID varchar(255),
        COMPUTE_RESOURCE_ID varchar(255),
        GATEWAY_EXECUTION_ID varchar(255),
        ENABLE_EMAIL_NOTIFICATION BOOLEAN,
        EMAIL_ADDRESSES TEXT,
        STORAGE_RESOURCE_ID varchar(255),
        USER_DN varchar(255),
        GENERATE_CERT SMALLINT,
        EXPERIMENT_DATA_DIR VARCHAR (512),
        USERNAME VARCHAR (255),
        GROUP_RESOURCE_PROFILE_ID VARCHAR (255) DEFAULT NULL,
        USE_USER_CR_PREF TINYINT(1),
        PRIMARY KEY (PROCESS_ID),
        FOREIGN KEY (EXPERIMENT_ID) REFERENCES EXPERIMENT(EXPERIMENT_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE PROCESS_INPUT
(
        PROCESS_ID varchar(255) NOT NULL,
        INPUT_NAME varchar(255),
        INPUT_VALUE text,
        DATA_TYPE varchar(255),
        APPLICATION_ARGUMENT varchar(255),
        STANDARD_INPUT tinyint(1),
        USER_FRIENDLY_DESCRIPTION varchar(255),
        METADATA varchar(4096),
        INPUT_ORDER int(11),
        IS_REQUIRED tinyint(1),
        REQUIRED_TO_ADDED_TO_CMD tinyint(1),
        DATA_STAGED tinyint(1),
        STORAGE_RESOURCE_ID varchar(255),
        IS_READ_ONLY tinyint(1),
        OVERRIDE_FILENAME VARCHAR(255),
        PRIMARY KEY(PROCESS_ID,INPUT_NAME),
        FOREIGN KEY (PROCESS_ID) REFERENCES PROCESS(PROCESS_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE PROCESS_OUTPUT
(
        PROCESS_ID varchar(255) NOT NULL,
        OUTPUT_NAME varchar(255),
        OUTPUT_VALUE LONGTEXT,
        DATA_TYPE varchar(255),
        APPLICATION_ARGUMENT varchar(255),
        IS_REQUIRED tinyint(1),
        REQUIRED_TO_ADDED_TO_CMD tinyint(1),
        DATA_MOVEMENT tinyint(1),
        LOCATION varchar(255),
        SEARCH_QUERY varchar(255),
        OUTPUT_STREAMING SMALLINT,
        STORAGE_RESOURCE_ID varchar(255),
        METADATA varchar(4096),
        PRIMARY KEY(PROCESS_ID,OUTPUT_NAME),
        FOREIGN KEY (PROCESS_ID) REFERENCES PROCESS(PROCESS_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE PROCESS_STATUS (
        STATUS_ID varchar(255),
        PROCESS_ID varchar(255) NOT NULL,
        STATE varchar(255),
        TIME_OF_STATE_CHANGE TIMESTAMP(6) DEFAULT NOW(6) ON UPDATE NOW(6),
        REASON LONGTEXT,
        PRIMARY KEY (STATUS_ID, PROCESS_ID),
        FOREIGN KEY (PROCESS_ID) REFERENCES PROCESS(PROCESS_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE PROCESS_ERROR (
        ERROR_ID varchar(255),
        PROCESS_ID varchar(255) NOT NULL,
        CREATION_TIME timestamp DEFAULT NOW(),
        ACTUAL_ERROR_MESSAGE text,
        USER_FRIENDLY_MESSAGE text,
        TRANSIENT_OR_PERSISTENT tinyint(1),
        ROOT_CAUSE_ERROR_ID_LIST text,
        PRIMARY KEY (ERROR_ID, PROCESS_ID),
        FOREIGN KEY (PROCESS_ID) REFERENCES PROCESS(PROCESS_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE PROCESS_RESOURCE_SCHEDULE (
        PROCESS_ID varchar(255) NOT NULL,
        RESOURCE_HOST_ID varchar(255),
        TOTAL_CPU_COUNT int(11),
        NODE_COUNT int(11),
        NUMBER_OF_THREADS int(11),
        QUEUE_NAME varchar(255),
        WALL_TIME_LIMIT int(11),
        TOTAL_PHYSICAL_MEMORY int(11),
        STATIC_WORKING_DIR varchar(255),
        OVERRIDE_ALLOCATION_PROJECT_NUMBER varchar(255),
        OVERRIDE_LOGIN_USER_NAME varchar(255),
        OVERRIDE_SCRATCH_LOCATION varchar(255),
        PRIMARY KEY (PROCESS_ID),
        FOREIGN KEY (PROCESS_ID) REFERENCES PROCESS(PROCESS_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE TASK (
  TASK_ID varchar(255),
  TASK_TYPE varchar(255),
  PARENT_PROCESS_ID varchar(255) NOT NULL,
  CREATION_TIME timestamp DEFAULT NOW(),
  LAST_UPDATE_TIME TIMESTAMP DEFAULT '0000-00-00 00:00:00',
  TASK_DETAIL text,
  SUB_TASK_MODEL BLOB,
  MAX_RETRY int(11) NOT NULL DEFAULT '3',
  CURRENT_RETRY int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (TASK_ID),
  FOREIGN KEY (PARENT_PROCESS_ID) REFERENCES PROCESS(PROCESS_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE TASK_STATUS (
        STATUS_ID varchar(255),
        TASK_ID varchar(255) NOT NULL,
        STATE varchar(255),
        TIME_OF_STATE_CHANGE TIMESTAMP(6) DEFAULT NOW(6) ON UPDATE NOW(6),
        REASON LONGTEXT,
        PRIMARY KEY (STATUS_ID, TASK_ID),
        FOREIGN KEY (TASK_ID) REFERENCES TASK(TASK_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE TASK_ERROR (
        ERROR_ID varchar(255),
        TASK_ID varchar(255) NOT NULL,
        CREATION_TIME timestamp DEFAULT NOW(),
        ACTUAL_ERROR_MESSAGE text,
        USER_FRIENDLY_MESSAGE text,
        TRANSIENT_OR_PERSISTENT tinyint(1),
        ROOT_CAUSE_ERROR_ID_LIST text,
        PRIMARY KEY (ERROR_ID, TASK_ID),
        FOREIGN KEY (TASK_ID) REFERENCES TASK(TASK_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE JOB (
        JOB_ID varchar(255),
        TASK_ID varchar(255) NOT NULL,
        PROCESS_ID varchar(255),
        JOB_DESCRIPTION LONGTEXT NOT NULL,
        CREATION_TIME timestamp DEFAULT NOW(),
        COMPUTE_RESOURCE_CONSUMED varchar(255),
        JOB_NAME varchar(255),
        WORKING_DIR varchar(255),
        STD_OUT LONGTEXT,
        STD_ERR LONGTEXT,
        EXIT_CODE INT(11),
        PRIMARY KEY (JOB_ID, TASK_ID),
        FOREIGN KEY (TASK_ID) REFERENCES TASK(TASK_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE JOB_STATUS (
        STATUS_ID varchar(255),
        JOB_ID varchar(255) NOT NULL,
        TASK_ID varchar(255) NOT NULL,
        STATE varchar(255),
        TIME_OF_STATE_CHANGE TIMESTAMP(6) DEFAULT NOW(6) ON UPDATE NOW(6),
        REASON LONGTEXT,
        PRIMARY KEY (STATUS_ID, JOB_ID, TASK_ID),
        FOREIGN KEY (JOB_ID, TASK_ID) REFERENCES JOB(JOB_ID, TASK_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE QUEUE_STATUS(
        HOST_NAME VARCHAR(255) NOT NULL,
        QUEUE_NAME VARCHAR(255) NOT NULL,
        CREATED_TIME BIGINT(20) NOT NULL,
        QUEUE_UP     TINYINT(1),
        RUNNING_JOBS INT(11),
        QUEUED_JOBS INT(11),
        PRIMARY KEY (HOST_NAME, QUEUE_NAME, CREATED_TIME)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE CONFIGURATION
(
        CONFIG_KEY VARCHAR(255),
        CONFIG_VAL VARCHAR(255),
        EXPIRE_DATE TIMESTAMP DEFAULT NOW() ON UPDATE NOW(),
        CATEGORY_ID VARCHAR (255),
        PRIMARY KEY(CONFIG_KEY, CONFIG_VAL, CATEGORY_ID)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO CONFIGURATION (CONFIG_KEY, CONFIG_VAL, EXPIRE_DATE, CATEGORY_ID) VALUES('registry.version', '0.16', NOW() ,'SYSTEM');

CREATE TABLE PROCESS_WORKFLOW
(
  PROCESS_ID varchar(255) NOT NULL,
  WORKFLOW_ID varchar(255) NOT NULL,
  TYPE varchar(255) DEFAULT NULL,
  CREATION_TIME timestamp DEFAULT NOW(),
  PRIMARY KEY (PROCESS_ID, WORKFLOW_ID),
  FOREIGN KEY (PROCESS_ID) REFERENCES PROCESS(PROCESS_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
