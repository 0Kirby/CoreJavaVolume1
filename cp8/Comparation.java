package cp8;

import javax.swing.JOptionPane;

public class Comparation {

	public static void main(String args[]) {

		String firstNumber, // 用户输入第1个数据变量

				secondNumber, // 用户输入第2个数据变量

				result; // 输出结果变量

		int number1, // 用于比较的第1个数

				number2; // 用于比较的第2个数

//用户输入第1个数据的字符串

		firstNumber = JOptionPane.showInputDialog("输入第1个整数:");

//用户输入第2个数据的字符串

		secondNumber = JOptionPane.showInputDialog("输入第2个整数:");

//将字符串转换为整数类型

		number1 = Integer.parseInt(firstNumber);

		number2 = Integer.parseInt(secondNumber);

//初始化结果变量

		result = "";

//比较两个数据

		if (number1 == number2)

			result += number1 + " == " + number2;

		if (number1 != number2)

			result += number1 + " != " + number2;

		if (number1 < number2)

			result = result + "\n" + number1 + " < " + number2;

		if (number1 > number2)

			result = result + "\n" + number1 + " > " + number2;

		if (number1 <= number2)

			result = result + "\n" + number1 + " <= " + number2;

		if (number1 >= number2)

			result = result + "\n" + number1 + " >= " + number2;

//显示结果

		JOptionPane.showMessageDialog(null, result, "比较结果",

				JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);

	}

}