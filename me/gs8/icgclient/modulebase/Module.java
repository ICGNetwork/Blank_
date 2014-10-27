package me.gs8.icgclient.modulebase;

import me.gs8.icgclient.ICG;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class Module {
	
	
	protected Minecraft mc = ICG.getMinecraft();
	private static String modulename;
	private static int keybind;
	private boolean isEnabled;
	
	public Module(String modulename, int keybind){
		this.modulename = modulename;
		this.keybind = keybind;
	}
	
	public void onTick(){}
	
	public void onEnable(){}
	
	public void onDisable(){}
	
	public void onToggle(){}
	
	public void onRender(){}
	
	public void onAttackEntity(EntityPlayer par1EntityPlayer, Entity par2EntityPlayer) { }
	
}