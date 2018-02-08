package star;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class star extends JFrame{
public star(){
super("Расчет места хранения");//создаем окно
setBounds(800, 400, 300, 250);//определяем размеры окна
JPanel panel1=new JPanel();//объявляем панель
GridLayout layout = new GridLayout(8, 2, 5, 6);//определяем расположение элементов
JLabel text1=new JLabel("Количество видео-файлов(штук):");JLabel text2=new JLabel("Разрешение Y(пикс.):");//объявляем текстовые строки
JLabel text3=new JLabel("Разрешение X(пикс.):");JLabel text4=new JLabel("Разрядность цвета(бит):");//--//
JLabel text5=new JLabel("Длительность(с):");JLabel text6=new JLabel("Частота кадров(FPS):");//--//
JLabel text7=new JLabel("Нажмите для рассчета:");JLabel text8=new JLabel("Результат(МегаБайт):");//--//
JLabel text9=new JLabel("");//объявляем текстовые строки
JTextField box1=new JTextField();JTextField box2=new JTextField();//объявляем поля для ввода
JTextField box3=new JTextField();JTextField box4=new JTextField();//--//
JTextField box5=new JTextField();JTextField box6=new JTextField();//--//
JButton go=new JButton("Рассчитать");//объявляем кнопки
panel1.setLayout(layout);//определяем расположение элементов для панели
//добавляем текстовые строки и поля для ввода
panel1.add(text1);panel1.add(text2);
panel1.add(box1);panel1.add(box2);
panel1.add(text3);panel1.add(text4);
panel1.add(box3);panel1.add(box4);
panel1.add(text5);panel1.add(text6);
panel1.add(box5);panel1.add(box6);
panel1.add(text7);panel1.add(text8);
panel1.add(go);panel1.add(text9);
//определяем цвет панели
panel1.setBackground(new Color(182,234,131));
box1.addKeyListener(new KeyAdapter() {//добавляем слушателя на поле для ввода
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ( ((c < '0') || (c > '9'))) {
			e.consume(); // Игнорим введенные буквы и пробел
		}
		if (box1.getText().length() > 4){
        	 JOptionPane.showMessageDialog(null, "Максимальное кол-во символов 4", "Неправильный ввод",JOptionPane.WARNING_MESSAGE );
         }//не даем пользователю вводить больше 5 символов в строку
	}
});
box2.addKeyListener(new KeyAdapter() {
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ( ((c < '0') || (c > '9'))) {
			e.consume(); // Игнорируем введенные буквы и пробел
		}
		if (box2.getText().length() > 4){
			JOptionPane.showMessageDialog(null, "Максимальное кол-во символов 4", "Неправильный ввод",JOptionPane.WARNING_MESSAGE );
		}//не даем пользователю вводить больше 5 символов в строку
	}
});
box3.addKeyListener(new KeyAdapter() {
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ( ((c < '0') || (c > '9'))) {
			e.consume(); // Игнорируем введенные буквы и пробел
		}
		if (box3.getText().length() > 4){
			JOptionPane.showMessageDialog(null, "Максимальное кол-во символов 4", "Неправильный ввод",JOptionPane.WARNING_MESSAGE );
		}//не даем пользователю вводить больше 5 символов в строку
	}
});
box4.addKeyListener(new KeyAdapter() {
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ( ((c < '0') || (c > '9'))) {
			e.consume(); // Игнорируем введенные буквы и пробел
		}
	
		if (box4.getText().length() > 4){
   	 		JOptionPane.showMessageDialog(null, "Максимальное кол-во символов 4", "Неправильный ввод",JOptionPane.WARNING_MESSAGE );
		}//не даем пользователю вводить больше 5 символов в строку
	}
	});
box5.addKeyListener(new KeyAdapter() {
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ( ((c < '0') || (c > '9'))) {
			e.consume(); // Игнорируем введенные буквы и пробел
		}
		if (box5.getText().length() > 4){
			JOptionPane.showMessageDialog(null, "Максимальное кол-во символов 4", "Неправильный ввод",JOptionPane.WARNING_MESSAGE );
		}//не даем пользователю вводить больше 5 символов в строку
	}
});
box6.addKeyListener(new KeyAdapter() {
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ( ((c < '0') || (c > '9'))) {
			e.consume(); // Игнорируем введенные буквы и пробел
		}
		if (box6.getText().length() > 4){
			JOptionPane.showMessageDialog(null, "Максимальное кол-во символов 4", "Неправильный ввод",JOptionPane.WARNING_MESSAGE );
		}//не даем пользователю вводить больше 5 символов в строку
	}
});
go.addActionListener(new ActionListener() {//добавляем слушателя на кнопку
public void actionPerformed(ActionEvent e) {
Float s = Float.parseFloat((box1.getText()));//преобразовываем введенные в поле значения в тип данных float
Float ky = Float.parseFloat((box2.getText()));//--//
Float kx = Float.parseFloat((box3.getText()));//--//
Float i = Float.parseFloat((box4.getText()));//--//
Float t = Float.parseFloat((box5.getText()));//--//
Float fps = Float.parseFloat((box6.getText()));//--//
float result= Calculation(s,ky,kx,i,t,fps);//передаем данные в метод для вычисления
text9.setText(""+result);//выводим результат
}
});
setContentPane(panel1);//устанавливаем панель содержимого для окна
setVisible(true);//делаем окно видимым
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//определяем способ закрытия
}

public float Calculation(float a, float b, float c,float d,float e,float f) {//создаем метод и переменные
Float A=a*((((b*c)*d)/8192)*f*e)/1024;//формула для вычисления
return A;//возвращаем значение
}
public static void main(String[] args) {
star s=new star();
}
}
