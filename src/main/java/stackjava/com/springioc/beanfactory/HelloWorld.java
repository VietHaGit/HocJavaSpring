package stackjava.com.springioc.beanfactory;

public class HelloWorld {
	private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.print("Print :" +message);
    }
}