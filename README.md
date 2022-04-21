# Why does jaxb2-maven-plugin xjc fail with Corretto jdk11.0.15_9 but not with Temurin jdk-11.0.14.1+1

Works: 
```
set JAVA_HOME=C:\Temurin\jdk-11.0.14.1+1
mvn clean jaxb2:xjc
```

Fails:
```
set JAVA_HOME=C:\Corretto\jdk11.0.15_9
mvn clean jaxb2:xjc
```