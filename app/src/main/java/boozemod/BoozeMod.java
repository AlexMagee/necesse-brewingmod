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
        ObjectRegistry.registerObject("still", new StillObject(), 2, true);

        ItemCategory.createCategory("B-F-A", "consumable", "alcohol");
        ItemCategory.craftingManager.createCategory("C-A-E", new String[]{"consumable", "alcohol"});

        // Register our items
        ItemRegistry.registerItem("brewWine", new AlcoholItem(1), 100, true);
        ItemRegistry.registerItem("brewSake", new AlcoholItem(1), 100, true);
        ItemRegistry.registerItem("brewBeer", new AlcoholItem(1), 100, true);
        ItemRegistry.registerItem("brewMead", new AlcoholItem(1), 100, true);
        ItemRegistry.registerItem("brewCider", new AlcoholItem(1), 100, true);
        ItemRegistry.registerItem("brewRum", new AlcoholItem(1), 10, true);
        ItemRegistry.registerItem("brewTequila", new AlcoholItem(1), 10, true);
        ItemRegistry.registerItem("brewVodka", new AlcoholItem(1), 10, true);
        ItemRegistry.registerItem("brewWhiskey", new AlcoholItem(1), 10, true);

        // Register our buff
        BuffRegistry.registerBuff("alcoholbuff", new AlcoholBuff());

        // Register our recipe tech
        RecipeTechRegistry.registerTech("fermenter", "fermenter");
        RecipeTechRegistry.registerTech("distillation", "distillation");
    }

    public void initResources() {
        // Sometimes your textures will have a black or other outline unintended under rotation or scaling
        // This is caused by alpha blending between transparent pixels and the edge
        // To fix this, run the preAntialiasTextures gradle task
        // It will process your textures and save them again with a fixed alpha edge color

    }

    public void postInit() {
        // Fermentation
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
        // Distillation
        Recipes.registerModRecipe(new Recipe(
                "brewRum",
                1,
                RecipeTechRegistry.getTech("distillation"),
                new Ingredient[]{
                        new Ingredient("sugar", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewTequila",
                1,
                RecipeTechRegistry.getTech("distillation"),
                new Ingredient[]{
                        new Ingredient("cactussapling", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewVodka",
                1,
                RecipeTechRegistry.getTech("distillation"),
                new Ingredient[]{
                        new Ingredient("potato", 2)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "brewWhiskey",
                1,
                RecipeTechRegistry.getTech("distillation"),
                new Ingredient[]{
                        new Ingredient("corn", 2)
                }
        ));
        // Workstations
        Recipes.registerModRecipe(new Recipe(
                "fermenter",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("copperbar", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "still",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("copperbar", 10)
                }
        ));
    }

}
