import java.awt.*;
import javax.swing.*;
public class FiveGUIObjects{
	public static void main(String[] args){
		JFrame five_Components=new JFrame("Five Components");
				String[] hello={"1","2"};
				Font Fonta=new Font("Arial",Font.BOLD,33);
			five_Components.setLayout(new FlowLayout());
			five_Components.setVisible(true);
				JButton button=new JButton("Button_1");
				JComboBox <String> box=new JComboBox<>(hello);
				JLabel text=new JLabel("Hello World...");
				JPanel panel=new JPanel();
				JTextField txtField=new JTextField("Enter text here: ");
			five_Components.add(button);
			five_Components.add(text);
			five_Components.add(txtField);
			five_Components.add(box);
			five_Components.add(panel);//code loop:
				panel.setLayout(new FlowLayout());
				for(int x=0;x<2;x++){
					five_Components.setSize(500,500);
						button.setLocation(100,50);
						button.setSize(100,300);
						box.setLocation(250,150);
						text.setFont(Fonta);
						text.setLocation(250,200);
						panel.setSize(500,10);
						panel.setLocation(0,20);
						panel.setBackground(Color.red);
						txtField.setLocation(250,100);
						txtField.setSize(200,50);
				if(x>=1){x=0;}
				}
	}
}