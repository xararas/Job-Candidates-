
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CleaningUp 
{

	public void cleanUpFile()
	{
		String s = "";
		String delimiter = ",";
		String[] surn_cv1 = null;
		String[] surn_cv2 = null;
		String[] surn_cv3 = null;
		String[] surn_cv4 = null;
		String[] surn_cv5 = null;
		String[] qual_cv1 = null;
		String[] qual_cv2 = null;
		String[] qual_cv3 = null;
		String[] qual_cv4 = null;
		String[] qual_cv5 = null;
		String[] pos1_cv1 = null;
		String[] pos2_cv1 = null;
		String[] pos1_cv3 = null;
		String[] pos2_cv3 = null;
		String[] pos_cv4 = null;
		String[] pos_cv5 = null;
		String[] exp1_cv1 = null;
		String[] exp2_cv1 = null;
		String[] exp1_cv3 = null;
		String[] exp2_cv3 = null;
		String[] exp_cv4 = null;
		String[] exp_cv5 = null;
		String[] eMail_cv1 = null; 
		String[] eMail_cv2 = null; 
		String[] eMail_cv3 = null; 
		String[] eMail_cv4 = null; 
		String[] eMail_cv5 = null; 
		String line = "";
		
		Path fileOut = Paths.get("cleancv.txt");
		OutputStream output = null;

		try
		{
			output = Files.newOutputStream(fileOut);

			while(s != null)
			{

				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(1);
				if (s.startsWith("Surname"))
				{
					surn_cv1 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(4);
				if (s.startsWith("Qualification"))
				{
					qual_cv1 = s.split(":");
				}

				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(5);
				if (s.startsWith("Position"))
				{
					pos1_cv1 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(6);
				if (s.startsWith("Experience"))
				{
					exp1_cv1 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(7);
				if (s.startsWith("Position"))
				{
					pos2_cv1 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(8);
				if (s.startsWith("Experience"))
				{
					exp2_cv1 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(9);
				if (s.startsWith("eMail"))
				{
					eMail_cv1 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(12);
				if (s.startsWith("Surname"))
				{
					surn_cv2 = s.split(":");
				}	
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(14);
				if (s.startsWith("Qualification"))
				{
					qual_cv2 = s.split(":");
				}

				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(15);
				if (s.startsWith("eMail"))
				{
					eMail_cv2 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(18);
				if (s.startsWith("Surname"))
				{
					surn_cv3 = s.split(":");
				}	
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(21);
				if (s.startsWith("Qualification"))
				{
					qual_cv3 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(22);
				if (s.startsWith("Position"))
				{
					pos1_cv3 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(23);
				if (s.startsWith("Experience"))
				{
					exp1_cv3 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(24);
				if (s.startsWith("Position"))
				{
					pos2_cv3 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(25);
				if (s.startsWith("Experience"))
				{
					exp2_cv3 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(26);
				if (s.startsWith("eMail"))
				{
					eMail_cv3 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(29);
				if (s.startsWith("Surname"))
				{
					surn_cv4 = s.split(":");
				}	
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(32);
				if (s.startsWith("Qualification"))
				{
					qual_cv4 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(33);
				if (s.startsWith("Position"))
				{
					pos_cv4 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(34);
				if (s.startsWith("Experience"))
				{
					exp_cv4 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(35);
				if (s.startsWith("eMail"))
				{
					eMail_cv4 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(38);
				if (s.startsWith("Surname"))
				{
					surn_cv5 = s.split(":");
				}	
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(41);
				if (s.startsWith("Qualification"))
				{
					qual_cv5 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(42);
				if (s.startsWith("Position"))
				{
					pos_cv5 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(43);
				if (s.startsWith("Experience"))
				{
					exp_cv5 = s.split(":");
				}
				
				s = Files.readAllLines(Paths.get("dirtycv.txt")).get(44);
				if (s.startsWith("eMail"))
				{
					eMail_cv5 = s.split(":");
				}
				
				line = surn_cv1[1] + "0001" + delimiter + qual_cv1[1] + delimiter + pos1_cv1[1] + delimiter + 
						exp1_cv1[1] + delimiter + pos2_cv1[1] + delimiter + exp2_cv1[1] + delimiter + eMail_cv1[1] + 
						delimiter + System.getProperty("line.separator") + surn_cv2[1] + "0002" +  delimiter +
						qual_cv2[1] + delimiter + eMail_cv2[1] +  delimiter + System.getProperty("line.separator") +
						surn_cv3[1] + "0003" + delimiter + qual_cv3[1] + delimiter + pos1_cv3[1] + delimiter + 
						exp1_cv3[1] + delimiter + pos2_cv3[1] + delimiter + exp2_cv3[1] + delimiter + eMail_cv3[1] +
						delimiter + System.getProperty("line.separator") + surn_cv4[1] + "0004" + delimiter +
						qual_cv4[1] + delimiter + pos_cv4[1] + delimiter + exp_cv4[1] + delimiter + eMail_cv4[1] +
						delimiter + System.getProperty("line.separator") + surn_cv5[1] + "0005" + delimiter +
						qual_cv5[1] + delimiter + pos_cv5[1] + delimiter + exp_cv5[1] + delimiter + eMail_cv5[1] +
						delimiter; 			
				break;
				
			}
			
            byte[] data = line.getBytes();
            output.write(data);

		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
}

