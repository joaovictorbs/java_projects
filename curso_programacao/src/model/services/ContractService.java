package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private int months;
    private Contract contract;

    private OnlinePaymentService paymentService;

    public ContractService(Contract contract, Integer months, OnlinePaymentService paymentService) {
        this.contract = contract;
        this.months = months;
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months) {

        LocalDate newDate = contract.getDate();

        double installmentValue = contract.getTotalValue() / months;

        for (int i=1; i<=months; i++) {

            double interest = paymentService.interest(installmentValue, i);
            double sumValue = installmentValue + interest;

            double paymentFee = paymentService.paymentFee(sumValue);
            sumValue += paymentFee;

            LocalDate installmentDate = newDate.plusMonths(i);
            contract.addInstallment(new Installment(installmentDate, sumValue));
        }
    }
}
