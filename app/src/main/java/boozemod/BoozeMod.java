package boozemod;

import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.inventory.item.ItemCategory;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;

@ModEntry
public class BoozeMod {

    public void init() {
        // Register out objects
        ObjectRegistry.registerObject("fermenter", new FermenterObject(), 2, true);

        ItemCategory.createCategory("B-F-A", "consumable", "alcohol");
        ItemCategory.craftingManager.createCategory("C-A-E", new String[]{"consumable", "alcohol"});

        // Register our items
        ItemRegistry.registerItem("brewWine", new AlcoholItem(1), 100, true);
        ItemRegistry.registerItem("brewSake", new AlcoholItem(1), 100, true);
        ItemRegistry.registerItem("brewBeer", new AlcoholItem(1), 100, true);
        ItemRegistry.registerItem("brewMead", new AlcoholItem(1), 100, true);
        ItemRegistry.registerItem("brewCider", new AlcoholItem(1), 100, true);
        // ItemRegistry.registerItem("rum", new AlcoholItem(1), 10, true);
        // ItemRegistry.registerItem("whiskey", new AlcoholItem(1), 10, true);
        // ItemRegistry.registerItem("vodka", new AlcoholItem(1), 10, true);
        // ItemRegistry.registerItem("tequila", new AlcoholItem(1), 10, true);

        // Register our buff
        BuffRegistry.registerBuff("alcoholbuff", new AlcoholBuff());

        // Register our recipe tech
        RecipeTechRegistry.registerTech("fermenter", "fermenter");
    }

    public void initResources() {
        // Sometimes your textures will have a black or other outline unintended under rotation or scaling
        // This is caused by alpha blending between transparent pixels and the edge
        // To fix this, run the preAntialiasTextures gradle task
        // It will process your textures and save them again with a fixed alpha edge color

    }

    public void postInit() {
        // Add recipes
        Recipes.registerModRecipe(new Recipe(
                "brewWine",
                1,
                RecipeTechRegistry.getTech("fermenter"),
                new Ingredient[]{
                        new Ingredient("blackberry", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewWine",
                1,
                RecipeTechRegistry.getTech("fermenter"),
                new Ingredient[]{
                        new Ingredient("strawberry", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewWine",
                1,
                RecipeTechRegistry.getTech("fermenter"),
                new Ingredient[]{
                        new Ingredient("blueberry", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewWine",
                1,
                RecipeTechRegistry.getTech("fermenter"),
                new Ingredient[]{
                        new Ingredient("raspberry", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewSake",
                1,
                RecipeTechRegistry.getTech("fermenter"),
                new Ingredient[]{
                        new Ingredient("rice", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewBeer",
                1,
                RecipeTechRegistry.getTech("fermenter"),
                new Ingredient[]{
                        new Ingredient("wheat", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewMead",
                1,
                RecipeTechRegistry.getTech("fermenter"),
                new Ingredient[]{
                        new Ingredient("honey", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewCider",
                1,
                RecipeTechRegistry.getTech("fermenter"),
                new Ingredient[]{
                        new Ingredient("apple", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "fermenter",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("copperbar", 10)
                }
        ));
    }

}
