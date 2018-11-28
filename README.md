# OSGI Spring Boot Demo

This is a demo application that shows that it's possible to run Spring Boot apps in OSGI container.

To produce bundle run `mvn clean install`. It will be available in `target/deploy`.
To produce and deploy bundle to Docker Apache Karaf container run `mvn clean install -Pdocker`. It will create docker container for 5 mins.

To verify that app is working try access `http://localhost:9015/echo` endpoint.
```
$ curl http://localhost:9015/echo
echo
```