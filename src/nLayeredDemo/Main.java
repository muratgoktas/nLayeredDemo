package nLayeredDemo;
import java.awt.List;
import java.util.ArrayList;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.adapter.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.ABCProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		//toDo:Spring IoC ile çözülecek.
		ProductService prodcuctService=new 
				ProductManager(new ABCProductDao(),new JLoggerManagerAdapter(new JLoggerManager()));
		Product product=new Product(1,2,"Elma",12,34);
		prodcuctService.add(product);
		
		
		
		// Bilgi:Array,ArrayList,List

		// bu hata verir çünkü böyle array lara ekleme yapýlmaz.
		//int[] sayýlar= {1,2,3,4,5,6};
		//sayilar[6]=7;
		// Onun yerine ArrayList<object>generic array listesi kullanýlýr. c# da javada  List<>  basedir.
		/*
		 * ArrayList<Integer> sayilar = new ArrayList<Integer>(); List sayilar2 =new
		 * List(); sayilar2.add("1"); sayilar2.add("3"); sayilar.add(12);
		 * sayilar.add(23);
		 */
		
		
	}

}
