
public class Teacher implements Listen<Violin> {

	@Override
	public void listen(Violin e) {
		e.pull();
		
	}

}
