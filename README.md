# Overview
This project connects a Bootstrap-based website to a Spring Boot back-end, enabling dynamic form submission and basic API interaction. The primary goal is to add server-side functionality (such as processing form submissions) to an otherwise front-end-only website.

The front-end is built with HTML, CSS, JavaScript, and Bootstrap 5 for responsive design. The back-end uses Spring Boot to handle HTTP requests and manage API routes.

# Features
- Static front-end pages styled with Bootstrap.
- Spring Boot-powered API for handling contact form submissions.
- Form data successfully captured and output to server console (future enhancement: storing or emailing data).
- Smooth navigation between pages using updated URL mappings.
- Fast, lightweight, and easy to extend.

# Technologies Used
Front-end:
- HTML5
- CSS3
- JavaScript
- Bootstrap 5

Back-end:
- Java 17+
- Spring-Boot 3.x
- Maven

# Getting Started
Prerequisites:
- Java 17 or higher
- Maven
- Git
- (Optional) IDE like IntelliJ IDEA or Eclipse

Steps:
1. Clone the repository:
   
```bash
git clone git@github.com:Mamtilda/Bootstrap-API.git
cd Bootstrap-API
```
2. Build and run the Spring Boot application

```./mvnw spring-boot:run```

Or if Maven is installed:

```mvn spring-boot:run```

3. Access the site

Open your browser and go to:

```http://localhost:8080/```

4. Form Submissions

- On the Contact page, fill out the form and submit.
- The form data will be printed to the console (this simulates backend handling).


