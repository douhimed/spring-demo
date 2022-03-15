package org.sqli.pfe.spring.basics.services;

import org.sqli.pfe.spring.basics.prodcuctDao.ProductDao;

public class ProductServicesImpl implements ProductServices{

    private ProductDao productDao;

    public ProductServicesImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void getAllProducts() {
        System.out.println(this.productDao.getAll());
    }

    @Override
    public void getByLabel(String label) {
        System.out.println(this.productDao.getByLabel(label));
    }
}
