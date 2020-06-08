package People;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Food.Food;
import Windows.InfoWindow;

public class Cook extends Human{
	public Food makeFood(Food f, Farmer fm) {
		if(fm.grow == false) {
			String str = "������ ��� �� �������� �����!";
			JFrame infowindow1 = new InfoWindow(str, null, null, null, null);
		}
		else {
			f.title = JOptionPane.showInputDialog("������� ��������:");
			f.quantity = JOptionPane.showInputDialog("������� ����������:");
			f.taste = JOptionPane.showInputDialog("������� ����:");
			String str1 = " ����� ���������� �����";
			String str2 = "��������: " + f.title;
			String str3 = "����������: " + f.quantity;
			String str4 = "����: " + f.taste;
			JFrame infowindow2 = new InfoWindow(str1, str2, str3, str4, null);
		}
		
		return f;
	}
	
	public void eat(Food f, String str) {
		if(f.taste == null) {
			String message1 = "����� ��� �� ���������� ���!";
			JFrame infowindow1 = new InfoWindow(message1, null, null, null, null);
		}
		else {
			String message2 = str + " ��������� " + f.taste + " ����";
			JFrame infowindow2 = new InfoWindow(message2, null, null, null, null);
		}
	}
}
