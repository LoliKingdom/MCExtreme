package mcextreme.tech;

import mcextreme.magic.block.BlocksMagic;
import mcextreme.magic.item.ItemsMagic;
import mcextreme.tech.block.BlocksTech;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class TechnicalEventHooks 
{
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void FillBucket(FillBucketEvent event) 
	{
		ItemStack result = attemptFill(event.world, event.target);
		if (result != null) 
		{
			event.result = result;
			event.setResult(Result.ALLOW);
		}
	}

	private ItemStack attemptFill( World world, MovingObjectPosition p )
	{
		int id = world.getBlockId( p.blockX, p.blockY, p.blockZ );
	
		if ( id == BlocksTech.blockLiquidConcrete.blockID )
		{
			if ( world.getBlockMetadata( p.blockX, p.blockY, p.blockZ ) == 0 ) // Check that it is a source block
			{
				world.setBlock( p.blockX, p.blockY, p.blockZ, 0 ); // Remove the fluid block
			}
		}
		return new ItemStack(Item.diamond); // Return the filled bucked item here.
	}
}