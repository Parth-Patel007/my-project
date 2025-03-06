public class University {
   private static University instance = null;
   protected University() {
      // Exists only to defeat instantiation.
   }
   public static University getInstance() {
      if(instance == null) {
         instance = new University();
      }
      return instance;
   }
}