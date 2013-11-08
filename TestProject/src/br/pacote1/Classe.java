package br.pacote1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Classe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblTelefone, lblNome;
	private JTextField textField_1;
	private JButton btnCadastrar;
	private JComboBox comboBox;
	private JLabel lblSexo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classe frame = new Classe();
					frame.setVisible(true);
					frame.setTitle("Programa Teste");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("static-access")
	public Classe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lbFormCadastro = new JLabel("Formul\u00E1rio de Cadastro");
		contentPane.add(lbFormCadastro, "4, 2, center, center");
		
		lblNome = new JLabel("Nome:");
		contentPane.add(lblNome, "2, 4, right, default");
		
		textField = new JTextField();
		contentPane.add(textField, "4, 4, fill, default");
		textField.setColumns(10);
		
		lblTelefone = new JLabel("Telefone:");
		contentPane.add(lblTelefone, "2, 6, right, default");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "4, 6, left, default");
		textField_1.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				String temp = lblNome.getText()+textField.getText()+ "\n" + lblTelefone.getText()+textField_1.getText()+ 
						"\n"+lblSexo.getText()+ comboBox.getSelectedItem();
				JOptionPane.showMessageDialog(null, "Kalline você é a menina mais linda do MUNDO\n e do meu <3 <3 <3");
				textField.setText("");
				textField_1.setText("");
			}
		});
		
		lblSexo = new JLabel("Sexo:");
		contentPane.add(lblSexo, "2, 8, right, default");
		
		comboBox = new JComboBox();
		contentPane.add(comboBox, "4, 8, left, default");
		contentPane.add(btnCadastrar, "4, 14, center, center");
		comboBox.addItem("M");
		comboBox.addItem("F");

	}

}
