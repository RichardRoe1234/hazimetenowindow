
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class windowsvirgin extends Frame
{
	public windowsvirgin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,640,480);
		
		JButton btn1 = new JButton("ボタン１");
		add(btn1);
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("クリック");
			}
		});
	}
	
	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public static void main(String[]args){
		Gui frm = new Gui();
		frm.setVisible(true);
	    }
}
