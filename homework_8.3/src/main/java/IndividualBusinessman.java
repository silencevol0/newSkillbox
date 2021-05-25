public class IndividualBusinessman extends Client {


    @Override
    public void getInformation() {
        System.out.println("При снятии наличных комиссия взыматься не будет. При пополнении " +
                "будет взыматься 1% в случае, если сумма мене 1.000руб, и 0.5% в случае если сумма более 1.000 руб");
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
        else if (amountToPut < 1000){
            setAccount(getAccount() + amountToPut - (amountToPut * 0.01));
            System.out.println("Вы положили " + amountToPut + "$ на свой счет. Комиссия составила 1% от заданной суммы " +
                    "Теперь на счету " + getAccount() + "$");
        }
        else  {
            setAccount(getAccount() + amountToPut - (amountToPut * 0.005));
            System.out.println("Вы положили " + amountToPut + "$ на свой счет. Комиссия составила 0.5% от заданной суммы " +
                    "Теперь на счету " + getAccount() + "$");
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake > getAccount()) {
            System.out.println("В операции отказано, Вы не можете снять денег больше, чем имеете на счете.");
        }
        else {
            setAccount(getAccount() - amountToTake);
            System.out.println("Вы сняли " + amountToTake + "$ со своего счета. Остаток = " + getAccount() + "$");
        }
    }
}
