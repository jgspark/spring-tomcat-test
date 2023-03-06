# spring-tomcat-test

## Requirements

* spring boot & inner tomcat 
* java 17 
* mac os 
* jmeter

## Spring Boot – Embedded Tomcat Configuration

*  `server.tomcat.connection-timeout` : it means the time control that the server waits until the client completes the request. If the client does not complete the request within the specified time, the server closes the connection.

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

* `server.tomcat.threads.min-spare` : it means the minimum number of threads always present in the connection pool. That doesn't mean "the number of threads that are always active" Also, the default value of server.tomcat.threads.min-spare is null, which means to use the default value of 10% of tomcat's maximum threads.

* `server.tomcat.accept-count` : it means setting the maximum number of queues that can wait in the queue when the number of threads in the pool is 0 when there are no threads for processing all available requests. For example, if Tomcat's Max Thread number is 200, and it is assumed that 200 requests are received at the same time, the request processing time is 5 seconds. If so, requests coming in later that have not been processed in the meantime will be in the queue.

* `server.tomcat.keep-alive-timeout` : it means the time to keep the thread alive.The default value is 20 seconds, and if one request has already been completed and no request has been made for 20 seconds, the thread will be returned or destroyed. However, if a request comes in, the thread handles the request.


* `server.tomcat.max-keep-alive-request` : it means limiting the number of requests that can be processed through HTTP/1.1 connections. In short, it is the maximum throughput of one thread. Also, if a thread is returned to the pool again, the set or used number of the thread is initialized again.
