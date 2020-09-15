package green.test_1.init;

import java.util.ArrayList;
import java.util.List;

import green.test_1.objects.armour.ArmourBase;
import green.test_1.objects.items.ItemBase;
import green.test_1.objects.items.ItemCanDamage;
import green.test_1.objects.items.ItemFoodBase;
import green.test_1.objects.items.ItemHasSub;
import green.test_1.objects.tools.ToolAxe;
import green.test_1.objects.tools.ToolPickaxe;
import green.test_1.objects.tools.ToolShovel;
import green.test_1.objects.tools.ToolSword;
import green.test_1.util.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import scala.tools.nsc.settings.Final;

public class ItemInit {
	public static final ToolMaterial GRENO_TOOL = 
			EnumHelper.addToolMaterial("greno_tool", 3, 256, 80.0F, 10.0F, 4);
	public static final ArmorMaterial GRENO_ARMOUR = 
			EnumHelper.addArmorMaterial("greno_armor",Reference.MOD_ID+":greno", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ENTITY_SNOWMAN_SHOOT, 0.0F);
	
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    public static final Item GRENO_INGOT = new ItemBase("greno_ingot");
    public static final Item GRENO_INGOT_CLAY_WRAPPED =new ItemBase("greno_ingot_clay_wrapped");
    public static final Item GRENO_INGOT_CERAMIC = new ItemBase("greno_ingot_ceramic");
    public static final Item GRENO_POWDER = new ItemFoodBase("greno_powder",1,true);
    
    public static final Item GRENO_SWORD = new ToolSword("greno_sword",GRENO_TOOL);
    public static final Item GRENO_AXE = new ToolAxe("greno_axe",GRENO_TOOL);
    public static final Item Greno_PICKAXE = new ToolPickaxe("greno_pickaxe",GRENO_TOOL);
    public static final Item Greno_SHOVEL = new ToolShovel("greno_shovel",GRENO_TOOL);
    
    public static final Item GRENO_HELMET = new ArmourBase("greno_helmet", GRENO_ARMOUR, 5, EntityEquipmentSlot.HEAD);
    public static final Item GRENO_CHESTPLATE = new ArmourBase("greno_chestplate", GRENO_ARMOUR, 5, EntityEquipmentSlot.CHEST);
    public static final Item GRENO_LEGGINGS = new ArmourBase("greno_leggings", GRENO_ARMOUR, 5, EntityEquipmentSlot.LEGS);
    public static final Item GRENO_BOOTS = new ArmourBase("greno_boots", GRENO_ARMOUR, 5, EntityEquipmentSlot.FEET);
     
    //public static final Item TEST_DAMAGE = new ItemCanDamage("test_damage", 233);
    
    public static final Item TEST_HASSUB = new ItemHasSub("test_hassub");
}

