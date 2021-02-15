package com.xymul.AzurLaneCalculator.core.warships

import com.xymul.AzurLaneCalculator.core.Type
import com.xymul.AzurLaneCalculator.core.Warship
import com.xymul.AzurLaneCalculator.core.helper.EquipmentSLots
import com.xymul.AzurLaneCalculator.core.helper.WeaponSlots

class HeavyCruiser(
    override val weaponSlots: WeaponSlots,
    override val equipmentSLots: EquipmentSLots,
    override val name: String,
    override val level: Int,
    override val health: Int,
    override val armorType: Type.ArmorType,
    override val reload: Int,
    override val lucky: Int,
    override val firepower: Int,
    override val torpedo: Int,
    override val evasion: Int,
    override val speed: Int,
    override val antiAircraft: Int,
    override val aviation: Int,
    override val cost: Int,
    override val accuracy: Int,
    override val antiSubmarine: Int,
    override val hasTorpedo: Boolean,
    override val hasAntiAircraftGun: Boolean,
    override val affection: Warship.Affection
) : Warship {
    override val shipType: Type.ShipType =
        if (hasTorpedo) Type.ShipType.CAT
        else Type.ShipType.CA
    override val hasMainGun: Boolean = true
    override val hasSecondaryGun: Boolean = !hasTorpedo
}