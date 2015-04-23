package module.entity;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MultipleExternalRepresentation {

	private Long id;
	
	private String description;
	
	private String [] tags;
	
	private byte[] image;
	
	private Integer complexity;
	
	private ArrayList<MERFunction> merFunctions;
	
	private ArrayList<TypeMER> typeMers;
	
	public MultipleExternalRepresentation(Long id, byte[] image, String descricao, ArrayList<MERFunction> merFunctions, ArrayList<TypeMER> typeMers) {
		this.id = id;
		this.setDescription(descricao);
		this.setImage(image);
		this.setMerFunctions(merFunctions);
		this.setTypeMers(typeMers);
		
	}



	public MultipleExternalRepresentation() {
		// TODO Auto-generated constructor stub
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



	public String [] getTags() {
		return tags;
	}



	public void setTags(String [] tags) {
		this.tags = tags;
	}


	public Integer getComplexity() {
		return complexity;
	}



	public void setComplexity(Integer complexity) {
		this.complexity = complexity;
	}



	public ArrayList<MERFunction> getMerFunctions() {
		return merFunctions;
	}



	public void setMerFunctions(ArrayList<MERFunction> merFunctions) {
		this.merFunctions = merFunctions;
	}



	public ArrayList<TypeMER> getTypeMers() {
		return typeMers;
	}



	public void setTypeMers(ArrayList<TypeMER> typeMers) {
		this.typeMers = typeMers;
	}


	public byte[] getImage() {
		return image;
	}



	public void setImage(byte[] image) {
		this.image = image;
	}



	public void renderImage(JLabel lbl) {
		if (image != null) {
			InputStream is = new ByteArrayInputStream(image);  
			Image img = new ImageIcon(image).getImage(); 
			lbl.setIcon(new ImageIcon(img));
		}
		
	}

	
	
}
