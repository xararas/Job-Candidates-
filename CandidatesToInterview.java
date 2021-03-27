
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CandidatesToInterview 
{
	
	List<List<String>> list = Arrays.asList();


	public void findCandidates()
	{

		Path fileOut = Paths.get("to-interview.txt");
		OutputStream output = null;
		String [] keywordsDegree = {"Degree in Computer Science", "Masters in Computer Science"};
		String [] keywordsExperience = {"Data Analyst", "Programmer", "Computer programmer", "Operator"};
		String s = "";
		String delimiter = ",";
		String[] cv1 = null;
		String[] cv2 = null;
		String[] cv3 = null;
		String[] cv4 = null;
		String[] cv5 = null;
		String line = "";
		String line1 = "";
		String line2 = "";
		String line3 = "";
		String line4 = "";
		String line5 = "";
		boolean degree1 = false;
		boolean experience1 = false;
		boolean degree2 = false;
		boolean experience2 = false;
		boolean degree3 = false;
		boolean experience3 = false;
		boolean degree4 = false;
		boolean experience4 = false;
		boolean degree5 = false;
		boolean experience5 = false;
		try
		{
			output = Files.newOutputStream(fileOut);

			
			while(s != null)
			{	
				/* CV1 */
				
				s = Files.readAllLines(Paths.get("cleancv.txt")).get(0);
				cv1 = s.split(delimiter);
				
				loop:  // this is to break all the loops
				for (String a : cv1)
				{
					for (String k : keywordsDegree)
					{
						if (a.equals(k))
						{
							degree1 = true;

							break loop;
						}
					}
				}
				
				loop:
				for (String a : cv1)
				{
					for (String k : keywordsExperience)
					{
						if (a.equals(k))
						{
							experience1 = true;

							break loop;
						}
					}
				}
				
				if (degree1 == true && experience1 == true)
					
				{
					line1 = cv1[0] + " " + cv1[1] + " " + cv1[2] + " " + cv1[3] + " " + cv1[4] + " " + 
							cv1[5] + " " + cv1[6] + System.getProperty("line.separator");
					
				}
				
				/* CV2 */

				s = Files.readAllLines(Paths.get("cleancv.txt")).get(1);
				cv2 = s.split(delimiter);
				loop:  
				for (String a : cv2)
				{
					for (String k : keywordsDegree)
					{
						if (a.equals(k))
						{
							degree2 = true;

							break loop;
						}
					}
				}
				
				loop:
				for (String a : cv2)
				{
					for (String k : keywordsExperience)
					{
						if (a.equals(k))
						{
							experience2 = true;

							break loop;
						}
					}
				}
				
				if (degree2 == true && experience2 == true)
					
				{
					line2 = cv2[0] + " " + cv2[1] + " " + cv2[2] + System.getProperty("line.separator");
				}
									
				/* CV3 */

				s = Files.readAllLines(Paths.get("cleancv.txt")).get(2);
				cv3 = s.split(delimiter);
				loop: 
				for (String a : cv3)
				{
					for (String k : keywordsDegree)
					{
						if (a.equals(k))
						{
							degree3 = true;

							break loop;
						}
					}
				}
				
				loop:
				for (String a : cv3)
				{
					for (String k : keywordsExperience)
					{
						if (a.equals(k))
						{
							experience3 = true;

							break loop;
						}
					}
				}
				
				if (degree3 == true && experience3 == true)
					
				{
					line3 = cv3[0] + " " + cv3[1] + " " + cv3[2] + " " + cv3[3] + " " + cv3[4] + " " + cv3[5] + 
							 " " + cv3[6] + System.getProperty("line.separator");
				}
				
				/* CV4 */

				s = Files.readAllLines(Paths.get("cleancv.txt")).get(3);
				cv4 = s.split(delimiter);
				loop:  
				for (String a : cv4)
				{
					for (String k : keywordsDegree)
					{
						if (a.equals(k))
						{
							degree4 = true;

							break loop;
						}
					}
				}
				
				loop:
				for (String a : cv4)
				{
					for (String k : keywordsExperience)
					{
						if (a.equals(k))
						{
							experience4 = true;

							break loop;
						}
					}
				}
				
				if (degree4 == true && experience4 == true)
					
				{
					line4 = cv4[0] + " " + cv4[1] + " " + cv4[2] + " " + cv4[3] + " " + cv4[4] +
							System.getProperty("line.separator");
				}
				
				/* CV5 */

				s = Files.readAllLines(Paths.get("cleancv.txt")).get(4);
				cv5 = s.split(delimiter);
				loop: 
				for (String a : cv5)
				{
					for (String k : keywordsDegree)
					{
						if (a.equals(k))
						{
							degree5 = true;

							break loop;
						}
					}
				}
				
				loop:
				for (String a : cv5)
				{
					for (String k : keywordsExperience)
					{
						if (a.equals(k))
						{
							experience5 = true;

							break loop;
						}
					}
				}
				
				if (degree5 == true && experience5 == true)
					
				{
					line5 = cv5[0] + " " + cv5[1] + " " + cv5[2] + " " + cv5[3] + " " 
							+ cv5[4] + System.getProperty("line.separator");
				}
								
				break;
												
			}
			
			line = line1  + line2  + line3 +  line4 + line5;
			
			list = Arrays.asList(
					Arrays.asList(cv1[0], cv1[1], cv1[2], cv1[3], cv1[4], cv1[5], cv1[6]),
					Arrays.asList(cv3[0], cv3[1], cv3[2], cv3[3], cv3[4], cv3[5], cv3[6]),
					Arrays.asList(cv4[0], cv4[1], cv4[2], cv4[3], "", "", cv4[4]),
					Arrays.asList(cv5[0], cv5[1], cv5[2], cv5[3], "", "", cv5[4])			
					);
			
			byte[] data = line.getBytes();
			output.write(data);

		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}

	public void candidatesWithExperience() throws IOException
	{
		
		Path fileOut = Paths.get("to-interview-experience.txt");
		OutputStream output = null;
		String c = "";
		String[] cv1 = null;
		String[] cv2 = null;
		String[] cv3 = null;
		String[] cv4 = null;
		String candidate1 = "";
		String candidate2 = "";
		String candidate3 = "";
		String candidate4 = "";
		String candidates = "";
		
		output = Files.newOutputStream(fileOut);

		try
		{

			while(c != null)
			{	
				/* Candidate 1 */

				c = Files.readAllLines(Paths.get("to-interview.txt")).get(0);
				cv1 = c.split(" ");					
			
				int i = Integer. parseInt(cv1[7]);
				int j = Integer.parseInt(cv1[10]);
				
				if (i > 5 )
				{
					candidate1 = cv1[0] + " " + i + System.getProperty("line.separator");
					

				}
				
				if (j > 5 )
				{
					candidate1 = cv1[0] + " " + j + System.getProperty("line.separator");

				}
				
				
				/* Candidate 2 */
				
				c = Files.readAllLines(Paths.get("to-interview.txt")).get(1);
				cv2 = c.split(" ");		
			
				int a = Integer. parseInt(cv2[6]);
				int b = Integer.parseInt(cv2[9]);
				
				if (a > 5 )
				{
					candidate2 = cv2[0] + " " + a + System.getProperty("line.separator");
				}
				
				if (b > 5 )
				{
					candidate2 = cv2[0] + " " + b + System.getProperty("line.separator");
				}
				
				/* Candidate 3 */
				
				c = Files.readAllLines(Paths.get("to-interview.txt")).get(2);
				cv3 = c.split(" ");		
			
				int d = Integer. parseInt(cv3[6]);
				
				if (d > 5 )
				{
					candidate3 = cv3[0] + " " + d + System.getProperty("line.separator");
				}
				
				/* Candidate 4 */

				c = Files.readAllLines(Paths.get("to-interview.txt")).get(3);
				cv4 = c.split(" ");		
			
				int e = Integer. parseInt(cv4[6]);
				
				if (e > 5 )
				{
					candidate4 = cv4[0] + " " + e + System.getProperty("line.separator");			
				}
				
				candidates = candidate1  + candidate2 + candidate3 + candidate4;
										
				byte[] data = candidates.getBytes();
				output.write(data);
	
				break;
			}

		}
			catch(Exception e)
			{
				System.out.println("Message: " + e);
			}
	}
	
	public void createCSVFile() throws IOException
	{
		
		try
		{
			FileWriter csvWriter = new FileWriter("to-interview-table-format.csv");
			csvWriter.append("Identrifier");
			csvWriter.append(",");
			csvWriter.append("Qualification");
			csvWriter.append(",");
			csvWriter.append("Position1");
			csvWriter.append(",");
			csvWriter.append("Experience1");
			csvWriter.append(",");
			csvWriter.append("Position2");
			csvWriter.append(",");
			csvWriter.append("Experience2");
			csvWriter.append(",");
			csvWriter.append("eMail");
			csvWriter.append("\n");
			
			for (List<String> rowData : list)
			{
			    csvWriter.append(String.join(",", rowData));
			    csvWriter.append("\n");
			}

			csvWriter.flush();
			csvWriter.close();
		}
		
		
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
	
	public void createReport()
	{

		try
		{
			String line;
			BufferedReader br = new BufferedReader(new FileReader("to-interview-table-format.csv")); 
					
			while((line = br.readLine()) != null)
			{
				String[] values = line.split(",");
				
			    System.out.println(values[0] + "  " + values[1] + "  " + values[2] + "  " + values[3] + "  " + values[6]);
								
			}

		} 		
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
}



