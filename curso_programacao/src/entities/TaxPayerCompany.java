package entities;

public class TaxPayerCompany extends TaxPayer {

    private Integer numberOfEmployees;

    public TaxPayerCompany(){
        super();
    }

    public TaxPayerCompany(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {

        Double sum, tax, taxEmployees = 0.0;

        tax = 0.16;
        if (numberOfEmployees > 10) {
            tax = 0.14;
        }
        sum = getAnualIncome() * tax;

        return sum;
    }
}
