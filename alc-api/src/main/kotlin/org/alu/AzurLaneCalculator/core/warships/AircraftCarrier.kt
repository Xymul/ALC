package com.xymul.AzurLaneCalculator.core.warships

import com.xymul.AzurLaneCalculator.core.Type
import com.xymul.AzurLaneCalculator.core.Warship
import com.xymul.AzurLaneCalculator.core.helper.EquipmentSlots
import com.xymul.AzurLaneCalculator.core.helper.WarshipWeapons

/**
 * 表示一艘正航
 * */
class AircraftCarrier(
    override val weaponSlots: WarshipWeapons,
    override val equipmentSlots: EquipmentSlots,
    override val name: String,
    override val level: Int,
    override val health: Int,
    override val armorType: Type.ArmorType,
    override val reload: Int,
    override val lucky: Int,
    override val evasion: Int,
    override val speed: Int,
    override val antiAircraft: Int,
    override val aviation: Int,
    override val cost: Int,
    override val accuracy: Int,
    override val antiSubmarine: Int,
    override val affection: Warship.Affection
) : Warship {
    override val shipType: Type.ShipType = Type.ShipType.CV
    override val hasMainGun: Boolean = false
    override val hasTorpedo: Boolean = false
    override val hasSecondaryGun: Boolean = false
    override val hasAntiAircraftGun: Boolean = false
    override val torpedo: Int = 0
    override val firepower: Int = 0
}