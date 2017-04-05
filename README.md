# Hibernate test

Just a simple project to learn how hibernate works with mysql

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them


* mysql server 
    *  or 
* docker (https://docs.docker.com/engine/installation/) & docker-compose (https://docs.docker.com/compose/install/)

### Installing


If using docker run the following command in the root dir of the project

```
docker-compose up -d
```

Configure hibernate to connect to the proper database (if using docker this is already taken care of)

```
set the host, port, user and password in src/main/resources/hibernate.cfg.xml
```