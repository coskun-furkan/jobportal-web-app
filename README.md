# JobPortal Web Application

**JobPortal** is a Spring Boot-based web application designed to connect job seekers with employers. Users can create profiles, post job listings, and manage applications. Even without registration, users can browse and view available jobs.

To get started, users should register to create and update their profiles. Recruiters can log into their accounts to post new job listings and publish them. Job seekers can then log in to apply for posted jobs and upload their CVs. 

Recruiters can view the details of applicants and download submitted CVs. Registration is not required to view job listings. Additionally, users can filter listings to display only the opportunities that match their interests.

 Note:** Only the *backend* of this project was developed by me. A pre-built theme was used for the *frontend*.

---

# Features

- **User Registration and Login:** Separate registration and login processes for job seekers and employers.
- **Profile Management:** Users can update personal details and upload resumes.
- **Job Posting:** Employers can create and manage job listings.
- **Job Applications:** Job seekers can apply for positions and track their application status.
- **JWT Authentication:** Secure session management using JSON Web Token (JWT).

---

# Technologies Used

- **Backend:** Java 23, Spring Boot, Spring Security, Spring Data JPA  
- **Database:** MySQL  
- **Frontend:** Thymeleaf, HTML, CSS (Imported pre-built theme)  
- **Other Tools:** Maven, JWT  

---

![homescreen png](https://github.com/user-attachments/assets/d72db7a4-6e55-45d1-afe7-d317a70a1af7)  
![recruiter-screen png](https://github.com/user-attachments/assets/a63b485b-8756-4efb-96a2-fbf9c28da7e3)  
![recruiterr png](https://github.com/user-attachments/assets/672c7711-c3cb-4910-9de1-b92dde9f2508)  
![candidate-screen png](https://github.com/user-attachments/assets/fc8ce446-e518-4513-b232-6d9b0537f26d)  
![job-application-screen png](https://github.com/user-attachments/assets/44da081c-741b-4e55-8d3b-3c3c148142e1)  
![diagram png](https://github.com/user-attachments/assets/96e996b1-18f0-46b7-80ee-544073e5b497)

---

# Project Structure

```
jobportal-web-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── jobportal/
│   │   │       └── web/
│   │   │           └── app/
│   │   │               ├── config/
│   │   │               ├── controller/
│   │   │               ├── entity/
│   │   │               ├── repository/
│   │   │               ├── services/
│   │   │               └── util/
│   │   └── resources/
│   │       ├── templates/
│   │       └── application.properties
├── pom.xml
└── README.md
```

---

# Setup and Running the Project

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/coskun-furkan/jobportal-web-app.git
   cd jobportal-web-app
   ```

2. **Configure the Database:**

   Open `src/main/resources/application.properties` and enter your own MySQL credentials.

3. **Run the Application:**

   For bash terminal:
   ```bash
   mvn spring-boot:run
   ```
   or simply open the project in IntelliJ IDEA and run it.

4. **Access the Application:**

   Open your browser and navigate to: `http://localhost:8080`

---

# License

This project is licensed under the [MIT License](LICENSE).

---

# Contributions

Contributions are welcome! Please refer to the `CONTRIBUTING.md` file before contributing.
