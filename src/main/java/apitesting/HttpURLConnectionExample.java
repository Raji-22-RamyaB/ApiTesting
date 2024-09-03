package apitesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {
//get
	public void getMethodExample() throws IOException
	{

	URL url=new URL("http://dummy.restapiexample.com/api/v1/employees");
	//URL url=new URL("http://www.google.co.in");
	
	HttpURLConnection connection=(HttpURLConnection)url.openConnection();
	connection.setRequestMethod("GET");
	connection.connect();
	
	int statusCode=connection.getResponseCode();
	System.out.println("Status code is "+ statusCode);	

	String message=connection.getResponseMessage();
	System.out.println("Response Message" +message);
		      
	InputStream inputStream=connection.getInputStream();
	InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
	
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	String line;
	StringBuffer buffer=new StringBuffer();
	while((line=bufferedReader.readLine())!=null)
	{
	buffer.append(line);
	}
	System.out.println(buffer);
	}
	
	//post
	
	public void postMethodExample() throws IOException
	{
		URL url=new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		 
		connection.setRequestMethod("POST");
		
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		
		String jsonBody="{\"name\":\"Raji\",\"salary\":\"1000000\",\"age\":\"21\"}";
		
		byte[] inputJson=jsonBody.getBytes();
		
		OutputStream outputStream=connection.getOutputStream();
		
		outputStream.write(inputJson);
		
		
		System.out.println("Response code:" + connection.getResponseCode());
		System.out.println("Respose code:" + connection.getResponseMessage());
		
		InputStream inputStream=connection.getInputStream();
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
		
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null)
		{
		buffer.append(line);
		}
		System.out.println(buffer);
		}
		
		//put
	

	public void putMethodExample() throws IOException
	{
		URL url=new URL("http://dummy.restapiexample.com/api/v1/update/26081");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		 
		connection.setRequestMethod("PUT");
		
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		
		String jsonBody="{\"name\":\"Raji\",\"salary\":\"1000000\",\"age\":\"22\"}";
		
		byte[] inputJson=jsonBody.getBytes();
		
		OutputStream outputStream=connection.getOutputStream();
		
		outputStream.write(inputJson);
		
		
		System.out.println("Response code:" + connection.getResponseCode());
		System.out.println("Respose code:" + connection.getResponseMessage());
		
		InputStream inputStream=connection.getInputStream();
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
		
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null)
		{
		buffer.append(line);
		}
		System.out.println(buffer);
		}
		
	//delete
	public void deleteMethodExample() throws IOException
	{
		URL url=new URL("http://dummy.restapiexample.com/api/v1/delete/26081");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		 
		connection.setRequestMethod("DELETE");
		
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		
		System.out.println("Response code:" + connection.getResponseCode());
		System.out.println("Respose code:" + connection.getResponseMessage());
		
		InputStream inputStream=connection.getInputStream();
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
		
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null)
		{
		buffer.append(line);
		}
		System.out.println(buffer);
		}
		
	
	public static void main(String[] args)throws IOException
	{
		HttpURLConnectionExample connectionExample=new HttpURLConnectionExample();
		connectionExample.getMethodExample();
		connectionExample.postMethodExample();
		connectionExample.putMethodExample();
		connectionExample.deleteMethodExample();
	}
	
	
	
}
