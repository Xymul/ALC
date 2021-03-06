package org.alu.alc.internal

import org.alu.alc.Equipable
import org.alu.alc.Type
import org.alu.alc.Type.ShipType.*
import org.alu.alc.internal.units.Attributes
import org.alu.alc.internal.units.Shell

data class Weapon(
    override val name: String,

    override val attributes: Attributes,

    override val level: Int,

    override val rarity: Int,

    override val equippedShips: Array<Type.ShipType>,

    val shells: ArrayList<Shell>,

    /** 武器的cd */
    val cd: Double,

    /** 武器系数 */
    val coefficient: Double,

    /** 主炮散步，如果武器是非舰炮类型则为0 */
    val rng: Int = 0
) : Equipable {

    companion object {
        val scoutEquippedShips: Array<Type.ShipType> = arrayOf(BBV, AS)
        val aircraftEquippedShips: Array<Type.ShipType> = arrayOf(CV, CVL)
        val DDMainGunEquippedShips: Array<Type.ShipType> = arrayOf(DD, BB, BC, CA, CL, CB)
        val CLMainGunEquippedShips: Array<Type.ShipType> = arrayOf(CL, BB, BC)
        val CAMainGunEquippedShips: Array<Type.ShipType> = arrayOf(CA, CAT, CB)
        val BBMainGunEquippedShips: Array<Type.ShipType> = arrayOf(BB, BC, BBV, BM)
        val torpedoEquippedShips: Array<Type.ShipType> = arrayOf(DD, CLT, CAT)
        val antiAircraftGunEquippedShips: Array<Type.ShipType> =
            arrayOf(DD, CL, CLT, CA, CAT, CB, BB, BC, BBV, BM, CVL, SS, AP)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Weapon

        if (name != other.name) return false
        if (attributes != other.attributes) return false
        if (level != other.level) return false
        if (rarity != other.rarity) return false
        if (!equippedShips.contentEquals(other.equippedShips)) return false
        if (shells != other.shells) return false
        if (cd != other.cd) return false
        if (coefficient != other.coefficient) return false
        if (rng != other.rng) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + attributes.hashCode()
        result = 31 * result + level
        result = 31 * result + rarity
        result = 31 * result + equippedShips.contentHashCode()
        result = 31 * result + shells.hashCode()
        result = 31 * result + cd.hashCode()
        result = 31 * result + coefficient.hashCode()
        result = 31 * result + rng
        return result
    }
}