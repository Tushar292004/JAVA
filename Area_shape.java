interface Area    
      {    
          double pi = 3.14;    
          double calc(double x,double y);    
       }    
    
class Rect implements Area    
   {    
      public double calc(double x,double y)    
        {    
            return(x*y);    
         }    
   }    
    
class Cir implements Area    
   {    
      public double calc(double x,double y)    
        {    
            return(pi*x*x);    
         }    
   }    
    
class Area_shape    
{    
     public static void main(String arg[])    
       {    
          Rect r = new Rect();    
          Cir c = new Cir();    
          Area a;    
              a = r;    
          System.out.println("\nArea of Rectangle is : " +a.calc(10,20));    
              a = c;    
          System.out.println("\nArea of Circle is : " +a.calc(15,15));    
        }    
  }  

