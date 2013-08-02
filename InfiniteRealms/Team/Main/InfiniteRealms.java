package BlueAtrium.InfiniteRealms.Team.Main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import BlueAtrium.InfiniteRealms.Team.Blocks.UnHolyOre;
import BlueAtrium.InfiniteRealms.Team.Items.CompressedGoldAxe;
import BlueAtrium.InfiniteRealms.Team.Items.CompressedGoldPickaxe;
import BlueAtrium.InfiniteRealms.Team.Items.CompressedGoldSpade;
import BlueAtrium.InfiniteRealms.Team.Items.CompressedGoldSword;
import BlueAtrium.InfiniteRealms.Team.Items.CompressesdGold;
import BlueAtrium.InfiniteRealms.Team.Items.InfinteTest;
import BlueAtrium.InfiniteRealms.Team.Items.Jade;
import BlueAtrium.InfiniteRealms.Team.Items.JadeAxe;
import BlueAtrium.InfiniteRealms.Team.Items.JadePickaxe;
import BlueAtrium.InfiniteRealms.Team.Items.JadeSpade;
import BlueAtrium.InfiniteRealms.Team.Items.JadeSword;
import BlueAtrium.InfiniteRealms.Team.Items.MaterializedCoal;
import BlueAtrium.InfiniteRealms.Team.Items.Ruby;
import BlueAtrium.InfiniteRealms.Team.Items.Saphire;
import BlueAtrium.InfiniteRealms.Team.Items.Topaz;
import BlueAtrium.InfiniteRealms.Team.Items.UnHolyIngot;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "InfiniteRealms", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)


public class InfiniteRealms 
{
@SidedProxy(clientSide = "BlueAtrium.InfiniteRealms.Team.Main.ClientProxyInfiniteRealms", serverSide = "BlueAtrium.InfiniteRealms.Team.Main.CommonProxyInfiniteRealms")
public static ClientProxyInfiniteRealms proxy;
	
public static Block UnHolyOre;
public static Block RubyOre;
public static Block SaphireOre;
public static Block TopazOre;
public static Block JadeOre;

int UnHolyOreID = 8000;
int RubyOreID = 8001;
int SaphireOreID = 8002;
int TopazOreID = 8003;
int JadeOreID = 8004;
	
public static Item InfiniteTest;
public static Item MaterializedCoal;
public static Item UnHolyIngot;
public static Item Ruby;
public static Item Saphire;
public static Item Topaz;
public static Item CompressedGold;
public static Item Jade;
public static Item CompressedGoldSword;
public static Item CompressedGoldAxe;
public static Item CompressedGoldPickaxe;
public static Item CompressedGoldSpade;
public static Item JadeSword;
public static Item JadeAxe;
public static Item JadePickaxe;
public static Item JadeSpade;

int InfiniteTestID = 20000;
int MaterializedCoalID = 20001;
int UnHolyIngotID = 20002;
int RubyID = 20003;
int SaphireID = 20004;
int TopazID = 20005;
int CompressedGoldID = 20006;
int JadeID = 20007;
int CompressedGoldSwordID = 20008;
int CompressedGoldAxeID = 20009;
int CompressedGoldPickaxeID = 20010;
int CompressedGoldSpadeID = 20011;
int JadeSwordID = 20012;
int JadeAxeID = 20013;
int JadePickaxeID = 20014;
int JadeSpadeID = 20015;

@Instance("InfiniteRealms") 
public static InfiniteRealms instance;

@Init
public void Load(FMLInitializationEvent event){
  proxy.registerRenderThings();
  
  UnHolyOre = new UnHolyOre(UnHolyOreID).setStepSound(Block.soundStoneFootstep).setHardness(1.0F).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("UnHolyOre");
  InfiniteTest =  new InfinteTest(InfiniteTestID).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("InfiniteTest");
  MaterializedCoal = new MaterializedCoal(MaterializedCoalID).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("MaterializedCoal");
  UnHolyIngot = new UnHolyIngot(UnHolyIngotID).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("UnHolyIngot");
  Ruby = new Ruby(RubyID).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("Ruby");
  Saphire = new Saphire(SaphireID).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("Saphire");
  Topaz = new Topaz(TopazID).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("Topaz");
  CompressedGold = new CompressesdGold(CompressedGoldID).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("CompressedGold");
  Jade = new Jade(JadeID).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("Jade"); 
  CompressedGoldSword = new CompressedGoldSword(CompressedGoldSwordID, null).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("CompressedGoldSword");
  CompressedGoldAxe = new CompressedGoldAxe(CompressedGoldAxeID, null).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("CompressedGoldAxe");
  CompressedGoldPickaxe = new CompressedGoldPickaxe(CompressedGoldPickaxeID, null).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("CompressedGoldPickaxe");
  CompressedGoldSpade = new CompressedGoldSpade(CompressedGoldSpadeID, null).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("CompressedGoldPickaxe");
  JadeSword = new JadeSword(JadeSwordID, null).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("JadeSword");
  JadeAxe = new JadeAxe(JadeAxeID, null).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("JadeAxe");
  JadePickaxe = new JadePickaxe(JadePickaxeID, null).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("JadePickaxe");
  JadeSpade = new JadeSpade(JadeSpadeID, null).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("JadeSpade");
  
  GameRegitry();
  LangunageRegistry();
}

private void LangunageRegistry() 
{	
LanguageRegistry.addName(UnHolyOre, "Unholy Ore");
	
LanguageRegistry.addName(InfiniteTest, "Infinite Test");
LanguageRegistry.addName(MaterializedCoal, "Refined Coal");
LanguageRegistry.addName(UnHolyIngot, "UnHolyIngot");
LanguageRegistry.addName(Ruby, "Ruby");
LanguageRegistry.addName(Saphire, "Saphire");
LanguageRegistry.addName(Topaz, "Topaz");
LanguageRegistry.addName(CompressedGold, "CompressedGold");
LanguageRegistry.addName(Jade, "Jade");
}

private void GameRegitry() 
{
GameRegistry.registerBlock(UnHolyOre, "UnHolyOre");	
}
@PreInit
public void preLoad(FMLPreInitializationEvent event)
{
 this.instance = this;
 System.out.println("Loading The Infinite Realms Mod v1.0");
}

 @PostInit
 public void modsLoaded(FMLPostInitializationEvent event)
 {
	 
 } 
}

