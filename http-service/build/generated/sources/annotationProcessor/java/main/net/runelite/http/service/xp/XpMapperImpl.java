package net.runelite.http.service.xp;

import javax.annotation.Generated;
import net.runelite.http.api.hiscore.HiscoreResult;
import net.runelite.http.api.hiscore.Skill;
import net.runelite.http.api.xp.XpData;
import net.runelite.http.service.xp.beans.XpEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-02T08:46:19-0700",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
public class XpMapperImpl implements XpMapper {

    @Override
    public XpData xpEntityToXpData(XpEntity xpEntity) {
        if ( xpEntity == null ) {
            return null;
        }

        XpData xpData = new XpData();

        xpData.setTime( xpEntity.getTime() );
        xpData.setAttack_xp( xpEntity.getAttack_xp() );
        xpData.setDefence_xp( xpEntity.getDefence_xp() );
        xpData.setStrength_xp( xpEntity.getStrength_xp() );
        xpData.setHitpoints_xp( xpEntity.getHitpoints_xp() );
        xpData.setRanged_xp( xpEntity.getRanged_xp() );
        xpData.setPrayer_xp( xpEntity.getPrayer_xp() );
        xpData.setMagic_xp( xpEntity.getMagic_xp() );
        xpData.setCooking_xp( xpEntity.getCooking_xp() );
        xpData.setWoodcutting_xp( xpEntity.getWoodcutting_xp() );
        xpData.setFletching_xp( xpEntity.getFletching_xp() );
        xpData.setFishing_xp( xpEntity.getFishing_xp() );
        xpData.setFiremaking_xp( xpEntity.getFiremaking_xp() );
        xpData.setCrafting_xp( xpEntity.getCrafting_xp() );
        xpData.setSmithing_xp( xpEntity.getSmithing_xp() );
        xpData.setMining_xp( xpEntity.getMining_xp() );
        xpData.setHerblore_xp( xpEntity.getHerblore_xp() );
        xpData.setAgility_xp( xpEntity.getAgility_xp() );
        xpData.setThieving_xp( xpEntity.getThieving_xp() );
        xpData.setSlayer_xp( xpEntity.getSlayer_xp() );
        xpData.setFarming_xp( xpEntity.getFarming_xp() );
        xpData.setRunecraft_xp( xpEntity.getRunecraft_xp() );
        xpData.setHunter_xp( xpEntity.getHunter_xp() );
        xpData.setConstruction_xp( xpEntity.getConstruction_xp() );
        xpData.setOverall_rank( xpEntity.getOverall_rank() );
        xpData.setAttack_rank( xpEntity.getAttack_rank() );
        xpData.setDefence_rank( xpEntity.getDefence_rank() );
        xpData.setStrength_rank( xpEntity.getStrength_rank() );
        xpData.setHitpoints_rank( xpEntity.getHitpoints_rank() );
        xpData.setRanged_rank( xpEntity.getRanged_rank() );
        xpData.setPrayer_rank( xpEntity.getPrayer_rank() );
        xpData.setMagic_rank( xpEntity.getMagic_rank() );
        xpData.setCooking_rank( xpEntity.getCooking_rank() );
        xpData.setWoodcutting_rank( xpEntity.getWoodcutting_rank() );
        xpData.setFletching_rank( xpEntity.getFletching_rank() );
        xpData.setFishing_rank( xpEntity.getFishing_rank() );
        xpData.setFiremaking_rank( xpEntity.getFiremaking_rank() );
        xpData.setCrafting_rank( xpEntity.getCrafting_rank() );
        xpData.setSmithing_rank( xpEntity.getSmithing_rank() );
        xpData.setMining_rank( xpEntity.getMining_rank() );
        xpData.setHerblore_rank( xpEntity.getHerblore_rank() );
        xpData.setAgility_rank( xpEntity.getAgility_rank() );
        xpData.setThieving_rank( xpEntity.getThieving_rank() );
        xpData.setSlayer_rank( xpEntity.getSlayer_rank() );
        xpData.setFarming_rank( xpEntity.getFarming_rank() );
        xpData.setRunecraft_rank( xpEntity.getRunecraft_rank() );
        xpData.setHunter_rank( xpEntity.getHunter_rank() );
        xpData.setConstruction_rank( xpEntity.getConstruction_rank() );

        return xpData;
    }

    @Override
    public XpData hiscoreResultToXpData(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return null;
        }

        XpData xpData = new XpData();

        xpData.setAgility_rank( hiscoreResultAgilityRank( hiscoreResult ) );
        xpData.setStrength_rank( hiscoreResultStrengthRank( hiscoreResult ) );
        xpData.setFletching_rank( hiscoreResultFletchingRank( hiscoreResult ) );
        xpData.setMining_xp( (int) hiscoreResultMiningExperience( hiscoreResult ) );
        xpData.setAttack_rank( hiscoreResultAttackRank( hiscoreResult ) );
        xpData.setAgility_xp( (int) hiscoreResultAgilityExperience( hiscoreResult ) );
        xpData.setRunecraft_xp( (int) hiscoreResultRunecraftExperience( hiscoreResult ) );
        xpData.setThieving_rank( hiscoreResultThievingRank( hiscoreResult ) );
        xpData.setHitpoints_rank( hiscoreResultHitpointsRank( hiscoreResult ) );
        xpData.setCrafting_xp( (int) hiscoreResultCraftingExperience( hiscoreResult ) );
        xpData.setFishing_rank( hiscoreResultFishingRank( hiscoreResult ) );
        xpData.setHerblore_rank( hiscoreResultHerbloreRank( hiscoreResult ) );
        xpData.setMagic_xp( (int) hiscoreResultMagicExperience( hiscoreResult ) );
        xpData.setRunecraft_rank( hiscoreResultRunecraftRank( hiscoreResult ) );
        xpData.setStrength_xp( (int) hiscoreResultStrengthExperience( hiscoreResult ) );
        xpData.setSlayer_xp( (int) hiscoreResultSlayerExperience( hiscoreResult ) );
        xpData.setFishing_xp( (int) hiscoreResultFishingExperience( hiscoreResult ) );
        xpData.setHitpoints_xp( (int) hiscoreResultHitpointsExperience( hiscoreResult ) );
        xpData.setSmithing_rank( hiscoreResultSmithingRank( hiscoreResult ) );
        xpData.setThieving_xp( (int) hiscoreResultThievingExperience( hiscoreResult ) );
        xpData.setRanged_rank( hiscoreResultRangedRank( hiscoreResult ) );
        xpData.setSmithing_xp( (int) hiscoreResultSmithingExperience( hiscoreResult ) );
        xpData.setConstruction_xp( (int) hiscoreResultConstructionExperience( hiscoreResult ) );
        xpData.setCrafting_rank( hiscoreResultCraftingRank( hiscoreResult ) );
        xpData.setAttack_xp( (int) hiscoreResultAttackExperience( hiscoreResult ) );
        xpData.setHunter_rank( hiscoreResultHunterRank( hiscoreResult ) );
        xpData.setWoodcutting_rank( hiscoreResultWoodcuttingRank( hiscoreResult ) );
        xpData.setFarming_xp( (int) hiscoreResultFarmingExperience( hiscoreResult ) );
        xpData.setFletching_xp( (int) hiscoreResultFletchingExperience( hiscoreResult ) );
        xpData.setRanged_xp( (int) hiscoreResultRangedExperience( hiscoreResult ) );
        xpData.setOverall_rank( hiscoreResultOverallRank( hiscoreResult ) );
        xpData.setConstruction_rank( hiscoreResultConstructionRank( hiscoreResult ) );
        xpData.setHunter_xp( (int) hiscoreResultHunterExperience( hiscoreResult ) );
        xpData.setDefence_rank( hiscoreResultDefenceRank( hiscoreResult ) );
        xpData.setDefence_xp( (int) hiscoreResultDefenceExperience( hiscoreResult ) );
        xpData.setFiremaking_rank( hiscoreResultFiremakingRank( hiscoreResult ) );
        xpData.setMining_rank( hiscoreResultMiningRank( hiscoreResult ) );
        xpData.setHerblore_xp( (int) hiscoreResultHerbloreExperience( hiscoreResult ) );
        xpData.setFarming_rank( hiscoreResultFarmingRank( hiscoreResult ) );
        xpData.setPrayer_xp( (int) hiscoreResultPrayerExperience( hiscoreResult ) );
        xpData.setMagic_rank( hiscoreResultMagicRank( hiscoreResult ) );
        xpData.setCooking_xp( (int) hiscoreResultCookingExperience( hiscoreResult ) );
        xpData.setPrayer_rank( hiscoreResultPrayerRank( hiscoreResult ) );
        xpData.setFiremaking_xp( (int) hiscoreResultFiremakingExperience( hiscoreResult ) );
        xpData.setWoodcutting_xp( (int) hiscoreResultWoodcuttingExperience( hiscoreResult ) );
        xpData.setSlayer_rank( hiscoreResultSlayerRank( hiscoreResult ) );
        xpData.setCooking_rank( hiscoreResultCookingRank( hiscoreResult ) );

        return xpData;
    }

    private int hiscoreResultAgilityRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill agility = hiscoreResult.getAgility();
        if ( agility == null ) {
            return 0;
        }
        int rank = agility.getRank();
        return rank;
    }

    private int hiscoreResultStrengthRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill strength = hiscoreResult.getStrength();
        if ( strength == null ) {
            return 0;
        }
        int rank = strength.getRank();
        return rank;
    }

    private int hiscoreResultFletchingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill fletching = hiscoreResult.getFletching();
        if ( fletching == null ) {
            return 0;
        }
        int rank = fletching.getRank();
        return rank;
    }

    private long hiscoreResultMiningExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill mining = hiscoreResult.getMining();
        if ( mining == null ) {
            return 0L;
        }
        long experience = mining.getExperience();
        return experience;
    }

    private int hiscoreResultAttackRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill attack = hiscoreResult.getAttack();
        if ( attack == null ) {
            return 0;
        }
        int rank = attack.getRank();
        return rank;
    }

    private long hiscoreResultAgilityExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill agility = hiscoreResult.getAgility();
        if ( agility == null ) {
            return 0L;
        }
        long experience = agility.getExperience();
        return experience;
    }

    private long hiscoreResultRunecraftExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill runecraft = hiscoreResult.getRunecraft();
        if ( runecraft == null ) {
            return 0L;
        }
        long experience = runecraft.getExperience();
        return experience;
    }

    private int hiscoreResultThievingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill thieving = hiscoreResult.getThieving();
        if ( thieving == null ) {
            return 0;
        }
        int rank = thieving.getRank();
        return rank;
    }

    private int hiscoreResultHitpointsRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill hitpoints = hiscoreResult.getHitpoints();
        if ( hitpoints == null ) {
            return 0;
        }
        int rank = hitpoints.getRank();
        return rank;
    }

    private long hiscoreResultCraftingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill crafting = hiscoreResult.getCrafting();
        if ( crafting == null ) {
            return 0L;
        }
        long experience = crafting.getExperience();
        return experience;
    }

    private int hiscoreResultFishingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill fishing = hiscoreResult.getFishing();
        if ( fishing == null ) {
            return 0;
        }
        int rank = fishing.getRank();
        return rank;
    }

    private int hiscoreResultHerbloreRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill herblore = hiscoreResult.getHerblore();
        if ( herblore == null ) {
            return 0;
        }
        int rank = herblore.getRank();
        return rank;
    }

    private long hiscoreResultMagicExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill magic = hiscoreResult.getMagic();
        if ( magic == null ) {
            return 0L;
        }
        long experience = magic.getExperience();
        return experience;
    }

    private int hiscoreResultRunecraftRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill runecraft = hiscoreResult.getRunecraft();
        if ( runecraft == null ) {
            return 0;
        }
        int rank = runecraft.getRank();
        return rank;
    }

    private long hiscoreResultStrengthExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill strength = hiscoreResult.getStrength();
        if ( strength == null ) {
            return 0L;
        }
        long experience = strength.getExperience();
        return experience;
    }

    private long hiscoreResultSlayerExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill slayer = hiscoreResult.getSlayer();
        if ( slayer == null ) {
            return 0L;
        }
        long experience = slayer.getExperience();
        return experience;
    }

    private long hiscoreResultFishingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill fishing = hiscoreResult.getFishing();
        if ( fishing == null ) {
            return 0L;
        }
        long experience = fishing.getExperience();
        return experience;
    }

    private long hiscoreResultHitpointsExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill hitpoints = hiscoreResult.getHitpoints();
        if ( hitpoints == null ) {
            return 0L;
        }
        long experience = hitpoints.getExperience();
        return experience;
    }

    private int hiscoreResultSmithingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill smithing = hiscoreResult.getSmithing();
        if ( smithing == null ) {
            return 0;
        }
        int rank = smithing.getRank();
        return rank;
    }

    private long hiscoreResultThievingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill thieving = hiscoreResult.getThieving();
        if ( thieving == null ) {
            return 0L;
        }
        long experience = thieving.getExperience();
        return experience;
    }

    private int hiscoreResultRangedRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill ranged = hiscoreResult.getRanged();
        if ( ranged == null ) {
            return 0;
        }
        int rank = ranged.getRank();
        return rank;
    }

    private long hiscoreResultSmithingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill smithing = hiscoreResult.getSmithing();
        if ( smithing == null ) {
            return 0L;
        }
        long experience = smithing.getExperience();
        return experience;
    }

    private long hiscoreResultConstructionExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill construction = hiscoreResult.getConstruction();
        if ( construction == null ) {
            return 0L;
        }
        long experience = construction.getExperience();
        return experience;
    }

    private int hiscoreResultCraftingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill crafting = hiscoreResult.getCrafting();
        if ( crafting == null ) {
            return 0;
        }
        int rank = crafting.getRank();
        return rank;
    }

    private long hiscoreResultAttackExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill attack = hiscoreResult.getAttack();
        if ( attack == null ) {
            return 0L;
        }
        long experience = attack.getExperience();
        return experience;
    }

    private int hiscoreResultHunterRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill hunter = hiscoreResult.getHunter();
        if ( hunter == null ) {
            return 0;
        }
        int rank = hunter.getRank();
        return rank;
    }

    private int hiscoreResultWoodcuttingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill woodcutting = hiscoreResult.getWoodcutting();
        if ( woodcutting == null ) {
            return 0;
        }
        int rank = woodcutting.getRank();
        return rank;
    }

    private long hiscoreResultFarmingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill farming = hiscoreResult.getFarming();
        if ( farming == null ) {
            return 0L;
        }
        long experience = farming.getExperience();
        return experience;
    }

    private long hiscoreResultFletchingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill fletching = hiscoreResult.getFletching();
        if ( fletching == null ) {
            return 0L;
        }
        long experience = fletching.getExperience();
        return experience;
    }

    private long hiscoreResultRangedExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill ranged = hiscoreResult.getRanged();
        if ( ranged == null ) {
            return 0L;
        }
        long experience = ranged.getExperience();
        return experience;
    }

    private int hiscoreResultOverallRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill overall = hiscoreResult.getOverall();
        if ( overall == null ) {
            return 0;
        }
        int rank = overall.getRank();
        return rank;
    }

    private int hiscoreResultConstructionRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill construction = hiscoreResult.getConstruction();
        if ( construction == null ) {
            return 0;
        }
        int rank = construction.getRank();
        return rank;
    }

    private long hiscoreResultHunterExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill hunter = hiscoreResult.getHunter();
        if ( hunter == null ) {
            return 0L;
        }
        long experience = hunter.getExperience();
        return experience;
    }

    private int hiscoreResultDefenceRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill defence = hiscoreResult.getDefence();
        if ( defence == null ) {
            return 0;
        }
        int rank = defence.getRank();
        return rank;
    }

    private long hiscoreResultDefenceExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill defence = hiscoreResult.getDefence();
        if ( defence == null ) {
            return 0L;
        }
        long experience = defence.getExperience();
        return experience;
    }

    private int hiscoreResultFiremakingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill firemaking = hiscoreResult.getFiremaking();
        if ( firemaking == null ) {
            return 0;
        }
        int rank = firemaking.getRank();
        return rank;
    }

    private int hiscoreResultMiningRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill mining = hiscoreResult.getMining();
        if ( mining == null ) {
            return 0;
        }
        int rank = mining.getRank();
        return rank;
    }

    private long hiscoreResultHerbloreExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill herblore = hiscoreResult.getHerblore();
        if ( herblore == null ) {
            return 0L;
        }
        long experience = herblore.getExperience();
        return experience;
    }

    private int hiscoreResultFarmingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill farming = hiscoreResult.getFarming();
        if ( farming == null ) {
            return 0;
        }
        int rank = farming.getRank();
        return rank;
    }

    private long hiscoreResultPrayerExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill prayer = hiscoreResult.getPrayer();
        if ( prayer == null ) {
            return 0L;
        }
        long experience = prayer.getExperience();
        return experience;
    }

    private int hiscoreResultMagicRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill magic = hiscoreResult.getMagic();
        if ( magic == null ) {
            return 0;
        }
        int rank = magic.getRank();
        return rank;
    }

    private long hiscoreResultCookingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill cooking = hiscoreResult.getCooking();
        if ( cooking == null ) {
            return 0L;
        }
        long experience = cooking.getExperience();
        return experience;
    }

    private int hiscoreResultPrayerRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill prayer = hiscoreResult.getPrayer();
        if ( prayer == null ) {
            return 0;
        }
        int rank = prayer.getRank();
        return rank;
    }

    private long hiscoreResultFiremakingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill firemaking = hiscoreResult.getFiremaking();
        if ( firemaking == null ) {
            return 0L;
        }
        long experience = firemaking.getExperience();
        return experience;
    }

    private long hiscoreResultWoodcuttingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill woodcutting = hiscoreResult.getWoodcutting();
        if ( woodcutting == null ) {
            return 0L;
        }
        long experience = woodcutting.getExperience();
        return experience;
    }

    private int hiscoreResultSlayerRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill slayer = hiscoreResult.getSlayer();
        if ( slayer == null ) {
            return 0;
        }
        int rank = slayer.getRank();
        return rank;
    }

    private int hiscoreResultCookingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill cooking = hiscoreResult.getCooking();
        if ( cooking == null ) {
            return 0;
        }
        int rank = cooking.getRank();
        return rank;
    }
}
