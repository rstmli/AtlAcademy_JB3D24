package org.example.forignkeytest.service.impl;

import jakarta.transaction.Transactional;
import org.example.forignkeytest.dao.entity.Category;
import org.example.forignkeytest.dao.repository.CategoryRepository;
import org.example.forignkeytest.dao.repository.ProductRepository;
import org.example.forignkeytest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private CategoryRepository categoryRepository;

    @Transactional
    public void deleteProduct(Long productId) {
        // Əgər product bir category ilə əlaqəlidirsə, silməyə icazə verməyin
        List<Category> categories = categoryRepository.findByProductId(productId);

        if (!categories.isEmpty()) {
            throw new RuntimeException("Bu məhsula bağlı kateqoriyalar var, silinə bilməz.");
        }

        // Əgər heç bir əlaqəli category yoxdursa, məhsulu silirik
        productRepository.deleteById(productId);
    }


}
