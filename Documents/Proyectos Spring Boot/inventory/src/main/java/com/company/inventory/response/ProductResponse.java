package com.company.inventory.response;

import lombok.Data;
import java.util.List;

import com.company.inventory.model.Product;

@Data
public class ProductResponse {
	List<Product> products;

}
