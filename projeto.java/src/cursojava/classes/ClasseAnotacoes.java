package cursojava.classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClasseAnotacoes {
	
	//para fazer um botao é necessario primeiramente fazer

private JButton jButton = new JButton("Start"); //----------> esse é o botão com o nome

private JLabel descricaoHora = new JLabel("Time thread 1");
private JTextField mostraTempo = new JTextField(); //------------------------> isso é oq o botao tem de ação, ou seja,
//se ele der start, ele vai começar a contar um relogio


private Runnable thread1 = new Runnable() { //------------> um bloco de runnable para colocar as informações que o 
//botao vai ter sobre um parametro


public void run() {
			while(true) { //fica sempre rodando
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));     
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
//depois tem que criar um desse embaixo de todo esse codigo acima
	private Thread thread1Time;

	//aqui sao as informacoes do bloco que vai ser mostrado, com tamanho
	public TelaTimeThread() {
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 500));
		setLocationRelativeTo(null);
		setResizable(false);
		
		// e aqui sao outras informacoes que vao dar funcionalidades pro botao
		
		//VVV isso aqui é como se fosse uma tabela, por isso usamos X e Y pra pular posições VVV
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize( new Dimension(200, 25)); //dimensoes das descricoes
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);
		
		//aq é pra dizer as dimensoes dos botoes, e seus espaços, ou seja, se vao ficar em X ou Y
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25)); //dimensoes dos botoes
		gridBagConstraints.gridy++; //gridy ou gridx pra dizer as localizacoes dos botoes
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton3.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton3, gridBagConstraints);
		
		// aqui embaixo é pra dizer OQ o botao vai fazer
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time = new Thread(thread1); 
				thread1Time.start(); //botao de INICIAR
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				thread3Time = new Thread(thread3);
				thread3Time.start();
				
				jButton2.setEnabled(false);
				jButton2.setEnabled(true);
			}
		});
		// e por ultimo, isso
		add(jPanel, BorderLayout.WEST);	//pra dizer a localização do layout
		
		//sempre será o ultimo codigo
		setVisible(true); //exibe na tela do usuario


