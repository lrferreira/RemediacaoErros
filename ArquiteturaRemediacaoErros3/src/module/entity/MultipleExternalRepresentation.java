package module.entity;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MultipleExternalRepresentation {

	private int id;
	
	private String descricao;
	
	private String [] tags;
	
	private String imageName;

	public MultipleExternalRepresentation(int id, String imageName, String descricao) {
		this.id = id;
		this.setDescricao(descricao);
		this.setImageName(imageName);
		
	}



	public MultipleExternalRepresentation() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String [] getTags() {
		return tags;
	}



	public void setTags(String [] tags) {
		this.tags = tags;
	}


	public String getImageName() {
		return imageName;
	}



	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	
	
}
