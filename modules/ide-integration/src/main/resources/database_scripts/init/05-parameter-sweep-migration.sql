ALTER TABLE EXPERIMENT ADD COLUMN SWEEP_COUNT INT DEFAULT 1;
ALTER TABLE EXPERIMENT ADD COLUMN EXECUTION_TYPE VARCHAR(50) DEFAULT 'one_pass';

CREATE TABLE EXPERIMENT_OUTPUT_VALUE
(
        EXPERIMENT_ID varchar(255) NOT NULL,
        OUTPUT_NAME varchar(255),
        OUTPUT_VALUE varchar(2048),
        PRIMARY KEY(EXPERIMENT_ID,OUTPUT_NAME,OUTPUT_VALUE),
        FOREIGN KEY (EXPERIMENT_ID,OUTPUT_NAME) REFERENCES EXPERIMENT_OUTPUT(EXPERIMENT_ID,OUTPUT_NAME) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE CHILD_JOB (
        CHILD_JOB_ID varchar(255),
        PARENT_JOB_ID varchar(255),
        PARENT_TASK_ID varchar(255) NOT NULL,
        JOB_INDEX int NOT NULL,
        PRIMARY KEY (CHILD_JOB_ID),
        FOREIGN KEY (PARENT_JOB_ID, PARENT_TASK_ID) REFERENCES JOB(JOB_ID, TASK_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE CHILD_JOB_STATUS (
        STATUS_ID varchar(255) NOT NULL,
        CHILD_JOB_ID varchar(255) NOT NULL,
        STATE varchar(255),
        TIME_OF_STATE_CHANGE TIMESTAMP(6) DEFAULT NOW(6) ON UPDATE NOW(6),
        REASON LONGTEXT,
        PRIMARY KEY (STATUS_ID, CHILD_JOB_ID),
        FOREIGN KEY (CHILD_JOB_ID) REFERENCES CHILD_JOB(CHILD_JOB_ID) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
