package mcextreme.core.utils;

import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;
import mcextreme.core.MCExtremeCore;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;

import java.util.Arrays;
import java.util.logging.Logger;

public class MCExtremePlayerHandler implements IConnectionHandler
{
	@Override
	public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager) 
	{
		for(String username : MinecraftServer.getServer().getAllUsernames()){
			if(username.equals("warlordjones")){
				MCExtremeCore.logger.warning("The code breaker is here: warlordjones! You're warned!"); break;
			}
			if(username.contains("Player")){
                MCExtremeCore.logger.info("MCP Test Enviroment!"); break;
			}
			//Insert Exacat Hate here!
			if(username.equals("Exacat"))
			{
                MCExtremeCore.exhate = true;
                MCExtremeCore.logger.warning("Exacat, you do not deserve this mod!");
                //Lelfish
                if(Arrays.asList(MinecraftServer.getServer().getAllUsernames()).contains("Rongmario"))
                    Logger.getLogger("Rongmario").info("Lel <3");
                break;
			}
		}
	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager) 
	{
		return null;
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager) { }

	@Override
	public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager) { }

	@Override
	public void connectionClosed(INetworkManager manager) {	}

	@Override
	public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login) { }
}
