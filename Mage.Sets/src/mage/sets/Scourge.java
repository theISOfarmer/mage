/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import java.util.GregorianCalendar;

import mage.cards.ExpansionSet;
import mage.constants.SetType;
import mage.constants.Rarity;
import java.util.List;

/**
 *
 * @author North
 */
public class Scourge extends ExpansionSet {

    private static final Scourge fINSTANCE = new Scourge();

    public static Scourge getInstance() {
        return fINSTANCE;
    }

    private Scourge() {
        super("Scourge", "SCG", "mage.sets.scourge", new GregorianCalendar(2003, 5, 17).getTime(), SetType.EXPANSION);
        this.blockName = "Onslaught";
        this.parentSet = Onslaught.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Accelerated Mutation", 109, Rarity.COMMON, mage.cards.a.AcceleratedMutation.class));
        cards.add(new SetCardInfo("Alpha Status", 110, Rarity.UNCOMMON, mage.cards.a.AlphaStatus.class));
        cards.add(new SetCardInfo("Ambush Commander", 111, Rarity.RARE, mage.cards.a.AmbushCommander.class));
        cards.add(new SetCardInfo("Ancient Ooze", 112, Rarity.RARE, mage.cards.a.AncientOoze.class));
        cards.add(new SetCardInfo("Aphetto Runecaster", 28, Rarity.UNCOMMON, mage.cards.a.AphettoRunecaster.class));
        cards.add(new SetCardInfo("Ark of Blight", 140, Rarity.UNCOMMON, mage.cards.a.ArkOfBlight.class));
        cards.add(new SetCardInfo("Astral Steel", 2, Rarity.COMMON, mage.cards.a.AstralSteel.class));
        cards.add(new SetCardInfo("Aven Farseer", 3, Rarity.COMMON, mage.cards.a.AvenFarseer.class));
        cards.add(new SetCardInfo("Aven Liberator", 4, Rarity.COMMON, mage.cards.a.AvenLiberator.class));
        cards.add(new SetCardInfo("Bladewing's Thrall", 55, Rarity.UNCOMMON, mage.cards.b.BladewingsThrall.class));
        cards.add(new SetCardInfo("Bladewing the Risen", 136, Rarity.RARE, mage.cards.b.BladewingTheRisen.class));
        cards.add(new SetCardInfo("Brain Freeze", 29, Rarity.UNCOMMON, mage.cards.b.BrainFreeze.class));
        cards.add(new SetCardInfo("Break Asunder", 113, Rarity.COMMON, mage.cards.b.BreakAsunder.class));
        cards.add(new SetCardInfo("Cabal Conditioning", 56, Rarity.RARE, mage.cards.c.CabalConditioning.class));
        cards.add(new SetCardInfo("Call to the Grave", 58, Rarity.RARE, mage.cards.c.CallToTheGrave.class));
        cards.add(new SetCardInfo("Carbonize", 83, Rarity.UNCOMMON, mage.cards.c.Carbonize.class));
        cards.add(new SetCardInfo("Carrion Feeder", 59, Rarity.COMMON, mage.cards.c.CarrionFeeder.class));
        cards.add(new SetCardInfo("Chartooth Cougar", 84, Rarity.COMMON, mage.cards.c.ChartoothCougar.class));
        cards.add(new SetCardInfo("Claws of Wirewood", 114, Rarity.UNCOMMON, mage.cards.c.ClawsOfWirewood.class));
        cards.add(new SetCardInfo("Coast Watcher", 30, Rarity.COMMON, mage.cards.c.CoastWatcher.class));
        cards.add(new SetCardInfo("Consumptive Goo", 62, Rarity.RARE, mage.cards.c.ConsumptiveGoo.class));
        cards.add(new SetCardInfo("Daru Warchief", 6, Rarity.UNCOMMON, mage.cards.d.DaruWarchief.class));
        cards.add(new SetCardInfo("Day of the Dragons", 31, Rarity.RARE, mage.cards.d.DayOfTheDragons.class));
        cards.add(new SetCardInfo("Death's-Head Buzzard", 63, Rarity.COMMON, mage.cards.d.DeathsHeadBuzzard.class));
        cards.add(new SetCardInfo("Decree of Annihilation", 85, Rarity.RARE, mage.cards.d.DecreeOfAnnihilation.class));
        cards.add(new SetCardInfo("Decree of Justice", 8, Rarity.RARE, mage.cards.d.DecreeOfJustice.class));
        cards.add(new SetCardInfo("Decree of Pain", 64, Rarity.RARE, mage.cards.d.DecreeOfPain.class));
        cards.add(new SetCardInfo("Decree of Savagery", 115, Rarity.RARE, mage.cards.d.DecreeOfSavagery.class));
        cards.add(new SetCardInfo("Decree of Silence", 32, Rarity.RARE, mage.cards.d.DecreeOfSilence.class));
        cards.add(new SetCardInfo("Dispersal Shield", 33, Rarity.COMMON, mage.cards.d.DispersalShield.class));
        cards.add(new SetCardInfo("Dragon Breath", 86, Rarity.COMMON, mage.cards.d.DragonBreath.class));
        cards.add(new SetCardInfo("Dragon Fangs", 117, Rarity.COMMON, mage.cards.d.DragonFangs.class));
        cards.add(new SetCardInfo("Dragon Mage", 87, Rarity.RARE, mage.cards.d.DragonMage.class));
        cards.add(new SetCardInfo("Dragon Scales", 10, Rarity.COMMON, mage.cards.d.DragonScales.class));
        cards.add(new SetCardInfo("Dragon Shadow", 65, Rarity.COMMON, mage.cards.d.DragonShadow.class));
        cards.add(new SetCardInfo("Dragonspeaker Shaman", 89, Rarity.UNCOMMON, mage.cards.d.DragonspeakerShaman.class));
        cards.add(new SetCardInfo("Dragonstalker", 11, Rarity.UNCOMMON, mage.cards.d.Dragonstalker.class));
        cards.add(new SetCardInfo("Dragonstorm", 90, Rarity.RARE, mage.cards.d.Dragonstorm.class));
        cards.add(new SetCardInfo("Dragon Tyrant", 88, Rarity.RARE, mage.cards.d.DragonTyrant.class));
        cards.add(new SetCardInfo("Dragon Wings", 34, Rarity.COMMON, mage.cards.d.DragonWings.class));
        cards.add(new SetCardInfo("Edgewalker", 137, Rarity.UNCOMMON, mage.cards.e.Edgewalker.class));
        cards.add(new SetCardInfo("Elvish Aberration", 118, Rarity.UNCOMMON, mage.cards.e.ElvishAberration.class));
        cards.add(new SetCardInfo("Enrage", 91, Rarity.UNCOMMON, mage.cards.e.Enrage.class));
        cards.add(new SetCardInfo("Eternal Dragon", 12, Rarity.RARE, mage.cards.e.EternalDragon.class));
        cards.add(new SetCardInfo("Extra Arms", 92, Rarity.UNCOMMON, mage.cards.e.ExtraArms.class));
        cards.add(new SetCardInfo("Fatal Mutation", 66, Rarity.UNCOMMON, mage.cards.f.FatalMutation.class));
        cards.add(new SetCardInfo("Fierce Empath", 119, Rarity.COMMON, mage.cards.f.FierceEmpath.class));
        cards.add(new SetCardInfo("Final Punishment", 67, Rarity.RARE, mage.cards.f.FinalPunishment.class));
        cards.add(new SetCardInfo("Forgotten Ancient", 120, Rarity.RARE, mage.cards.f.ForgottenAncient.class));
        cards.add(new SetCardInfo("Form of the Dragon", 93, Rarity.RARE, mage.cards.f.FormOfTheDragon.class));
        cards.add(new SetCardInfo("Frozen Solid", 36, Rarity.COMMON, mage.cards.f.FrozenSolid.class));
        cards.add(new SetCardInfo("Gilded Light", 16, Rarity.UNCOMMON, mage.cards.g.GildedLight.class));
        cards.add(new SetCardInfo("Goblin Brigand", 94, Rarity.COMMON, mage.cards.g.GoblinBrigand.class));
        cards.add(new SetCardInfo("Goblin Warchief", 97, Rarity.UNCOMMON, mage.cards.g.GoblinWarchief.class));
        cards.add(new SetCardInfo("Goblin War Strike", 96, Rarity.COMMON, mage.cards.g.GoblinWarStrike.class));
        cards.add(new SetCardInfo("Grip of Chaos", 98, Rarity.RARE, mage.cards.g.GripOfChaos.class));
        cards.add(new SetCardInfo("Hindering Touch", 37, Rarity.COMMON, mage.cards.h.HinderingTouch.class));
        cards.add(new SetCardInfo("Hunting Pack", 121, Rarity.UNCOMMON, mage.cards.h.HuntingPack.class));
        cards.add(new SetCardInfo("Karona, False God", 138, Rarity.RARE, mage.cards.k.KaronaFalseGod.class));
        cards.add(new SetCardInfo("Krosan Drover", 122, Rarity.COMMON, mage.cards.k.KrosanDrover.class));
        cards.add(new SetCardInfo("Krosan Warchief", 123, Rarity.UNCOMMON, mage.cards.k.KrosanWarchief.class));
        cards.add(new SetCardInfo("Kurgadon", 124, Rarity.UNCOMMON, mage.cards.k.Kurgadon.class));
        cards.add(new SetCardInfo("Long-Term Plans", 38, Rarity.UNCOMMON, mage.cards.l.LongTermPlans.class));
        cards.add(new SetCardInfo("Mercurial Kite", 39, Rarity.COMMON, mage.cards.m.MercurialKite.class));
        cards.add(new SetCardInfo("Mind's Desire", 41, Rarity.RARE, mage.cards.m.MindsDesire.class));
        cards.add(new SetCardInfo("Mischievous Quanar", 42, Rarity.RARE, mage.cards.m.MischievousQuanar.class));
        cards.add(new SetCardInfo("Misguided Rage", 99, Rarity.COMMON, mage.cards.m.MisguidedRage.class));
        cards.add(new SetCardInfo("Nefashu", 70, Rarity.RARE, mage.cards.n.Nefashu.class));
        cards.add(new SetCardInfo("Noble Templar", 19, Rarity.COMMON, mage.cards.n.NobleTemplar.class));
        cards.add(new SetCardInfo("One with Nature", 125, Rarity.UNCOMMON, mage.cards.o.OneWithNature.class));
        cards.add(new SetCardInfo("Pemmin's Aura", 45, Rarity.UNCOMMON, mage.cards.p.PemminsAura.class));
        cards.add(new SetCardInfo("Primitive Etchings", 126, Rarity.RARE, mage.cards.p.PrimitiveEtchings.class));
        cards.add(new SetCardInfo("Putrid Raptor", 71, Rarity.UNCOMMON, mage.cards.p.PutridRaptor.class));
        cards.add(new SetCardInfo("Pyrostatic Pillar", 100, Rarity.UNCOMMON, mage.cards.p.PyrostaticPillar.class));
        cards.add(new SetCardInfo("Rain of Blades", 20, Rarity.UNCOMMON, mage.cards.r.RainOfBlades.class));
        cards.add(new SetCardInfo("Raven Guild Master", 47, Rarity.RARE, mage.cards.r.RavenGuildMaster.class));
        cards.add(new SetCardInfo("Reaping the Graves", 72, Rarity.COMMON, mage.cards.r.ReapingTheGraves.class));
        cards.add(new SetCardInfo("Recuperate", 21, Rarity.COMMON, mage.cards.r.Recuperate.class));
        cards.add(new SetCardInfo("Reward the Faithful", 22, Rarity.UNCOMMON, mage.cards.r.RewardTheFaithful.class));
        cards.add(new SetCardInfo("Riptide Survivor", 48, Rarity.UNCOMMON, mage.cards.r.RiptideSurvivor.class));
        cards.add(new SetCardInfo("Root Elemental", 127, Rarity.RARE, mage.cards.r.RootElemental.class));
        cards.add(new SetCardInfo("Rush of Knowledge", 49, Rarity.COMMON, mage.cards.r.RushOfKnowledge.class));
        cards.add(new SetCardInfo("Scattershot", 102, Rarity.COMMON, mage.cards.s.Scattershot.class));
        cards.add(new SetCardInfo("Scornful Egotist", 50, Rarity.COMMON, mage.cards.s.ScornfulEgotist.class));
        cards.add(new SetCardInfo("Shoreline Ranger", 51, Rarity.COMMON, mage.cards.s.ShorelineRanger.class));
        cards.add(new SetCardInfo("Siege-Gang Commander", 103, Rarity.RARE, mage.cards.s.SiegeGangCommander.class));
        cards.add(new SetCardInfo("Silver Knight", 23, Rarity.UNCOMMON, mage.cards.s.SilverKnight.class));
        cards.add(new SetCardInfo("Skirk Volcanist", 104, Rarity.UNCOMMON, mage.cards.s.SkirkVolcanist.class));
        cards.add(new SetCardInfo("Skulltap", 73, Rarity.COMMON, mage.cards.s.Skulltap.class));
        cards.add(new SetCardInfo("Sliver Overlord", 139, Rarity.RARE, mage.cards.s.SliverOverlord.class));
        cards.add(new SetCardInfo("Soul Collector", 74, Rarity.RARE, mage.cards.s.SoulCollector.class));
        cards.add(new SetCardInfo("Spark Spray", 105, Rarity.COMMON, mage.cards.s.SparkSpray.class));
        cards.add(new SetCardInfo("Sprouting Vines", 128, Rarity.COMMON, mage.cards.s.SproutingVines.class));
        cards.add(new SetCardInfo("Stifle", 52, Rarity.RARE, mage.cards.s.Stifle.class));
        cards.add(new SetCardInfo("Sulfuric Vortex", 106, Rarity.RARE, mage.cards.s.SulfuricVortex.class));
        cards.add(new SetCardInfo("Temple of the False God", 143, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Temporal Fissure", 53, Rarity.COMMON, mage.cards.t.TemporalFissure.class));
        cards.add(new SetCardInfo("Tendrils of Agony", 75, Rarity.UNCOMMON, mage.cards.t.TendrilsOfAgony.class));
        cards.add(new SetCardInfo("Thundercloud Elemental", 54, Rarity.UNCOMMON, mage.cards.t.ThundercloudElemental.class));
        cards.add(new SetCardInfo("Titanic Bulvox", 129, Rarity.COMMON, mage.cards.t.TitanicBulvox.class));
        cards.add(new SetCardInfo("Torrent of Fire", 107, Rarity.COMMON, mage.cards.t.TorrentOfFire.class));
        cards.add(new SetCardInfo("Trap Digger", 24, Rarity.RARE, mage.cards.t.TrapDigger.class));
        cards.add(new SetCardInfo("Treetop Scout", 130, Rarity.COMMON, mage.cards.t.TreetopScout.class));
        cards.add(new SetCardInfo("Twisted Abomination", 76, Rarity.COMMON, mage.cards.t.TwistedAbomination.class));
        cards.add(new SetCardInfo("Unburden", 77, Rarity.COMMON, mage.cards.u.Unburden.class));
        cards.add(new SetCardInfo("Uncontrolled Infestation", 108, Rarity.COMMON, mage.cards.u.UncontrolledInfestation.class));
        cards.add(new SetCardInfo("Undead Warchief", 78, Rarity.UNCOMMON, mage.cards.u.UndeadWarchief.class));
        cards.add(new SetCardInfo("Unspeakable Symbol", 79, Rarity.UNCOMMON, mage.cards.u.UnspeakableSymbol.class));
        cards.add(new SetCardInfo("Upwelling", 131, Rarity.RARE, mage.cards.u.Upwelling.class));
        cards.add(new SetCardInfo("Vengeful Dead", 80, Rarity.COMMON, mage.cards.v.VengefulDead.class));
        cards.add(new SetCardInfo("Wing Shards", 25, Rarity.UNCOMMON, mage.cards.w.WingShards.class));
        cards.add(new SetCardInfo("Wipe Clean", 26, Rarity.COMMON, mage.cards.w.WipeClean.class));
        cards.add(new SetCardInfo("Wirewood Guardian", 132, Rarity.COMMON, mage.cards.w.WirewoodGuardian.class));
        cards.add(new SetCardInfo("Wirewood Symbiote", 133, Rarity.UNCOMMON, mage.cards.w.WirewoodSymbiote.class));
        cards.add(new SetCardInfo("Woodcloaker", 134, Rarity.COMMON, mage.cards.w.Woodcloaker.class));
        cards.add(new SetCardInfo("Xantid Swarm", 135, Rarity.RARE, mage.cards.x.XantidSwarm.class));
        cards.add(new SetCardInfo("Zealous Inquisitor", 27, Rarity.COMMON, mage.cards.z.ZealousInquisitor.class));
        cards.add(new SetCardInfo("Zombie Cutthroat", 81, Rarity.COMMON, mage.cards.z.ZombieCutthroat.class));
    }
}
