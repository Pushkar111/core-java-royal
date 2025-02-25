//6) StringBuffer capacity() Method
//--------------------------------------
//► The capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.

package String_Manupulation.mutable.StringBufferClass.StringBuffer_Methods.StringBuffer_capacity_6;

public class StringBuffer_capacityExample1 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
	}
}
