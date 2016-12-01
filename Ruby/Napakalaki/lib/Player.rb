# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Player
  @@MAXLEVEL=10
  
  def initialize(name_p)
    @name=name_p
    @level= 0
    @dead=true
    @canISteal= true
    @enemy= nil
    @hiddenTreasures= Array.new
    @visibleTreasures= Array.new
    @pendingBadConsequence= nil
  end
  
  def bringToLife
    @dead= false
  end
  
  def getCombatLevel
    level_combat= @level
    for i in(0..@hiddenTreasures.length-1)
      level_combat+=hiddenTreasures[i].bonus
    end
    
    for i in(0..@visibleTreasures.length-1)
      level_combat+=visibleTreasures[i]
    end
    
    return level_combat
  end
  
  def incrementLevels(i)
    @level+=i
  end
  
  def decrementLevels(i)
    @level-=i
  end
  
  def setPendingBadConsequence(b)
    @pendingBadConsequence = b
  end
  
  def applyPrize(m)
    nLevels = m.getLevelsGained
    n_treasures = m.getTreasuresGained

    incrementLevels(nLevels)

    if n_treasures>0
        dealer = CardDealer.instance
        n_treasures.each do |tr|
          tr_aux = dealer.nextTreasure
          hiddenTreasures.push(tr_aux)
        end
    end
  end
  
  def applyBadConsequence(m)
    badC = m.getBadConsequence
    nLevels= badC.getLevels
        
    decrementLevels(nLevels)

    pendingBad= badC.adjustToFitTreasureLists(visibleTreasures, hiddenTreasures)
    setPendingBadConsequence(pendingBad)
  end
  
  def canMakeTreasureVisible(t)
    puede_make = true
    n_tr_oh = 0
    @visibleTreasures.each do |tes|
      if tes.getType == t.getType && t.getType != TreasureKind::ONEHAND
        return false
      end
      if tes.getType == TreasureKind::ONEHAND
          n_tr_oh += 1

          if t.getType == TreasureKind::BOTHHANDS
            return false
          end
      end
      if tes.getType == TreasureKind::BOTHHANDS && t.getType == TreasureKind::ONEHAND
        return false
      end
    end
    if t.getType == TreasureKind::ONEHAND && n_tr_oh >= 2
      return false
    end

    return puede_make
  end
  
  def howManyVisibleTreasures(t)
    n_trs=0
    @visibleTreasures.each do |v_tr|
      if(v_tr==t)
        n_trs+=1
      end
    end
    return n_trs
  end
  
  def dielfNoTreasures
    @dead=true
  end
  
  def giveMeATreasure
    return hiddenTreasures[rand(hiddenTreasures.length)]
  end
  
  def canYouGiveMeATreasure
    return @visibleTreasures.length
  end
  
  def howManyVisibleTreasures(t)
    n_trs = 0
    for i in(0..@visibleTreasures.length-1)
      if visibleTreasures[i].getType == t
        n_trs += 1
      end
    end
    return n_trs
  end
  
  def dielfNoTreasures
    if @visibleTreasures.isEmpty && hiddenTreasures.isEmpty
      @dead = true
    end
  end
  
  def isDead
    return @dead
  end
  
  def getHiddenTreasures
    return @hiddenTreasures
  end
  
  def getVisibleTreasures
    return @visibleTreasures
  end
  
  def combat(m)
    myLevel = getCombatLevel
    monsterLevel = m.getCombatLevel
    if !canISteal
      dice = Dice.instance
      number = dice.nextNumber

      if number < 3 
        enemyLevel = @enemy.getCombatLevel
        monsterLevel += enemyLevel;
      end
    end
    if myLevel > monsterLevel
      applyPrize(m)
      if level >= MAXLEVEL 
        cr = CombatResult::WINGAME
      else
        cr = CombatResult::WIN
      end
    else
      applyBadConsequence(m)
      cr = CombatResult::LOSE
    end
    
    return cr;
  end
  
  def makeTreasureVisible(t)
    canI = canMakeTreasureVisible(t)
    if canI
      visibleTreasures.push(t)
      hiddenTreasures.delete(t)
    end
  end
  
  def discardVisibleTreasure(t)
    @visibleTreasures.delete(t)
    if(@pendingBadConsequence != null && !@pendingBadConsequence.isEmpty)
      @pendingBadConsequence.substractVisibleTreasure(t)
    end
    dielfNoTreasures()
  end
  
  def discardHiddenTreasure(t)
    @hiddenTreasures.delete(t)
    if(@pendingBadConsequence != null && !@pendingBadConsequence.isEmpty)
      @pendingBadConsequence.substractHiddenTreasure(t)
    end
    dielfNoTreasures()
  end
  
  def validState
    return @hiddenTreasures.length < 5 && @pendingBadConsequence.isEmpty
  end
  
  def initTreasures
    dealer = CardDealer.instance
    dice = Dice.instance
    bringToLife
    t = dealer.nextTreasure
    @hiddenTreasures.push(t)
    number = dice.nextNumber

    if(number > 1)
        t = dealer.nextTreasure
        @hiddenTreasures.push(t)
    end
    if(number == 6)
        t = dealer.nextTreasure
        @hiddenTreasures.push(t)
    end
  end
  
  def getLevels
    return @level;
  end
  
  def stealTreasure
    t = null;
    if canISteal
      if enemy.canYouGiveMeATreasure
        t = giveMeATreasure
        @hiddenTreasures.push(t)
        haveStolen
      end
    end
    return t
  end
  
  def setEnemy(enemy)
    @enemy = enemy
  end
  
  def giveMeATreasure
    return @hiddenTreasures[rand(@hiddenTreasures.length)]
  end
  
  def canISteal
    return @canISteal
  end
  
  def canYouGiveMeATreasure
    return @visibleTreasures.length > 0
  end
  
  def haveStolen
    @canISteal = false
  end
  
  def discardAllTreasures
    tr_vis_aux = Array.new(@visibleTreasures)
    tr_hid_aux = Array.new(@hiddenTreasures)

    tr_vis_aux.each do |v_tr|
      discardVisibleTreasure(v_tr)
    end

    tr_hid_aux.each do |h_tr|
      discardHiddenTreasure(h_tr)
    end
  end
  
  attr_reader :canISteal, :level, :name
  attr_writer :enemy, :pendingBadConsequence
  private :bringToLife, :getCombatLevel, :incrementLevels, :decrementLevels,
    :setPendingBadConsequence, :applyPrize, :applyBadConsequence, :canMakeTreasureVisible,
    :howManyVisibleTreasures, :dielfNoTreasures, :giveMeATreasure, :canYouGiveMeATreasure,
    :haveStolen
end