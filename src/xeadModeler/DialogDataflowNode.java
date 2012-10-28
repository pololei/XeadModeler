package xeadModeler;

/*
 * Copyright (c) 2012 WATANABE kozo <qyf05466@nifty.com>,
 * All rights reserved.
 *
 * This file is part of XEAD Modeler.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the XEAD Project nor the names of its contributors
 *       may be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class DialogDataflowNode extends JDialog {
	private static final long serialVersionUID = 1L;
	private static ResourceBundle res = ResourceBundle.getBundle("xeadModeler.Res");
	private JPanel panelMain = new JPanel();
	private JLabel jLabel1 = new JLabel();
	private KanjiTextField jTextFieldLabel = new KanjiTextField();
	private JLabel jLabel2 = new JLabel();
	private JComboBox jComboBoxType = new JComboBox();
	private JTextField jTextFieldType = new JTextField();
	private JComboBox jComboBoxEventPos = new JComboBox();
	private JLabel jLabel3 = new JLabel();
	private JLabel jLabel4 = new JLabel();
	private JLabel jLabel5 = new JLabel();
	private JLabel jLabel6 = new JLabel();
	private JButton jButtonOK = new JButton();
	private JButton jButtonCancel = new JButton();
	private JSpinner jSpinnerSlideNumber = new JSpinner();
	private JScrollPane jScrollPaneDescriptions = new JScrollPane();
	private KanjiTextArea jTextAreaDescriptions = new KanjiTextArea();
	private boolean buttonOKIsPressed;
	private Modeler frame_;

	public DialogDataflowNode(Modeler frame, String title, boolean modal) {
		super(frame, title, modal);
		try {
			frame_ = frame;
			jbInit();
			pack();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public DialogDataflowNode(Modeler frame) {
		this(frame, "", true);
	}

	private void jbInit() throws Exception {
		this.setModal(true);
		this.setResizable(false);
		panelMain.setLayout(null);
		panelMain.setPreferredSize(new Dimension(270, 288));
		panelMain.setBorder(BorderFactory.createEtchedBorder());
		jLabel1.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel1.setText(res.getString("DialogDataflowNode01"));
		jLabel1.setBounds(new Rectangle(20, 16, 70, 15));
		jTextFieldLabel.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldLabel.setBounds(new Rectangle(97, 15, 115, 22));
		jLabel2.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel2.setText(res.getString("DialogDataflowNode02"));
		jLabel2.setBounds(new Rectangle(22, 49, 68, 15));
		jComboBoxType.setFont(new java.awt.Font("Dialog", 0, 12));
		jComboBoxType.setBounds(new Rectangle(97, 47, 115, 21));
		jComboBoxType.addItem(res.getString("DialogDataflowNode03")); //:0
		jComboBoxType.addItem(res.getString("DialogDataflowNode19")); //:1
		jComboBoxType.addItem(res.getString("DialogDataflowNode04")); //:2
		jComboBoxType.addItem(res.getString("DialogDataflowNode05")); //:3
		jComboBoxType.addItem(res.getString("DialogDataflowNode06")); //:4
		jComboBoxType.addItem(res.getString("DialogDataflowNode07")); //:5
		jComboBoxType.addItem(res.getString("DialogDataflowNode08")); //:6
		jComboBoxType.addItem(res.getString("DialogDataflowNode09")); //:7
		jComboBoxType.addItem(res.getString("DialogDataflowNode10")); //:8
		jComboBoxType.addItem(res.getString("DialogDataflowNode11")); //:9
		jComboBoxType.addItem(res.getString("DialogDataflowNode18")); //:10
		jComboBoxType.setMaximumRowCount(20);
		jTextFieldType.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldType.setBounds(new Rectangle(97, 47, 115, 22));
		jTextFieldType.setEditable(false);
		jLabel3.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel3.setText("");
		jLabel3.setBounds(new Rectangle(8, 86, 81, 15));
		jLabel4.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel4.setText(res.getString("DialogDataflowNode12"));
		jLabel4.setBounds(new Rectangle(11, 82, 79, 15));
		jLabel6.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabel6.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel6.setText(res.getString("DialogDataflowNode21"));
		jLabel6.setBounds(new Rectangle(5, 113, 85, 15));
		jComboBoxEventPos.setFont(new java.awt.Font("Dialog", 0, 12));
		jComboBoxEventPos.setBounds(new Rectangle(97, 110, 60, 21));
		jLabel5.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel5.setText(res.getString("DialogDataflowNode20"));
		jLabel5.setBounds(new Rectangle(11, 143, 79, 15));
		jTextAreaDescriptions.setFont(new java.awt.Font("SansSerif", 0, 12));
		jTextAreaDescriptions.setLineWrap(true);
		jScrollPaneDescriptions.getViewport().add(jTextAreaDescriptions, null);
		jScrollPaneDescriptions.setBounds(new Rectangle(97, 140, 155, 90));
		jButtonOK.setBounds(new Rectangle(40, 248, 73, 25));
		jButtonOK.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonOK.setText("OK");
		jButtonOK.addActionListener(new DialogDataflowNode_jButtonOK_actionAdapter(this));
		jButtonCancel.setBounds(new Rectangle(169, 248, 73, 25));
		jButtonCancel.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonCancel.setText(res.getString("DialogDataflowNode13"));
		jButtonCancel.addActionListener(new DialogDataflowNode_jButtonCancel_actionAdapter(this));
		getContentPane().add(panelMain);
	}

	public boolean request(String action, org.w3c.dom.Element element) {
		buttonOKIsPressed = false;
		//
		jLabel6.setEnabled(false);
		jComboBoxEventPos.setEnabled(false);
		jComboBoxEventPos.removeAllItems();
		//
		if (element.getAttribute("Type").equals("Process")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode14"));
			jLabel6.setEnabled(true);
			jComboBoxEventPos.setEnabled(true);
			jComboBoxEventPos.addItem(res.getString("DialogDataflowNode22")); //:0
			jComboBoxEventPos.addItem(res.getString("DialogDataflowNode23")); //:0
		}
		if (element.getAttribute("Type").equals("Ledger")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode03"));
		}
		if (element.getAttribute("Type").equals("Drum")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode19"));
		}
		if (element.getAttribute("Type").equals("Store1")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode04"));
		}
		if (element.getAttribute("Type").equals("Store2")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode05"));
		}
		if (element.getAttribute("Type").equals("Tray")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode06"));
		}
		if (element.getAttribute("Type").equals("Folder")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode07"));
		}
		if (element.getAttribute("Type").equals("Subject")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode08"));
		}
		if (element.getAttribute("Type").equals("Casher")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode09"));
		}
		if (element.getAttribute("Type").equals("Safe")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode10"));
		}
		if (element.getAttribute("Type").equals("Sofa")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode11"));
		}
		if (element.getAttribute("Type").equals("Basket")) {
			jTextFieldType.setText(res.getString("DialogDataflowNode18"));
		}
		//
		panelMain.removeAll();
		panelMain.add(jLabel2, null);
		panelMain.add(jLabel3, null);
		panelMain.add(jTextFieldLabel, null);
		panelMain.add(jLabel1, null);
		panelMain.add(jLabel4, null);
		panelMain.add(jLabel6, null);
		panelMain.add(jComboBoxEventPos, null);
		panelMain.add(jLabel5, null);
		panelMain.add(jScrollPaneDescriptions, null);
		panelMain.add(jButtonOK, null);
		panelMain.add(jButtonCancel, null);
		panelMain.getRootPane().setDefaultButton(jButtonOK);
		//
		//Setup components according to action and type//
		if (action.equals("Add")) {
			this.setTitle(res.getString("DialogDataflowNode15"));
			jTextFieldLabel.setText(element.getAttribute("Name"));
			jTextFieldLabel.setBackground(Color.white);
			jTextFieldLabel.setEditable(true);
			jComboBoxType.setSelectedIndex(0);
			panelMain.add(jComboBoxType, null);
		} else {
			this.setTitle(res.getString("DialogDataflowNode16"));
			panelMain.add(jTextFieldType, null);
			if (element.getAttribute("Type").equals("Process")) {
				this.setTitle(res.getString("DialogDataflowNode17"));
				Modeler.XeadTreeNode node = frame_.getSpecificXeadTreeNode("Task", element.getAttribute("TaskID"), null);
				jTextFieldLabel.setText(node.getElement().getAttribute("Name"));
				jTextFieldLabel.setBackground(SystemColor.control);
				jTextFieldLabel.setEditable(false);
				jTextAreaDescriptions.setText(Modeler.substringLinesWithTokenOfEOL(node.getElement().getAttribute("Descriptions"), "\n"));
				jTextAreaDescriptions.setBackground(SystemColor.control);
				jTextAreaDescriptions.setEditable(false);
				if (node.getElement().getAttribute("EventPos").equals("") || node.getElement().getAttribute("EventPos").equals("L")) {
					jComboBoxEventPos.setSelectedIndex(0);
				} else {
					jComboBoxEventPos.setSelectedIndex(1);
				}
			} else {
				jTextFieldLabel.setText(element.getAttribute("Name"));
				jTextFieldLabel.setBackground(Color.white);
				jTextFieldLabel.setEditable(true);
				jTextAreaDescriptions.setText(Modeler.substringLinesWithTokenOfEOL(element.getAttribute("Descriptions"), "\n"));
				jTextAreaDescriptions.setBackground(Color.white);
				jTextAreaDescriptions.setEditable(true);
			}
		}
		//
		//Create spinner with specified default//
		int defaultValue = Integer.parseInt(element.getAttribute("SlideNumber"));
		SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(defaultValue, 1, 30, 1);
		jSpinnerSlideNumber.setModel(spinnerNumberModel);
		JSpinner.NumberEditor spinnerEditor = new JSpinner.NumberEditor(jSpinnerSlideNumber, "00");
		jSpinnerSlideNumber.setEditor(spinnerEditor);
		jSpinnerSlideNumber.setBounds(new Rectangle(97, 78, 42, 24));
		panelMain.add(jSpinnerSlideNumber, null);
		//
		//Setup dialog and show//
		Dimension dlgSize = this.getPreferredSize();
		Dimension frmSize = frame_.getSize();
		Point loc = frame_.getLocation();
		this.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
		this.pack();
		this.setVisible(true);
		//
		//Update and return parameter value//
		if (buttonOKIsPressed) {
			if (element.getAttribute("Type").equals("Process")) {
				if (jComboBoxEventPos.getSelectedIndex() == 0) {
					element.setAttribute("EventPos", "L");
				}
				if (jComboBoxEventPos.getSelectedIndex() == 1) {
					element.setAttribute("EventPos", "R");
				}
			} else {
				//
				//Update DOM element//
				element.setAttribute("Name", jTextFieldLabel.getText());
				element.setAttribute("Descriptions", Modeler.concatLinesWithTokenOfEOL(jTextAreaDescriptions.getText()));
				//
				if (action.equals("Add")) {
					if (jComboBoxType.getSelectedIndex() == 0) {
						element.setAttribute("Type", "Ledger");
					}
					if (jComboBoxType.getSelectedIndex() == 1) {
						element.setAttribute("Type", "Drum");
					}
					if (jComboBoxType.getSelectedIndex() == 2) {
						element.setAttribute("Type", "Store1");
					}
					if (jComboBoxType.getSelectedIndex() == 3) {
						element.setAttribute("Type", "Store2");
					}
					if (jComboBoxType.getSelectedIndex() == 4) {
						element.setAttribute("Type", "Tray");
					}
					if (jComboBoxType.getSelectedIndex() == 5) {
						element.setAttribute("Type", "Folder");
					}
					if (jComboBoxType.getSelectedIndex() == 6) {
						element.setAttribute("Type", "Subject");
					}
					if (jComboBoxType.getSelectedIndex() == 7) {
						element.setAttribute("Type", "Casher");
					}
					if (jComboBoxType.getSelectedIndex() == 8) {
						element.setAttribute("Type", "Safe");
					}
					if (jComboBoxType.getSelectedIndex() == 9) {
						element.setAttribute("Type", "Sofa");
					}
					if (jComboBoxType.getSelectedIndex() == 10) {
						element.setAttribute("Type", "Basket");
					}
				}
			}
			//
			element.setAttribute("SlideNumber", jSpinnerSlideNumber.getValue().toString());
			//
			if (action.equals("Add")) {
				frame_.currentMainTreeNode.getElement().appendChild(element);
			}
		}
		return buttonOKIsPressed;
	}

	void jButtonOK_actionPerformed(ActionEvent e) {
		buttonOKIsPressed = true;
		this.setVisible(false);
	}

	void jButtonCancel_actionPerformed(ActionEvent e) {
		buttonOKIsPressed = false;
		this.setVisible(false);
	}
}

class KanjiTextArea extends JTextArea {
	private static final long serialVersionUID = 1L;
	public KanjiTextArea(){
		super();
		addFocusListener(new KanjiTextAreaListener());
	}
	class KanjiTextAreaListener implements FocusListener{
		public void focusLost(FocusEvent event){
			focusLostHandler();
		}
		public void focusGained(FocusEvent event){
			focusGainedHandler();
		}
	}
	private void focusGainedHandler(){
		getInputContext().setCharacterSubsets(null);
		String lang = Locale.getDefault().getLanguage();
		if (lang.equals("ja")) {
			Character.Subset[] subsets = new Character.Subset[] {java.awt.im.InputSubset.KANJI};
			getInputContext().setCharacterSubsets(subsets);
		}
		//if (lang.equals("ko")) {
		//  Character.Subset[] subsets = new Character.Subset[] {java.awt.im.InputSubset.HANJA};
		//  getInputContext().setCharacterSubsets(subsets);
		//}
		if (lang.equals("zh")) {
			Character.Subset[] subsets = new Character.Subset[] {java.awt.im.InputSubset.TRADITIONAL_HANZI};
			getInputContext().setCharacterSubsets(subsets);
		}
	}
	private void focusLostHandler() {
		getInputContext().setCharacterSubsets(null);
	}
}

class DialogDataflowNode_jButtonOK_actionAdapter implements java.awt.event.ActionListener {
	DialogDataflowNode adaptee;

	DialogDataflowNode_jButtonOK_actionAdapter(DialogDataflowNode adaptee) {
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e) {
		adaptee.jButtonOK_actionPerformed(e);
	}
}

class DialogDataflowNode_jButtonCancel_actionAdapter implements java.awt.event.ActionListener {
	DialogDataflowNode adaptee;

	DialogDataflowNode_jButtonCancel_actionAdapter(DialogDataflowNode adaptee) {
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e) {
		adaptee.jButtonCancel_actionPerformed(e);
	}
}
