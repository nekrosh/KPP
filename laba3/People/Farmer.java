package People;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Food.Vegetable;
import Windows.InfoWindow;

public class Farmer {
	private boolean plant;
	private boolean pour;
	protected boolean grow;
	
	public Farmer(){
		this.plant = false;
		this.pour = false;
		this.grow = false;
	}
	
	public Vegetable plantVegetable(Vegetable v) {
		v.title = JOptionPane.showInputDialog("������� ��������:");
		v.quantity = JOptionPane.showInputDialog("������� ����������:");
		v.form = JOptionPane.showInputDialog("������� ���:");
		v.color = JOptionPane.showInputDialog("������� ����:");
		
		String str1 = "������ ������� ����";
		String str2 = "��������: " + v.title;
		String str3 = "����������: " + v.quantity;
		String str4 = "���: " + v.form;
		String str5 = "����: " + v.color;
		JFrame infowindow1 = new InfoWindow(str1, str2, str3, str4, str5);
		
		return v;
	}
	
	public void pourVegetable() {
		if(this.plant == false)
		{
			String str1 = "���� ��� �� �������!";
			JFrame infowindow1 = new InfoWindow(str1, null, null, null, null);
		}
		else {
			String str2 = "���� �����";
			JFrame infowindow2 = new InfoWindow(str2, null, null, null ,null);
		}
	}
	
	public void growVegetable() {
		if(this.plant == false)
		{
			String str1 = "���� ��� �� �������!";
			JFrame infowindow1 = new InfoWindow(str1, null, null, null, null);
			return;
		}
		if(this.pour == false)
		{
			String str1 = "���� ��� �� �����!";
			JFrame infowindow1 = new InfoWindow(str1, null, null, null, null);
		}
		else {
			String str2 = "���� �������";
			JFrame infowindow2 = new InfoWindow(str2, null, null, null ,null);
		}
	}
	
	public void setPlant(boolean b) {
		this.plant = b;
	}
	public void setPour(boolean b) {
		this.pour = b;
	}
	public void setGrow(boolean b) {
		this.grow = b;
	}
}