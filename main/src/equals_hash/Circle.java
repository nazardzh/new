package equals_hash;

import java.util.Objects;

public class Circle {
   private int radius;

   public Circle (int radius) {
       this.radius = radius;
   }
   public double getRadius(){
       return radius;
   }
//   @Override
//   public boolean equals(Object o){
//       if(!(o instanceof Circle)){
//           return false;
//       }
//       Circle another = (Circle) o;
//       if(this.radius == another.radius){
//           return true;
//       }
//       return  false;
//   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return getRadius() == circle.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
