# spring-learning-features

1) Spring Boot Customize Exceptions Using Controller Advice
2) Spring Boot Profiling
3) Spring Boot RestTempalate Exception Handling
4) Spring Boot AOPs
5) Spring Boot Emitter
6) Spring Boot Asynchronous API Call uisng Resttemplate
7) Spring Boot Using Caching
8) Spring Boot Using Actuator
9) Spring Boot WebClient and JsonView


Example 

To Check Health Of Application

eg : http://localhost:8080/actuator/health


Spring Boot Commands
-----------------------------------------------------------------------------

1) java -jar Application.jar (to run application using jar)

2) java -jar Application.jar --spring.config.location=classpath:file:/home/fasoftwares/application.properties (Load External Properties in Spring Boot(Instead of application.properties) using jar)

3) mvn spring-boot:run (using application)

4) mvn spring-boot:run -Dspring-boot.run.profiles=test(using application and select profiling)



http://localhost:8080/oauth/authorize?client_id=javainuse-client&response_type=code&scope=read_profile_info

http://localhost:8080/oauth/authorize?grant_type=client_credentials&client_id=javainuse-client&client_secret=javainuse-secret&scope=read_profile_info 
