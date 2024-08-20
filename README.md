# fund_transfer_service

## Description
Fund Transaction maintains the all the transaction details for accounts. This service will expose the api to create new transactions for account and fetch the all transaction for an account. 


## Setup
To build this project require maven 3.8 or later and Java 17 or later.

## Build and Run the application
```bash
# Clone the repository
git clone https://github.com/VimalaJay/fund_transaction_service

# Navigate to the project directory
cd local-repository

# Build application
mvn clean install

# Deploy the project
mvn spring-boot:run

# check database console
http://localhost:8081/h2-console
