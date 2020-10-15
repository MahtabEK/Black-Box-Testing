# Black-Box-Testing
In this project, I have applied three of foundational black box techniques on the ATM system.

The focal points of this project is the withdrawal, the deposit, and the transfer operations.

Each of these operations has their own business logic for calculating banking fees for the given operation.

The business logic specification for calculating the fees for each of the given operations is provided below:

**Withdrawal**

- If the client is a student and…

  o If the transaction is performed during the weekend, then there is no fee
  
  o Otherwise, the fee is 0.1% of the amount withdrawn

- If the client is not a student and…

  o If the balance of the account is less than $1,000, then the fee is 0.2% of the amount
withdrawn.

  o If, however, the balance is $1,000, or more, but less than $10,000, the fee is 0.1% of the
amount withdrawn.

  o If the balance is more than $10,000, then there is no fee
  
  
**Deposit**

- If the client is a student and…

  o If the amount withdrawn is more than $100 and…
  
    - If the balance of the account is more than $1,000, then the fee is 1% of the
amount withdrawn.
    - Otherwise, the fee is 0.5% of the amount withdrawn
  
  o If, however, the amount withdrawn is $100 or less and…
  
    - If the balance of the account is more than $5,000, then the fee is 0.5% of the
amount withdrawn.
    - Otherwise, there is no fee.

- If the client is not a student and…

  o If the amount withdrawn is more than $500 and…
  
    - If the balance of the account is more than $5,000, then the fee is 1% of the
amount withdrawn.

    - Otherwise, the fee is 0.5% of the amount withdrawn.
  
  o If, however, the amount withdrawn is $500 or less and…

    - If the balance of the account is more than $10,000, then the fee is 0.5% of the
amount withdrawn.

    - Otherwise, there is no fee
    
**Transfer**

- If the client is a student and…

  o If the amount withdrawn is less than $100 and…
  
    - If the balance of the account the money is coming from is less than $1,000 and…
    
      - If the balance of the account the money is going to is less than $1,000,
then the fee is 0.1% of the amount withdrawn.

      - Otherwise, the fee is 0.05% of the amount withdrawn
      
   - If, however, the balance of the account the money is coming from is $1,000, or more and…
   
     - If the balance of the account the money is going to is less than $1,000,
then the fee is 0.5% of the amount withdrawn.
  
     - Otherwise, the fee is 0.25% of the amount withdrawn.

  o If the amount withdrawn is $100, or more, and…
  
    - If the balance of the account the money is coming from is less than $1,000 and…
    
      - If the balance of the account the money is going to is less than $1,000,
then the fee is 0.05% of the amount withdrawn.

      - Otherwise, the fee is 0.025% of the amount withdrawn.
    
    - If, however, the balance of the account the money is coming from is $1,000, or
more and…

      - If the balance of the account the money is going to is less than $1,000,
then the fee is 0.25% of the amount withdrawn

      - Otherwise, the fee is 0.125% of the amount withdrawn.
      
  - If the client is a not student and…
  
    o If the amount withdrawn is less than $100 and…
    
      - If the balance of the account the money is coming from is less than $1,000 and…
      
        - If the balance of the account the money is going to is less than $1,000, then the fee is 0.2% of the amount withdrawn.
        
        - Otherwise, the fee is 0.1% of the amount withdrawn.
        
      - If, however, the balance of the account the money is coming from is $1,000, or more and…
      
        - If the balance of the account the money is going to is less than $1,000, then the fee is 1% of the amount withdrawn.
        
        - Otherwise, the fee is 0.5% of the amount withdrawn.
        
    o If the amount withdrawn is $100, or more, and…
    
      - If the balance of the account the money is coming from is less than $1,000 and…
      
        - If the balance of the account the money is going to is less than $1,000, then the fee is 0.1% of the amount withdrawn.
        
        - Otherwise, the fee is 0.05% of the amount withdrawn.
        
      - If, however, the balance of the account the money is coming from is $1,000, or more and…
      
        - If the balance of the account the money is going to is less than $1,000, then the fee is 0.5% of the amount withdrawn.
        
        - Otherwise, the fee is 0.25% of the amount withdrawn
        
        
**ATM Session**

When it comes to this part, you will only test the withdrawal transaction (transaction choice 1). Failure to input the right kind of data results in the following outcomes:

  - Invalid amount -> throws InvalidAmountException
  
    o Valid amount for withdrawal -> product of 20 and 50
    
  - Invalid PIN format -> throws InvalidPINException
  
    o PIN should be 4 digits


**The Testing Targets**

I performed black box testing on the following classes:

  1) **atm.Session.java**: The focus here is to check for PIN format, and valid amount chosen for a
withdrawal transaction(transaction choice 1) as per the business logic presented above for **ATM
Session**. The technique to use for this test is Robust Worst Case Boundary Value Analysis under
the single fault assumption principle. In the program provided a withdrawal is limited to the
available balance of the account and the daily limit. For this assignment you must create an
account with a daily limit of $1000 and an available balance of $5,000. The daily limit of $1000 is
your upper boundary in this case.

  2) **bank.FeesCalculator.java**: The focus here is to check for the correct calculation of fees while
performing withdrawal, deposit, and transfer.

    o For withdrawal: Use Robust Worst Case Boundary Value Analysis to generate your test
cases.

    o For deposit: Use Weak Robust Equivalence Class Analysis to generate your test cases.
    
    o For transfer: Use Decision Table Analysis to generate your test cases

For each of the JUnit tests you can find:

  1) The test cases I have created. This has two sections. In the first section I just commented on the process and the assumptions I have used to calculate the test cases, using the analysis technique for the corresponding case. In the second section I have the tables with the test cases.
  
  2) The test results. This provides a table indicating the test case and whether the test passed or failed.
  
  3) The archive with the system’s code along with the JUnit code with which I ran my tests.
  
  
