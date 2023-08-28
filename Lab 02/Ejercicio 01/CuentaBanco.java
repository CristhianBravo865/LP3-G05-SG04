class CuentaBanco
{
private String titular;
private double cantidad;
   
public CuentaBanco (String titular, double cantidad)
{ 
this.titular = titular;
this.cantidad = cantidad;
} 

public CuentaBanco (String titular)
{    
this.titular = titular;
this.cantidad = 0.0;
}  
public String getTitular ()
{
return titular;
}
  
public void setTitular (String titular)
{   
this.titular = titular;  
} 
 
public double getCantidad ()
{    
return cantidad; 
}

public void ingresar (double cantidad)
{
    
if (cantidad > 0)
{
	
this.cantidad += cantidad;      
}
}

public void retirar (double cantidad)
{
    
if (this.cantidad - cantidad < 0)
{
this.cantidad = 0;
}
else
    {	
this.cantidad -= cantidad;  
}
}
  

public String toString ()
{
    
return "Titular: " + titular + ", Cantidad: " + cantidad;
}
}


