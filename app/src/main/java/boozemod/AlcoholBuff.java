package boozemod;

import necesse.engine.util.GameBlackboard;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.Buff;
import necesse.gfx.gameTooltips.ListGameTooltips;

public class AlcoholBuff extends Buff {

    public AlcoholBuff() {
        canCancel = true;
        isVisible = true;
        shouldSave = true;
    }


    @Override
    public void init(ActiveBuff activeBuff, BuffEventSubscriber buffEventSubscriber) {
        // Apply modifiers here
        activeBuff.setModifier(BuffModifiers.SPEED, -0.5f); // -50% speed
        activeBuff.setModifier(BuffModifiers.CRIT_CHANCE, -0.25f); // -25% crit chance
        activeBuff.setModifier(BuffModifiers.MELEE_DAMAGE, 0.5f); // +50% melee damage
    }

    @Override
    public void serverTick(ActiveBuff buff) {
        // You can do server ticks here
    }

    @Override
    public void clientTick(ActiveBuff buff) {
        // You can do client ticks here, like adding particles to buff.owner
    }

    public ListGameTooltips getTooltip(ActiveBuff ab, GameBlackboard blackboard) {
        ListGameTooltips tooltips = super.getTooltip(ab, blackboard);
        tooltips.add("You have had too much to drink!");
        return tooltips;
    }

}
