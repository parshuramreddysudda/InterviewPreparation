
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
 
public class Distance {
    
    public static void main(String args[] ) throws Exception {
        
          @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
            float  point1=sc.nextInt();
            float point2=sc.nextInt();
            float  point3=sc.nextInt();
            float  point4=sc.nextInt();
            Point pointx = new Point();
            pointx.point1 = point1;  //x1
            pointx.point2 = point3;  //x2
            Point pointy = new Point();
            pointy.point1 = point2;  //y1
            pointy.point2 = point4;  //y2
            
            System.out.println((findDistance(pointx, pointy)));
}
 
 
  public static  BigDecimal findDistance(Point p1, Point p2)
         {
           
     
              double dis;
             
              dis= Math.sqrt((p1.point2-p1.point1)*(p1.point2-p1.point1) + (p2.point2-p2.point1)*(p2.point2-p2.point1));                        
       
              if(dis %1 ==0) {
            	  DecimalFormat ds = new DecimalFormat("#.000");
            	  String result=ds.format(dis);
            	  BigDecimal res = new BigDecimal(result); 
            	  return res;
              }
              else
              {
                  DecimalFormat ds = new DecimalFormat("#.###");
                  String result=ds.format(dis);
                  BigDecimal res = new BigDecimal(result);
                  return res;
              }
        
     
         } 
   
 
static class Point
{
    public float point2;
    public float point1;
 
}
}