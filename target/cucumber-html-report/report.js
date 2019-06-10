$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "test DB",
  "description": "",
  "id": "test-db",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Test DB",
  "description": "",
  "id": "test-db;test-db",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I change DB \"\u003cdbName\u003e\" config table \"\u003ctableNameConfig\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "test-db;test-db;",
  "rows": [
    {
      "cells": [
        "dbName",
        "tableNameConfig"
      ],
      "line": 8,
      "id": "test-db;test-db;;1"
    },
    {
      "cells": [
        "prodstatdb",
        "blacklistmsisdn"
      ],
      "line": 9,
      "id": "test-db;test-db;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "Test DB",
  "description": "",
  "id": "test-db;test-db;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I change DB \"prodstatdb\" config table \"blacklistmsisdn\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "prodstatdb",
      "offset": 13
    },
    {
      "val": "blacklistmsisdn",
      "offset": 39
    }
  ],
  "location": "Test.I_change_DB_config_table(String,String)"
});
