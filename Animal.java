public class Animal {

   public void speak() {
   }

   public String getType() {
      return "Generic animal";
   }
}

class Cat extends Animal {

   @Override
   public void speak() { // This is a good override.
      System.out.println("Meow."); 
   }

   @Override
   public String gettype() { // throws compile warning due to mistyped name.
      return "Cat";
   }

   @Override
   public String getType() { // throws compile warning due to mistyped name.
      return "Cat";
   }
   //}

   // @Twizzle is an annotation to method toggle().
   @Twizzle
   public void toggle() {
   }

   // Declares the annotation Twizzle.
   public @interface Twizzle {
   }
   
   // Same as: @Edible(value = true)
   @Edible(true)
   Item item = new Carrot();
  
   public @interface Edible {
     boolean value() default false;
   }
  
   @Author(first = "Oompah", last = "Loompah")
   Book book = new Book();
  
   public @interface Author {
     String first();
     String last();
   }

}

