package laba2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cook extends Human{
	Food makeFood(Food f) {
		f.title = JOptionPane.showInputDialog("������� ��������:");
		f.quantity = JOptionPane.showInputDialog("������� ����������:");
		f.taste = JOptionPane.showInputDialog("������� ����:");
		String str1 = "����� ���������� �����";
		String str2 = "��������: " + f.title;
		String str3 = "����������: " + f.quantity;
		String str4 = "����: " + f.taste;
		JFrame infowindow1 = new InfoWindow(str1, str2, str3, str4);
		
		return f;
	}
}
