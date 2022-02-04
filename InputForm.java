import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class InputForm extends Frame implements ActionListener{
	public InputForm() {
		Button button;
		setLayout(null);
		Label label1;
		Label l1= new Label("ENTER DETAILS :");
		add(l1);
		l1.setBounds(200, 30, 100, 50);
		//  ****
		Label l2= new Label("NAME :");
		add(l2);
		l2.setBounds(50, 90, 100, 50);
		
		TextField t1=new TextField(30);
		add(t1);
		t1.setBounds(150, 90, 160, 40);
		//   ****
		Label l3= new Label("CLASS :");
		add(l3);
		l3.setBounds(50, 145, 100, 50);
		TextField t2=new TextField(30);
		add(t2);
		t2.setBounds(150, 150, 160, 40);
		//   ****
		Label l4= new Label("DEPARTMENT :");
		add(l4);
		l4.setBounds(50, 200, 100, 50);
		TextField t3=new TextField(30);
		add(t3);
		t3.setBounds(150, 200, 160, 40);
		//  ****
		Label l5=new Label("EMAIL :");
		add(l5);
		l5.setBounds(50, 260, 60, 40);
		TextField t4=new TextField(30);
		add(t4);
		t4.setBounds(150, 260, 260, 40);
		
		Button b=new Button("SUBMIT");
		add(b);
		b.setBounds(170, 350, 100, 30);
		
		//window closing
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//frame
		setTitle("DETAILS COLLECTION");
		setSize(470,440);
		setVisible(true);
		
	}
		public void actionPerformed(ActionEvent e) {
			
		}
		

	public static void main(String[] args) {
		InputForm IF =new InputForm();
		//System.out.println("name:"+t1);
	}
}