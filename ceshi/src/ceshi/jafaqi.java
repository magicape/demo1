package ceshi;

import java.awt.*;
import java.awt.event.*;
public class jafaqi extends WindowAdapter implements ActionListener {
Frame f;
TextField txt1;
TextField txt2;
TextField txt3;
Label lbl1;
Label lbl2;
Label lbl3;
Button btn1;
Button btn2;
Button btn3;
Button btn4;
void init() 
{
	f = new Frame("计算器");
	lbl1 = new Label("x");
	lbl2 = new Label("y");
	lbl3 = new Label("结果");
	txt1 = new TextField(10);
	txt2 = new TextField(10);
	txt3 = new TextField(10);
	btn1 = new Button(" 求 和 ");
	btn2 = new Button(" 求 差 ");
	btn3 = new Button(" 清 除 ");
	btn4 = new Button(" 退 出 ");
f.setLayout(new FlowLayout());
f.add(lbl1);
f.add(txt1);
f.add(lbl2);
f.add(txt2);
f.add(lbl3);
f.add(txt3);
f.add(btn1);
f.add(btn2);
f.add(btn3);
f.add(btn4);
f.setVisible(true);
f.pack();
btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);
f.addWindowListener(this);
}
public void windowClosing(WindowEvent e) {
System.exit(0);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == btn1) {
String s1 = txt1.getText();
String s2 = txt2.getText();
double d1 = Double.parseDouble(s1);
double d2 = Double.parseDouble(s2);
double d3 = d1 + d2;
String s3 = Double.toString(d3);
txt3.setText(s3);
}
if (e.getSource() == btn2) {
String s1 = txt1.getText();
String s2 = txt2.getText();
double d1 = Double.parseDouble(s1);
double d2 = Double.parseDouble(s2);
double d3 = d1 - d2;
String s3 = Double.toString(d3);
txt3.setText(s3);
}
if (e.getSource() == btn3) {
String s = "";
txt1.setText(s);
txt2.setText(s);
txt3.setText(s);
}
if (e.getSource() == btn4) {
System.exit(0);
}
}
public static void main(String[] args) {
new jafaqi().init();
}
}
