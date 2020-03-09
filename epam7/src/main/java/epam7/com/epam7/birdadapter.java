package epam7.com.epam7;
class BirdAdapter implements ToyDuck 
	{ 
	    Bird bird; 

	    public void squeak() 
	    { 
	        bird.makeSound(); 
	    } 
	    public BirdAdapter(Bird bird) 
	    { 
	        this.bird = bird; 
	    } 
	  
	}
