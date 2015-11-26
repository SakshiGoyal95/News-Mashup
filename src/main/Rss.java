package main;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Rss implements Collection{
	Rss(){
		
	}
	HashSet<String> hs_titles=new HashSet<String>();
	HashSet<String> hs_links=new HashSet<String>();
	HashSet<String> hs_desc=new HashSet<String>();
	
	
	public String readRSS(String field,String urlAddress){
		
		try{
				
			    Connection connect= db2Connectivity.dbConnector();
			    
				URL rssURL = new URL(urlAddress);
				BufferedReader in = new BufferedReader(new InputStreamReader(rssURL.openStream()));
				String sourceCode = "";
				String line,query,temp1="--",temp2="--",temp3="--";
				int count=0,count1=0,count2=0;
				
				while((line=in.readLine())!= null){
					temp3="--\n";
					if(line.contains("<title>")){
						
						count++;
						if(line.contains("<![CDATA[")){
							int pos1=line.lastIndexOf("[");
							
							int pos2=line.indexOf("]");
							 temp1=line.substring(pos1+1,pos2);
						}
						else{
						int firstPos = line.indexOf("<title>");
						 temp1 = line.substring(firstPos);
						temp1 = temp1.replace("<title>","");
						int lastPos = temp1.indexOf("</title>");
						temp1 = temp1.substring(0,lastPos);
						}
						if(count>2){
							//System.out.print("\n\nTITLE\t");
							
							hs_titles.add(temp1);
						//	System.out.println("\n\n"+temp1);
							sourceCode += "\n\n"+temp1+"\n";
							
						}
							
						
						
						
					}
					else if(line.contains("<link>")){
						
						count1++;
						if(line.contains("<![CDATA[")){
							int pos1=line.lastIndexOf("[");
							
							int pos2=line.indexOf("]");
							 temp2=line.substring(pos1+1,pos2);
						}
						else{
						int firstPos = line.indexOf("<link>");
						 temp2 = line.substring(firstPos);
						temp2 = temp2.replace("<link>","");
						int lastPos = temp2.indexOf("</link>");
						temp2 = temp2.substring(0,lastPos);
						}
							if(count1>2){
								hs_links.add(temp2);
								//	System.out.print("LINK\t");
							//	System.out.println(temp2);
								sourceCode += temp2+"\n";
							}
						
							
						
						
					}
					
					else if(line.contains("<description>")){
						
						count2++;
						if(line.contains("<![CDATA[")){
							int pos1=line.lastIndexOf("[");
							
							int pos2=line.indexOf("]");
							 temp3=line.substring(pos1+1,pos2);
						}
						else{
						int firstPos = line.indexOf("<description>");
						 temp3 = line.substring(firstPos);
						temp3 = temp3.replace("<description>","");
						int lastPos = temp3.indexOf("</description>");
						temp3 = temp3.substring(0,lastPos);
						if(temp3.contains("&lt"))
							temp3="--\n";
						if(temp3.isEmpty())
							temp3="--\n";
						}
						
						if(count2>1){
							hs_desc.add(temp3);
							//query="insert into Newsfeed values('"+field+"','"+temp1+"','"+temp2+"','"+temp3+"')";
					      //	Statement stmt = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
						 // 	stmt.executeUpdate(query);
							//System.out.print("DESCRIPTION\t");
						//	System.out.println(temp3);
							sourceCode += temp3+"\n";
						}
							
						
						
						
						
					}
				
			
		}
				//System.out.println(sourceCode);
				in.close();
				
				NewsResult newsUI=new NewsResult(sourceCode);
				newsUI.setSize(new Dimension(1367, 740));;
				newsUI.setVisible(true);
				newsUI.setDefaultCloseOperation(UI.EXIT_ON_CLOSE);
				
				return sourceCode;
		}
			catch(MalformedURLException ue){
				System.out.println("Mal formed url");
				
			}
			catch(IOException ioe){
				System.out.println("Wrong!!");
				
			}
			catch(Exception m){
			System.out.println("ERROR");
			}
			//return sourceCode;
			return "";
		
		}

	@Override
	public boolean add(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}

