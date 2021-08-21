## To run this application:

### Set up
1. Go to the `palindrome` directory and run `npm install` 
2. Go to the `persistence` directory and run `npm install`

### Execute:
1. Go to `palindrome` directory and execute `node palindrome.js`
2. Go to `persistence` directory and execute `node persistence.js`
3. Go to `webapp` directory
   1. Execute `mvn clean install` to generate `webapp/target/webapp.jar` directory 
   2. Go to the `target` folder and execute `java -jar webapp.jar`

### Web-app:
* In your browser, open [http://localhost:8080/](http://localhost:8080/)

---

## About

### Requirements
* Java
* Maven
* NodeJS

### Ports used:
* Webapp: 8080
* Persistence app: 8081
* Palindrome app: 8082