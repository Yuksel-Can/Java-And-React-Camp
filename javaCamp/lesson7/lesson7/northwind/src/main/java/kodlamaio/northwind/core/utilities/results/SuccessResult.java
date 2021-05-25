package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result{
	public SuccessResult() {	//bu işlem sonucu başarılı fakat mesaj donmeyendir.
		super(true);
	}
	
	public SuccessResult(String message) {
		super(true,message);
	}
}