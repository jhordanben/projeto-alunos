package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
		
	private JPanel jPanel = new JPanel(new GridBagLayout()); //painel de componentes
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Email");
	private JTextField mostraTempo2 = new JTextField();
	
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	private JButton jButton = new JButton("Add lista");
	private JButton jButton2 = new JButton("Stop");
	//private JButton jButton3 = new JButton("Botao3"); 
	
	
	public TelaTimeThread() {
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 300));
		setLocationRelativeTo(null);
		setResizable(false);
		
		//primeira parte concluida
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize( new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		//descricaoHora3.setPreferredSize(new Dimension(200, 25));
		//jPanel.add(descricaoHora3, gridBagConstraints);
		
		//mostraTempo3.setPreferredSize(new Dimension(200, 25));
		//gridBagConstraints.gridy++;
		//mostraTempo3.setEditable(false);
		//jPanel.add(mostraTempo3, gridBagConstraints);
		
			
		//============================================================================================================
		
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
		//jButton3.setPreferredSize(new Dimension(92,25));
		//gridBagConstraints.gridy++;
		//jPanel.add(jButton3, gridBagConstraints);
		
			
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for (int qtd = 0; qtd < 101; qtd++) { //simulando 100 vezes uma criaçao em massa
				
				ObjetoThread filaThread = new ObjetoThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText() + " - "+ qtd);
								
				fila.add(filaThread);
			}
		}
	});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				fila.stop();
				fila = null;
				
			}
		});
		
		fila.start();								
		add(jPanel, BorderLayout.WEST);	
		
		//sempre será o ultimo codigo
		setVisible(true); //exibe na tela do usuario
		
		
	}
	

	}


