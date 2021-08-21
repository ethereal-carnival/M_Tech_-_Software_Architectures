## To run this application:

### Set up
#### 1. RabbitMQ via Docker:
* Run `docker-compose up -d` in this directory
* Note: RabbitMQ can be natively installed as well. In this case, skip this step.

#### 2. Run `npm install` in this directory

### Execute:
* After completing set up, run 
  1. `node stock_publisher.js`
  2. `node stock_consumer.js`

### Web-app:
* To administer RabbitMQ, in your browser, open [http://localhost:15672/](http://localhost:15672/)
* Default credentials for RabbitMQ are guest/guest

---

## About

### Requirements
* NodeJS
* Docker

### Ports used:
* Webapp: 8080
* docker/RabbitMQ: 5672, 15672