# 🌟 E-Commerce Web App: Built with Java Spring Boot & React 🚀

A full-stack, high-performance e-commerce web application built using **Java Spring Boot** for the backend and **React** for the frontend. This project showcases seamless integration of modern technologies to deliver a robust, user-friendly online shopping experience.


## 🔥 Features
- 🛒 **Dynamic Product Catalog:** Manage and display products with ease.
- 🔐 **Secure User Authentication:** Signup/Login with JWT-based authentication.
- 💳 **Integrated Payment Gateway:** Fast and secure checkout experience.
- 📈 **Admin Dashboard:** Manage inventory, orders, and users.
- 🌟 **Responsive Design:** Optimized for both desktop and mobile.

## 📚 Tech Stack
- **Backend:** Java Spring Boot, Hibernate, MySQL
- **Frontend:** React, Redux, TailwindCSS
- **API Integration:** RESTful API architecture

👩‍💻 Perfect for developers looking to explore Spring Boot and React, or build their first full-stack e-commerce app! Clone, contribute, and customize. Let's build something amazing! 🚀😊

## 🐳 Docker Deployment

The application can be easily deployed using Docker Compose. This will set up both the Spring Boot application and the PostgreSQL database in containers.

### Prerequisites
- Docker and Docker Compose installed on your system
- Git (to clone the repository)
- Java 17 (for manual build)
- Maven 3.9+ (for manual build)

### Build Options

#### Option 1: Manual Build
1. Clone the repository:
```bash
git clone [your-repository-url]
cd ecommerce-spring-boot-react-application-backend
```

2. Build the application:
```bash
mvn clean package -DskipTests
```

3. Start the containers:
```bash
docker-compose up -d
```

#### Option 2: Docker Multi-stage Build (Recommended)
1. Clone the repository:
```bash
git clone [your-repository-url]
cd ecommerce-spring-boot-react-application-backend
```

2. Build and start the containers:
```bash
docker-compose up -d --build
```

This will:
- Build the Spring Boot application using Maven in a container
- Create the application JAR file
- Start a PostgreSQL database
- Configure all necessary environment variables
- Expose the application on port 8080

### Managing the Application

To stop the application:
```bash
docker-compose down
```

To stop the application and remove associated volumes:
```bash
docker-compose down -v
```
> Note: The `-v` flag removes all Docker volumes associated with the application. Use this when you want to completely clean up the application state, including the database data. If you want to preserve your data, use `docker-compose down` instead.

To view logs:
```bash
docker-compose logs -f
```

To rebuild after changes:
```bash
docker-compose up -d --build
```

The application will be available at `http://localhost:8080`
