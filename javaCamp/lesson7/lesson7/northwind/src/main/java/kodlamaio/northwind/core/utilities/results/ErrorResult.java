package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result{
	public ErrorResult() {	//bu işlem sonucu başarılı fakat mesaj donmeyendir.
		super(false);
	}
	
	public ErrorResult(String message) {
		super(false,message);
	}
}