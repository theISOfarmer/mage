/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import java.util.GregorianCalendar;
import mage.cards.ExpansionSet;
import mage.constants.SetType;
import mage.constants.Rarity;
import java.util.List;
import mage.ObjectColor;
import mage.cards.CardGraphicInfo;
import mage.cards.FrameStyle;

/**
 *
 * @author fireshoes
 */
public class MagicOrigins extends ExpansionSet {

    private static final MagicOrigins fINSTANCE = new MagicOrigins();

    public static MagicOrigins getInstance() {
        return fINSTANCE;
    }

    private MagicOrigins() {
        super("Magic Origins", "ORI", "mage.sets.magicorigins", new GregorianCalendar(2015, 7, 17).getTime(), SetType.CORE);
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.numBoosterDoubleFaced = -1;
        this.maxCardNumberInBooster = 272;
        cards.add(new SetCardInfo("Abbot of Keral Keep", 127, Rarity.RARE, mage.cards.a.AbbotOfKeralKeep.class));
        cards.add(new SetCardInfo("Acolyte of the Inferno", 128, Rarity.UNCOMMON, mage.cards.a.AcolyteOfTheInferno.class));
        cards.add(new SetCardInfo("Act of Treason", 129, Rarity.COMMON, mage.cards.a.ActOfTreason.class));
        cards.add(new SetCardInfo("Aegis Angel", 273, Rarity.RARE, mage.cards.a.AegisAngel.class));
        cards.add(new SetCardInfo("Aerial Volley", 168, Rarity.COMMON, mage.cards.a.AerialVolley.class));
        cards.add(new SetCardInfo("Akroan Jailer", 1, Rarity.COMMON, mage.cards.a.AkroanJailer.class));
        cards.add(new SetCardInfo("Akroan Sergeant", 130, Rarity.COMMON, mage.cards.a.AkroanSergeant.class));
        cards.add(new SetCardInfo("Alchemist's Vial", 220, Rarity.COMMON, mage.cards.a.AlchemistsVial.class));
        cards.add(new SetCardInfo("Alhammarret, High Arbiter", 43, Rarity.RARE, mage.cards.a.AlhammarretHighArbiter.class));
        cards.add(new SetCardInfo("Alhammarret's Archive", 221, Rarity.MYTHIC, mage.cards.a.AlhammarretsArchive.class));
        cards.add(new SetCardInfo("Ampryn Tactician", 2, Rarity.COMMON, mage.cards.a.AmprynTactician.class));
        cards.add(new SetCardInfo("Anchor to the Aether", 44, Rarity.UNCOMMON, mage.cards.a.AnchorToTheAether.class));
        cards.add(new SetCardInfo("Angel's Tomb", 222, Rarity.UNCOMMON, mage.cards.a.AngelsTomb.class));
        cards.add(new SetCardInfo("Animist's Awakening", 169, Rarity.RARE, mage.cards.a.AnimistsAwakening.class));
        cards.add(new SetCardInfo("Anointer of Champions", 3, Rarity.UNCOMMON, mage.cards.a.AnointerOfChampions.class));
        cards.add(new SetCardInfo("Archangel of Tithes", 4, Rarity.MYTHIC, mage.cards.a.ArchangelOfTithes.class));
        cards.add(new SetCardInfo("Artificer's Epiphany", 45, Rarity.COMMON, mage.cards.a.ArtificersEpiphany.class));
        cards.add(new SetCardInfo("Aspiring Aeronaut", 46, Rarity.COMMON, mage.cards.a.AspiringAeronaut.class));
        cards.add(new SetCardInfo("Auramancer", 5, Rarity.COMMON, mage.cards.a.Auramancer.class));
        cards.add(new SetCardInfo("Avaricious Dragon", 131, Rarity.MYTHIC, mage.cards.a.AvariciousDragon.class));
        cards.add(new SetCardInfo("Aven Battle Priest", 6, Rarity.COMMON, mage.cards.a.AvenBattlePriest.class));
        cards.add(new SetCardInfo("Battlefield Forge", 244, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Bellows Lizard", 132, Rarity.COMMON, mage.cards.b.BellowsLizard.class));
        cards.add(new SetCardInfo("Blazing Hellhound", 210, Rarity.UNCOMMON, mage.cards.b.BlazingHellhound.class));
        cards.add(new SetCardInfo("Blessed Spirits", 7, Rarity.UNCOMMON, mage.cards.b.BlessedSpirits.class));
        cards.add(new SetCardInfo("Blightcaster", 85, Rarity.UNCOMMON, mage.cards.b.Blightcaster.class));
        cards.add(new SetCardInfo("Blood-Cursed Knight", 211, Rarity.UNCOMMON, mage.cards.b.BloodCursedKnight.class));
        cards.add(new SetCardInfo("Boggart Brute", 133, Rarity.COMMON, mage.cards.b.BoggartBrute.class));
        cards.add(new SetCardInfo("Bonded Construct", 223, Rarity.COMMON, mage.cards.b.BondedConstruct.class));
        cards.add(new SetCardInfo("Bone to Ash", 47, Rarity.COMMON, mage.cards.b.BoneToAsh.class));
        cards.add(new SetCardInfo("Bounding Krasis", 212, Rarity.UNCOMMON, mage.cards.b.BoundingKrasis.class));
        cards.add(new SetCardInfo("Brawler's Plate", 224, Rarity.UNCOMMON, mage.cards.b.BrawlersPlate.class));
        cards.add(new SetCardInfo("Calculated Dismissal", 48, Rarity.COMMON, mage.cards.c.CalculatedDismissal.class));
        cards.add(new SetCardInfo("Call of the Full Moon", 134, Rarity.UNCOMMON, mage.cards.c.CallOfTheFullMoon.class));
        cards.add(new SetCardInfo("Catacomb Slug", 86, Rarity.COMMON, mage.cards.c.CatacombSlug.class));
        cards.add(new SetCardInfo("Caustic Caterpillar", 170, Rarity.COMMON, mage.cards.c.CausticCaterpillar.class));
        cards.add(new SetCardInfo("Caves of Koilos", 245, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Celestial Flare", 8, Rarity.COMMON, mage.cards.c.CelestialFlare.class));
        cards.add(new SetCardInfo("Chandra, Fire of Kaladesh", 135, Rarity.MYTHIC, mage.cards.c.ChandraFireOfKaladesh.class));
        cards.add(new SetCardInfo("Chandra, Roaring Flame", 135, Rarity.MYTHIC, mage.cards.c.ChandraRoaringFlame.class));
        cards.add(new SetCardInfo("Chandra's Fury", 136, Rarity.COMMON, mage.cards.c.ChandrasFury.class));
        cards.add(new SetCardInfo("Chandra's Ignition", 137, Rarity.RARE, mage.cards.c.ChandrasIgnition.class));
        cards.add(new SetCardInfo("Charging Griffin", 9, Rarity.COMMON, mage.cards.c.ChargingGriffin.class));
        cards.add(new SetCardInfo("Chief of the Foundry", 225, Rarity.UNCOMMON, mage.cards.c.ChiefOfTheFoundry.class));
        cards.add(new SetCardInfo("Citadel Castellan", 213, Rarity.UNCOMMON, mage.cards.c.CitadelCastellan.class));
        cards.add(new SetCardInfo("Clash of Wills", 49, Rarity.UNCOMMON, mage.cards.c.ClashOfWills.class));
        cards.add(new SetCardInfo("Claustrophobia", 50, Rarity.COMMON, mage.cards.c.Claustrophobia.class));
        cards.add(new SetCardInfo("Cleric of the Forward Order", 10, Rarity.COMMON, mage.cards.c.ClericOfTheForwardOrder.class));
        cards.add(new SetCardInfo("Cobblebrute", 138, Rarity.COMMON, mage.cards.c.Cobblebrute.class));
        cards.add(new SetCardInfo("Conclave Naturalists", 171, Rarity.UNCOMMON, mage.cards.c.ConclaveNaturalists.class));
        cards.add(new SetCardInfo("Consecrated by Blood", 87, Rarity.UNCOMMON, mage.cards.c.ConsecratedByBlood.class));
        cards.add(new SetCardInfo("Consul's Lieutenant", 11, Rarity.UNCOMMON, mage.cards.c.ConsulsLieutenant.class));
        cards.add(new SetCardInfo("Cruel Revival", 88, Rarity.UNCOMMON, mage.cards.c.CruelRevival.class));
        cards.add(new SetCardInfo("Dark Dabbling", 89, Rarity.COMMON, mage.cards.d.DarkDabbling.class));
        cards.add(new SetCardInfo("Dark Petition", 90, Rarity.RARE, mage.cards.d.DarkPetition.class));
        cards.add(new SetCardInfo("Day's Undoing", 51, Rarity.MYTHIC, mage.cards.d.DaysUndoing.class));
        cards.add(new SetCardInfo("Deadbridge Shaman", 91, Rarity.COMMON, mage.cards.d.DeadbridgeShaman.class));
        cards.add(new SetCardInfo("Deep-Sea Terror", 52, Rarity.COMMON, mage.cards.d.DeepSeaTerror.class));
        cards.add(new SetCardInfo("Demolish", 139, Rarity.COMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Demonic Pact", 92, Rarity.MYTHIC, mage.cards.d.DemonicPact.class));
        cards.add(new SetCardInfo("Despoiler of Souls", 93, Rarity.RARE, mage.cards.d.DespoilerOfSouls.class));
        cards.add(new SetCardInfo("Disciple of the Ring", 53, Rarity.MYTHIC, mage.cards.d.DiscipleOfTheRing.class));
        cards.add(new SetCardInfo("Disperse", 54, Rarity.COMMON, mage.cards.d.Disperse.class));
        cards.add(new SetCardInfo("Displacement Wave", 55, Rarity.RARE, mage.cards.d.DisplacementWave.class));
        cards.add(new SetCardInfo("Divine Verdict", 274, Rarity.COMMON, mage.cards.d.DivineVerdict.class));
        cards.add(new SetCardInfo("Dragon Fodder", 140, Rarity.COMMON, mage.cards.d.DragonFodder.class));
        cards.add(new SetCardInfo("Dreadwaters", 56, Rarity.COMMON, mage.cards.d.Dreadwaters.class));
        cards.add(new SetCardInfo("Dwynen, Gilt-Leaf Daen", 172, Rarity.RARE, mage.cards.d.DwynenGiltLeafDaen.class));
        cards.add(new SetCardInfo("Dwynen's Elite", 173, Rarity.UNCOMMON, mage.cards.d.DwynensElite.class));
        cards.add(new SetCardInfo("Eagle of the Watch", 275, Rarity.COMMON, mage.cards.e.EagleOfTheWatch.class));
        cards.add(new SetCardInfo("Elemental Bond", 174, Rarity.UNCOMMON, mage.cards.e.ElementalBond.class));
        cards.add(new SetCardInfo("Elvish Visionary", 175, Rarity.COMMON, mage.cards.e.ElvishVisionary.class));
        cards.add(new SetCardInfo("Embermaw Hellion", 141, Rarity.RARE, mage.cards.e.EmbermawHellion.class));
        cards.add(new SetCardInfo("Enlightened Ascetic", 12, Rarity.COMMON, mage.cards.e.EnlightenedAscetic.class));
        cards.add(new SetCardInfo("Enshrouding Mist", 13, Rarity.COMMON, mage.cards.e.EnshroudingMist.class));
        cards.add(new SetCardInfo("Enthralling Victor", 142, Rarity.UNCOMMON, mage.cards.e.EnthrallingVictor.class));
        cards.add(new SetCardInfo("Erebos's Titan", 94, Rarity.MYTHIC, mage.cards.e.ErebossTitan.class));
        cards.add(new SetCardInfo("Evolutionary Leap", 176, Rarity.RARE, mage.cards.e.EvolutionaryLeap.class));
        cards.add(new SetCardInfo("Evolving Wilds", 246, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exquisite Firecraft", 143, Rarity.RARE, mage.cards.e.ExquisiteFirecraft.class));
        cards.add(new SetCardInfo("Eyeblight Assassin", 95, Rarity.COMMON, mage.cards.e.EyeblightAssassin.class));
        cards.add(new SetCardInfo("Eyeblight Massacre", 96, Rarity.UNCOMMON, mage.cards.e.EyeblightMassacre.class));
        cards.add(new SetCardInfo("Faerie Miscreant", 57, Rarity.COMMON, mage.cards.f.FaerieMiscreant.class));
        cards.add(new SetCardInfo("Fetid Imp", 97, Rarity.COMMON, mage.cards.f.FetidImp.class));
        cards.add(new SetCardInfo("Fiery Conclusion", 144, Rarity.UNCOMMON, mage.cards.f.FieryConclusion.class));
        cards.add(new SetCardInfo("Fiery Hellhound", 284, Rarity.COMMON, mage.cards.f.FieryHellhound.class));
        cards.add(new SetCardInfo("Fiery Impulse", 145, Rarity.COMMON, mage.cards.f.FieryImpulse.class));
        cards.add(new SetCardInfo("Firefiend Elemental", 146, Rarity.COMMON, mage.cards.f.FirefiendElemental.class));
        cards.add(new SetCardInfo("Flameshadow Conjuring", 147, Rarity.RARE, mage.cards.f.FlameshadowConjuring.class));
        cards.add(new SetCardInfo("Fleshbag Marauder", 98, Rarity.UNCOMMON, mage.cards.f.FleshbagMarauder.class));
        cards.add(new SetCardInfo("Flesh to Dust", 280, Rarity.COMMON, mage.cards.f.FleshToDust.class));
        cards.add(new SetCardInfo("Forest", 269, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 270, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 271, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 272, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Foundry of the Consuls", 247, Rarity.UNCOMMON, mage.cards.f.FoundryOfTheConsuls.class));
        cards.add(new SetCardInfo("Gaea's Revenge", 177, Rarity.RARE, mage.cards.g.GaeasRevenge.class));
        cards.add(new SetCardInfo("Gather the Pack", 178, Rarity.UNCOMMON, mage.cards.g.GatherThePack.class));
        cards.add(new SetCardInfo("Ghirapur Aether Grid", 148, Rarity.UNCOMMON, mage.cards.g.GhirapurAetherGrid.class));
        cards.add(new SetCardInfo("Ghirapur Gearcrafter", 149, Rarity.COMMON, mage.cards.g.GhirapurGearcrafter.class));
        cards.add(new SetCardInfo("Gideon, Battle-Forged", 23, Rarity.MYTHIC, mage.cards.g.GideonBattleForged.class));
        cards.add(new SetCardInfo("Gideon's Phalanx", 14, Rarity.RARE, mage.cards.g.GideonsPhalanx.class));
        cards.add(new SetCardInfo("Gilt-Leaf Winnower", 99, Rarity.RARE, mage.cards.g.GiltLeafWinnower.class));
        cards.add(new SetCardInfo("Gnarlroot Trapper", 100, Rarity.UNCOMMON, mage.cards.g.GnarlrootTrapper.class));
        cards.add(new SetCardInfo("Goblin Glory Chaser", 150, Rarity.UNCOMMON, mage.cards.g.GoblinGloryChaser.class));
        cards.add(new SetCardInfo("Goblin Piledriver", 151, Rarity.RARE, mage.cards.g.GoblinPiledriver.class));
        cards.add(new SetCardInfo("Gold-Forged Sentinel", 226, Rarity.UNCOMMON, mage.cards.g.GoldForgedSentinel.class));
        cards.add(new SetCardInfo("Grasp of the Hieromancer", 15, Rarity.COMMON, mage.cards.g.GraspOfTheHieromancer.class));
        cards.add(new SetCardInfo("Graveblade Marauder", 101, Rarity.RARE, mage.cards.g.GravebladeMarauder.class));
        cards.add(new SetCardInfo("Guardian Automaton", 227, Rarity.COMMON, mage.cards.g.GuardianAutomaton.class));
        cards.add(new SetCardInfo("Guardians of Meletis", 228, Rarity.COMMON, mage.cards.g.GuardiansOfMeletis.class));
        cards.add(new SetCardInfo("Hallowed Moonlight", 16, Rarity.RARE, mage.cards.h.HallowedMoonlight.class));
        cards.add(new SetCardInfo("Hangarback Walker", 229, Rarity.RARE, mage.cards.h.HangarbackWalker.class));
        cards.add(new SetCardInfo("Harbinger of the Tides", 58, Rarity.RARE, mage.cards.h.HarbingerOfTheTides.class));
        cards.add(new SetCardInfo("Healing Hands", 17, Rarity.COMMON, mage.cards.h.HealingHands.class));
        cards.add(new SetCardInfo("Heavy Infantry", 18, Rarity.COMMON, mage.cards.h.HeavyInfantry.class));
        cards.add(new SetCardInfo("Helm of the Gods", 230, Rarity.RARE, mage.cards.h.HelmOfTheGods.class));
        cards.add(new SetCardInfo("Herald of the Pantheon", 180, Rarity.RARE, mage.cards.h.HeraldOfThePantheon.class));
        cards.add(new SetCardInfo("Hitchclaw Recluse", 181, Rarity.COMMON, mage.cards.h.HitchclawRecluse.class));
        cards.add(new SetCardInfo("Hixus, Prison Warden", 19, Rarity.RARE, mage.cards.h.HixusPrisonWarden.class));
        cards.add(new SetCardInfo("Honored Hierarch", 182, Rarity.RARE, mage.cards.h.HonoredHierarch.class));
        cards.add(new SetCardInfo("Hydrolash", 59, Rarity.UNCOMMON, mage.cards.h.Hydrolash.class));
        cards.add(new SetCardInfo("Infectious Bloodlust", 152, Rarity.COMMON, mage.cards.i.InfectiousBloodlust.class));
        cards.add(new SetCardInfo("Infernal Scarring", 102, Rarity.COMMON, mage.cards.i.InfernalScarring.class));
        cards.add(new SetCardInfo("Infinite Obliteration", 103, Rarity.RARE, mage.cards.i.InfiniteObliteration.class));
        cards.add(new SetCardInfo("Into the Void", 277, Rarity.UNCOMMON, mage.cards.i.IntoTheVoid.class));
        cards.add(new SetCardInfo("Iroas's Champion", 214, Rarity.UNCOMMON, mage.cards.i.IroassChampion.class));
        cards.add(new SetCardInfo("Island", 257, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 258, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 259, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 260, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Jace's Sanctum", 61, Rarity.RARE, mage.cards.j.JacesSanctum.class));
        cards.add(new SetCardInfo("Jace, Telepath Unbound", 60, Rarity.MYTHIC, mage.cards.j.JaceTelepathUnbound.class));
        cards.add(new SetCardInfo("Jace, Vryn's Prodigy", 60, Rarity.MYTHIC, mage.cards.j.JaceVrynsProdigy.class));
        cards.add(new SetCardInfo("Jayemdae Tome", 231, Rarity.UNCOMMON, mage.cards.j.JayemdaeTome.class));
        cards.add(new SetCardInfo("Jhessian Thief", 62, Rarity.UNCOMMON, mage.cards.j.JhessianThief.class));
        cards.add(new SetCardInfo("Joraga Invocation", 183, Rarity.UNCOMMON, mage.cards.j.JoragaInvocation.class));
        cards.add(new SetCardInfo("Knightly Valor", 22, Rarity.UNCOMMON, mage.cards.k.KnightlyValor.class));
        cards.add(new SetCardInfo("Knight of the Pilgrim's Road", 20, Rarity.COMMON, mage.cards.k.KnightOfThePilgrimsRoad.class));
        cards.add(new SetCardInfo("Knight of the White Orchid", 21, Rarity.RARE, mage.cards.k.KnightOfTheWhiteOrchid.class));
        cards.add(new SetCardInfo("Kothophed, Soul Hoarder", 104, Rarity.RARE, mage.cards.k.KothophedSoulHoarder.class));
        cards.add(new SetCardInfo("Kytheon, Hero of Akros", 23, Rarity.MYTHIC, mage.cards.k.KytheonHeroOfAkros.class));
        cards.add(new SetCardInfo("Kytheon's Irregulars", 24, Rarity.RARE, mage.cards.k.KytheonsIrregulars.class));
        cards.add(new SetCardInfo("Kytheon's Tactics", 25, Rarity.COMMON, mage.cards.k.KytheonsTactics.class));
        cards.add(new SetCardInfo("Languish", 105, Rarity.RARE, mage.cards.l.Languish.class));
        cards.add(new SetCardInfo("Leaf Gilder", 184, Rarity.COMMON, mage.cards.l.LeafGilder.class));
        cards.add(new SetCardInfo("Lightning Javelin", 153, Rarity.COMMON, mage.cards.l.LightningJavelin.class));
        cards.add(new SetCardInfo("Liliana, Defiant Necromancer", 106, Rarity.MYTHIC, mage.cards.l.LilianaDefiantNecromancer.class));
        cards.add(new SetCardInfo("Liliana, Heretical Healer", 106, Rarity.MYTHIC, mage.cards.l.LilianaHereticalHealer.class));
        cards.add(new SetCardInfo("Llanowar Empath", 185, Rarity.COMMON, mage.cards.l.LlanowarEmpath.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 248, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Macabre Waltz", 107, Rarity.COMMON, mage.cards.m.MacabreWaltz.class));
        cards.add(new SetCardInfo("Mage-Ring Bully", 154, Rarity.COMMON, mage.cards.m.MageRingBully.class));
        cards.add(new SetCardInfo("Mage-Ring Network", 249, Rarity.UNCOMMON, mage.cards.m.MageRingNetwork.class));
        cards.add(new SetCardInfo("Mage-Ring Responder", 232, Rarity.RARE, mage.cards.m.MageRingResponder.class));
        cards.add(new SetCardInfo("Magmatic Insight", 155, Rarity.UNCOMMON, mage.cards.m.MagmaticInsight.class));
        cards.add(new SetCardInfo("Mahamoti Djinn", 278, Rarity.RARE, mage.cards.m.MahamotiDjinn.class));
        cards.add(new SetCardInfo("Malakir Cullblade", 108, Rarity.UNCOMMON, mage.cards.m.MalakirCullblade.class));
        cards.add(new SetCardInfo("Managorger Hydra", 186, Rarity.RARE, mage.cards.m.ManagorgerHydra.class));
        cards.add(new SetCardInfo("Mantle of Webs", 187, Rarity.COMMON, mage.cards.m.MantleOfWebs.class));
        cards.add(new SetCardInfo("Maritime Guard", 63, Rarity.COMMON, mage.cards.m.MaritimeGuard.class));
        cards.add(new SetCardInfo("Meteorite", 233, Rarity.UNCOMMON, mage.cards.m.Meteorite.class));
        cards.add(new SetCardInfo("Might of the Masses", 188, Rarity.COMMON, mage.cards.m.MightOfTheMasses.class));
        cards.add(new SetCardInfo("Mighty Leap", 26, Rarity.COMMON, mage.cards.m.MightyLeap.class));
        cards.add(new SetCardInfo("Mind Rot", 281, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Mizzium Meddler", 64, Rarity.RARE, mage.cards.m.MizziumMeddler.class));
        cards.add(new SetCardInfo("Molten Vortex", 156, Rarity.RARE, mage.cards.m.MoltenVortex.class));
        cards.add(new SetCardInfo("Mountain", 265, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 266, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 267, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 268, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Murder Investigation", 27, Rarity.UNCOMMON, mage.cards.m.MurderInvestigation.class));
        cards.add(new SetCardInfo("Nantuko Husk", 109, Rarity.COMMON, mage.cards.n.NantukoHusk.class));
        cards.add(new SetCardInfo("Necromantic Summons", 110, Rarity.UNCOMMON, mage.cards.n.NecromanticSummons.class));
        cards.add(new SetCardInfo("Negate", 65, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Nightmare", 282, Rarity.RARE, mage.cards.n.Nightmare.class));
        cards.add(new SetCardInfo("Nightsnare", 111, Rarity.COMMON, mage.cards.n.Nightsnare.class));
        cards.add(new SetCardInfo("Nissa, Sage Animist", 189, Rarity.MYTHIC, mage.cards.n.NissaSageAnimist.class));
        cards.add(new SetCardInfo("Nissa's Pilgrimage", 190, Rarity.COMMON, mage.cards.n.NissasPilgrimage.class));
        cards.add(new SetCardInfo("Nissa's Revelation", 191, Rarity.RARE, mage.cards.n.NissasRevelation.class));
        cards.add(new SetCardInfo("Nissa, Vastwood Seer", 189, Rarity.MYTHIC, mage.cards.n.NissaVastwoodSeer.class));
        cards.add(new SetCardInfo("Nivix Barrier", 66, Rarity.COMMON, mage.cards.n.NivixBarrier.class));
        cards.add(new SetCardInfo("Orbs of Warding", 234, Rarity.RARE, mage.cards.o.OrbsOfWarding.class));
        cards.add(new SetCardInfo("Orchard Spirit", 192, Rarity.COMMON, mage.cards.o.OrchardSpirit.class));
        cards.add(new SetCardInfo("Outland Colossus", 193, Rarity.RARE, mage.cards.o.OutlandColossus.class));
        cards.add(new SetCardInfo("Patron of the Valiant", 28, Rarity.UNCOMMON, mage.cards.p.PatronOfTheValiant.class));
        cards.add(new SetCardInfo("Pharika's Disciple", 194, Rarity.COMMON, mage.cards.p.PharikasDisciple.class));
        cards.add(new SetCardInfo("Pia and Kiran Nalaar", 157, Rarity.RARE, mage.cards.p.PiaAndKiranNalaar.class));
        cards.add(new SetCardInfo("Plains", 253, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 254, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 255, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 256, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plummet", 286, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Possessed Skaab", 215, Rarity.UNCOMMON, mage.cards.p.PossessedSkaab.class));
        cards.add(new SetCardInfo("Prickleboar", 158, Rarity.COMMON, mage.cards.p.Prickleboar.class));
        cards.add(new SetCardInfo("Priest of the Blood Rite", 112, Rarity.RARE, mage.cards.p.PriestOfTheBloodRite.class));
        cards.add(new SetCardInfo("Prism Ring", 235, Rarity.UNCOMMON, mage.cards.p.PrismRing.class));
        cards.add(new SetCardInfo("Prized Unicorn", 287, Rarity.UNCOMMON, mage.cards.p.PrizedUnicorn.class));
        cards.add(new SetCardInfo("Psychic Rebuttal", 67, Rarity.UNCOMMON, mage.cards.p.PsychicRebuttal.class));
        cards.add(new SetCardInfo("Pyromancer's Goggles", 236, Rarity.MYTHIC, mage.cards.p.PyromancersGoggles.class));
        cards.add(new SetCardInfo("Rabid Bloodsucker", 113, Rarity.COMMON, mage.cards.r.RabidBloodsucker.class));
        cards.add(new SetCardInfo("Ramroller", 237, Rarity.UNCOMMON, mage.cards.r.Ramroller.class));
        cards.add(new SetCardInfo("Ravaging Blaze", 159, Rarity.UNCOMMON, mage.cards.r.RavagingBlaze.class));
        cards.add(new SetCardInfo("Read the Bones", 114, Rarity.COMMON, mage.cards.r.ReadTheBones.class));
        cards.add(new SetCardInfo("Reave Soul", 115, Rarity.COMMON, mage.cards.r.ReaveSoul.class));
        cards.add(new SetCardInfo("Reclaim", 195, Rarity.COMMON, mage.cards.r.Reclaim.class));
        cards.add(new SetCardInfo("Reclusive Artificer", 216, Rarity.UNCOMMON, mage.cards.r.ReclusiveArtificer.class));
        cards.add(new SetCardInfo("Relic Seeker", 29, Rarity.RARE, mage.cards.r.RelicSeeker.class));
        cards.add(new SetCardInfo("Returned Centaur", 116, Rarity.COMMON, mage.cards.r.ReturnedCentaur.class));
        cards.add(new SetCardInfo("Revenant", 117, Rarity.UNCOMMON, mage.cards.r.Revenant.class));
        cards.add(new SetCardInfo("Rhox Maulers", 196, Rarity.COMMON, mage.cards.r.RhoxMaulers.class));
        cards.add(new SetCardInfo("Ringwarden Owl", 68, Rarity.COMMON, mage.cards.r.RingwardenOwl.class));
        cards.add(new SetCardInfo("Rogue's Passage", 250, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Runed Servitor", 238, Rarity.UNCOMMON, mage.cards.r.RunedServitor.class));
        cards.add(new SetCardInfo("Scab-Clan Berserker", 160, Rarity.RARE, mage.cards.s.ScabClanBerserker.class));
        cards.add(new SetCardInfo("Scrapskin Drake", 69, Rarity.COMMON, mage.cards.s.ScrapskinDrake.class));
        cards.add(new SetCardInfo("Screeching Skaab", 70, Rarity.COMMON, mage.cards.s.ScreechingSkaab.class));
        cards.add(new SetCardInfo("Seismic Elemental", 161, Rarity.UNCOMMON, mage.cards.s.SeismicElemental.class));
        cards.add(new SetCardInfo("Send to Sleep", 71, Rarity.COMMON, mage.cards.s.SendToSleep.class));
        cards.add(new SetCardInfo("Sengir Vampire", 283, Rarity.UNCOMMON, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Sentinel of the Eternal Watch", 30, Rarity.UNCOMMON, mage.cards.s.SentinelOfTheEternalWatch.class));
        cards.add(new SetCardInfo("Separatist Voidmage", 72, Rarity.COMMON, mage.cards.s.SeparatistVoidmage.class));
        cards.add(new SetCardInfo("Serra Angel", 276, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Shadows of the Past", 118, Rarity.UNCOMMON, mage.cards.s.ShadowsOfThePast.class));
        cards.add(new SetCardInfo("Shaman of the Pack", 217, Rarity.UNCOMMON, mage.cards.s.ShamanOfThePack.class));
        cards.add(new SetCardInfo("Shambling Ghoul", 119, Rarity.COMMON, mage.cards.s.ShamblingGhoul.class));
        cards.add(new SetCardInfo("Shivan Dragon", 285, Rarity.RARE, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Shivan Reef", 251, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Sigiled Starfish", 73, Rarity.UNCOMMON, mage.cards.s.SigiledStarfish.class));
        cards.add(new SetCardInfo("Sigil of the Empty Throne", 31, Rarity.RARE, mage.cards.s.SigilOfTheEmptyThrone.class));
        cards.add(new SetCardInfo("Sigil of Valor", 239, Rarity.UNCOMMON, mage.cards.s.SigilOfValor.class));
        cards.add(new SetCardInfo("Skaab Goliath", 74, Rarity.UNCOMMON, mage.cards.s.SkaabGoliath.class));
        cards.add(new SetCardInfo("Skyraker Giant", 162, Rarity.UNCOMMON, mage.cards.s.SkyrakerGiant.class));
        cards.add(new SetCardInfo("Skysnare Spider", 197, Rarity.UNCOMMON, mage.cards.s.SkysnareSpider.class));
        cards.add(new SetCardInfo("Smash to Smithereens", 163, Rarity.COMMON, mage.cards.s.SmashToSmithereens.class));
        cards.add(new SetCardInfo("Somberwald Alpha", 198, Rarity.UNCOMMON, mage.cards.s.SomberwaldAlpha.class));
        cards.add(new SetCardInfo("Soulblade Djinn", 75, Rarity.RARE, mage.cards.s.SoulbladeDjinn.class));
        cards.add(new SetCardInfo("Sphinx's Tutelage", 76, Rarity.UNCOMMON, mage.cards.s.SphinxsTutelage.class));
        cards.add(new SetCardInfo("Stalwart Aven", 32, Rarity.COMMON, mage.cards.s.StalwartAven.class));
        cards.add(new SetCardInfo("Starfield of Nyx", 33, Rarity.MYTHIC, mage.cards.s.StarfieldOfNyx.class));
        cards.add(new SetCardInfo("Stratus Walk", 77, Rarity.COMMON, mage.cards.s.StratusWalk.class));
        cards.add(new SetCardInfo("Subterranean Scout", 164, Rarity.COMMON, mage.cards.s.SubterraneanScout.class));
        cards.add(new SetCardInfo("Suppression Bonds", 34, Rarity.COMMON, mage.cards.s.SuppressionBonds.class));
        cards.add(new SetCardInfo("Swamp", 261, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 262, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 263, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 264, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swift Reckoning", 35, Rarity.UNCOMMON, mage.cards.s.SwiftReckoning.class));
        cards.add(new SetCardInfo("Sword of the Animist", 240, Rarity.RARE, mage.cards.s.SwordOfTheAnimist.class));
        cards.add(new SetCardInfo("Sylvan Messenger", 199, Rarity.UNCOMMON, mage.cards.s.SylvanMessenger.class));
        cards.add(new SetCardInfo("Tainted Remedy", 120, Rarity.RARE, mage.cards.t.TaintedRemedy.class));
        cards.add(new SetCardInfo("Talent of the Telepath", 78, Rarity.RARE, mage.cards.t.TalentOfTheTelepath.class));
        cards.add(new SetCardInfo("Terra Stomper", 288, Rarity.RARE, mage.cards.t.TerraStomper.class));
        cards.add(new SetCardInfo("The Great Aurora", 179, Rarity.MYTHIC, mage.cards.t.TheGreatAurora.class));
        cards.add(new SetCardInfo("Thopter Engineer", 165, Rarity.UNCOMMON, mage.cards.t.ThopterEngineer.class));
        cards.add(new SetCardInfo("Thopter Spy Network", 79, Rarity.RARE, mage.cards.t.ThopterSpyNetwork.class));
        cards.add(new SetCardInfo("Thornbow Archer", 121, Rarity.COMMON, mage.cards.t.ThornbowArcher.class));
        cards.add(new SetCardInfo("Throwing Knife", 241, Rarity.UNCOMMON, mage.cards.t.ThrowingKnife.class));
        cards.add(new SetCardInfo("Thunderclap Wyvern", 218, Rarity.UNCOMMON, mage.cards.t.ThunderclapWyvern.class));
        cards.add(new SetCardInfo("Timberpack Wolf", 200, Rarity.COMMON, mage.cards.t.TimberpackWolf.class));
        cards.add(new SetCardInfo("Titanic Growth", 201, Rarity.COMMON, mage.cards.t.TitanicGrowth.class));
        cards.add(new SetCardInfo("Titan's Strength", 166, Rarity.COMMON, mage.cards.t.TitansStrength.class));
        cards.add(new SetCardInfo("Topan Freeblade", 36, Rarity.COMMON, mage.cards.t.TopanFreeblade.class));
        cards.add(new SetCardInfo("Tormented Thoughts", 122, Rarity.UNCOMMON, mage.cards.t.TormentedThoughts.class));
        cards.add(new SetCardInfo("Totem-Guide Hartebeest", 37, Rarity.UNCOMMON, mage.cards.t.TotemGuideHartebeest.class));
        cards.add(new SetCardInfo("Touch of Moonglove", 123, Rarity.COMMON, mage.cards.t.TouchOfMoonglove.class));
        cards.add(new SetCardInfo("Tower Geist", 80, Rarity.UNCOMMON, mage.cards.t.TowerGeist.class));
        cards.add(new SetCardInfo("Tragic Arrogance", 38, Rarity.RARE, mage.cards.t.TragicArrogance.class));
        cards.add(new SetCardInfo("Turn to Frog", 81, Rarity.UNCOMMON, mage.cards.t.TurnToFrog.class));
        cards.add(new SetCardInfo("Undead Servant", 124, Rarity.COMMON, mage.cards.u.UndeadServant.class));
        cards.add(new SetCardInfo("Undercity Troll", 202, Rarity.UNCOMMON, mage.cards.u.UndercityTroll.class));
        cards.add(new SetCardInfo("Unholy Hunger", 125, Rarity.COMMON, mage.cards.u.UnholyHunger.class));
        cards.add(new SetCardInfo("Valeron Wardens", 203, Rarity.UNCOMMON, mage.cards.v.ValeronWardens.class));
        cards.add(new SetCardInfo("Valor in Akros", 39, Rarity.UNCOMMON, mage.cards.v.ValorInAkros.class));
        cards.add(new SetCardInfo("Vastwood Gorger", 204, Rarity.COMMON, mage.cards.v.VastwoodGorger.class));
        cards.add(new SetCardInfo("Veteran's Sidearm", 242, Rarity.COMMON, mage.cards.v.VeteransSidearm.class));
        cards.add(new SetCardInfo("Vine Snare", 205, Rarity.COMMON, mage.cards.v.VineSnare.class));
        cards.add(new SetCardInfo("Volcanic Rambler", 167, Rarity.COMMON, mage.cards.v.VolcanicRambler.class));
        cards.add(new SetCardInfo("Vryn Wingmare", 40, Rarity.RARE, mage.cards.v.VrynWingmare.class));
        cards.add(new SetCardInfo("War Horn", 243, Rarity.UNCOMMON, mage.cards.w.WarHorn.class));
        cards.add(new SetCardInfo("War Oracle", 41, Rarity.UNCOMMON, mage.cards.w.WarOracle.class));
        cards.add(new SetCardInfo("Watercourser", 82, Rarity.COMMON, mage.cards.w.Watercourser.class));
        cards.add(new SetCardInfo("Weave Fate", 279, Rarity.COMMON, mage.cards.w.WeaveFate.class));
        cards.add(new SetCardInfo("Weight of the Underworld", 126, Rarity.COMMON, mage.cards.w.WeightOfTheUnderworld.class));
        cards.add(new SetCardInfo("Whirler Rogue", 83, Rarity.UNCOMMON, mage.cards.w.WhirlerRogue.class));
        cards.add(new SetCardInfo("Wild Instincts", 206, Rarity.COMMON, mage.cards.w.WildInstincts.class));
        cards.add(new SetCardInfo("Willbreaker", 84, Rarity.RARE, mage.cards.w.Willbreaker.class));
        cards.add(new SetCardInfo("Woodland Bellower", 207, Rarity.MYTHIC, mage.cards.w.WoodlandBellower.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 252, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Yeva's Forcemage", 208, Rarity.COMMON, mage.cards.y.YevasForcemage.class));
        cards.add(new SetCardInfo("Yoked Ox", 42, Rarity.COMMON, mage.cards.y.YokedOx.class));
        cards.add(new SetCardInfo("Zendikar Incarnate", 219, Rarity.UNCOMMON, mage.cards.z.ZendikarIncarnate.class));
        cards.add(new SetCardInfo("Zendikar's Roil", 209, Rarity.UNCOMMON, mage.cards.z.ZendikarsRoil.class));
    }
}
