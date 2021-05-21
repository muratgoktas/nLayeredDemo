package nLayeredDemo.business.concretes;

import java.util.List;

import javax.accessibility.Accessible;
import javax.swing.JLabel;
import javax.swing.JLayer;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.service.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("That is Category's product don't sale.");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Product Added : "+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
