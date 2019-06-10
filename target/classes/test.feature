@Test
Feature: test DB

Scenario Outline: Test DB
Given I change DB "<dbName>" config table "<tableNameConfig>"

Examples:
|dbName		|tableNameConfig	|
|prodstatdb	|blacklistmsisdn	|
