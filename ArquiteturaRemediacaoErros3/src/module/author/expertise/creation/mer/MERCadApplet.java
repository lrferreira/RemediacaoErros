package module.author.expertise.creation.mer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
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

import module.entity.DBConnect;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.TypeMER;
import util.Constants;

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
		cbPapeisComplementares.setBounds(52, 290, 166, 23);
		panel.add(cbPapeisComplementares);
		
		cbRestricaoDeInterpretacao = new JCheckBox("Restrição de Interpretação");
		cbRestricaoDeInterpretacao.setBounds(52, 328, 166, 23);
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
				int i= file.showSaveDialog(null); 
				if (i==1){ 
					textField.setText(""); 
					} else { 
						File arquivo = file.getSelectedFile(); 
						textField.setText(arquivo.getPath()); }

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
				
				mre.setDescription("\"" + txtDescription.getText() + "\"");
				mre.setPath("\"" + textField.getText() + "\"");
				
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
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_TEXTO, null));
				if (cbGrafico.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_GRAFICO, null));
				if (cbTabela.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_TABELA, null));
				if (cbImagem.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_IMAGEM, null));
				if (cbVideo.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_VIDEO, null));
				if (cbEquacao.isSelected())
					mre.getTypeMers().add(new TypeMER(Constants.TIPO_MRE_EQUACAO, null));

				dbCon.save(mre);
										
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
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(365, 262, 377, 184);
		panel.add(textPane_1);
	}

	public DBConnect getDbCon() {
		return dbCon;
	}

	public void setDbCon(DBConnect dbCon) {
		this.dbCon = dbCon;
	}
}
