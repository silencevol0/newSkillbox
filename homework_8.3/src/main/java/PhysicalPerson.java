public class PhysicalPerson extends Client {


    @Override
    public void getInformation() {
        System.out.println("Для физических лиц снятие и пополнение осуществляются без комиссии");
        System.out.println("Ваш баланс состовляет " + getAccount() + "$");
    }

    @Override
    public double getAmount() {
        System.out.println("На Вашем счету " + getAccount() + "$");
        return getAccount();
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut <= 0) {
            System.out.println("В операции отказано, Вы не можете положить на счет отрицательную сумму.");
        }
        else {
            setAccount(getAccount() + amountToPut);
            System.out.println("Вы положили " + amountToPut + "$ на свой счет. Теперь на счету " + getAccount() + "$");
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake > getAccount()) {
            System.out.println("В операции отказано, Вы не можете снять денег больше, чем имеете на счете.");
        }
        else {
            setAccount(getAccount() - amountToTake);
            System.out.println("Вы сняли " + amountToTake + "$ со своего счета, остаток = " + getAccount() + "$");
        }
    }
}
