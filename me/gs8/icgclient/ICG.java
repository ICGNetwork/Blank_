package me.gs8.icgclient;

import net.minecraft.client.Minecraft;

public class ICG
{
	public static Minecraft mc = Minecraft.getMinecraft();
	
	public static void startUp(){
		
	}

	
	public static Minecraft getMinecraft(){
		if(mc == null) mc = Minecraft.getMinecraft();
		return mc;
	}
}
