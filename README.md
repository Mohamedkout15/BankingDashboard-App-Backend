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

**Client API Endpoints**<br>
The ClientController class provides various endpoints for managing client data in the BankingDashboard application.<br>

**Add Client**<br>
URL: /client/addclient<br>
Method: POST<br>
Description: Adds a new client to the system.<br>
Request Body: Client object representing the new client to be added.<br>
Response: The newly added client object.<br>

**Find Client by ID**<br>
URL: /client/findclient/{id}<br>
Method: GET<br>
Description: Retrieves a client by their unique ID.<br>
Path Variable: id - The unique ID of the client.<br>
Response: The client object with the specified ID.<br>

**Set Date of Second Visit**<br>
URL: /client/setdatedxvisite/{id}<br>
Method: POST<br>
Description: Sets the date of the second visit for a client.<br>
Path Variable: id - The unique ID of the client.<br>
Request Parameter: date - The date of the second visit (format: yyyy-MM-dd).<br>
Response: The updated client object.<br>

**Set Date of First Visit**<br>
URL: /client/setdateprvisite/{id}<br>
Method: POST<br>
Description: Sets the date of the first visit for a client.<br>
Path Variable: id - The unique ID of the client.<br>
Request Parameter: date - The date of the first visit (format: yyyy-MM-dd).<br>
Response: The updated client object.<br>

**Set Values of First Visit**<br>
URL: /client/setvalprv/{id}<br>
Method: POST<br>
Description: Sets the values of the first visit for a client.<br>
Path Variable: id - The unique ID of the client.<br>
Request Body: List of numbers representing the values of the first visit.<br>
Response: The updated client object.<br>

**Set Values of Second Visit**<br>
URL: /client/setvaldxv/{id}<br>
Method: POST<br>
Description: Sets the values of the second visit for a client.<br>
Path Variable: id - The unique ID of the client.<br>
Request Body: List of numbers representing the values of the second visit.<br>
Response: The updated client object.<br>

**Set Values of Promise Client**<br>
URL: /client/setvalprc/{id}<br>
Method: POST<br>
Description: Sets the values of the promise client for a client.<br>
Path Variable: id - The unique ID of the client.<br>
Request Body: List of numbers representing the values of the promise client.<br>
Response: The updated client object.<br>


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


