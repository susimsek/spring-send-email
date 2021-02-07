# Spring Boot Send Email
> Spring Boot Send Email
>
<img src="https://github.com/susimsek/spring-send-email/blob/main/images/spring-boot-send-email.png" alt="Spring Boot Send Email" width="100%" height="100%"/> 

## Prerequisites

* Java 11
* Maven 3.3+
* Docker 19.03+
* Docker Compose 1.25+

## Installation

```sh
./mvnw compile jib:dockerBuild
```

```sh

change .env this lines.

MAIL_SMTP_USERNAME=your_username
MAIL_SMTP_PASSWORD=your_password
```

```sh
docker-compose up -d 
```

## Used Technologies

* Spring Boot 2.4.2
* Spring Boot Web
* Spring Boot Email
* Spring Boot Actuator
* Maven Jib Plugin
* Maven Clean Plugin
* Maven Enforcer Plugin  
* Lombok
* Dev Tools
* Spring Boot Test