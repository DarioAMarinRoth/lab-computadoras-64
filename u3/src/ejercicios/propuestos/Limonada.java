package ejercicios.propuestos;

public class Limonada {

    public static void main(String[] args) {
        Limonada l = new Limonada();
        int[] bills = {5, 5, 5, 10, 5, 5, 10, 20, 20, 20};
        System.out.println(l.lemonadeChange(bills));
    }


    public boolean lemonadeChange(int[] bills) {
        int price = 5;
        int[] cashInRegister = {0, 0, 0};

        for (int bill : bills) {
            int change = bill - price;

            if (isPossibleChange(change, cashInRegister)) {
                updateCashRegister(bill, cashInRegister);
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPossibleChange(int change, int[] billsInRegister) {
        switch (change) {
            case 15:
                if (billsInRegister[1] > 0) {
                    billsInRegister[1]--;
                    change -= 10;
                }
            case 5:
                int nBills = change / 5;
                if (billsInRegister[0] < nBills) {
                    return false;
                }
                billsInRegister[0] -= nBills;
            default:
                return true;
        }
    }

    public void updateCashRegister(int bill, int[] billsInRegister) {
        switch (bill) {
            case 5:
                billsInRegister[0]++;
                break;
            case 10:
                billsInRegister[1]++;
                break;
            case 20:
                billsInRegister[2]++;
                break;
        }
    }
}
