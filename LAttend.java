import java.io.*;
class LAttend extends Exception{
	LAttend(String str){
		super(str);
		}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the record submission status as (True/False)");
		String ans = br.readLine( );
		boolean recordSubmitted = ans.equalsIgnoreCase("False");
	try{
		System.out.println("Enter the held classes");
		double h=Double.parseDouble(br.readLine());
		System.out.println("Enter the attended classes");
		double at=Double.parseDouble(br.readLine());
		double p=(at/h)*100;
		System.out.println("Percnetage is: "+p);
		if(p<75){
			LAttend lat=new LAttend("You are not allowed for JAVA LAB exam");
			throw lat;
			}
	}
	catch (LAttend la){
		System.out.println(la);
		}
	catch(IOException ie){
		System.out.println(ie);
		}
	finally{
		if(recordSubmitted){
			System.out.println("You are allowed for JAVA LAB exam without record");
			}
		else{
			System.out.println("You are allowed for JAVA LAB exam only if you have the record and attendence");
			}
		}
	}
}			