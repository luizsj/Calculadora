package org.me.calculo_obj;

import javax.swing.*;

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
     
     private String valor1, valor2, operador, resultado;
    
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

        public String getResultado()
		{	return resultado;}
        
	public void setOperador(String operador,JTextField visor)
		{
                    this.resultado = "";
                    if (getOperador()==null )
                        {   this.operador = operador;
                        }
                    if (! (getOperador().equals(""))  )
                        {   Calcula (visor);
                        }
                    this.operador = operador;
                    
                        
                }    
        
        public String Calcula(JTextField visor)
        {
            double v1, v2, total;
            String Texto;
            
            setValor2(visor.getText());
            
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
           

            Texto = String.valueOf(total);

            this.resultado = Texto;
            return Texto;
        }
}

