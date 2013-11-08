package com.example.soma;

import android.annotation.SuppressLint;


@SuppressLint("DefaultLocale")
public class GeCalcularMedia implements CalcularMedia {

	private double[] numeros;
	
	
	@Override
	public String calcNumeros(double[] num) {
		
		this.numeros = num;
		double temp = 0;
		
		for(int i = 0; i < this.numeros.length; i++){
			
			temp += numeros[i];
		}
		
		return calcResultados(temp/this.numeros.length);
		
	}

	private String calcResultados(double num) {
		
		String valor = String.format("%.1f", num);
		
		if(num >= 7){
			return "Sua média foi:"+ valor +"\nParabéns você foi aprovado!";
		
		}else if(num < 4){
			return "Você foi reprovado.";
		
		}else{
		
			num = (50 - (num * 6))/4;
			valor = String.format("%.1f", num);
			
			return "Você está na final.\n" + "Precisa tirar: "+ valor + "\nBoa sorte!" ;
		}
		
	}

	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}

}
