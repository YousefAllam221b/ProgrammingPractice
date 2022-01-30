public class miniString {
    char[] c;
    public miniString() {
    	this.c=new char[0];
    }
    public miniString(char[] c){
    	this.c= new char[c.length];
    	for(int i =0;i<c.length;i++)
    		this.c[i]=c[i];
    }
    public int length(){
    	return this.c.length;
    }
    public char charAt(int n){
    	return c[n];
    }
    public miniString concat(miniString s){
    	miniString out= new miniString(new char[this.c.length+s.length()]);
    	int j=0;
    	for(int i =0;i<this.c.length+s.length();i++){
    		if(i<this.c.length){
    			out.c[i]=this.c[i];
    			j++;
    		}
    		else{
    			out.c[i]=s.c[i-j];
    		}

    	}
    	return out;

    }
    public boolean equals(miniString s){
    	if( c.length != s.length())
    		return false;
    	else{
    		for(int i=0;i<s.length();i++){
    			if(this.c[i] != s.c[i])
    				return false;
    		}
    		return true;
    	}

    }
    public String toString(){
    	String out="";
    	for(int i=0; i<this.c.length;i++){
    		out+=c[i];
    	}
    	return out;
    }

    public static void main(String[] args) {
		char[] s1= {'y','o','u','s','e','f'};
		char[] s2={' ','m','o','a','t','a','z'};
		miniString m1=new miniString(s1);
		miniString m2=new miniString(s2);
		System.out.println(m1.concat(m2));
}

}
