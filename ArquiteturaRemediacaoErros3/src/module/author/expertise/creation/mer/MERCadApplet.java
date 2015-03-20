package module.author.expertise.creation.mer;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class MERCadApplet extends JApplet {
	private JTextField textField;
	public MERCadApplet() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 500);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(30, 48, 60, 14);
		panel.add(lblDescrio);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(30, 73, 244, 63);
		panel.add(textPane);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBounds(32, 205, 40, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBounds(74, 205, 40, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBounds(116, 205, 40, 23);
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.setBounds(158, 205, 40, 23);
		panel.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.setBounds(200, 205, 40, 23);
		panel.add(radioButton_4);
		
		JLabel lblComplexidade = new JLabel("Complexidade");
		lblComplexidade.setBounds(30, 173, 113, 14);
		panel.add(lblComplexidade);
		
		JLabel lblFunofunes = new JLabel("Fun\u00E7\u00E3o/Fun\u00E7\u00F5es");
		lblFunofunes.setBounds(30, 256, 113, 14);
		panel.add(lblFunofunes);
		
		JCheckBox chckbxPapisComplementares = new JCheckBox("Pap\u00E9is Complementares");
		chckbxPapisComplementares.setBounds(52, 290, 166, 23);
		panel.add(chckbxPapisComplementares);
		
		JCheckBox chckbxRestrioDeInformao = new JCheckBox("Restri\u00E7\u00E3o de Informa\u00E7\u00E3o");
		chckbxRestrioDeInformao.setBounds(52, 328, 166, 23);
		panel.add(chckbxRestrioDeInformao);
		
		JCheckBox chckbxCompreensoMaisAprofundada = new JCheckBox("Compreens\u00E3o Mais Aprofundada");
		chckbxCompreensoMaisAprofundada.setBounds(52, 366, 222, 23);
		panel.add(chckbxCompreensoMaisAprofundada);
		
		JCheckBox chckbxTexto = new JCheckBox("TEXTO");
		chckbxTexto.setBounds(378, 78, 97, 23);
		panel.add(chckbxTexto);
		
		JCheckBox chckbxGrfico = new JCheckBox("GR\u00C1FICO");
		chckbxGrfico.setBounds(653, 131, 86, 23);
		panel.add(chckbxGrfico);
		
		JCheckBox chckbxTabela = new JCheckBox("TABELA");
		chckbxTabela.setBounds(653, 78, 86, 23);
		panel.add(chckbxTabela);
		
		JCheckBox chckbxImagem = new JCheckBox("IMAGEM");
		chckbxImagem.setBounds(378, 131, 97, 23);
		panel.add(chckbxImagem);
		
		JCheckBox chckbxVdeo = new JCheckBox("V\u00CDDEO");
		chckbxVdeo.setBounds(504, 131, 97, 23);
		panel.add(chckbxVdeo);
		
		JLabel lblTipos = new JLabel("Tipo(s)");
		lblTipos.setBounds(378, 48, 46, 14);
		panel.add(lblTipos);
		
		JCheckBox chckbxEquao = new JCheckBox("EQUA\u00C7\u00C3O");
		chckbxEquao.setBounds(504, 78, 97, 23);
		panel.add(chckbxEquao);
		
		JLabel lblCadastroDeMltipla = new JLabel("CADASTRO DE M\u00DALTIPLA REPRESENTA\u00C7\u00C3O EXTERNA");
		lblCadastroDeMltipla.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadastroDeMltipla.setBounds(10, 11, 414, 14);
		panel.add(lblCadastroDeMltipla);
		
		textField = new JTextField();
		textField.setBounds(459, 187, 212, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(675, 186, 54, 23);
		panel.add(btnNewButton);
		
		JLabel lblArquivo = new JLabel("Arquivo:");
		lblArquivo.setBounds(378, 190, 46, 14);
		panel.add(lblArquivo);
		
		JLabel lblVisualizao = new JLabel("Visualiza\u00E7\u00E3o");
		lblVisualizao.setBounds(365, 245, 86, 14);
		panel.add(lblVisualizao);
		
		JButton btnSalvar = new JButton("Salvar MRE");
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
}
