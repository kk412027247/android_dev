
public class Student implements Listen<Piano> {

	@Override
	public void listen(Piano e) {
		e.play();	
	}

}
