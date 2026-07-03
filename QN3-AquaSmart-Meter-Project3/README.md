# QN3 AquaSmart Meter - Project 3

## Five classes

1. `Customer` - represents the water user. Collaborator: `TokenPayment`.
2. `SmartMeter` - checks credit and opens or closes water. Collaborator: `Customer`.
3. `TokenPayment` - represents water credit bought by mobile money. Collaborator: `SmartMeter`.
4. `ConsumptionLog` - records water usage events. Collaborator: `SmartMeter`.
5. `LeakDetector` - checks abnormal continuous flow. Collaborator: `ConsumptionLog`.

## Program answer

`SmartMeter` has the private fields requested in the question: `meterId`, `creditBalance`, and `valveOpen`.

The constructor sets the meter id, sets the opening credit, and opens the valve. `loadToken(double amount)` adds credit and opens the valve. `recordConsumption(double litres)` charges UGX 50 per litre. If credit reaches zero or goes below zero, the balance becomes zero and the valve closes.

## JUnit tests

There are two JUnit tests in `SmartMeterTest`.

One test closes the valve by using more credit than is available, then loads a token and checks that the valve opens again. The other test checks that too much consumption makes the valve close.

## Encapsulation

Encapsulation is applied because the important data is private. This prevents another class from setting a wrong balance or opening the valve without buying credit. It helps KIS keep billing honest and prevents free water from being dispensed by mistake.

## NetBeans

Open this folder with `File` > `Open Project` in NetBeans. Run the main program for sample output, or run tests to check the JUnit part.
