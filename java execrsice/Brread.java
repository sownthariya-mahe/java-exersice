import java.io.*;
public class Brread
{
	public static void main(String args[])throws IOException
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\kgisl\\sownthariya\\java execrsice\\javaio.txt"));
		DataOutputStream dos = new DataOutputStream(new FileOutStream("E:\\kgisl\\sownthariya\\java execrsice\\javaio1.txt"));
		String count;
		while((count = dis.readLine())!=null)
		{
		String data = count.toUpperCase();
		System.out.println(data + ", ");
		dos.writeBytes(data+",");
		}
	}
}