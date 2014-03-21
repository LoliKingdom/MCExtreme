package mcextreme.tech.entity;

import java.util.Random;

import mcextreme.tech.item.ItemsTech;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityZombieScientist extends EntityZombie
{
  public EntityZombieScientist(World par1World)
  {
    super(par1World);
  }
  
  protected void entityInit()
  {
    super.entityInit();
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
  {
    if ((par1DamageSource == DamageSource.inFire) || (par1DamageSource == DamageSource.onFire)) {
      return false;
    }
    return super.attackEntityFrom(par1DamageSource, par2);
  }
  
  protected int getDropItemId()
  {
      return Item.rottenFlesh.itemID;
  }
  protected int getDropitemId()
  {
	  return ItemsTech.itemTestTube.itemID;
  }
}
  
