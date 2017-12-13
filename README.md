Hello Openshift project
-----------------------

Initial source was taken from:
https://github.com/gshipley/bootwildfly.git



Run or debug locally
===========
Comment in pom.xml
```
<exclusion>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
</exclusion>
```

Run from IDE:
Application.main

Build:
```
mvn clean package
```

Run:
```
java -jar target/helloopenshift-1.0.war
```

Verify:
http://localhost:8080
```
curl -v http://localhost:8080/hello
```
