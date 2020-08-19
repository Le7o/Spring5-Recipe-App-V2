package fr.le7o.spring5recipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }
    @Test
    void getDescription() {
        String descriptionValue = "French";
        category.setDescription("French");
        assertEquals(descriptionValue, category.getDescription());
    }

    @Test
    void getRecipes() {
    }
}