# spring-tomcat-test

## Requirements

* spring boot & inner tomcat 
* java 17 
* mac os 
* jmeter

## Tomcat Args 

*  `server.tomcat.connection-timeout` it means the time control that the server waits until the client completes the request. <br/> If the client does not complete the request within the specified time, the server closes the connection. <br> 

**throw exception**

```text
Response code:Non HTTP response code: org.apache.http.conn.HttpHostConnectException
Response message:Non HTTP response message: Connect to localhost:8080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Operation timed out
```

**example case**

```text
If you change the setting to 10 seconds and assume that it takes more than 20 seconds during the logic, and set the queue and pool threads to 1.

Then, if 10 requests come, one request can wait and wait until the rest are processed before an exception can occur.
```

