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
import mage.ObjectColor;
import mage.cards.CardGraphicInfo;
import mage.cards.FrameStyle;

/**
 *
 * @author fireshoes
 */
public class MasterpieceSeries extends ExpansionSet {

    private static final MasterpieceSeries fINSTANCE = new MasterpieceSeries();

    public static MasterpieceSeries getInstance() {
        return fINSTANCE;
    }

    private MasterpieceSeries() {
        super("Masterpiece Series", "MPS", "mage.sets.masterpieceseries", new GregorianCalendar(2016, 9, 30).getTime(), SetType.PROMOTIONAL);
        this.hasBoosters = false;
        this.hasBasicLands = false;
        cards.add(new SetCardInfo("Aether Vial", 6, Rarity.MYTHIC, mage.cards.a.AetherVial.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Cataclysmic Gearhulk", 1, Rarity.MYTHIC, mage.cards.c.CataclysmicGearhulk.class, new CardGraphicInfo(
                FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Champion's Helm", 7, Rarity.MYTHIC, mage.cards.c.ChampionsHelm.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Chromatic Lantern", 8, Rarity.MYTHIC, mage.cards.c.ChromaticLantern.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION,
                false)));
        cards.add(new SetCardInfo("Chrome Mox", 9, Rarity.MYTHIC, mage.cards.c.ChromeMox.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Cloudstone Curio", 10, Rarity.MYTHIC, mage.cards.c.CloudstoneCurio.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION,
                false)));
        cards.add(new SetCardInfo("Combustible Gearhulk", 2, Rarity.MYTHIC, mage.cards.c.CombustibleGearhulk.class));
        cards.add(new SetCardInfo("Crucible of Worlds", 11, Rarity.MYTHIC, mage.cards.c.CrucibleOfWorlds.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION,
                false)));
        cards.add(new SetCardInfo("Gauntlet of Power", 12, Rarity.MYTHIC, mage.cards.g.GauntletOfPower.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION,
                false)));
        cards.add(new SetCardInfo("Hangarback Walker", 13, Rarity.MYTHIC, mage.cards.h.HangarbackWalker.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION,
                false)));
        cards.add(new SetCardInfo("Lightning Greaves", 14, Rarity.MYTHIC, mage.cards.l.LightningGreaves.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION,
                false)));
        cards.add(new SetCardInfo("Lotus Petal", 15, Rarity.MYTHIC, mage.cards.l.LotusPetal.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Mana Crypt", 16, Rarity.MYTHIC, mage.cards.m.ManaCrypt.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Mana Vault", 17, Rarity.MYTHIC, mage.cards.m.ManaVault.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Mind's Eye", 18, Rarity.MYTHIC, mage.cards.m.MindsEye.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Mox Opal", 19, Rarity.MYTHIC, mage.cards.m.MoxOpal.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Noxious Gearhulk", 3, Rarity.MYTHIC, mage.cards.n.NoxiousGearhulk.class));
        cards.add(new SetCardInfo("Painter's Servant", 20, Rarity.MYTHIC, mage.cards.p.PaintersServant.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION,
                false)));
        cards.add(new SetCardInfo("Rings of Brighthearth", 21, Rarity.MYTHIC, mage.cards.r.RingsOfBrighthearth.class, new CardGraphicInfo(
                FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Scroll Rack", 22, Rarity.MYTHIC, mage.cards.s.ScrollRack.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Sculpting Steel", 23, Rarity.MYTHIC, mage.cards.s.SculptingSteel.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Solemn Simulacrum", 25, Rarity.MYTHIC, mage.cards.s.SolemnSimulacrum.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION,
                false)));
        cards.add(new SetCardInfo("Sol Ring", 24, Rarity.MYTHIC, mage.cards.s.SolRing.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Static Orb", 26, Rarity.MYTHIC, mage.cards.s.StaticOrb.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Steel Overseer", 27, Rarity.MYTHIC, mage.cards.s.SteelOverseer.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Sword of Feast and Famine", 28, Rarity.MYTHIC, mage.cards.s.SwordOfFeastAndFamine.class, new CardGraphicInfo(
                FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Sword of Fire and Ice", 29, Rarity.MYTHIC, mage.cards.s.SwordOfFireAndIce.class, new CardGraphicInfo(
                FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Sword of Light and Shadow", 30, Rarity.MYTHIC, mage.cards.s.SwordOfLightAndShadow.class, new CardGraphicInfo(
                FrameStyle.KLD_INVENTION, false)));
        cards.add(new SetCardInfo("Torrential Gearhulk", 4, Rarity.MYTHIC, mage.cards.t.TorrentialGearhulk.class));
        cards.add(new SetCardInfo("Verdurous Gearhulk", 5, Rarity.MYTHIC, mage.cards.v.VerdurousGearhulk.class, new CardGraphicInfo(FrameStyle.KLD_INVENTION,
                false)));
    }
}
