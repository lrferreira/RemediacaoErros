/* Copyright (c) 2008-2009 Centro de Computacao Cientifica e Software Livre
 * Departamento de Informatica - Universidade Federal do Parana - C3SL/UFPR
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.
 */
package br.ufpr.c3sl.condigital.virtualkeyboard.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import br.ufpr.c3sl.condigital.virtualkeyboard.communication.KeyBoardComunication;
import br.ufpr.c3sl.condigital.virtualkeyboard.compositedElements.Division;
import br.ufpr.c3sl.condigital.virtualkeyboard.compositedElements.Parentheses;
import br.ufpr.c3sl.condigital.virtualkeyboard.compositedElements.Power;
import br.ufpr.c3sl.condigital.virtualkeyboard.compositedElements.Root;
import br.ufpr.c3sl.condigital.virtualkeyboard.elements.Number;
import br.ufpr.c3sl.condigital.virtualkeyboard.elements.Operation;
import br.ufpr.c3sl.condigital.virtualkeyboard.elements.Variable;
import br.ufpr.c3sl.condigital.virtualkeyboard.formula.ElementCompositeOfFormula;
import br.ufpr.c3sl.condigital.virtualkeyboard.formula.ElementOfFormula;
import br.ufpr.c3sl.condigital.virtualkeyboard.formula.FormulaInitial;


/**
 * The Class VirtualKeyboardGUI created on Mar 28, 2009.
 * 
 */
@SuppressWarnings("serial")
public class VirtualKeyBoardMain extends JFrame {

	private JPanel jpMain;
	private JPanel jpDisplay;
	private JPanel jpButtons;

	private JLabel jlError;

	/** The is enable operations and variables. */
	private boolean isEnableOperations;
	private boolean isEnableVariables;

	/** The element focus. */
	private static ElementOfFormula elementFocus = new FormulaInitial();

	/** The formula. */
	private ElementOfFormula formula = new FormulaInitial();

	/** The number. */
	private static Number number = new Number();

	/** The operation. */
	private static Operation operation = new Operation();

	/** The variable. */
	private static Variable variable = new Variable();

	/** The list of elements added. */
	private LinkedList<ElementOfFormula> listOfElementsAdded = new LinkedList<ElementOfFormula>();

	/** The Constant ERROR_MESSAGE. */
	private static final String ERROR_MESSAGE = "Operação Inválida"; 

	/** The communication. */
	private KeyBoardComunication communication;

	/**
	 * Instantiates a new virtual keyboard GUI.
	 */
	public VirtualKeyBoardMain() {
		this(true,true);
	}

	/**
	 * Instantiates a new virtual keyboard GUI.
	 * 
	 * @param enableOperations the enable operations
	 */
	public VirtualKeyBoardMain(boolean enableOperations, boolean enableVariables) {
		this.isEnableOperations = enableOperations;
		this.isEnableVariables = enableVariables;
		initializeVariables();
		this.setFocusable(true);
		this.pack();
		this.setTitle("Teclado Virtual");
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		this.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) { cmdKeyTyped(e); }
			public void keyPressed(KeyEvent e) { /*cmdKeyPressed(e);*/ }
			public void keyReleased(KeyEvent e) {}
		});

		formula = new FormulaInitial();
		number = new Number();
		operation = new Operation();
		variable = new Variable();
		listOfElementsAdded = new LinkedList<ElementOfFormula>();

		listOfElementsAdded.add(formula);
		setElementFocus(formula);
		jpDisplay.add(formula);

		updateDisplay();
	}

	/**
	 * Initialize variables.
	 */
	private void initializeVariables() {

		jpMain = new JPanel();
		jpMain.setName("jpMain");
		jpMain.setLayout(new BorderLayout(5, 5));
		jpMain.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		this.add(jpMain);

		jpDisplay = new JPanel();
		jpButtons = new JPanel();

		this.add(jpMain);

		jlError  = new JLabel(" ");

		JScrollPane scrollPaneDisplay = new JScrollPane();
		scrollPaneDisplay.setPreferredSize(new Dimension(400,100));
		scrollPaneDisplay.getViewport().add(jpDisplay);            

		jpMain.add(scrollPaneDisplay, BorderLayout.NORTH);
		jpMain.add(jpButtons, BorderLayout.SOUTH);
		jpMain.add(jlError, BorderLayout.CENTER);		

		createButtons();
		setDisplayPreferences();
	}


	/**
	 * Creates the buttons.
	 */
	public void createButtons() {
		jpButtons.setLayout(new GridLayout(0, 5, 7, 7));
		String numbers;
		String operation;
		
		numbers = "123";
		for (Character number : numbers.toCharArray()) {
			JButton b = new JButton(number.toString());
			b.setFocusable(false);
			b.setName(number.toString());
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cmdNumbers(e.getActionCommand());
				}
			});
			jpButtons.add(b);
		}

		JButton jbBackspace = new JButton("←");
		jbBackspace.setFocusable(false);
		jbBackspace.setName("Backspace");
		jbBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdBackspace();
			}
		});
		jpButtons.add(jbBackspace);

		JButton jbClear = new JButton("Limpa");
		jbClear.setFocusable(false);
		jbClear.setToolTipText("Limpa o display do teclado virtual");	
		jbClear.setName("Clear");
		jbClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdClear();
			}
		});
		jpButtons.add(jbClear);
		
		numbers = "456";
		for (Character number : numbers.toCharArray()) {
			JButton b = new JButton(number.toString());
			b.setFocusable(false);
			b.setName(number.toString());
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cmdNumbers(e.getActionCommand());
				}
			});
			jpButtons.add(b);
		}
		
		operation = "+-";
		for (Character op : operation.toCharArray()) {
			JButton b = new JButton(op.toString());
			b.setFocusable(false);
			b.setName(op.toString());
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cmdOperation(e.getActionCommand());
				}
			});
			jpButtons.add(b);
		}
		
		numbers = "789";
		for (Character number : numbers.toCharArray()) {
			JButton b = new JButton(number.toString());
			b.setFocusable(false);
			b.setName(number.toString());
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cmdNumbers(e.getActionCommand());
				}
			});
			jpButtons.add(b);
		}
		
		JButton jbMult = new JButton("x");
		jbMult.setFocusable(false);
		jbMult.setName("x");
		jbMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdOperation(e.getActionCommand());
			}
		});
		jpButtons.add(jbMult);

		JButton jbDivision = new JButton("÷");
		jbDivision.setFocusable(false);
		jbDivision.setName("÷");
		jbDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdDivision();
			}
		});
		jpButtons.add(jbDivision);
		
				
		JButton jbComma = new JButton(",");
		jbComma.setEnabled(isEnableOperations);
		jbComma.setFocusable(false);
		jbComma.setName(",");
		jbComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdComma(e.getActionCommand());
			}
		});
		jpButtons.add(jbComma);		
		
		JButton jbZero = new JButton("0");
		jbZero.setFocusable(false);
		jbZero.setName("0");
		jbZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdNumbers(e.getActionCommand());
			}
		});
		jpButtons.add(jbZero);
		
		JButton jbBrackets = new JButton("(  )");
		jbBrackets.setFocusable(false);
		jbBrackets.setName("()");
		jbBrackets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdBrackets();
			}
		});
		jpButtons.add(jbBrackets);
		
		JButton jbRoot = new JButton("√‾");
		jbRoot.setFocusable(false);
		jbRoot.setName("√");
		jbRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdRoot();
			}
		});
		jpButtons.add(jbRoot);

		JButton jbPower = new JButton("<html>x<sup>y</sup></html> ");
		jbPower.setFocusable(false);
		jbPower.setName("^");
		jbPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdPower();
			}
		});
		jpButtons.add(jbPower);

		JButton jbNvar = new JButton("n");
		jbNvar.setEnabled(isEnableVariables);
		jbNvar.setFocusable(false);
		jbNvar.setName("n");
		jbNvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdVariable(e.getActionCommand());
			}
		});
		jpButtons.add(jbNvar);

		JButton jbSend = new JButton("Enviar");
		jbSend.setFocusable(false);
		jbSend.setName("Send");
		jbSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdSend();
			}
		});
		jpButtons.add(jbSend);

		JButton jbReturn = new JButton("↓↑");
		jbReturn.setFocusable(false);
		jbReturn.setToolTipText("Retorna um nível na formula");	
		jbReturn.setName("Return");
		jbReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdReturn();
			}
		});
		jpButtons.add(jbReturn);
	}

	/**
	 * Sets the display preferences.
	 */
	public void setDisplayPreferences() {
		jpDisplay.setBackground(new Color(255, 255, 255));
		jpDisplay.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1)); 

	}

	/**
	 * Display error message.
	 * 
	 * @param e the error
	 */
	private void displayErrorMessage(String error) {
		jlError.setBorder(BorderFactory.createLineBorder(Color.RED));
		jlError.setText(error);
	}

	/**
	 * Clear error message.
	 */
	private void clearErrorMessage() {
		jlError.setBorder(BorderFactory.createEmptyBorder());
		jlError.setText("");
	}

	/**
	 * Update display.
	 */
	private void updateDisplay() {
		jpDisplay.removeAll();
		jpDisplay.add(formula);
		SwingUtilities.updateComponentTreeUI(this);
	}

	/**
	 * New number.
	 */
	private void newNumber(){
		number.correctCommaIfNecessary();
		number = new Number();
	}

	/**
	 * New operation.
	 */
	private void newOperation(){
		operation = new Operation();
	}

	/**
	 * New variable.
	 */
	private void newVariable(){
		variable = new Variable();
	}

	/**
	 * Cmd numbers.
	 * 
	 * @param String s the number
	 */
	private void cmdNumbers(String s) {
		if (elementFocus instanceof Operation){
			setElementFocus(elementFocus.getFather());
			newOperation();
			newNumber();
		}else
			if (elementFocus instanceof Variable){
				setElementFocus(elementFocus.getFather());
			}


		if (number.isEmpty()){
			if(elementFocus.addElement(number)){
				listOfElementsAdded.add(number);
				setElementFocus(number);
				elementFocus.addElement(s);
			}else{
				//setElementFocus(list.getLast());
				displayErrorMessage(ERROR_MESSAGE);
			}
		}else
			if(!elementFocus.addElement(s))
				displayErrorMessage(ERROR_MESSAGE);

		updateDisplay();
	}

	/**
	 * Cmd operation.
	 * 
	 * @param s the s
	 */
	private void cmdOperation(String s) {
		clearErrorMessage();
		if (elementFocus instanceof Number){
			setElementFocus(elementFocus.getFather());
			newNumber();
		}else
			if (elementFocus instanceof Variable){
				setElementFocus(elementFocus.getFather());
				newVariable();
			}

		if (operation.isEmpty()){
			if(elementFocus.addElement(operation)){
				listOfElementsAdded.add(operation);
				setElementFocus(operation);
				operation.addElement(s);
			}else
				displayErrorMessage(ERROR_MESSAGE);
		}else
			if(!elementFocus.addElement(s))
				displayErrorMessage(ERROR_MESSAGE);	

		updateDisplay();
	}

	/**
	 * Cmd variable.
	 * 
	 * @param var the var
	 */
	private void cmdVariable(String var) {
		clearErrorMessage();
		if (elementFocus instanceof Operation){
			setElementFocus(elementFocus.getFather());
			newOperation();
		}

		if (variable.isEmpty()){
			if(elementFocus.addElement(variable)){
				listOfElementsAdded.add(variable);
				setElementFocus(variable);
				elementFocus.addElement(var);
			}else{
				//setElementFocus(list.getLast());
				displayErrorMessage(ERROR_MESSAGE);
			}
		}else
			if(!elementFocus.addElement(var))
				displayErrorMessage(ERROR_MESSAGE);	


		updateDisplay();
	}

	/**
	 * Adds the element composite.
	 * 
	 * @param element the element
	 * 
	 * @return true, if successful
	 */
	private boolean addElementComposite(ElementCompositeOfFormula element){
		clearErrorMessage();
		if (elementFocus instanceof Number){
			setElementFocus(elementFocus.getFather());
			newNumber();
		}else
			if (elementFocus instanceof Operation){
				setElementFocus(elementFocus.getFather());
				newOperation();
			}
			else
				if (elementFocus instanceof Variable){
					setElementFocus(elementFocus.getFather());
					newVariable();
				}

		if(elementFocus.addElement(element)){
			setElementFocus(element);
			listOfElementsAdded.add(element);
			return true;
		}else{
			//setElementFocus(list.getLast());
			displayErrorMessage(ERROR_MESSAGE);
			return false;
		}

	}

	/**
	 * Cmd brackets.
	 */
	private void cmdBrackets() {
		addElementComposite(new Parentheses());
		newNumber();
	}

	/**
	 * Cmd root.
	 */
	private void cmdRoot() {
		addElementComposite(new Root());
		newNumber();
	}

	/**
	 * Cmd power.
	 */
	private void cmdPower() {
		clearErrorMessage();
		ElementOfFormula lastElement = elementFocus.getLastElementAdded();

		if (lastElement == null)
			lastElement = elementFocus;

		if (lastElement.isValidElement()){
			Power power = new Power();		
			if (addElementComposite(power)){
				power.setFirstElementOfPower(lastElement);
			}
			newNumber();
		}else
			displayErrorMessage(ERROR_MESSAGE);
		updateDisplay();

		//		addElementComposite(new Power());
		//		newNumber();
	}

	/**
	 * Cmd division.
	 */
	private void cmdDivision() {
		clearErrorMessage();
		ElementOfFormula lastElement = elementFocus.getLastElementAdded();

		if (lastElement == null)
			lastElement = elementFocus;

		if (lastElement.isValidElement()){
			Division division = new Division();		
			if (addElementComposite(division)){
				division.setDividend(lastElement);
			}
			newNumber();
			newVariable();
		}else
			displayErrorMessage(ERROR_MESSAGE);
		updateDisplay();
	}

	/**
	 * Cmd comma.
	 * 
	 * @param s the s
	 */
	private void cmdComma(String s) {
		cmdNumbers(",");
	}

	/**
	 * Cmd backspace.
	 */
	private void cmdBackspace () {
		clearErrorMessage();
		int x = listOfElementsAdded.indexOf(elementFocus);

		// if happens (10-1-20)| cursor back to (10-1-20|)
		if(elementFocus.getLastElementAdded() instanceof ElementCompositeOfFormula){
			if (elementFocus.getLastElementAdded().getLastElementAdded() instanceof ElementCompositeOfFormula)
				setElementFocus(elementFocus.getLastElementAdded());
			else
				setElementFocus(elementFocus.getLastElementAdded().getLastElementAdded());
		}else
			if(x > 0 && elementFocus.removeLastElement()){
				listOfElementsAdded.remove(x);
				x--;			
				if (x >= 0)
					setElementFocus(listOfElementsAdded.get((x)));
			}
		updateDisplay();
	}

	/**
	 * Cmd send.
	 */
	public void cmdSend(){
		if(elementFocus.isValidElement()){
			this.communication.send();
			elementFocus.hideCursor();
			formula = new FormulaInitial();
			updateDisplay();
		}else{
			displayErrorMessage("Fórmula Incompleta");
		}
		//		System.out.println("-------------------------------------");
		//		buildListOfFormula(formula);
		//		System.out.println("-------------------------------------");
		//		list();
	}

	/**
	 * Sets the communication.
	 * 
	 * @param communication the new communication
	 */
	public void setCommunication(KeyBoardComunication communication){
		this.communication = communication;
	}


	/**
	 * Cmd clear.
	 */
	private void cmdClear(){
		formula = new FormulaInitial();
		number = new Number();
		operation = new Operation();
		variable = new Variable();
		listOfElementsAdded = new LinkedList<ElementOfFormula>();
		setElementFocus(formula);
		listOfElementsAdded.add(formula);
		updateDisplay();
	}

	/**
	 * Cmd return.
	 */
	private void cmdReturn(){
		if (elementFocus.isValidElement() && elementFocus instanceof ElementCompositeOfFormula){
			setElementFocus(elementFocus.getFather());
		}else
			if (elementFocus.isValidElement() &&
					!(elementFocus instanceof Operation) &&
					elementFocus.getFather() instanceof ElementCompositeOfFormula){

				setElementFocus(elementFocus.getFather().getFather());	
				newOperation();
			}else
				displayErrorMessage(ERROR_MESSAGE);

	}


	public void cmdKeyLeft() {
		clearErrorMessage();
		int x = listOfElementsAdded.indexOf(elementFocus);	
		if ( x > 1 )
			setElementFocus(listOfElementsAdded.get(x-1));
		updateDisplay();	
	}

	public void cmdKeyRight() {
		clearErrorMessage();
		int x = listOfElementsAdded.indexOf(elementFocus);	
		if ( x < listOfElementsAdded.size()-1 )
			setElementFocus(listOfElementsAdded.get(x+1));
		updateDisplay();	
	}

	/**
	 * Cmd key typed.
	 * 
	 * @param KeyEvent  e
	 */
	public void cmdKeyTyped(KeyEvent e){
		char c = e.getKeyChar();
		
		if ( c >= '0' && c <= '9' ) {
			cmdNumbers(String.valueOf(c-48));
		}else if ( c == 10 ) {
			cmdSend();
		}else if ( c == 8 ) {
			cmdBackspace();
		}else if ( c== 27 ) {
			cmdClear();
		}else if ( c == '+' || c == '-' ) {
			cmdOperation(c+"");
		}else if ( c == '*' ) {
			cmdOperation("x");
		}else if ( c == 47 ) {
			cmdDivision();
		}else if ( c == '^' ) {
			cmdPower();
		}else if ( c == '(' ) {
			cmdBrackets();
		}else if ( c == 'n' || c == 'N' ) {
			cmdVariable(String.valueOf('n'));
		}else if ( c == ')' ) {
			cmdReturn();
		}else if ( isEnableOperations ) {
			if ( c == 'l' || c == 'L' ) {
				cmdVariable(String.valueOf('ℓ'));
			}else if ( c == '.' || c == ',' ) {
				cmdComma(",");
			}
		}

	}

	/**
	 * Cmd key pressed.
	 * 
	 * @param KeyEvent  e
	 */
	public void cmdKeyPressed(KeyEvent e){
		int c = e.getKeyCode();
		if ( c == 37 ) {
			cmdKeyLeft();
		}else if ( c == 39 ) {
			cmdKeyRight();
		}else if ( c == 17 ) {
			cmdReturn();
		}		
	}
	/**
	 * Sets the element focus.
	 * 
	 * @param e the new element focus
	 */
	public static void setElementFocus(ElementOfFormula e){
		if (e instanceof Number){
			number = ((Number) e); 
		}else
			if (e instanceof Operation){
				operation = ((Operation) e); 
			}else
				if (e instanceof Variable){
					variable = ((Variable) e); 
				}

		elementFocus.hideCursor();
		elementFocus = e;
		elementFocus.showCursor();
	}

	/**
	 * Gets the formula.
	 * 
	 * @return the formula
	 */
	public ElementOfFormula getFormula() {
		return formula.getClone();
	}

	/**
	 * Sets the formula.
	 * 
	 * @param formulaIncial the new formula
	 */
	public void setFormula(ElementOfFormula formulaIncial){
		cmdClear();
		formula = formulaIncial.getClone();
		listOfElementsAdded.clear();
		listOfElementsAdded.add(formula);
		buildListOfFormula(formula);
		setElementFocus(listOfElementsAdded.getLast());
		updateDisplay();
	}

	/**
	 * Builds the list of formula.
	 * 
	 * @param f the f
	 */
	public void buildListOfFormula(ElementOfFormula f){
		if (f instanceof ElementOfFormula && !(f instanceof FormulaInitial)){
			listOfElementsAdded.add((ElementOfFormula) f);
			//System.out.println("formula "+ f);
		}

		for (Component c : f.getComponents()) {
			if (c instanceof ElementOfFormula){
				if (c instanceof ElementCompositeOfFormula){
					if (c instanceof Division){
						if (((Division)c).getDivend() instanceof Power){
							Power p = (Power) ((Division)c).getDivend();
							buildListOfFormula(p.getFirstElement());
							listOfElementsAdded.add((ElementOfFormula) p);
							//System.out.println("formula "+ p);
							buildListOfFormula(p.getFormulaInside());
						}else
							buildListOfFormula(((Division)c).getDivend());

						listOfElementsAdded.add((ElementOfFormula) c);
						//System.out.println("formula "+ c);
						buildListOfFormula(((Division)c).getDivisor());
					}
					else
						if (c instanceof Power){
							buildListOfFormula(((Power)c).getFirstElement());
							listOfElementsAdded.add((ElementOfFormula) c);
							//System.out.println("formula "+ c);
							buildListOfFormula(((Power)c).getFormulaInside());
							//System.out.println("formula "+ c);
						}else
							buildListOfFormula((ElementOfFormula) c);
				}else
					if (!(c instanceof FormulaInitial)){
						listOfElementsAdded.add((ElementOfFormula) c);
						//System.out.println("formula  " + c);
					}else{
						buildListOfFormula((ElementOfFormula) c);
					}
			}
		}
	}

	/**
	 * Show keyboard.
	 * 
	 * @param key the key
	 */
	public void showKeyBoard(boolean key){
		if (key){
			this.setVisible(true);
			cmdClear();
		}
		else
			this.setVisible(false);
	}

	/**
	 * Creates the and show gui.
	 */
	public static void createAndShowGUI() {
		VirtualKeyBoardMain frame = new VirtualKeyBoardMain();
		frame.setVisible(true);
	}

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VirtualKeyBoardMain.createAndShowGUI();
			}
		});
	}

}

