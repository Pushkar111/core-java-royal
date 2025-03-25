package Modifiers.yt_PeaceOfCode.house2;

import Modifiers.yt_PeaceOfCode.house.Father;
import Modifiers.yt_PeaceOfCode.house.Mother;

public class Cousin
{
	public static void main(String[] args)
	{
		Mother mother = new Mother();
//		mother.money();  --> not accessable bcz cousin.java file and mother.java are not in same folder or packages

		Father father = new Father();
		father.pocketMoney();
	}
}
