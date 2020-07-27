use experiment_catalog;

ALTER TABLE EXPERIMENT_INPUT ADD COLUMN OVERRIDE_FILENAME VARCHAR(255);
ALTER TABLE PROCESS_INPUT ADD COLUMN OVERRIDE_FILENAME VARCHAR(255);

-- AIRAVATA-3355: Add EXPERIMENT_DATA_DIR_SIZE entry to the table Experiment
SET @AddExperimentDataDirSize = (SELECT IF(
    (SELECT COUNT(*)
        FROM INFORMATION_SCHEMA.COLUMNS
        WHERE table_name = 'EXPERIMENT'
        AND column_name = 'EXPERIMENT_DATA_DIR_SIZE'
    ) > 0,
    "SELECT 1",
    "ALTER TABLE EXPERIMENT ADD EXPERIMENT_DATA_DIR_SIZE BIGINT DEFAULT 0"
));

PREPARE stmt FROM @AddExperimentDataDirSize;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;