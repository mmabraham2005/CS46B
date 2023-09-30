package birds;

public class Swan extends Bird{
	
	public void glide() {
		System.out.println("I'm graceful");
		
	}

	public static void main(String[] args) {
      	Bird duck = new Duck();
      	Swan s = new Swan();
      	Bird b = s;
      	System.out.println("Fixed by casting: RHS type = Duck, LHS type = Bird, RHS is subclass of LHS”.");
      	Duck d = (Duck) b;
      	System.out.println("Fixed by casting: RHS type = Duck, LHS type = Bird, RHS is subclass of LHS”.");
		Duck d1 = (Duck) duck;
		d1.quack();
      	d.quack();	
 	}

}
