package module.author.expertise.creation.rules;

import javax.swing.JApplet;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;

public class RulesApplet extends JApplet{
	private JTextField textField;
	public RulesApplet() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 966, 527);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(308, 202, 58, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Estudante informou a resposta", "Estudante cometeu um erro (n\u00E3o importa a resposta)"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(28, 207, 272, 20);
		panel.add(comboBox);
		
		JLabel lblCaminhoDeResoluo = new JLabel("CAMINHO DE RESOLU\u00C7\u00C3O:");
		lblCaminhoDeResoluo.setBounds(28, 84, 179, 14);
		panel.add(lblCaminhoDeResoluo);
		
		JLabel lblMeta = new JLabel("META:");
		lblMeta.setBounds(28, 109, 46, 14);
		panel.add(lblMeta);
		
		JLabel lblAdicionarRemediaoDe = new JLabel("ADICIONAR REMEDIA\u00C7\u00C3O DE ERRO");
		lblAdicionarRemediaoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdicionarRemediaoDe.setBounds(28, 21, 272, 14);
		panel.add(lblAdicionarRemediaoDe);
		
		JLabel lblSe = new JLabel("Se");
		lblSe.setBounds(28, 182, 46, 14);
		panel.add(lblSe);
		
		JLabel lblEnto = new JLabel("Ent\u00E3o");
		lblEnto.setBounds(28, 248, 46, 14);
		panel.add(lblEnto);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Interpreta\u00E7\u00E3o Equivocada", "Diretamente Identific\u00E1vel", "Indiretamente Identific\u00E1vel", "Solu\u00E7\u00E3o N\u00E3o Categoriz\u00E1vel"}));
		comboBox_2.setBounds(259, 273, 221, 20);
		panel.add(comboBox_2);
		
		JLabel lblE = new JLabel("E");
		lblE.setBounds(28, 378, 46, 14);
		panel.add(lblE);
		
		JLabel lblEspecificarRemediao = new JLabel("Especificar MRE:");
		lblEspecificarRemediao.setBounds(562, 37, 146, 14);
		panel.add(lblEspecificarRemediao);
		
		JLabel lblCritrioDeClassificao = new JLabel("Crit\u00E9rio para Remedia\u00E7\u00E3o");
		lblCritrioDeClassificao.setBounds(28, 457, 146, 14);
		panel.add(lblCritrioDeClassificao);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"MER espec\u00EDfica para o erro", "Persist\u00EAncia no erro", "Alternar entre MRES", "Complexidade", "Sucessos anteriores com a MRE"}));
		comboBox_5.setSelectedIndex(1);
		comboBox_5.setBounds(259, 454, 221, 20);
		panel.add(comboBox_5);
		
		JLabel lblClassifiqueOTipo = new JLabel("Classifique o Tipo de Erro como");
		lblClassifiqueOTipo.setBounds(28, 276, 228, 14);
		panel.add(lblClassifiqueOTipo);
		
		JLabel lblClassifiqueOTipo_1 = new JLabel("Com este tipo de erro");
		lblClassifiqueOTipo_1.setBounds(28, 406, 228, 14);
		panel.add(lblClassifiqueOTipo_1);
		
		JLabel lblE_1 = new JLabel("E");
		lblE_1.setBounds(28, 312, 46, 14);
		panel.add(lblE_1);
		
		JLabel lblClassifiqueOSubtipo = new JLabel("Classifique o Subtipo de Erro como");
		lblClassifiqueOSubtipo.setBounds(28, 337, 212, 14);
		panel.add(lblClassifiqueOSubtipo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-", "Defici\u00EAncia no Dom\u00EDnio", "Defici\u00EAncia na Regra", "Defici\u00EAncia na Escolha do Operador"}));
		comboBox_1.setBounds(259, 334, 221, 20);
		panel.add(comboBox_1);
		
		JLabel lblClassificador = new JLabel("Classificador de Erro:");
		lblClassificador.setBounds(28, 148, 146, 14);
		panel.add(lblClassificador);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Classificador desenvolvido por Leite"}));
		comboBox_3.setBounds(184, 145, 254, 20);
		panel.add(comboBox_3);
		
		JLabel label = new JLabel("1");
		label.setBounds(194, 84, 46, 14);
		panel.add(label);
		
		JLabel lblAdicionar = new JLabel("n\u00BA 1 -> adicionar no campo \"txt8\" o valor \"6\"");
		lblAdicionar.setBounds(72, 109, 348, 14);
		panel.add(lblAdicionar);
		
		JLabel lblOTipoDe = new JLabel("o Tipo de Fun\u00E7\u00E3o da MRE ser\u00E1");
		lblOTipoDe.setBounds(28, 420, 179, 14);
		panel.add(lblOTipoDe);
		
		JLabel lblNewLabel = new JLabel("Pap\u00E9is Complementares");
		lblNewLabel.setBounds(263, 420, 146, 14);
		panel.add(lblNewLabel);
		
		JLabel lblExerccio = new JLabel("EXERC\u00CDCIO: 1");
		lblExerccio.setBounds(28, 59, 112, 14);
		panel.add(lblExerccio);
		
		JButton btnSalvarRemediao = new JButton("Salvar Remedia\u00E7\u00E3o");
		btnSalvarRemediao.setBounds(492, 493, 179, 23);
		panel.add(btnSalvarRemediao);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(562, 56, 331, 20);
		panel.add(comboBox_4);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(562, 124, 331, 184);
		panel.add(textPane);
		
		JLabel lblVisualizao = new JLabel("Visualiza\u00E7\u00E3o");
		lblVisualizao.setBounds(562, 99, 95, 14);
		panel.add(lblVisualizao);
	
	}
}
