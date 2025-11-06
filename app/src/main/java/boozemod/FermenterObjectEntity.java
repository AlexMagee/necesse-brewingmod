package boozemod;

import necesse.engine.registries.RecipeTechRegistry;
import necesse.entity.objectEntity.ProcessingTechInventoryObjectEntity;
import necesse.inventory.recipe.Tech;
import necesse.level.maps.Level;

public class FermenterObjectEntity extends ProcessingTechInventoryObjectEntity {
    public FermenterObjectEntity(Level level, int x, int y) {
      super(level, "fermenter", x, y, 2, 2, new Tech[]{RecipeTechRegistry.getTech("fermenter")});
    }

    public int getProcessTime() {
      return 45000;
   }
}