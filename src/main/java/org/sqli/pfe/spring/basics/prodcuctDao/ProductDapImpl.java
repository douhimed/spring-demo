package org.sqli.pfe.spring.basics.prodcuctDao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductDapImpl implements ProductDao{

    private static List<String> prodcts = Arrays.asList("Test", "SQLI");

    @Override
    public List<String> getAll() {
        return prodcts;
    }

    @Override
    public List<String> getByLabel(String label) {
        return prodcts.stream().filter(p -> p.equalsIgnoreCase(label)).collect(Collectors.toList());

    }
}
