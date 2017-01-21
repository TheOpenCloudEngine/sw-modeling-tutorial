# Welcome to Model Driven Software Development using OCE and Visual-paradigm 

## Building and running the tutorial example

```
mvn tomcat7:run-war
```

after seeing the last log - INFO: Starting ProtocolHandler ["http-bio-8089"] - then you can now go to following url:

```
http://localhost:8089/auto-insurance/runner.html?className=controllers.NameAndAddressTab
```

if you have newly installed database, you need to configure your database and change the connection configuration of the application:

1. create a database named 'auto'
```
create database auto;

```
1. find the DDL (create table scripts) and run them: 

1. configure the connection url

Congratulations!
