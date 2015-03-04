package controler;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Window;
import model.HybernateHelper;


public class controler {
	Window view;
	HybernateHelper model;
	
	
controler(){
	view = new Window();
	model = new HybernateHelper();
	MainWindow();
	guardar();
	loadCategories();
}


private void guardar() {
	view.getBotonGuardar().addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String sQuestion;
			String sCategory;
			int id;
			
			sQuestion = view.getAddQuestion().getText();
			sCategory = (String) view.getCategory().getSelectedItem();
			id = model.getLastQuestion().getIdQuestion();
			id++;
			
			System.out.println("save question:"+id+ " "+sQuestion+ " "+sCategory);
			model.addQuestion(id,sQuestion,sCategory);	
		}
	});
	
}
private void MainWindow() {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				view.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

private void loadCategories() {
	view.getCategory().addItem("Matematicas");
	view.getCategory().addItem("Historia");
	view.getCategory().addItem("Geografia");
}
}
