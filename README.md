# Black-Box-Testing
In this project, I have applied three of foundational black box techniques on the ATM system.

The focal points of this project is the withdrawal, the deposit, and the transfer operations.

Each of these operations has their own business logic for calculating banking fees for the given operation.

The business logic specification for calculating the fees for each of the given operations is provided below:

**Withdrawal**

- If the client is a student and…

  o If the transaction is performed during the weekend, then there is no fee
  
  o Otherwise, the fee is 0.1% of the amount withdrawn
