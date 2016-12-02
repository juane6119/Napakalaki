#!/bin/env ruby
# encoding: utf-8

require 'singleton'
require_relative 'BadConsequence.rb'
require_relative 'Prize.rb'
require_relative 'Monster.rb'
require_relative 'Treasure.rb'
require_relative 'TreasureKind.rb'


class CardDealer
  include Singleton
  
  def initialize
    @unusedTreasures = Array.new
    @usedTreasures = Array.new
    @unusedMonsters = Array.new
    @usedMonster = Array.new
  end
      
  def initTreasureCardDeck
    @unusedTreasures << Treasure.new("¡Si mi amo!", 4, TreasureKind::SHOES)
    @unusedTreasures << Treasure.new('Botas de investigacion', 3, TreasureKind::SHOES)
    @unusedTreasures << Treasure.new('Capucha de Cthulhu', 3, TreasureKind::HELMET)
    @unusedTreasures << Treasure.new('A prueba de babas', 2, TreasureKind::ARMOR)
    @unusedTreasures<< Treasure.new('Botas de lluvia acida', 1, TreasureKind::BOTHHANDS)
    @unusedTreasures<< Treasure.new('Casco minero', 2, TreasureKind::HELMET)
    @unusedTreasures<< Treasure.new('Ametralladora ACME', 4, TreasureKind::BOTHHANDS)
    @unusedTreasures<< Treasure.new('Camiseta de la ETSIIT', 1, TreasureKind::ARMOR)
    @unusedTreasures<< Treasure.new('Clavo de rail ferroviario', 3, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('Cuchillo de sushi arcano', 2, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('Fez alopodo', 3, TreasureKind::HELMET)
    @unusedTreasures<< Treasure.new('Hacha prehistorica', 2, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('El aparato del PR. Tesla', 4, TreasureKind::ARMOR)
    @unusedTreasures<< Treasure.new('Gaita', 4, TreasureKind::BOTHHANDS)
    @unusedTreasures<< Treasure.new('Insecticida', 2, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('Escopeta de 3 cañones', 4, TreasureKind::BOTHHANDS)
    @unusedTreasures<< Treasure.new('Garabato mistico', 2, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('La rebeca metalica', 2, TreasureKind::ARMOR)
    @unusedTreasures<< Treasure.new('Lanzallamas', 4, TreasureKind::BOTHHANDS)
    @unusedTreasures<< Treasure.new('Necro-comicón', 1, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('Necronomicón', 5, TreasureKind::BOTHHANDS)
    @unusedTreasures<< Treasure.new('Linterna a 2 manos', 3, TreasureKind::BOTHHANDS)
    @unusedTreasures<< Treasure.new('Necro-gnomicón', 2, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('Necrotelecom', 2, TreasureKind::HELMET)
    @unusedTreasures<< Treasure.new('Mazo de los antiguos', 3, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('Necro-playboycón', 3, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('Porra preternatural', 2, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('Shogulador', 1, TreasureKind::BOTHHANDS)
    @unusedTreasures<< Treasure.new('Varita de atizamiento', 3, TreasureKind::ONEHAND)
    @unusedTreasures<< Treasure.new('Tentáculo de pega', 2, TreasureKind::HELMET)
    @unusedTreasures<< Treasure.new('Zapato deja-amigos', 1, TreasureKind::SHOES)
    
  end
  
  def initMonsterCardDeck
    # Monstruo 1 -> Byakhees de bonanza
    prize = Prize.new(2, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('Pierdes tu armadura visible y otra oculta', 0, [TreasureKind::ARMOR], [TreasureKind::ARMOR])
    
    @unusedMonsters<< Monster.new('Byakhees de bonanza', 8, prize, bad_consequence)
   puts "Hasta aqui llega inicio monstruops"
    # Monstruo 2 -> Tenochtitlan
    prize = Prize.new(1, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('Embobados con el lindo primigenio te descartas de tu casco visible.', 0, [TreasureKind::HELMET], Array.new)
    @unusedMonsters<< Monster.new('Tenochtitlan', 2, prize, bad_consequence)

    # Monstruo 3 -> El sopor de dunwich
    prize = Prize.new(1, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('Pierdes tu armadura visible y otra oculta.', 0, [TreasureKind::SHOES], Array.new)
    @unusedMonsters<< Monster.new('El sopor de dunwich', 2, prize, bad_consequence)

    # Monstruo 4 -> DEMONIOS DE MAGALUF
    prize = Prize.new(4, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta una mano visible y una mano oculta.', 0, [TreasureKind::ONEHAND], [TreasureKind::ONEHAND])
    @unusedMonsters<< Monster.new('Demonios de Magaluf', 2, prize, bad_consequence)

   # Monstruo 5 -> EL GORRON DEL UMBRAL
    prize = Prize.new(3, 1)
    bad_consequence = BadConsequence.newLevelNumberOfTreasures('Pierdes todos tus tesoros visibles.', 0, 0, 0 )
    @unusedMonsters<< Monster.new('Demonios de Magaluf', 2, prize, bad_consequence)

    # Monstruo 6 -> H.P Munchcraft
    prize = Prize.new(2, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('Pierdes la armadura visible.', 0, [TreasureKind::ARMOR], Array.new)
    @unusedMonsters<< Monster.new('H.P. Munchcraft', 6, prize, bad_consequence)

    # Monstruo 7 -> Necrofago
    prize = Prize.new(1, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('Sientes bichos bajo la ropa. Descarta la armadura visible.', 0, [TreasureKind::ARMOR], Array.new)
    @unusedMonsters<< Monster.new('Necrofago', 13, prize, bad_consequence)

    # Monstruo 8 -> El rey de rosado
    prize = Prize.new(3, 2)
    bad_consequence = BadConsequence.newLevelNumberOfTreasures('Pierdes 5 niveles y 3 tesoros visibles.', 5, 3, 0)
    @unusedMonsters<< Monster.new('El rey de rosado', 11, prize, bad_consequence)

    # Monstruo 9 -> FLECHER
    prize = Prize.new(1, 1)
    bad_consequence = BadConsequence.newLevelNumberOfTreasures('Toses los pulmones y pierdes 2 niveles.', 2, 0, 0)
    @unusedMonsters<< Monster.new('Flecher', 2, prize, bad_consequence)

    # Monstruo 10 -> Los hondos
    prize = Prize.new(2, 1)
    bad_consequence = BadConsequence.newDeath('Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto')
    @unusedMonsters<< Monster.new('Los hondos', 8, prize, bad_consequence)

    # Monstruo 11 -> Semillas Cthulhu
    prize = Prize.new(2, 1)
    bad_consequence = BadConsequence.newLevelNumberOfTreasures('Pierdes 2 niveles y 2 tesoros ocultos.', 2, 0, 2)
    @unusedMonsters<< Monster.new('Semillas Cthulhu', 4, prize, bad_consequence)

    # Monstruo 12 -> Dameargo
    prize = Prize.new(2, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('Te intentas escaquear. Pierdes una mano visible.', 0, [TreasureKind::ONEHAND], Array.new)
    @unusedMonsters<< Monster.new('Dameargo', 1, prize, bad_consequence)

    # Monstruo 13 -> Pollipólipo volante
    prize = Prize.new(2, 1)
    bad_consequence = BadConsequence.newLevelNumberOfTreasures('Da mucho asquito. Pierdes 3 niveles.', 3, 0, 0)
    @unusedMonsters<< Monster.new('Pollipólipo volante', 3, prize, bad_consequence)

    # Monstruo 14 -> Yskhtihyssg-Goth
    prize = Prize.new(3, 1)
    bad_consequence = BadConsequence.newDeath('No le hace gracia que pronuncien mal su nombre. Estas muerto')
    @unusedMonsters<< Monster.new('Yskhtihyssg-Goth', 14, prize, bad_consequence)

    # Monstruo 15 -> Familia feliz
    prize = Prize.new(3, 1)
    bad_consequence = BadConsequence.newDeath('La familia te atrapa. Estás muerto.')
    @unusedMonsters<< Monster.new('Familia feliz', 1, prize, bad_consequence)

    # Monstruo 16 -> Roboggoth
    prize = Prize.new(2, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible', 2, [TreasureKind::BOTHHANDS], Array.new)
    @unusedMonsters<< Monster.new('Roboggoth', 8, prize, bad_consequence)

    # Monstruo 17 -> El espía sordo
    prize = Prize.new(1, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('Te asusta en la noche. Pierdes un casco visible.', 0, [TreasureKind::HELMET], Array.new)
    @unusedMonsters<< Monster.new('El espía sordo', 5, prize, bad_consequence)

    # Monstruo 18 -> Tongue
    prize = Prize.new(2, 1)
    bad_consequence = BadConsequence.newLevelNumberOfTreasures('Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles.', 2, 5, 0)
    @unusedMonsters<< Monster.new('Tongue', 19, prize, bad_consequence)

     # Monstruo 19 -> Bicefalo
    prize = Prize.new(2, 1)
    bad_consequence = BadConsequence.newLevelSpecificTreasures('Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos.', 3, [TreasureKind::ONEHAND], [TreasureKind::BOTHHANDS])
    @unusedMonsters<< Monster.new('Bicefalo', 21, prize, bad_consequence)
  end
  
  def shuffleTreasures
    @unusedTreasures.shuffle
  end
  
  def shuffleMonsters
    @unusedMonsters.shuffle
  end
  
  def nextTreasure
    if !@unusedTreasures.isEmpty
        devolver = @unusedTreasures[0]
        @unusedTreasures.delete(devolver)

        return devolver
    end

    @unusedTreasures = @usedTreasures
    @usedTreasures.clear
    shuffleTreasures
    devolver = @unusedTreasures[0]
    @unusedTreasures.delete(devolver)

    return devolver
  end
  
  def nextMonster
    if !@unusedMonsters.empty?
      devolver = @unusedMonsters[0]
      @unusedMonsters.delete(devolver)

      return devolver
    end

    @unusedMonster = @usedMonster
    @usedMonster.clear
    shuffleMonster
    devolver = @unusedMonster[0]
    @unusedMonster.delete(devolver)

    return devolver
  end
  
  def giveTreasureBack(tesoro)
    @usedTreasures<< tesoro
  end
  
  def giveMonsterBack(monstruo)
    @usedMonsters<< monstruo
  end
  
  def initCards
    initTreasureCardDeck
    initMonsterCardDeck
  end
  
  private :initTreasureCardDeck, :initMonsterCardDeck, :shuffleTreasures, :shuffleMonsters

end
