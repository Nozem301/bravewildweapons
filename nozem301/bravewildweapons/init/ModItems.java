package nozem301.bravewildweapons.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import nozem301.bravewildweapons.Main;
import nozem301.bravewildweapons.items.ItemBase;
import nozem301.bravewildweapons.items.ToolAxe;
import nozem301.bravewildweapons.items.ToolShield;
import nozem301.bravewildweapons.items.ToolSword;
import nozem301.bravewildweapons.items.armor.ArmorBase;
import nozem301.bravewildweapons.items.tools.AncientShortSword;
import nozem301.bravewildweapons.items.tools.AwakenedMasterSword;
import nozem301.bravewildweapons.items.tools.BiggoronSword;
import nozem301.bravewildweapons.items.tools.BokoClub;
import nozem301.bravewildweapons.items.tools.Boomerang;
import nozem301.bravewildweapons.items.tools.DemonCarver;
import nozem301.bravewildweapons.items.tools.DoubleAxe;
import nozem301.bravewildweapons.items.tools.DragonboneBokoClub;
import nozem301.bravewildweapons.items.tools.EdgeOfDuality;
import nozem301.bravewildweapons.items.tools.EightfoldBlade;
import nozem301.bravewildweapons.items.tools.EightfoldLongblade;
import nozem301.bravewildweapons.items.tools.FeatheredEdge;
import nozem301.bravewildweapons.items.tools.FireRod;
import nozem301.bravewildweapons.items.tools.FishingHarpoon;
import nozem301.bravewildweapons.items.tools.FlameBlade;
import nozem301.bravewildweapons.items.tools.ForestDwellerSpear;
import nozem301.bravewildweapons.items.tools.ForestDwellerSword;
import nozem301.bravewildweapons.items.tools.FrostBlade;
import nozem301.bravewildweapons.items.tools.GerudoScimitar;
import nozem301.bravewildweapons.items.tools.GoddessSword;
import nozem301.bravewildweapons.items.tools.GoldenClaymore;
import nozem301.bravewildweapons.items.tools.GreatFlameblade;
import nozem301.bravewildweapons.items.tools.GreatFrostblade;
import nozem301.bravewildweapons.items.tools.GuardianSword1;
import nozem301.bravewildweapons.items.tools.GuardianSword2;
import nozem301.bravewildweapons.items.tools.GuardianSword3;
import nozem301.bravewildweapons.items.tools.HeroSword;
import nozem301.bravewildweapons.items.tools.IronSledgehammer;
import nozem301.bravewildweapons.items.tools.KnightClaymore;
import nozem301.bravewildweapons.items.tools.KnightsBroadsword;
import nozem301.bravewildweapons.items.tools.KnightsHalberd;
import nozem301.bravewildweapons.items.tools.LynelSword;
import nozem301.bravewildweapons.items.tools.MasterSword;
import nozem301.bravewildweapons.items.tools.MeteorRod;
import nozem301.bravewildweapons.items.tools.MightyLynelSword;
import nozem301.bravewildweapons.items.tools.MoonlightScimitar;
import nozem301.bravewildweapons.items.tools.RoyalBroadsword;
import nozem301.bravewildweapons.items.tools.RoyalClaymore;
import nozem301.bravewildweapons.items.tools.RoyalGuardClaymore;
import nozem301.bravewildweapons.items.tools.RoyalGuardSpear;
import nozem301.bravewildweapons.items.tools.RoyalHalberd;
import nozem301.bravewildweapons.items.tools.RoyalguardSword;
import nozem301.bravewildweapons.items.tools.RustyBroadsword;
import nozem301.bravewildweapons.items.tools.RustyClaymore;
import nozem301.bravewildweapons.items.tools.SavageLynelSword;
import nozem301.bravewildweapons.items.tools.ScimitarOfTheSeven;
import nozem301.bravewildweapons.items.tools.SeabreezeBoomerang;
import nozem301.bravewildweapons.items.tools.SoldierBroadsword;
import nozem301.bravewildweapons.items.tools.SoldierClaymore;
import nozem301.bravewildweapons.items.tools.SoldierSpear;
import nozem301.bravewildweapons.items.tools.SoupLadle;
import nozem301.bravewildweapons.items.tools.SpikedBokoClub;
import nozem301.bravewildweapons.items.tools.SpringloadedHammer;
import nozem301.bravewildweapons.items.tools.ThrowingSpear;
import nozem301.bravewildweapons.items.tools.ThunderBlade;
import nozem301.bravewildweapons.items.tools.TravelerClaymore;
import nozem301.bravewildweapons.items.tools.TravelerSpear;
import nozem301.bravewildweapons.items.tools.TravelerSword;
import nozem301.bravewildweapons.items.tools.TravelersBow;
import nozem301.bravewildweapons.items.tools.TreeBranch;
import nozem301.bravewildweapons.items.tools.ViciousSickle;
import nozem301.bravewildweapons.items.tools.WoodcutterAxe;
import nozem301.bravewildweapons.items.tools.ZoraSword;
import nozem301.bravewildweapons.util.Reference;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Items (Materials etc.)
	public static final Item ANCIENT_CORE = new ItemBase("ancient_core");
	public static final Item CHUCHU_JELLY = new ItemBase("chuchu_jelly");
	public static final Item KOROK_STICK = new ItemBase("korok_stick");
	public static final Item SILVER_ZORA_INGOT = new ItemBase("silver_zora_ingot");
	
	//Material Types (CTRL + Click ToolMaterial for vanilla tool values)
	public static final ToolMaterial MATERIAL_TRAVELER_SWORD = EnumHelper.addToolMaterial("material_traveler_sword", 0, 400, 0, -1.0F, 10);
	public static final ToolMaterial MATERIAL_FEATHERED_EDGE = EnumHelper.addToolMaterial("material_feathered_edge", 0, 540, 0, 2.0F, 14);
	public static final ToolMaterial MATERIAL_ANCIENT_SHORT_SWORD = EnumHelper.addToolMaterial("materal_ancient_short_sword", 0, 1080, 0, 6.0F, 14);
	public static final ToolMaterial MATERIAL_AWAKENED_MASTER_SWORD = EnumHelper.addToolMaterial("material_awakened_master_sword", 0, 0, 0, 11.0F, 30);
	public static final ToolMaterial MATERIAL_BOKO_CLUB = EnumHelper.addToolMaterial("material_boko_club", 0, 80, 0, -2.0F, 0);
	public static final ToolMaterial MATERIAL_EIGHTFOLD_BLADE = EnumHelper.addToolMaterial("material_eightfold_blade", 0, 520, 0, 2.0F, 18);
	public static final ToolMaterial MATERIAL_FLAME_BLADE = EnumHelper.addToolMaterial("material_flame_blade", 0, 720, 0, 2.5F, 12);
	public static final ToolMaterial MATERIAL_FOREST_DWELLER_SWORD = EnumHelper.addToolMaterial("material_forest_dweller_sword", 0, 540, 0, 2.5F, 15);
	public static final ToolMaterial MATERIAL_FROST_BLADE = EnumHelper.addToolMaterial("material_frost_blade", 0, 600, 0, 1.5F, 12);
	public static final ToolMaterial MATERIAL_GERUDO_SCIMITAR = EnumHelper.addToolMaterial("material_gerudo_scimitar", 0, 460, 0, 1.0F, 14);
	public static final ToolMaterial MATERIAL_KNIGHTS_BROADSWORD = EnumHelper.addToolMaterial("material_knights_broadsword", 0, 540, 0, 2.5F, 14);
	public static final ToolMaterial MATERIAL_TRAVELER_SPEAR = EnumHelper.addToolMaterial("material_traveler_spear", 0, 600, 0, -2.0F, 8);
	public static final ToolMaterial MATERIAL_TRAVELER_CLAYMORE = EnumHelper.addToolMaterial("material_traveler_claymore", 0, 400, 0, 2.5F, 10);
	public static final ToolMaterial MATERIAL_LYNEL_SWORD = EnumHelper.addToolMaterial("material_lynel_sword", 0, 520, 0, 2.5F, 10);
	public static final ToolMaterial MATERIAL_ROYAL_BROADSWORD = EnumHelper.addToolMaterial("material_royal_broadsword", 0, 720, 0, 5.0F, 18);
	public static final ToolMaterial MATERIAL_ROYALGUARD_SWORD = EnumHelper.addToolMaterial("material_royalguard_sword", 0, 280, 0, 8.0F, 18);
	public static final ToolMaterial MATERIAL_RUSTY_BROADSWORD = EnumHelper.addToolMaterial("material_rusty_broadsword", 0, 80, 0, -1.0F, 5);
	public static final ToolMaterial MATERIAL_SOLDIER_BROADSWORD = EnumHelper.addToolMaterial("material_soldier_broadsword", 0, 500, 0, 2.0F, 13);
	public static final ToolMaterial MATERIAL_SPIKED_BOKO_CLUB = EnumHelper.addToolMaterial("material_spiked_boko_club", 0, 180, 0, 1.0F, 8);
	public static final ToolMaterial MATERIAL_GUARDIAN_SWORD_1 = EnumHelper.addToolMaterial("material_guardian_sword_1", 0, 340, 0, 2.5F, 14);
	public static final ToolMaterial MATERIAL_GUARDIAN_SWORD_2 = EnumHelper.addToolMaterial("material_guardian_sword_2", 0, 520, 0, 3.5F, 15);
	public static final ToolMaterial MATERIAL_GUARDIAN_SWORD_3 = EnumHelper.addToolMaterial("material_guardian_sword_3", 0, 640, 0, 6.0F, 16);
	public static final ToolMaterial MATERIAL_THUNDER_BLADE = EnumHelper.addToolMaterial("material_thunder_blade", 0, 720, 0, 2.0F, 14);
	public static final ToolMaterial MATERIAL_TREE_BRANCH = EnumHelper.addToolMaterial("material_tree_branch", 0, 0, 0, -3.0F, 0);
	public static final ToolMaterial MATERIAL_SOLDIER_CLAYMORE = EnumHelper.addToolMaterial("material_soldier_claymore", 0, 500, 0, 3.0F, 12);
	public static final ToolMaterial MATERIAL_SOLDIER_SPEAR = EnumHelper.addToolMaterial("material_soldier_spear", 0, 700, 0, -1.5F, 10);
	public static final ToolMaterial MATERIAL_GODDESS_SWORD = EnumHelper.addToolMaterial("material_goddess_sword", 0, 4500, 0, 3.0F, 25);
	public static final ToolMaterial MATERIAL_HERO_SWORD = EnumHelper.addToolMaterial("material_hero_sword", 0, 540, 0, 2.0F, 20);
	public static final ToolMaterial MATERIAL_KNIGHTS_HALBERD = EnumHelper.addToolMaterial("material_knights_halberd", 0, 800, 0, 0.0F, 15);
	public static final ToolMaterial MATERIAL_ROYAL_HALBERD = EnumHelper.addToolMaterial("material_royal_halberd", 0, 1000, 0, 2.5F, 18);
	public static final ToolMaterial MATERIAL_ROYAL_GUARD_SPEAR = EnumHelper.addToolMaterial("material_royal_guard_spear", 0, 300, 0, 4.0F, 18);
	public static final ToolMaterial MATERIAL_DRAGONBONE_BOKO_CLUB = EnumHelper.addToolMaterial("material_dragonbone_boko_club", 0, 360, 0, 2.0F, 9);
	public static final ToolMaterial MATERIAL_MASTER_SWORD = EnumHelper.addToolMaterial("material_master_sword", 0, 800, 0, 3.5F, 25);
	public static final ToolMaterial MATERIAL_MOONLIGHT_SCIMITAR = EnumHelper.addToolMaterial("material_moonlight_scimitar", 0, 640, 0, 2.5F, 16);
	public static final ToolMaterial MATERIAL_WOODCUTTER_AXE = EnumHelper.addToolMaterial("material_woodcutter_axe", 2, 940, 7.0F, -1.0F, 12);
	public static final ToolMaterial MATERIAL_KNIGHT_CLAYMORE = EnumHelper.addToolMaterial("material_knight_claymore", 0, 600, 0, 5.5F, 15);
	public static final ToolMaterial MATERIAL_ROYAL_CLAYMORE = EnumHelper.addToolMaterial("material_royal_claymore", 0, 800, 0, 9.0F, 20);
	public static final ToolMaterial MATERIAL_ROYAL_GUARD_CLAYMORE = EnumHelper.addToolMaterial("material_royal_guard_claymore", 0, 300, 0, 14.0F, 22);
	public static final ToolMaterial MATERIAL_BOOMERANG = EnumHelper.addToolMaterial("material_boomerang", 0, 360, 0, 0.0F, 12);
	public static final ToolMaterial MATERIAL_SPRINGLOADED_HAMMER = EnumHelper.addToolMaterial("material_springloaded_hammer", 0, 1600, 0, -3.0F, 0);
	public static final ToolMaterial MATERIAL_SCIMITAR_OF_THE_SEVEN = EnumHelper.addToolMaterial("material_scimitar_of_the_seven", 0, 1200, 0, 4.0F, 22);
	public static final ToolMaterial MATERIAL_SEABREEZE_BOOMERANG = EnumHelper.addToolMaterial("material_seabreeze_boomerang", 0, 400, 0, 1.0F, 15);
	public static final ToolMaterial MATERIAL_FIRE_ROD = EnumHelper.addToolMaterial("material_fire_rod", 0, 280, 0, -3.0F, 0);
	public static final ToolMaterial MATERIAL_VICIOUS_SICKLE = EnumHelper.addToolMaterial("material_vicious_sickle", 0, 280, 0, 2.0F, 15);
	public static final ToolMaterial MATERIAL_DEMON_CARVER = EnumHelper.addToolMaterial("material_demon_carver", 0, 500, 0, 6.0F, 17);
	public static final ToolMaterial MATERIAL_SOUP_LADLE = EnumHelper.addToolMaterial("material_soup_ladle", 0, 100, 0, -2.0F, 0);
	public static final ToolMaterial MATERIAL_MIGHTY_LYNEL_SWORD = EnumHelper.addToolMaterial("material_mighty_lynel_sword", 0, 640, 0, 5.0F, 13);
	public static final ToolMaterial MATERIAL_SAVAGE_LYNEL_SWORD = EnumHelper.addToolMaterial("material_savage_lynel_sword", 0, 820, 0, 10.5F, 17);
	public static final ToolMaterial MATERIAL_METEOR_ROD = EnumHelper.addToolMaterial("material_meteor_rod", 0, 640, 0, -3.0F, 0);
	public static final ToolMaterial MATERIAL_RUSTY_CLAYMORE = EnumHelper.addToolMaterial("material_rusty_claymore", 0, 100, 0, 0.0F, 2);
	public static final ToolMaterial MATERIAL_DOUBLE_AXE = EnumHelper.addToolMaterial("material_double_axe", 2, 1040, 2.0F, 3.0F, 15);
	public static final ToolMaterial MATERIAL_IRON_SLEDGEHAMMER = EnumHelper.addToolMaterial("material_iron_sledgehammer", 2, 800, -1.0F, 2.0F, 10);
	public static final ToolMaterial MATERIAL_BIGGORON_SWORD = EnumHelper.addToolMaterial("material_biggoron_sword", 0, 1200, 0, 8.5F, 17);
	public static final ToolMaterial MATERIAL_EDGE_OF_DUALITY = EnumHelper.addToolMaterial("material_edge_of_duality", 0, 700, 0, 8.5F, 17);
	public static final ToolMaterial MATERIAL_GREAT_FLAMEBLADE = EnumHelper.addToolMaterial("material_great_flameblade", 0, 1000, 0, 4.5F, 20);
	public static final ToolMaterial MATERIAL_FOREST_DWELLER_SPEAR = EnumHelper.addToolMaterial("material_forest_dweller_spear", 0, 700, 0, -0.5F, 12);
	public static final ToolMaterial MATERIAL_FISHING_HARPOON = EnumHelper.addToolMaterial("fishing_harpoon", 0, 240, 0, -1.0F, 14);
	public static final ToolMaterial MATERIAL_EIGHTFOLD_LONGBLADE = EnumHelper.addToolMaterial("material_eightfold_longblade", 0, 500, 0, 4.0F, 18);
	public static final ToolMaterial MATERIAL_GOLDEN_CLAYMORE = EnumHelper.addToolMaterial("material_golden_claymore", 0, 600, 0, 3.0F, 18);
	public static final ToolMaterial MATERIAL_GREAT_FROSTBLADE = EnumHelper.addToolMaterial("material_great_frostblade", 0, 800, 0, 4.0F, 20);
	public static final ToolMaterial MATERIAL_THROWING_SPEAR = EnumHelper.addToolMaterial("material_throwing_spear", 0, 400, 0, -1.0F, 15);
	
	public static final ArmorMaterial ARMOR_MATERIAL_CHAMPION_TUNIC = EnumHelper.addArmorMaterial("armor_material_champion", Reference.MOD_ID + ":champion_tunic", 20, new int [] {3, 6, 11, 0}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
	
	//Tools
	public static final ItemSword TRAVELER_SWORD = new TravelerSword("traveler_sword", MATERIAL_TRAVELER_SWORD);
	public static final ItemSword FEATHERED_EDGE = new FeatheredEdge("feathered_edge", MATERIAL_FEATHERED_EDGE);
	public static final ItemSword ANCIENT_SHORT_SWORD = new AncientShortSword("ancient_short_sword", MATERIAL_ANCIENT_SHORT_SWORD);
	public static final ItemSword AWAKENED_MASTER_SWORD = new AwakenedMasterSword("awakened_master_sword", MATERIAL_AWAKENED_MASTER_SWORD);
	public static final ItemSword BOKO_CLUB = new BokoClub("boko_club", MATERIAL_BOKO_CLUB);
	public static final ItemSword EIGHTFOLD_BLADE = new EightfoldBlade("eightfold_blade", MATERIAL_EIGHTFOLD_BLADE);
	public static final ItemSword FLAME_BLADE = new FlameBlade("flame_blade", MATERIAL_FLAME_BLADE);
	public static final ItemSword FOREST_DWELLER_SWORD = new ForestDwellerSword("forest_dweller_sword", MATERIAL_FOREST_DWELLER_SWORD);
	public static final ItemSword FROST_BLADE = new FrostBlade("frost_blade", MATERIAL_FROST_BLADE);
	public static final ItemSword GERUDO_SCIMITAR = new GerudoScimitar("gerudo_scimitar", MATERIAL_GERUDO_SCIMITAR);
	public static final ItemSword KNIGHTS_BROADSWORD = new KnightsBroadsword("knights_broadsword", MATERIAL_KNIGHTS_BROADSWORD);
	public static final ItemSword ZORA_SWORD = new ZoraSword("zora_sword", MATERIAL_FEATHERED_EDGE);
	public static final ItemSword TRAVELER_SPEAR = new TravelerSpear("traveler_spear", MATERIAL_TRAVELER_SPEAR);
	public static final ItemSword TRAVELER_CLAYMORE = new TravelerClaymore("traveler_claymore", MATERIAL_TRAVELER_CLAYMORE);
	public static final ItemSword LYNEL_SWORD = new LynelSword("lynel_sword", MATERIAL_LYNEL_SWORD);
	public static final ItemSword ROYAL_BROADSWORD = new RoyalBroadsword("royal_broadsword", MATERIAL_ROYAL_BROADSWORD);
	public static final ItemSword ROYALGUARD_SWORD = new RoyalguardSword("royalguard_sword", MATERIAL_ROYALGUARD_SWORD);
	public static final ItemSword RUSTY_BROADSWORD = new RustyBroadsword("rusty_broadsword", MATERIAL_RUSTY_BROADSWORD);
	public static final ItemSword SOLDIER_BROADSWORD = new SoldierBroadsword("soldier_broadsword", MATERIAL_SOLDIER_BROADSWORD);
	public static final ItemSword SPIKED_BOKO_CLUB = new SpikedBokoClub("spiked_boko_club", MATERIAL_SPIKED_BOKO_CLUB);
	public static final ItemSword GUARDIAN_SWORD_1 = new GuardianSword1("guardian_sword_1", MATERIAL_GUARDIAN_SWORD_1);
	public static final ItemSword GUARDIAN_SWORD_2 = new GuardianSword2("guardian_sword_2", MATERIAL_GUARDIAN_SWORD_2);
	public static final ItemSword GUARDIAN_SWORD_3 = new GuardianSword3("guardian_sword_3", MATERIAL_GUARDIAN_SWORD_3);
	public static final ItemSword THUNDER_BLADE = new ThunderBlade("thunder_blade", MATERIAL_THUNDER_BLADE);
	public static final ItemSword TREE_BRANCH = new TreeBranch("tree_branch", MATERIAL_TREE_BRANCH);
	public static final ItemSword SOLDIER_CLAYMORE = new SoldierClaymore("soldier_claymore", MATERIAL_SOLDIER_CLAYMORE);
	public static final ItemSword SOLDIER_SPEAR = new SoldierSpear("soldier_spear", MATERIAL_SOLDIER_SPEAR);
	public static final ItemSword GODDESS_SWORD = new GoddessSword("goddess_sword", MATERIAL_GODDESS_SWORD);
	public static final ItemSword HERO_SWORD = new HeroSword("hero_sword", MATERIAL_HERO_SWORD);
	public static final ItemSword KNIGHTS_HALBERD = new KnightsHalberd("knights_halberd", MATERIAL_KNIGHTS_HALBERD);
	public static final ItemSword ROYAL_HALBERD = new RoyalHalberd("royal_halberd", MATERIAL_ROYAL_HALBERD);
	public static final ItemSword ROYAL_GUARD_SPEAR = new RoyalGuardSpear("royal_guard_spear", MATERIAL_ROYAL_GUARD_SPEAR);
	public static final ItemSword DRAGONBONE_BOKO_CLUB = new DragonboneBokoClub("dragonbone_boko_club", MATERIAL_DRAGONBONE_BOKO_CLUB);
	public static final ItemSword MASTER_SWORD = new MasterSword("master_sword", MATERIAL_MASTER_SWORD);
	public static final ItemSword MOONLIGHT_SCIMITAR = new MoonlightScimitar("moonlight_scimitar", MATERIAL_MOONLIGHT_SCIMITAR);
	public static final ItemAxe WOODCUTTER_AXE = new WoodcutterAxe("woodcutter_axe", MATERIAL_WOODCUTTER_AXE);
	public static final ItemSword KNIGHT_CLAYMORE = new KnightClaymore("knight_claymore", MATERIAL_KNIGHT_CLAYMORE);
	public static final ItemSword ROYAL_CLAYMORE = new RoyalClaymore("royal_claymore", MATERIAL_ROYAL_CLAYMORE);
	public static final ItemSword ROYAL_GUARD_CLAYMORE = new RoyalGuardClaymore("royal_guard_claymore", MATERIAL_ROYAL_GUARD_CLAYMORE);
	public static final ItemSword BOOMERANG = new Boomerang("boomerang", MATERIAL_BOOMERANG);
	public static final ItemSword SPRINGLOADED_HAMMER = new SpringloadedHammer("springloaded_hammer", MATERIAL_SPRINGLOADED_HAMMER);
	public static final ItemSword SCIMITAR_OF_THE_SEVEN = new ScimitarOfTheSeven("scimitar_of_the_seven", MATERIAL_SCIMITAR_OF_THE_SEVEN);
	public static final ItemSword SEABREEZE_BOOMERANG = new SeabreezeBoomerang("seabreeze_boomerang", MATERIAL_SEABREEZE_BOOMERANG);
	public static final ItemSword FIRE_ROD = new FireRod("fire_rod", MATERIAL_FIRE_ROD);
	public static final ItemSword VICIOUS_SICKLE = new ViciousSickle("vicious_sickle", MATERIAL_VICIOUS_SICKLE);
	public static final ItemSword DEMON_CARVER = new DemonCarver("demon_carver", MATERIAL_DEMON_CARVER);
	public static final ItemSword SOUP_LADLE = new SoupLadle("soup_ladle", MATERIAL_SOUP_LADLE);
	public static final ItemSword MIGHTY_LYNEL_SWORD = new MightyLynelSword("mighty_lynel_sword", MATERIAL_MIGHTY_LYNEL_SWORD);
	public static final ItemSword SAVAGE_LYNEL_SWORD = new SavageLynelSword("savage_lynel_sword", MATERIAL_SAVAGE_LYNEL_SWORD);
	public static final ItemSword METEOR_ROD = new MeteorRod("meteor_rod", MATERIAL_METEOR_ROD);
	public static final ItemSword RUSTY_CLAYMORE = new RustyClaymore("rusty_claymore", MATERIAL_RUSTY_CLAYMORE);
	public static final ItemSword DOUBLE_AXE = new DoubleAxe("double_axe", MATERIAL_DOUBLE_AXE);
	public static final ItemSword IRON_SLEDGEHAMMER = new IronSledgehammer("iron_sledgehammer", MATERIAL_IRON_SLEDGEHAMMER);
	public static final ItemSword BIGGORON_SWORD = new BiggoronSword("biggoron_sword", MATERIAL_BIGGORON_SWORD);
	public static final ItemSword EDGE_OF_DUALITY = new EdgeOfDuality("edge_of_duality", MATERIAL_EDGE_OF_DUALITY);
	public static final ItemSword GREAT_FLAMEBLADE = new GreatFlameblade("great_flameblade", MATERIAL_GREAT_FLAMEBLADE);
	public static final ItemSword FOREST_DWELLER_SPEAR = new ForestDwellerSpear("forest_dweller_spear", MATERIAL_FOREST_DWELLER_SPEAR);
	public static final ItemSword FISHING_HARPOON = new FishingHarpoon("fishing_harpoon", MATERIAL_FISHING_HARPOON);
	public static final ItemSword EIGHTFOLD_LONGBLADE = new EightfoldLongblade("eightfold_longblade", MATERIAL_EIGHTFOLD_LONGBLADE);
	public static final ItemSword GOLDEN_CLAYMORE = new GoldenClaymore("golden_claymore", MATERIAL_GOLDEN_CLAYMORE);
	public static final ItemSword GREAT_FROSTBLADE = new GreatFrostblade("great_frostblade", MATERIAL_GREAT_FROSTBLADE);
	public static final ItemSword THROWING_SPEAR = new ThrowingSpear("throwing_spear", MATERIAL_THROWING_SPEAR);
	
	//Bows
	public static final Item TRAVELERS_BOW = new TravelersBow("travelers_bow");
	
	//Shields
	public static final Item HYLIAN_SHIELD = new ToolShield("hylian_shield", CreativeTabs.COMBAT, 9000);
	
	//Armor
	public static final Item CHAMPION_TUNIC_CHESTPLATE = new ArmorBase("champion_tunic_chestplate", ARMOR_MATERIAL_CHAMPION_TUNIC, 1, EntityEquipmentSlot.CHEST);
	public static final Item CHAMPION_TUNIC_LEGGINGS = new ArmorBase("champion_tunic_leggings", ARMOR_MATERIAL_CHAMPION_TUNIC, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHAMPION_TUNIC_BOOTS = new ArmorBase("champion_tunic_boots", ARMOR_MATERIAL_CHAMPION_TUNIC, 1, EntityEquipmentSlot.FEET);

			
};
