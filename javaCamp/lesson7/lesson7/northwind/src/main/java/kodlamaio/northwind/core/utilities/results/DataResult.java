package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result{

	private T data;
	
	
	public DataResult(T data,boolean success, String message) {
		super(success, message);	//base sınıfın constructorunu çalıştırır
		this.data = data;
	}
	
	public DataResult(T data,boolean success) {	//mesajsız
		super(success);	//base sınıfın constructorunu çalıştırır
		this.data = data;
	}

	public T getData() {
		return this.data;
	}
}
