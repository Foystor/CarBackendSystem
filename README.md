# Backend System for a Car Website

Real-world project from [Java Web Developer Nanodegree](https://www.udacity.com/course/java-developer-nanodegree--nd035) at Udacity.

This backend implements a Vehicles API that serves as an endpoint to track vehicle inventory.

While the primary Vehicles API performs CRUD operations related to vehicle details, it can consume information from the separate Boogle Maps and Pricing Service APIs, and return that information as part of the vehicle information for a single vehicle.

## Summary

- [Demo](#demo)
- [Structure](#structure)
- [Technologies](#technologies)
- [Usage](#usage)
- [License](#license)

## Demo



## Structure

The backend is composed of vehicles list services, pricing services, and location services as mentioned below:

- **Vehicles API** - a REST API to maintain vehicle data and to provide a complete view of vehicle details including price and address.
- **Pricing Service** - a REST WebService that simulates a backend that would store and retrieve the price of a vehicle given a vehicle id as input.
- **Location API** - a Mock that simulates a Maps WebService where, given a latitude longitude, will return a random address.

## Technologies

- Implement a `REST-based` Vehicles API that communicates with a location and pricing service using `Spring Boot` and `HTTP WebClient`.
- Convert the existing Pricing Service API to a microservice registered on a `Eureka` server.
- Use `Swagger` to customize error messages and efficiently create documentation for the Vehicles API.
- Implement tests that cover the `CRUD` operations for Vehicles API and Pricing Service using `Spring Test`, `JUnit` and `Mockito`.

## Usage

Note that the Boogle Maps, Pricing Service and Vehicles API applications must all be running for all operations to perform correctly, although they should be able to launch on their own.

You can either use these in separate windows in your favorite IDE, or use the below commands:

1. `$ mvn clean package` (run this in each directory containing the separate applications)
2. Boogle Maps: `$ java -jar target/boogle-maps-0.0.1-SNAPSHOT.jar`
    - The service is available by default on port `9191`. You can check it on the command line by using `$ curl http://localhost:9191/maps\?lat\=20.0\&lon\=30.0`
3. Pricing Service: `$ java -jar target/pricing-service-0.0.1-SNAPSHOT.jar`
4. Vehicles API: `$ java -jar target/vehicles-api-0.0.1-SNAPSHOT.jar`
    - The Swagger API documentation is available at: http://localhost:8080/swagger-ui.html

## License

[MIT License](LICENSE)