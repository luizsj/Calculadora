package org.me.calculo_obj;

public class calculo_obj {
/*
    public calculo_obj(String valor1, String valor2, String operador) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operador = operador;
    }

*/
     public calculo_obj() 
     {        
     } 
     
     private String valor1, valor2, operador;
    
	public String getValor1()
		{	return valor1;}

	public void setValor1(String valor1)
		{	this.valor1 = valor1;}

	public String getValor2()
		{	return valor2;}

	public void setValor2(String valor2)
		{	this.valor2 = valor2;}

	public String getOperador()
		{	return operador;}

	public void setOperador(String operador)
		{	this.operador = operador;}    
        
        public double Calcula()
        {
            double v1, v2, total;
            
            v1=Double.parseDouble(getValor1());
            v2=Double.parseDouble(getValor2());
            
            if (getOperador().equals("+"))
                total=v1+v2; 
            else if (getOperador().equals("-"))
                total=v1-v2;
            else if (getOperador().equals("*"))
                total=v1*v2;
            else 
                total=v1/v2; 
            return total;
        }
}

