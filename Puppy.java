public class Puppy {
   private String breed;
   private String name;	

   public Puppy(String nameParam, String breedParam) {
      breed = breedParam;
      name = nameParam;	      
   }

   public String getBreed() {
	return breed;
   }

   public String getName() {
	return name;
   }
   public static void main(String []args) {
      // Following statement would create an object myPuppy
      Puppy myPuppy = new Puppy("Tommy", "Labrador");
      System.out.println(myPuppy.getBreed() + " Puppy's name is: " + myPuppy.getName());

   }
}