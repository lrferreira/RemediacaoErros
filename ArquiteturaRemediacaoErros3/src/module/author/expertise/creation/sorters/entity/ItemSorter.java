package module.author.expertise.creation.sorters.entity;

import java.io.Serializable;

import module.entity.MERFunction;

public class ItemSorter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private ErrorType errorType;
	private MERFunction merFunction;
	private String statedError;
	private Remediation remediation;
	
	public ErrorType getErrorType() {
		return errorType;
	}
	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}
	public MERFunction getMerFunction() {
		return merFunction;
	}
	public void setMerFunction(MERFunction merFunction) {
		this.merFunction = merFunction;
	}
	public Remediation getRemediation() {
		return remediation;
	}
	public void setRemediation(Remediation remediation) {
		this.remediation = remediation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatedError() {
		return statedError;
	}
	public void setStatedError(String statedError) {
		this.statedError = statedError;
	}
	
	
}
