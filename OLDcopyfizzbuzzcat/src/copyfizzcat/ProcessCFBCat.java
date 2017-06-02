package copyfizzcat;

public class ProcessCFBCat {
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
      for(int i=1; i<101; i++)
      {
         if (i % 2==0 && i % 3==0 && i % 5==0 && i % 10==0){

            System.out.println("COPYFIZZBUZZCAT");
         }
         else if(i % 2==0 && i % 3==0 && i % 5==0){

 	            System.out.println("COPYFIZZBUZZ");
 	          }
         else if(i % 2==0 && i % 3==0 && i % 10==0){
 	            System.out.println("COPYFIZZCAT");
 	          }
         else if(i % 2==0 && i % 5==0 && i % 10==0){
 	            System.out.println("COPYBUZZCAT");
 	          }
         else if(i % 2==0 && i % 3==0){

	            System.out.println("COPYFIZZ");
	          }
         else if (i % 2==0 && i % 5==0){

	            System.out.println("COPYBUZZ");
	         }
         else if (i % 2==0 && i % 10==0){
	            System.out.println("COPYCAT");           
	         }
         else if (i % 3==0 && i % 5==0){
	            System.out.println("FIZZBUZZ");	            
	         }
         else if (i % 3==0 && i % 10==0){
	            System.out.println("FIZZCAT");	            
	         }
         else if (i % 5==0 && i % 10==0){
	            System.out.println("COPYCAT");	            
	         }
         else if(i % 2==0){
            System.out.println("COPY");
          }
                 else if (i % 3==0){
                	System.out.println("FIZZ");
                 } 
                 else if (i % 5==0){
                	System.out.println("BUZZ");
                 } 
                 else if (i % 10==0){
                	System.out.println("CAT");
                 }
                    else{
                    	System.out.println(i); 
                    }
             }
    	}   
}
