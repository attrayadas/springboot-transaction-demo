# Spring Boot Transaction Demo - Spring Boot, Spring Data JPA (@Transactional), and MySQL
A concise REST API project with transaction management, utilizing Spring Boot, MySQL database, and Spring Data JPA

## Steps to Setup

**1. Clone the Application**

```bash
git clone https://github.com/attrayadas/springboot-transaction-demo
```

**2. Create MySQL Database**
```bash
create database transaction_demo
```

**3. Change MySQL username and password as per your installation**

+ open `src/main/resources/application.properties`
+ change `spring.datasource.username` and `spring.datasource.password` as per your MySQL installation

**4. Run the app using maven**

```bash
mvn spring-boot:run
```
The end-point to place order: <http://localhost:8080/api/v1/orders>

**5. Sample Valid Request Body**
##### <a id="placeOrder">Place order (POST) -> /api/v1/orders</a>
```json
{
    "order": {
        "totalQuantity": 30,
        "shoppingCartId": 2,
        "totalPrice": 20000
    },
    "payment": {
        "type": "CREDIT",
        "cardName": "Attraya Das",
        "cardNumber": "1234 4321 1234",
        "expiryMonth": 2,
        "expiryYear": 2025,
        "cvc": 123
    }
}
```

