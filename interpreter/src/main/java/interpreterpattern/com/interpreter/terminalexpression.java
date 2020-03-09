package interpreterpattern.com.interpreter;

class terminalexpression implements Expression  
{ 
    String data; 
  
    public terminalexpression(String data) 
    { 
        this.data = data;  
    } 
  
    public boolean interpreter(String contain)  
    { 
        if(contain.contains(data)) 
        { 
            return true; 
        } 
        else
        { 
            return false;   
        } 
    } 
} 
