package module.author.expertise.creation.sorters.entity;

import java.io.Serializable;

import module.entity.MERFunction;

public class ItemSorter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Sorter sorter;
	private ErrorType errorType;
	private SubErrorType subErrorType;
	private MERFunction merFunction;
	
	private String remediation;
	
	public ItemSorter(Long id, Sorter sorter, ErrorType errorType, SubErrorType subErrorType, MERFunction merFunction,
			 String remediation) {
		super();
		this.id = id;
		this.sorter = sorter;
		this.errorType = errorType;
		this.subErrorType = subErrorType;
		this.merFunction = merFunction;
		this.remediation = remediation;
	}
	
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
	public String getRemediation() {
		return remediation;
	}
	public void setRemediation(String remediation) {
		this.remediation = remediation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public SubErrorType getSubErrorType() {
		return subErrorType;
	}

	public void setSubErrorType(SubErrorType subErrorType) {
		this.subErrorType = subErrorType;
	}

	public Sorter getSorter() {
		return sorter;
	}

	public void setSorter(Sorter sorter) {
		this.sorter = sorter;
	}
	
	
}
