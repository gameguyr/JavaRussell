package firstCourseInJava.Module6;

/**
 * Write a simple cash register class.
 *
 * Each cash register should keep track of the number of items checked out and the total cash in the register.
 *
 * We are only concerned with the number of items to check out and their prices. No need to handle item names, SKUs, taxes, etc...
 *
 * It should have the following methods (use static when appropriate):
 *
 * checkout( )
 * Takes two forms. If there is only one parameter that is the cash received and there is only one item checked out. If it has two parameters, the first parameter should have the number of items checked out and the second parameter is the price per item.
 * cashout( )
 * Reset the number of items and total cash to zero for a cash register
 * getItems( )
 * Returns the number of items in the cash register
 * getTotalCash( )
 * Returns the total cash in the cash register
 * getAveragePricePerItem( )
 * Returns the average price per item checked out by the cash register
 * getRegisterCount( )
 * Returns the number of cash registers created
 * getAllItems( )
 * Returns the total number of items for all cash registers
 * getAllTotalCash( )
 * Returns the total cash for all cash registers
 * For your main method, write some code to test your cash register class. Instantiate at least two cash register objects and check out a few items for each cash register.
 *
 * It should then print for each cash register:
 *
 * the total items
 * total cash
 * average price per item
 * And finally, it should print:
 *
 * the number of cash registers created
 * the total items checked out for all cash registers
 * the total cash for all cash registers
 * Note: Don't worry about the format of the currency.
 *
 */
public class Assignment6 {
    public static void main(String[] args) {
        System.out.println("Handling affairs at the Bus station");
        CashRegister cashRegisterBusStation = new CashRegister();
        double priceOfBusTicket = 14.95;
        double priceOfBusSnack = 5.00;

        cashRegisterBusStation.checkout(priceOfBusSnack);
        cashRegisterBusStation.checkout(25, priceOfBusTicket);
        System.out.println("Let's see the total items for the Bus station: " + cashRegisterBusStation.getItemsCheckedOut());
        System.out.println("Let's see the total cash for the Bus station: " + cashRegisterBusStation.getCashInRegister());
        System.out.println("Let's see the average price per item for the Bus station: " + cashRegisterBusStation.getAveragePricePerItem());



        System.out.println("Handling affairs at the Train station");
        CashRegister cashRegisterTrainStation = new CashRegister();
        double priceOfTrainTicket = 22.95;
        double priceOfTrainSouvenir = 10.00;

        cashRegisterTrainStation.checkout(priceOfTrainSouvenir);
        cashRegisterTrainStation.checkout(priceOfTrainSouvenir);
        cashRegisterTrainStation.checkout(priceOfTrainSouvenir);
        cashRegisterTrainStation.checkout(priceOfTrainSouvenir);

        cashRegisterTrainStation.checkout(678, priceOfTrainTicket);
        System.out.println("Let's see the total items for the Train station: " + cashRegisterTrainStation.getItemsCheckedOut());
        System.out.println("Let's see the total cash for the Train station: " + cashRegisterTrainStation.getCashInRegister());
        System.out.println("Let's see the average price per item for the Train station: " + cashRegisterTrainStation.getAveragePricePerItem());



        System.out.println("Handling affairs on the Ferry");
        CashRegister cashRegisterFerryStation = new CashRegister();
        double priceOfFerryTicket = 9.50;
        double priceOfFerryLifeVest = 10.00;

        cashRegisterFerryStation.checkout(priceOfFerryLifeVest);
        cashRegisterFerryStation.checkout(priceOfFerryLifeVest);

        cashRegisterFerryStation.checkout(420, priceOfFerryTicket);
        System.out.println("Let's see the total items for the Ferry: " + cashRegisterFerryStation.getItemsCheckedOut());
        System.out.println("Let's see the total cash for the Ferry: " + cashRegisterFerryStation.getCashInRegister());
        System.out.println("Let's see the average price per item for the Ferry: " + cashRegisterFerryStation.getAveragePricePerItem());


        System.out.println("Let's see how many items and cash we have");
        System.out.println("Total number of cash registers: " + CashRegister.getTotalCountOfAllRegisters());
        System.out.println("Total cash of all cash registers: " + CashRegister.getTotalCashInAllRegisters());
        System.out.println("Total number of items checked out for all cash registers: " + CashRegister.getTotalItemsInAllRegisters());


        System.out.println("End of the day, time to cashout!");
        cashRegisterBusStation.cashout();
        cashRegisterTrainStation.cashout();
        cashRegisterFerryStation.cashout();

        System.out.println("Let's see how many items and cash we have");
        System.out.println("Total number of cash registers: " + CashRegister.getTotalCountOfAllRegisters());
        System.out.println("Total cash of all cash registers: " + CashRegister.getTotalCashInAllRegisters());
        //looks like there is a decimal being dropped somewhere
        System.out.println("Total number of items checked out for all cash registers: " + CashRegister.getTotalItemsInAllRegisters());





    }


}
