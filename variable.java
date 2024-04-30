public class variable{
public double value;
public Double derivative=0.0;
public variable(double a){
this.value=a;
}
public String toString(){
return "value ="+Double.toString(value)+"\tderivative ="+derivative.toString();
}  
}
