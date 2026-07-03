<<<<<<< HEAD
# QN3 AquaSmart Meter - Project 3

## Five classes

1. `WaterCustomer` - represents the water user. Collaborator: `SmartMeter`.
2. `SmartMeter` - checks credit and opens or closes water. Collaborator: `WaterCustomer`.
3. `MobileMoneyToken` - represents water credit bought by mobile money. Collaborator: `SmartMeter`.
4. `ConsumptionLog` - records water usage events. Collaborator: `SmartMeter`.
5. `LeakDetector` - checks abnormal continuous flow. Collaborator: `ConsumptionLog`.
6. `DisconnectionRecord` - tracks how long a meter stays disconnected. Collaborator: `SmartMeter`.

These classes are implemented as separate simple Java classes in the `src` folder. This version uses different names from the other projects while still answering the same question.

## Program answer

`SmartMeter` has the private fields requested in the question: `meterId`, `creditBalance`, and `valveOpen`.

The constructor sets the meter id, sets the opening credit, and opens the valve. `loadToken(double amount)` adds credit and opens the valve. `recordConsumption(double litres)` charges UGX 50 per litre. If credit reaches zero or goes below zero, the balance becomes zero and the valve closes.

## JUnit tests

There are two JUnit tests in `SmartMeterTest`.

One test closes the valve by using more credit than is available, then loads a token and checks that the valve opens again. The other test checks that too much consumption makes the valve close.

## Encapsulation

Encapsulation is applied because the important data is private. This prevents another class from setting a wrong balance or opening the valve without buying credit. It helps KIS keep billing honest and prevents free water from being dispensed by mistake.
=======
>>>>>>> ab8745fa5512683ac827817fd6455bb894aa51d9

## NetBeans

Open this folder with `File` > `Open Project` in NetBeans. Run the main program for sample output, or run tests to check the JUnit part.
