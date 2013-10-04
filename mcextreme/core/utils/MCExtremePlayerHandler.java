package mcextreme.core.utils;

import cpw.mods.fml.common.network.IConnectionHandler;
import ibxm.Player;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;

public class MCExtremePlayerHandler implements IConnectionHandler
{
	@Override
	public void playerLoggedIn(cpw.mods.fml.common.network.Player player,
			NetHandler netHandler, INetworkManager manager) 
	{
		//if(EntityPlayerMP.username == "warlordjones")
		//{
			//ModLoader.getMinecraftInstance().thePlayer.addChatMessage("Warning! Warlordjones will probably break stuff!");
		//}
		
	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler,
			INetworkManager manager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server,
			int port, INetworkManager manager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler,
			MinecraftServer server, INetworkManager manager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectionClosed(INetworkManager manager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clientLoggedIn(NetHandler clientHandler,
			INetworkManager manager, Packet1Login login) {
		// TODO Auto-generated method stub
		
	}
}
