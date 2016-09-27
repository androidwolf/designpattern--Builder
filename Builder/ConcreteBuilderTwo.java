package Builder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConcreteBuilderTwo implements Builder {

	private PanelProduct panel;
	
	public ConcreteBuilderTwo() {
		panel = new PanelProduct();
	}

	@Override
	public void buildButton() {
		panel.button = new JButton("button");
	}

	@Override
	public void buildLabel() {
		panel.label = new JLabel("label");
	}

	@Override
	public void buildTextField() {
		panel.textField = new JTextField("MyÎÄ±¾¿ò");
	}

	@Override
	public JPanel getPanel() {
		panel.add(panel.textField);
		panel.add(panel.label);
		panel.add(panel.button);
		return panel;
	}

}
