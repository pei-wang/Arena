package com.arena.model;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by jason on 15-11-28.
 */
public class PlayerTest {
    @Test
    public void test_player_can_attack(){
        Player atkPlayer = new OrdinaryPerson("atkPlayer",10,100);
        Player atkedPlayer = new OrdinaryPerson("atkedPlayer",10,100);

        atkPlayer.attack(atkedPlayer);

        Assert.assertThat(atkedPlayer.getBlood(),is(90.0));
    }

    @Test
    public void test_player_attack_should_return_attack_infomation(){
        Player atkPlayer = new OrdinaryPerson("atkPlayer",10,100);
        Player atkedPlayer = new OrdinaryPerson("atkedPlayer",10,100);

        Assert.assertThat(atkPlayer.attack(atkedPlayer),is("atkPlayer攻击了atkedPlayer"));
    }

    @Test
    public void test_player_beAttacked_should_return_beAttacked_infomation(){
        Player atkPlayer = new OrdinaryPerson("atkPlayer",10,100);
        Player atkedPlayer = new OrdinaryPerson("atkedPlayer",10,100);

        Assert.assertThat(atkedPlayer.beAttacked(atkPlayer.getAtk()),is("atkedPlayer受到了10.0点伤害,atkedPlayer剩余生命:90.0"));
    }

    @Test
    public void test_player_isAlive_should_return_true_when_blood_bigger_than_0(){
        Player player = new OrdinaryPerson("wangpei",10,100);

        Assert.assertThat(player.isAlive(),is(true));
    }

    @Test
    public void test_player_can_be_attack(){
        Player player = new OrdinaryPerson("wangpei",10,100);

        player.beAttacked(10);

        Assert.assertThat(player.getBlood(),is(90.0));
    }
}