package module.author.expertise.creation.sorters.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Sorter implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String description;
	
	private ArrayList<ItemSorter> itensSorter;

	public ArrayList<ItemSorter> getItensSorter() {
		return itensSorter;
	}

	public void setItensSorter(ArrayList<ItemSorter> itensSorter) {
		this.itensSorter = itensSorter;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
