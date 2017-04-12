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

create a database named 'auto'
```
create database auto;
```
find the DDL (create table scripts) and run them: https://github.com/TheOpenCloudEngine/sw-modeling-tutorial/blob/master/autoinsurance.ddl

and restart the server by

```
mvn tomcat7:run-war
```
again.


Congratulations!

## Recommended Readings

 (Object oriented concepts and UML)[https://www.slideshare.net/pongsor/ss-55719446]
