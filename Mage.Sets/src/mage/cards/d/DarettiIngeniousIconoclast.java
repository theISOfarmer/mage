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
package mage.cards.d;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.LoyaltyAbility;
import mage.abilities.common.PlanswalkerEntersWithLoyalityCountersAbility;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.abilities.effects.common.DoIfCostPaid;
import mage.abilities.effects.common.PutTokenOntoBattlefieldCopyTargetEffect;
import mage.abilities.keyword.DefenderAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.filter.StaticFilters;
import mage.filter.common.FilterArtifactCard;
import mage.filter.common.FilterControlledArtifactPermanent;
import mage.game.Game;
import mage.game.permanent.token.Token;
import mage.target.TargetPermanent;
import mage.target.common.TargetCardInGraveyardOrBattlefield;
import mage.target.common.TargetControlledPermanent;

/**
 *
 * @author LevelX2
 */
public class DarettiIngeniousIconoclast extends CardImpl {

    public DarettiIngeniousIconoclast(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.PLANESWALKER},"{1}{B}{R}");
        this.subtype.add("Daretti");

        this.addAbility(new PlanswalkerEntersWithLoyalityCountersAbility(3));

        // +1: Put a 1/1 colorless Construct artifact creature token with defender onto the battlefield.
        LoyaltyAbility ability = new LoyaltyAbility(new CreateTokenEffect(new DarettiConstructToken()), 1);
        this.addAbility(ability);

        // -1: You may sacrifice an artifact. If you do, destroy target artifact or creature.
        ability = new LoyaltyAbility(
                new DoIfCostPaid(new DestroyTargetEffect(""), new SacrificeTargetCost(new TargetControlledPermanent(new FilterControlledArtifactPermanent("an artifact")))),
                -1);
        ability.addTarget(new TargetPermanent(StaticFilters.FILTER_ARTIFACT_CREATURE_PERMANENT));
        this.addAbility(ability);

        // -6: Choose target artifact card in a graveyard or artifact on the battlefield. Put three tokens that are copies of it onto the battlefield.
        ability = new LoyaltyAbility(
                new PutTokenOntoBattlefieldCopyTargetEffect(null, null, false, 3),
                -6);
        ability.addTarget(new TargetCardInGraveyardOrBattlefield(new FilterArtifactCard("artifact card in a graveyard or artifact on the battlefield")));
        this.addAbility(ability);

    }

    public DarettiIngeniousIconoclast(final DarettiIngeniousIconoclast card) {
        super(card);
    }

    @Override
    public DarettiIngeniousIconoclast copy() {
        return new DarettiIngeniousIconoclast(this);
    }
}

class DarettiIngeniousIconoclastEffect extends OneShotEffect {

    public DarettiIngeniousIconoclastEffect() {
        super(Outcome.Benefit);
        this.staticText = "Choose target artifact card in a graveyard or artifact on the battlefield. Put three tokens that are copies of it onto the battlefield";
    }

    public DarettiIngeniousIconoclastEffect(final DarettiIngeniousIconoclastEffect effect) {
        super(effect);
    }

    @Override
    public DarettiIngeniousIconoclastEffect copy() {
        return new DarettiIngeniousIconoclastEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return false;
    }
}

class DarettiConstructToken extends Token {

    public DarettiConstructToken() {
        this("CNS");
    }

    public DarettiConstructToken(String setCode) {
        super("Construct", "1/1 colorless Construct artifact creature token with defender");
        this.setOriginalExpansionSetCode(setCode);
        cardType.add(CardType.ARTIFACT);
        cardType.add(CardType.CREATURE);
        subtype.add("Construct");
        power = new MageInt(1);
        toughness = new MageInt(1);

        addAbility(DefenderAbility.getInstance());
    }
}
