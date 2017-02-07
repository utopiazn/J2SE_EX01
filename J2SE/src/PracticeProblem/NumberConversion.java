package PracticeProblem;

class conversion{
	
	String result;
	
	
	public conversion(String string, int i, int j) {
		// TODO Auto-generated constructor stub
		
		if(i == 10 && j == 2){
			
			result = Integer.toBinaryString(Integer.valueOf(string));
			
		}else if(i == 10 && j == 8){
			result = Integer.toOctalString(Integer.valueOf(string));			
		
		}else if(i == 10 && j == 16){
			result = Integer.toHexString(Integer.valueOf(string));
			
		}else if( (i == 2 ||i == 8 ||i == 16 )&& j == 10){
			result = Integer.valueOf(string,i).toString();						
		}else if(i == 2 && j == 8){
			
			//2->10
			this.conversion(string,1,10);
			//10-->8
			
			
		}else if(i == 2 && j == 16){
			
			
			
		}else if(i == 8 && j == 2){
				
		}else if(i == 8 && j == 16){
				
		}else if(i == 16 && j == 2){
			
		}else if(i == 16 && j == 8){
			
		}
	}

	private void conversion(String string, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	void print(){
		
		System.out.println(result);
		
	}


	
	
	// 10 진수를 2진수로 변환
	String getDecimaltoBinary(int i){			
		return Integer.toBinaryString(i);
	}
	// 10 진수를 8진수로 변환
	String getDecimaltoOctal(int i){
		return Integer.toOctalString(i);
	}	
	// 10 진수를 16진수로 변환
	String getDecimaltoHexadecimal(int i){
		return Integer.toBinaryString(i);
	}
	
	// 2 진수를 10진수로 변환
	String getBinarytoDecimal(int i){			
		return Integer.toBinaryString(i);
	}
	// 8 진수를 10진수로 변환
	String getOctaltoDecimal(int i){
		return Integer.toOctalString(i);
	}	
	// 16 진수를 10진수로 변환
	String getHexadecimaltoDecimal(int i){
		return Integer.toBinaryString(i);
	}
	

	
}

public class NumberConversion {
	
	public static void main(String[] args){
		
		
		
		conversion dd = new conversion("127",10,2);
		
		//dd.print();
		
		
		
		//자바에서 표현할수 있는 진법 표현
		
		
	/*	
		
		
		int binary = 0b0000000001111111; //2진수일 경우 앞에 0b 를 붙인다
		int oct =017; //8진수일 경우 앞에 0 를 붙인다
		int dec = 15; //10진수
		int hex = 0xf;  //16진수는 0x를 붙이다
		
		System.out.println("2진수 "+binary);
		System.out.println("8진수"+oct);
		System.out.println("10진수"+dec);		
		System.out.println("16진수"+hex);
		
		System.out.println("========================");
		
		//10 진수 기준  2,8,16 진수 변환 
		System.out.println("2진수 "+Integer.toBinaryString(dec));
		System.out.println("8진수 "+Integer.toOctalString(dec));
		System.out.println("16진수 "+Integer.toBinaryString(dec));
		
		
		
		String strBinary = "0000000001111111";
		String strOct ="17"; 
		String strHex = "f";
		
		
		//2,8,16 진수 기준  10 진수 변환		
		System.out.println("2진수를 10진수 "+Integer.valueOf(strBinary,2));
		System.out.println("8진수를 10진수 "+Integer.valueOf(strOct,8));
		System.out.println("16진수를 10진수 "+Integer.valueOf(strHex,16));	
		*/
	}

}
