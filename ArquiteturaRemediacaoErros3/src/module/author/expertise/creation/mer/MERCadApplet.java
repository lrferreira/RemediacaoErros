package module.author.expertise.creation.mer;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import module.creation.rules.RulesFactory;
import module.entity.DBConnect;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.TypeMER;
import util.Constants;
import util.StringConstants;

public class MERCadApplet extends JApplet {
	private JTextField textField;
	private JTextPane txtDescription;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JRadioButton rb3;
	private JRadioButton rb4;
	private JRadioButton rb5;
	private JLabel lblComplexidade;
	private JLabel lblFunofunes;
	private JCheckBox cbPapeisComplementares;
	private JCheckBox cbRestricaoDeInterpretacao;
	private JCheckBox cbCompreensaoMaisAprofundada;
	private JCheckBox cbTexto;
	private JCheckBox cbGrafico;
	private JCheckBox cbTabela;
	private JCheckBox cbImagem;
	private JCheckBox cbVideo;
	private JCheckBox cbEquacao;
	private JLabel lblTipos;
	private ButtonGroup bg;
	private DBConnect dbCon;
	private JLabel lblImage;
	
	public MERCadApplet() {
		getContentPane().setLayout(null);
		
		try {
			setDbCon(new DBConnect("C:\\users\\leandro2\\git\\RemediacaoErros\\ArquiteturaRemediacaoErros3\\db\\remediacao.sqlite"));
			//setDbCon(new DBConnect("C:\\users\\UFPR\\git\\RemediacaoErros\\ArquiteturaRemediacaoErros3\\db\\remediacao.sqlite"));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 500);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(30, 48, 60, 14);
		panel.add(lblDescrio);
		
		txtDescription = new JTextPane();
		txtDescription.setBounds(30, 73, 244, 63);
		panel.add(txtDescription);
		
		bg = new ButtonGroup();
		
		rb1 = new JRadioButton("1");
		rb1.setBounds(32, 205, 40, 23);
		bg.add(rb1);
		panel.add(rb1);
		
		rb2 = new JRadioButton("2");
		rb2.setBounds(74, 205, 40, 23);
		bg.add(rb2);
		panel.add(rb2);
		
		rb3 = new JRadioButton("3");
		rb3.setBounds(116, 205, 40, 23);
		bg.add(rb3);
		panel.add(rb3);
		
		rb4 = new JRadioButton("4");
		rb4.setBounds(158, 205, 40, 23);
		bg.add(rb4);
		panel.add(rb4);
		
		rb5 = new JRadioButton("5");
		rb5.setBounds(200, 205, 40, 23);
		bg.add(rb5);
		panel.add(rb5);
		
		lblComplexidade = new JLabel("Complexidade");
		lblComplexidade.setBounds(30, 173, 113, 14);
		panel.add(lblComplexidade);
		
		lblFunofunes = new JLabel("Fun\u00E7\u00E3o/Fun\u00E7\u00F5es");
		lblFunofunes.setBounds(30, 256, 113, 14);
		panel.add(lblFunofunes);
		
		cbPapeisComplementares = new JCheckBox("Pap\u00E9is Complementares");
		cbPapeisComplementares.setBounds(52, 290, 222, 23);
		panel.add(cbPapeisComplementares);
		
		cbRestricaoDeInterpretacao = new JCheckBox("Restrição de Interpretação");
		cbRestricaoDeInterpretacao.setBounds(52, 328, 244, 23);
		panel.add(cbRestricaoDeInterpretacao);
		
		cbCompreensaoMaisAprofundada = new JCheckBox("Compreens\u00E3o Mais Aprofundada");
		cbCompreensaoMaisAprofundada.setBounds(52, 366, 222, 23);
		panel.add(cbCompreensaoMaisAprofundada);
		
		cbTexto = new JCheckBox("TEXTO");
		cbTexto.setBounds(378, 78, 97, 23);
		panel.add(cbTexto);
		
		cbGrafico = new JCheckBox("GR\u00C1FICO");
		cbGrafico.setBounds(653, 131, 86, 23);
		panel.add(cbGrafico);
		
		cbTabela = new JCheckBox("TABELA");
		cbTabela.setBounds(653, 78, 86, 23);
		panel.add(cbTabela);
		
		cbImagem = new JCheckBox("IMAGEM");
		cbImagem.setBounds(378, 131, 97, 23);
		panel.add(cbImagem);
		
		cbVideo = new JCheckBox("V\u00CDDEO");
		cbVideo.setBounds(504, 131, 97, 23);
		panel.add(cbVideo);
		
		lblTipos = new JLabel("Tipo(s)");
		lblTipos.setBounds(378, 48, 46, 14);
		panel.add(lblTipos);
		
		cbEquacao = new JCheckBox("EQUA\u00C7\u00C3O");
		cbEquacao.setBounds(504, 78, 97, 23);
		panel.add(cbEquacao);
		
		JLabel lblCadastroDeMltipla = new JLabel("CADASTRO DE M\u00DALTIPLA REPRESENTA\u00C7\u00C3O EXTERNA");
		lblCadastroDeMltipla.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastroDeMltipla.setBounds(10, 11, 414, 14);
		panel.add(lblCadastroDeMltipla);
		
		textField = new JTextField();
		textField.setBounds(459, 187, 212, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser file = new JFileChooser(); 
				file.setFileSelectionMode(JFileChooser.FILES_ONLY); 
				//file.addChoosableFileFilter(new FileNameExtensionFilter);
				int i= file.showOpenDialog(MERCadApplet.this); 
				if (i==1){ 
					textField.setText(""); 
					} else { 
						renderImage(file);
					}

				}
		});
		
		btnNewButton.setBounds(675, 186, 54, 23);
		panel.add(btnNewButton);
		
		JLabel lblArquivo = new JLabel("Arquivo:");
		lblArquivo.setBounds(378, 190, 46, 14);
		panel.add(lblArquivo);
		
		JLabel lblVisualizao = new JLabel("Visualiza\u00E7\u00E3o");
		lblVisualizao.setBounds(365, 245, 86, 14);
		panel.add(lblVisualizao);
		
		JButton btnSalvar = new JButton("Salvar MRE");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MultipleExternalRepresentation mre = new MultipleExternalRepresentation();
				
				mre.setDescription(txtDescription.getText());
				//mre.setPath("\"" + textField.getText() + "\"");
				
				if (rb1.isSelected())
					mre.setComplexity(1);
				if (rb2.isSelected())
					mre.setComplexity(2);
				if (rb3.isSelected())
					mre.setComplexity(3);
				if (rb4.isSelected())
					mre.setComplexity(4);
				if (rb5.isSelected())
					mre.setComplexity(5);
				
				mre.setMerFunctions(new ArrayList<MERFunction>());
				
				if (cbPapeisComplementares.isSelected())
					mre.getMerFunctions().add(new MERFunction(Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES, "Papéis Complementares"));
				if (cbRestricaoDeInterpretacao.isSelected())
					mre.getMerFunctions().add(new MERFunction(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO, "Restrição de Interpretação"));
				if (cbCompreensaoMaisAprofundada.isSelected())
					mre.getMerFunctions().add(new MERFunction(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA, "Compreensão Mais Aprofundada"));
				
				mre.setTypeMers(new ArrayList<TypeMER>());
				
				if (cbTexto.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_TEXTO, "Texto"));
				if (cbGrafico.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_GRAFICO, "Gráfico"));
				if (cbTabela.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_TABELA, "Tabela"));
				if (cbImagem.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_IMAGEM, "Imagem"));
				if (cbVideo.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_VIDEO, "Vídeo"));
				if (cbEquacao.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_EQUACAO, "Equação"));

				try {
					mre.setImage(renderByte(textField.getText()));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				dbCon.save(mre);
				RulesFactory.createRules(mre);
				RulesFactory.compile(StringConstants.FILE_MER_MANAGER_KB);
			}
		});
		btnSalvar.setBounds(278, 465, 123, 23);
		panel.add(btnSalvar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 309, 10);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 444, 309, 10);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(10, 36, 10, 406);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(317, 36, 10, 406);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(365, 36, 385, 2);
		panel.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(365, 231, 385, 2);
		panel.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(365, 39, 20, 190);
		panel.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(749, 39, 20, 190);
		panel.add(separator_7);
		
		lblImage = new JLabel("");
		lblImage.setBounds(365, 270, 385, 184);
		panel.add(lblImage);
		
	}
	
	private byte[] renderByte(String file) throws FileNotFoundException, IOException {

		File image = new File(file);
        FileInputStream fis = new FileInputStream(image);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];

        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;)
            {
                bos.write(buf, 0, readNum);
                //no doubt here is 0
                /*Writes len bytes from the specified byte array starting at offset
                off to this byte array output stream.*/
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return bos.toByteArray();

	}
	
	private void renderImage(JFileChooser file){
		File arquivo = file.getSelectedFile(); 
		textField.setText(arquivo.getPath()); 
		URL imageURL = null;
		try {
			imageURL = arquivo.toURI().toURL();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image = Toolkit.getDefaultToolkit().createImage(imageURL);
		//Image scaled = image.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
		lblImage.setIcon(new ImageIcon(image));
	}

	public DBConnect getDbCon() {
		return dbCon;
	}

	public void setDbCon(DBConnect dbCon) {
		this.dbCon = dbCon;
	}
}
