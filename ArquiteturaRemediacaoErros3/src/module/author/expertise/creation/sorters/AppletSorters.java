package module.author.expertise.creation.sorters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import module.author.expertise.creation.sorters.entity.ErrorType;
import module.author.expertise.creation.sorters.entity.ItemSorter;
import module.author.expertise.creation.sorters.entity.Sorter;
import module.author.expertise.creation.sorters.entity.SubErrorType;
import module.creation.rules.RulesFactory;
import module.entity.DBConnect;
import module.entity.MERFunction;

import org.xml.sax.SAXException;

import javax.swing.JScrollPane;

public class AppletSorters extends JApplet {
	
	public static int COL_TIPOERRO = 0;
	public static int COL_SUBTIPOERRO = 1;
	public static int COL_FUNCAOMRE = 2;
	public static int COL_REMEDIACAO = 3;
	public Sorter sorter;
	public ArrayList<ErrorType> errorTypes;
	public ArrayList<MERFunction> merFunctions;
	private JTable table;
	private DBConnect dbCon;
	
	public AppletSorters() {
		
		try {
			setDbCon(new DBConnect("C:\\users\\leandro2\\git\\RemediacaoErros\\ArquiteturaRemediacaoErros3\\db\\remediacao.sqlite"));
			//setDbCon(new DBConnect("C:\\users\\UFPR\\git\\RemediacaoErros\\ArquiteturaRemediacaoErros3\\db\\remediacao.sqlite"));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		initComponents();
	}
	
	private void initComponents() {
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1290, 605);
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Classificadores", null, panel, null);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 617, 21);
		panel.add(menuBar);
		
		JMenu mnClassificador = new JMenu("Classificador");
		menuBar.add(mnClassificador);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir...");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser openFile = new JFileChooser();
                int returnVal = openFile.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                	File file = openFile.getSelectedFile();
                	try {
                		if (file.getName().toLowerCase().matches("(?i).*sorter.*"))
                			sorter = XMLManager.parserSorter(file);
                		else if (file.getName().toLowerCase().matches("(?i).*errorType.*"))
                			errorTypes = XMLManager.parserErrorType(file);
                		else if (file.getName().toLowerCase().matches("(?i).*merFunction.*"))
                			merFunctions = XMLManager.parserMERFunction(file);
                	} catch (JAXBException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ParserConfigurationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SAXException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                
			}
		});
		mnClassificador.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar...");
		mntmSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser saveFile = new JFileChooser();
                int returnVal = saveFile.showSaveDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                	File file = saveFile.getSelectedFile();
                	XMLManager.testeXstream(sorter,file);
                	XMLManager.modifyXMLFile(sorter, file);
                }	
                
			}
		});
		mnClassificador.add(mntmSalvar);
		
		JButton btnSalvarClassificador = new JButton("Salvar Classificador");
		btnSalvarClassificador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Sorter s = readSorter(new Sorter(null, "classificador Maici", new ArrayList<ItemSorter>()), table);
				dbCon.insert(sorter);
				
			}
		});
		btnSalvarClassificador.setBounds(286, 394, 168, 23);
		panel.add(btnSalvarClassificador);
		
		final JComboBox cmbClassificador = new JComboBox();
		cmbClassificador.setBounds(10, 39, 231, 20);
		cmbClassificador.addItem("-");
		panel.add(cmbClassificador);
		
		cmbClassificador.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				sorter = dbCon.getSorter(Long.valueOf(cmbClassificador.getSelectedIndex()));
				table.setModel(putSorterOnTable(sorter));
			}
	    });
		
		putSorterOnCombo(cmbClassificador);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 1265, 457);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Tipo de Erro", "Subtipo do Erro", "Fun\u00E7\u00E3o da MRE", "Remedia\u00E7\u00E3o"
			}
		));
		table.setBounds(10, 100, 865, 272);
		//panel.add(table);
		scrollPane.setViewportView(table);
	}
	
	protected void putSorterOnCombo(JComboBox cmbClassificador){
		for (Sorter s: dbCon.getSorters()){
			cmbClassificador.addItem("" + s.getId() + " - " + s.getDescription());
		}
	}
	
	protected DefaultTableModel putSorterOnTable(Sorter sorter){
		Object [][] linhas = new Object[sorter.getItensSorter().size()][4];
		for (int i = 0; i < sorter.getItensSorter().size(); i++) {
			ItemSorter is = sorter.getItensSorter().get(i);
			linhas[i] = new Object []{is.getErrorType().getDescription(), 
									(is.getSubErrorType() == null) ? null : is.getSubErrorType().getDescription(), 
									is.getMerFunction().getDescription(), 
									is.getRemediation()};
		}
		return new DefaultTableModel(
				linhas
				/*new Object[][] {
					{"Interpreta\u00E7\u00E3o Equivocada", "-", "Pap\u00E9is Complementares", "Propor outras formas de apresentar o problema com a possibilidade de o aprendiz fazer uma releitura a partir de uma simboliza\u00E7\u00E3o matem\u00E1tica."},
					{"Diretamente Identific\u00E1veis", "Defici\u00EAncia em rela\u00E7\u00E3o ao dom\u00EDnio ou uso inadequado de dados", "Fun\u00E7\u00F5es de Restri\u00E7\u00E3o de Interpreta\u00E7\u00E3o", "Mostrar que, embora a estrat\u00E9gia possa estar correta, a defici\u00EAncia se encontra no uso das informa\u00E7\u00F5es."},
					{null, "Defici\u00EAncia de regra, teorema ou defini\u00E7\u00E3o", "Compreens\u00E3o mais aprofundada", "Apresentar a regra ou teorema, com o prop\u00F3sito de o aprendiz reorganizar conceito ou generalizar."},
					{null, "Defici\u00EAncia na escolha do operador correto", "Compreens\u00E3o mais aprofundada", "Apresentar ao aprendiz que seu equ\u00EDvoco encontra-se na escolha do operador correto."},
					{"Indiretamente identific\u00E1veis", "-", "Restri\u00E7\u00E3o de interpreta\u00E7\u00E3o", "Mostrar ao aprendiz que a l\u00F3gica adotada n\u00E3o resulta na solu\u00E7\u00E3o do problema."},
					{"Solu\u00E7\u00E3o n\u00E3o categoriz\u00E1vel", "-", "Compreens\u00E3o Mais Aprofundada", "Propor ao aprendiz a revis\u00E3o de conceitos elementares ou presente na base de dom\u00EDnio."},
				}*/,
				new String[] {
					"Tipo de Erro", "Subtipo do Erro", "Fun\u00E7\u00E3o da MRE", "Remedia\u00E7\u00E3o"
				}
			) {
				Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			};
	}

	protected Sorter readSorter(Sorter sorter, JTable table) {
		
		for (int i = 0; i < table.getRowCount(); i++){
			ErrorType errorType = new ErrorType(null, (String)table.getValueAt(i, COL_TIPOERRO), null);
			if (errorType.getDescription() == null || errorType.getDescription().equalsIgnoreCase("") || errorType.getDescription().equalsIgnoreCase("-") || errorType.getDescription().equalsIgnoreCase(" - ")){
				errorType.setDescription(sorter.getItensSorter().get(sorter.getItensSorter().size()-1).getErrorType().getDescription());
			}
			ItemSorter itemSorter = new ItemSorter(null, 
					sorter,
					errorType, 
					new SubErrorType(null, (String)table.getValueAt(i, COL_SUBTIPOERRO), errorType),
					new MERFunction(null, (String)table.getValueAt(i, COL_FUNCAOMRE)),
					 (String) table.getValueAt(i, COL_REMEDIACAO));
			
			sorter.getItensSorter().add(itemSorter);
			
		}
		return sorter;
		
	}

	public DBConnect getDbCon() {
		return dbCon;
	}

	public void setDbCon(DBConnect dbCon) {
		this.dbCon = dbCon;
	}
}
