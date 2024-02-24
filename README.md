# BankingDashboard Backend

Welcome to the BankingDashboard Backend repository! This repository contains the backend code for the BankingDashboard project.

## About

BankingDashboard is a web application designed to provide users with a comprehensive dashboard for managing their banking activities. The backend is responsible for handling data storage, processing, and API endpoints to interact with the frontend.

## Technologies Used

- [SpringBoot](https://spring.io/)
- [MySQL](https://www.mysql.com/)


## Getting Started

To get started with the BankingDashboard Backend, follow these steps:

Clone the Repository:
```bash
   git clone https://github.com/Mohamedkout15/BankingDashboard-App-Backend
```   
   
## API Endpoints:

/api/client:
/api/accounts: Endpoint for managing bank accounts.
Add more endpoints as needed.
## Project Structure
The project structure is organized as follows:


```bash
/BankingDashboard Project/BankingDashboard-App-Backend
├── compose.yaml
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   └── main
│       ├── java
│       │   └── zz
│       │       └── sk
│       │           └── bankingdashboard
│       │               ├── Aspects
│       │               ├── BankingDashboardApplication.java
│       │               ├── Configuration
│       │               │   ├── AppConfig.java
│       │               │   ├── CorsConfig.java
│       │               │   ├── SwaggerConfig.java
│       │               │   └── WebSecurityConfig.java
│       │               ├── Controllers
│       │               │   ├── Client
│       │               │   │   └── ClientController.java
│       │               │   └── UserRegistrationController.java
│       │               ├── Entities
│       │               │   ├── Adresse.java
│       │               │   ├── Client.java
│       │               │   ├── DeuxiemeVisite.java
│       │               │   ├── PremiereVisite.java
│       │               │   ├── PromesseClient.java
│       │               │   ├── Role.java
│       │               │   └── User.java
│       │               ├── Repositories
│       │               │   ├── AdresseRepository.java
│       │               │   ├── ClientRepository.java
│       │               │   ├── DeuxiemeVisiteRepository.java
│       │               │   ├── PremiereVisiteRepository.java
│       │               │   ├── PromesseRepository.java
│       │               │   └── UserRepository.java
│       │               └── Services
│       │                   └── Client
│       │                       ├── InterfaceClientServiceImp.java
│       │                       └── InterfaceClientService.java
│       └── resources
│           ├── application.properties
│           ├── static
│           └── templates
└── target
    ├── classes
    │   ├── application.properties
    │   └── zz
    │       └── sk
    │           └── bankingdashboard
    │               ├── BankingDashboardApplication.class
    │               ├── Configuration
    │               │   ├── AppConfig.class
    │               │   ├── CorsConfig$1.class
    │               │   ├── CorsConfig.class
    │               │   ├── SwaggerConfig.class
    │               │   └── WebSecurityConfig.class
    │               ├── Controllers
    │               │   ├── Client
    │               │   │   └── ClientController.class
    │               │   └── UserRegistrationController.class
    │               ├── Entities
    │               │   ├── Adresse.class
    │               │   ├── Client.class
    │               │   ├── DeuxiemeVisite.class
    │               │   ├── PremiereVisite.class
    │               │   ├── PromesseClient.class
    │               │   ├── Role.class
    │               │   └── User.class
    │               ├── Repositories
    │               │   ├── AdresseRepository.class
    │               │   ├── ClientRepository.class
    │               │   ├── DeuxiemeVisiteRepository.class
    │               │   ├── PremiereVisiteRepository.class
    │               │   ├── PromesseRepository.class
    │               │   └── UserRepository.class
    │               └── Services
    │                   └── Client
    │                       ├── InterfaceClientService.class
    │                       └── InterfaceClientServiceImp.
```

## Authors

- [@Mohamedkout15](https://www.github.com/Mohamedkout15)


