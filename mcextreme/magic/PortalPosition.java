package mcextreme.magic;

import net.minecraft.util.ChunkCoordinates;

public class PortalPosition extends ChunkCoordinates
{
    public long lastUpdateTime;
    
    final MagicTeleporter teleporterInstance;
    
    public PortalPosition(MagicTeleporter teleporter, int x, int y, int z, long updateTime)
    {
        super(x, y, z);
        teleporterInstance = teleporter;
        lastUpdateTime = updateTime;
    }
}
