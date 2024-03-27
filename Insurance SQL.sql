CREATE DATABASE INSURANCE_MANAGEMENT ;
USE INSURANCE_MANAGEMENT;
CREATE TABLE User (
  userId INT PRIMARY KEY,
  username VARCHAR(255),
  password VARCHAR(255),
  role VARCHAR(50)
);

CREATE TABLE Client (
  clientId INT PRIMARY KEY,
  clientName VARCHAR(255),
  contactInfo VARCHAR(255),
  policy VARCHAR(100)
);

CREATE TABLE Claim (
  claimId INT PRIMARY KEY,
  claimNumber VARCHAR(100),
  dateFiled DATE,
  claimAmount DECIMAL(10, 2),
  status VARCHAR(50),
  policy VARCHAR(100),
  client INT,
  FOREIGN KEY (client) REFERENCES Client (clientId)
);

CREATE TABLE Payment (
  paymentId INT PRIMARY KEY,
  paymentDate DATE,
  paymentAmount DECIMAL(10, 2),
  client INT,
  FOREIGN KEY (client) REFERENCES Client (clientId)
);

-- Inserting values into User table
INSERT INTO User (userId, username, password, role)
VALUES 
(1, 'Sri', '123', 'role1'),
(2, 'Pooja', '456', 'role2'),
(3, 'Reena', '789', 'role3'),
(4, 'Priya', '432', 'role4'),
(5, 'Ashwin', '980', 'role5');

-- Inserting values into Client table
INSERT INTO Client (clientId, clientName, contactInfo, policy)
VALUES 
(1, 'Anu', '1234567890', 'Policy 1'),
(2, 'Anjana', '0987654321', 'Policy 2'),
(3, 'Banu', '9876543210', 'Policy 3'),
(4, 'Lakshmi', '0123456789', 'Policy 4'),
(5, 'Meera', '5555555555', 'Policy 5');

-- Inserting values into Claim table
INSERT INTO Claim (claimId, claimNumber, dateFiled, claimAmount, status, policy, client)
VALUES 
(1, 'CLAIM001', '2024-03-25', 1000.00, 'Pending', 'Policy 1', 1),
(2, 'CLAIM002', '2024-03-26', 1500.00, 'Approved', 'Policy 2', 2),
(3, 'CLAIM003', '2024-03-27', 2000.00, 'Pending', 'Policy 3', 3),
(4, 'CLAIM004', '2024-03-28', 2500.00, 'Rejected', 'Policy 4', 4),
(5, 'CLAIM005', '2024-03-29', 3000.00, 'Approved', 'Policy 5', 5);

-- Inserting values into Payment table
INSERT INTO Payment (paymentId, paymentDate, paymentAmount, client)
VALUES 
(1, '2024-03-25', 500.00, 1),
(2, '2024-03-26', 700.00, 2),
(3, '2024-03-27', 900.00, 3),
(4, '2024-03-28', 1100.00, 4),
(5, '2024-03-29', 1300.00, 5);


