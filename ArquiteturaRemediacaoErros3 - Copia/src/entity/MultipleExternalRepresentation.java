package entity;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class MultipleExternalRepresentation {

	private int id;
	
	private String descricao;
	
	private String [] tags;
	
	private Image img;

	public MultipleExternalRepresentation(int id, String imageName, String descricao) {
		this.id = id;
		this.setDescricao(descricao);
		
	    URL imgUrl = getClass().getClassLoader().getResource("images/"+imageName);
	    ImageIcon icon = new ImageIcon(imgUrl);
		this.setImg(icon.getImage());
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



	public Image getImg() {
		return img;
	}



	public void setImg(Image img) {
		this.img = img;
	}

	
	
}
