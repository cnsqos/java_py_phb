package singleton;

	
public class Remocon {

	
	// static 때문에 한 번만 메모리에 올라감
	private static Remocon remocon = new Remocon();
			
			
			private Remocon(){
			 	
		}
			
			
			public static Remocon getInstance() {
				return remocon;
			}
}
