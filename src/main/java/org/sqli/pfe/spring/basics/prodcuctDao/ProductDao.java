package org.sqli.pfe.spring.basics.prodcuctDao;

import java.util.List;

public interface ProductDao {

    List<String> getAll();

    List<String> getByLabel(String label);
}
