package firstCourseInJava.Module6;

public class CashRegister {
    private int itemsCheckedOut;
    private double cashInRegister;
    private static int totalCountOfAllRegisters;
    private static int totalItemsInAllRegisters;
    private static double totalCashInAllRegisters;



    CashRegister() {
        increaseRegisterCount();
        setItemsCheckedOut(0);
        setCashInRegister(0);
    }

    public void checkout(double cashReceived) {
        setItemsCheckedOut(getItemsCheckedOut() + 1);
        setCashInRegister(getCashInRegister() + cashReceived);
        setTotalCashInAllRegisters(getTotalCashInAllRegisters() + cashReceived);
        setTotalItemsInAllRegisters(getTotalItemsInAllRegisters() + 1);
    }

    public void checkout(int numberOfItemsCheckedOut, double pricePerItem) {
        setItemsCheckedOut(getItemsCheckedOut() + numberOfItemsCheckedOut);
        setCashInRegister(getCashInRegister() + (numberOfItemsCheckedOut * pricePerItem));
        setTotalCashInAllRegisters(getTotalCashInAllRegisters() + (numberOfItemsCheckedOut * pricePerItem));
        setTotalItemsInAllRegisters(getTotalItemsInAllRegisters() + numberOfItemsCheckedOut);
    }

    public void cashout() {
        setTotalCashInAllRegisters(getTotalCashInAllRegisters() - getCashInRegister());
        setTotalItemsInAllRegisters(getTotalItemsInAllRegisters() - getItemsCheckedOut());
        setItemsCheckedOut(0);
        setCashInRegister(0);
    }

    public double getAveragePricePerItem() {
        return cashInRegister / itemsCheckedOut;
    }

    public static int getTotalCountOfAllRegisters() {
        return totalCountOfAllRegisters;
    }

    private void increaseRegisterCount() {
        totalCountOfAllRegisters++;
    }


    public static int getTotalItemsInAllRegisters() {
        return totalItemsInAllRegisters;
    }

    public static void setTotalItemsInAllRegisters(int totalItemsInAllRegisters) {
        CashRegister.totalItemsInAllRegisters = totalItemsInAllRegisters;
    }

    public static double getTotalCashInAllRegisters() {
        return totalCashInAllRegisters;
    }

    public static void setTotalCashInAllRegisters(double totalCashInAllRegisters) {
        CashRegister.totalCashInAllRegisters = totalCashInAllRegisters;
    }



















    public int getItemsCheckedOut() {
        return itemsCheckedOut;
    }

    public void setItemsCheckedOut(int itemsCheckedOut) {
        this.itemsCheckedOut = itemsCheckedOut;
    }

    public double getCashInRegister() {
        return cashInRegister;
    }

    public void setCashInRegister(double cashInRegister) {
        this.cashInRegister = cashInRegister;
    }


}
