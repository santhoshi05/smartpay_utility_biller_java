interface Billable {
	double calculateTotal(int units);
}
class MeterException extends Exception{
	public MeterException(String msg){
		super(msg);
	}
}
public class UtilityBill implements Billable {
	private double taxAmount;
	@Override
	public double calculateTotal(int units) {
		double total;
		if (units <= 100) {
			total = units*1.0;
		}
		else if (units <= 300) {
			total = (100*1.0) + ((units-100)* 2.0);
		}
		else {
			total = (100*1.0) + (200*2.0) + ((units-300)* 5.0);
		}
		taxAmount = total * 0.10;
		return total + taxAmount;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
}