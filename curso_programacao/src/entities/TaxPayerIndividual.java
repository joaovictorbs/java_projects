package entities;

public class TaxPayerIndividual extends TaxPayer {

    private Double healthExpenditures;

    public TaxPayerIndividual(){
        super();
    }
    public TaxPayerIndividual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {

        Double sum, tax, taxHealth = 0.0;

        if (getAnualIncome() < 20000.00) {
            tax = 0.15;
        } else {
            tax = 0.25;
        }

        if (healthExpenditures != 0.0) {
            taxHealth = 0.5;
        }

        sum = (getAnualIncome() * tax) - (healthExpenditures * taxHealth);

        return sum;
    }
}
