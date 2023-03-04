# spring-tomcat-test

## Requirements

* spring boot & inner tomcat 
* java 17 
* mac os 
* jm

## Tomcat Args 

1. connection-timeout :  it means the time control that the server waits until the client completes the request. <br/> If the client does not complete the request within the specified time, the server closes the connection. <br> 

throw exception

```text
Response code:Non HTTP response code: org.apache.http.conn.HttpHostConnectException
Response message:Non HTTP response message: Connect to localhost:8080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Operation timed out
```
