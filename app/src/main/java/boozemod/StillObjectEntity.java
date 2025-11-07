package boozemod;

import necesse.engine.registries.RecipeTechRegistry;
import necesse.entity.objectEntity.ProcessingTechInventoryObjectEntity;
import necesse.inventory.recipe.Tech;
import necesse.level.maps.Level;

public class StillObjectEntity extends ProcessingTechInventoryObjectEntity {
    public StillObjectEntity(Level level, int x, int y) {
      super(level, "still", x, y, 2, 2, new Tech[]{RecipeTechRegistry.getTech("distillation")});
    }

    public int getProcessTime() {
      return 45000;
   }
}