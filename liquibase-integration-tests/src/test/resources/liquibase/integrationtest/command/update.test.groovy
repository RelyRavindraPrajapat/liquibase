package liquibase.integrationtest.command

import liquibase.change.ColumnConfig
import liquibase.change.core.CreateTableChange
import liquibase.changelog.DatabaseChangeLog
import liquibase.integrationtest.command.LiquibaseCommandTest
import liquibase.integrationtest.setup.SetupDatabaseChangeLog
import liquibase.integrationtest.setup.SetupDatabaseStructure

[
    new LiquibaseCommandTest.Spec(
        command: ["update"],

        setup: [
            new SetupDatabaseChangeLog("changelogs/hsqldb/complete/simple.changelog.xml")
        ],
        expectedOutput: [
            "",
        ],
        expectedResults: [
            statusCode: 0
        ]
    )

] as LiquibaseCommandTest.Spec[]