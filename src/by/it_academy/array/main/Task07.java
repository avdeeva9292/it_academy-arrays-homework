package by.it_academy.array.main;

import java.util.Random;

public class Task07 {
	/*Дан массив целых чисел A длиной N и два индекса L и R, где 0 ≤ L ≤ R < N. Разверните
	элементы массива между индексами L и R включительно, оставив остальные
	элементы без изменений.*/
	public static void main(String[] args) {
		
	        int n;
	        int l;
	        int r;
	        int[] a;
	        int[] temp;
	        int step;
	       
	        n = 10;
	        l = 3;
	     	r = 6;
	    	a = new int[n];
	        
	        init(a);
	        
	        System.out.println("Исходный массив");
	        print(a);

	        temp = new int[a.length];
	        step = r;
	        for (int i = 0; i < a.length; i++){
	            if (i >= l && i <= r){
	                temp[step] = a[i];
	                step--;
	                continue;
	            }
	            temp[i] = a[i];
	        }
	        
	        System.out.println("Массив с развернутыми элементами между индексами " + l + " и " + r);
	        print(temp);
	    }
	
	    public static int[] init(int[] mas) {
	        Random rnd = new Random();
	        for (int i = 0; i < mas.length; i++) {
	            mas[i] = rnd.nextInt(10);
	        }
	        return mas;
	    }
	    
	    public static void print(int[] mas){
	        for (int i = 0; i < mas.length; i++){
	            System.out.printf("[%2d]", mas[i]);
	        }
	        System.out.println();
	    }
	}
	
