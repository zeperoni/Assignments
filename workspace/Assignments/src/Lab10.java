/*-------------------------------------------------------------
// AUTHOR: Colin Bruzas
// ASU ID: 1212619562
// FILENAME: Lab10
// SPECIFICATION: description of the program
// TIME SPENT: how long it took you to complete the lab
//-----------------------------------------------------------*/
	
	import java.io.*;

	class Lab10
	{
	    public static void main(String[] args)
	    {
	        //declare necessary variables here
	    	String firstName, lastName;
	    	double test1, test2, test3, test4, avg, sum = 0.0;
	    	
	        try {
	        	System.out.print("\nEnter text file name: ");
	        	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        	String fileName = reader.readLine();
	        	
	        	// #1: create a File object called 'fo' based on above fileName
	        	File fo = new File(fileName);

	        	// #2: create a FileReader object called 'fr' by using above object created in #1
	        	FileReader fr = new FileReader(fo);

	        	// #3: create a BufferedReader object called 'br' by using the FileReader object created in #2
	        	BufferedReader br = new BufferedReader(fr);
	        	
	        	
		        	//create a File object called 'outputFile' that is associated with testAverage.txt
	        	    File outputFile = new File("testAverage.txt");
		        	
	
		        	//check whether the file's name already exists in the current directory
		        	//Note: When you submit the Lab10.java on server, you need to comment out the following if statement in order to test it multiple times!
		        	/*if(outputFile.exists())
		        	{
		        	    System.out.println("File already exists");
		        	    System.exit(0);
		        	}*/
	
		        	//create a PrintWriter object called 'pr' that is associated with the outputFile
		        	PrintWriter pr = new PrintWriter(outputFile);
		        	
		        	//Header of the file
        			pr.printf("%s", "========= CSE110 Report =========");
        			pr.println();
        			pr.printf("%s\t\t\t%s", "Name", "Test Average");
        			pr.println();
        			
	        			//prime read - read in the first line. br is a BufferedReader object we created in above step 1.3
	        			String line = br.readLine();
	        			//while not reach to the end of the file
	        			while(line != null )
	        			{
	        				String[] tokenizedLine = line.split("[ \\s ]");	        			    
	        				//process data line by line
	        				lastName = tokenizedLine[0];
    						firstName = tokenizedLine[1];
    						
    						test1 = Double.parseDouble(tokenizedLine[2]);
    						test2 = Double.parseDouble(tokenizedLine[3]);
    						test3 = Double.parseDouble(tokenizedLine[4]);
    						test4 = Double.parseDouble(tokenizedLine[5]);
    								
    								//do the computation, compute sum and average
    								sum = (test1 + test2 + test3 + test4);
    								avg = sum/4;
    								String fullName = firstName + " " + lastName;
    								
    								
    									pr.printf(" %-15s %.2f", fullName, avg);
    									pr.println();		
	        			    //read in the next line until to the end
	        			    line = br.readLine();
	        			} //end while
	
           		  //Once finished read or write data, close the relevant BufferedReader and PrintWriter object
		          //close the BufferedReader object
			      br.close();

			      //close the PrintWriter object
			      pr.close();
	            } 
	        catch(IOException e)
	        {
	            System.out.println(e);
	        }
	        
	        
	    } //end main()
	}//end class
	


