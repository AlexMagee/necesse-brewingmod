package boozemod;

import necesse.entity.mobs.PlayerMob;
import necesse.engine.network.server.ServerClient;
import necesse.entity.mobs.friendly.human.HumanMob;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.placeableItem.consumableItem.potionConsumableItem.PotionConsumableItem;
import necesse.inventory.item.ItemCategory;
import necesse.level.maps.Level;
import necesse.engine.util.GameBlackboard;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.engine.localization.Localization;

public class AlcoholItem extends PotionConsumableItem {
    public int abv;

    public AlcoholItem(int abv){
      super(250, "alcoholbuff", 120, 1);
      this.abv = abv;
      this.obeysBuffPotionPolicy = false;
      this.setItemCategory(ItemCategory.masterManager, new String[]{"consumable", "alcohol"});
    }

    public boolean canAndShouldPartyConsume(Level level, HumanMob mob, ServerClient partyClient, InventoryItem item, String purpose) {
      if (!super.canAndShouldPartyConsume(level, mob, partyClient, item, purpose)) {
        return false;
      } else {
        return true;
      }
    }

    @Override
    public ListGameTooltips getTooltips(InventoryItem item, PlayerMob perspective, GameBlackboard blackboard) {
      ListGameTooltips tooltips = super.getTooltips(item, perspective, blackboard);
      tooltips.add(Localization.translate("itemtooltip", "consumeeffecttip1"));
      tooltips.add(Localization.translate("itemtooltip", "consumeeffecttip2"));
      tooltips.add(Localization.translate("itemtooltip", "consumeeffecttip3"));
      return tooltips;
   }
}
