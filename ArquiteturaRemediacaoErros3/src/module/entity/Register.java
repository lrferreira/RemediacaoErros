package module.entity;

public class Register {

	private int id;
	
	private Action action;
	
	private MERFunction merFunction;
	
	private MultipleExternalRepresentation mer;

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public MERFunction getMerFunction() {
		return merFunction;
	}

	public void setMerFunction(MERFunction merFunction) {
		this.merFunction = merFunction;
	}

	public MultipleExternalRepresentation getMer() {
		return mer;
	}

	public void setMer(MultipleExternalRepresentation mer) {
		this.mer = mer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
