package com.tiramisu.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class EshopApplication {

   /* @Autowired
    EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    @RequestMapping("/")
    public void test(){
        System.out.println("#######");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Productcategories productcategories = new Productcategories();
        productcategories.setCategoryName("cat");
        productcategories.setCategoryGender("gen");

        Products products = new Products();
        products.setProductcategoriesByProductCategoryId(productcategories);
        products.setProductName("address");

        entityManager.persist(productcategories);
        entityManager.persist(products);

        entityManager.getTransaction().commit();
        entityManager.close();
    }*/

    public static void main(String[] args) {
		SpringApplication.run(EshopApplication.class, args);

    }


}
