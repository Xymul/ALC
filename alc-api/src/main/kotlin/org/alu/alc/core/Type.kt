package org.alu.alc.core

interface Type {
    /**
     * 表示装甲类型
     * */
    enum class ArmorType : Type {
        /**
         * 表示舰船装甲属于轻甲
         * */
        LIGHT_ARMOR,

        /**
         * 表示舰船装甲属于中甲
         * */
        MEDIUM_ARMOR,

        /**
         * 表示舰船装甲属于重甲
         */
        HEAVY_ARMOR
    }

    /**
     * 表示**主炮炮弹**类型
     * */
    enum class ShellType : Type {
        /** 表示该炮弹属于高爆弹 */
        HE,

        /** 表示该炮弹属于穿甲弹 */
        AP,

        /** 表示该炮弹属于半穿甲弹 */
        SAP,

        /** 表示该炮弹属于通常弹 */
        COMMON
    }

    /**
     * 表示防空炮类型
     * */
    enum class AntiAircraftType : Type {
        COMMON
    }

    /**
     * 表示**舰载鱼雷**类型
     * */
    enum class TorpedoType : Type {
        /** 表示该鱼雷属于普通鱼雷 */
        COMMON_TORPEDO,

        /** 表示该鱼雷属于磁性鱼雷 */
        MAGNETIC_TORPEDO
    }

    /**
     * 表示舰载机的航弹类型
     * */
    enum class AerialBombType : Type {
        /** 表示该舰载机不携带任何鱼雷/航弹 */
        NONE,

        /** 表示该航弹属于航空鱼雷 */
        TORPEDO,

        /** 表示100磅航弹 */
        LB100,

        /** 表示500磅航弹 */
        LB500,

        /** 表示1000磅航弹 */
        LB1000,

        /** 表示1600磅航弹 */
        LB1600,

        /** 表示2000磅航弹 */
        LB2000
    }

    /**
     * 表示舰船类型
     * */
    enum class ShipType : Type {
        /** DD: 即驱逐舰 */
        DD,

        /** CL: 即轻巡洋舰，**这里特指有副炮的轻巡洋舰** */
        CL,

        /** CA: 即重巡洋舰，**这里特指有副炮的重巡洋舰** */
        CA,

        /** CB: 即大巡/超巡 */
        CB,

        /** CLT: 即雷击巡洋舰，**这里特指带有鱼雷的轻巡洋舰** */
        CLT,

        /** CAT: **这里特指带有鱼雷的重巡洋舰** */
        CAT,

        /** CAV: 航空巡洋舰 */
        CAV,

        /** BB: 战列舰 */
        BB,

        /** BC: 战列巡洋舰 */
        BC,

        /** BM: 重炮 */
        BM,

        /** BBV: 航空战列舰 */
        BBV,

        /** CV: 正规航空母舰 */
        CV,

        /** CVL: 轻型航空母舰 */
        CVL,

        /** AR: 维修舰 */
        AR,

        /** SS: 潜艇 */
        SS
    }

    /**
     * 表示装备/武器的可作用对象，该枚举和[Type.ShipType]除含有[ALL]外完全一致
     *
     * @see Type.ShipType
     * */
    enum class Applicability : Type {
        DD, CL, CA, CB, CLT, CAT, CAV, BB, BC, BM, BBV, CV, CVL, AR, SS,

        /** 表示该装备/武器可被作用于所有舰船 */
        ALL;
    }

    enum class Faction : Type {
        /** 白鹰 */
        EAGLE_UNION,
        /** 皇家 */
        ROYAL_NAVY,
        /** 铁血 */
        IRON_BLOOD,
        /** 重樱 */
        SAKURA_EMPIRE,
        /** 自由鸢尾 */
        IRIS_LIBRE,
        /** 维希教廷 */
        VICHYA_DOMINION,
        /** 撒丁帝国 */
        SARDEGNA_EMPIRE,
        /** 北方联合 */
        NORTHERN_PARLIAMENT,
        /** META */
        META,
        /** 布里 */
        OTHERS,
    }

    /**
     * 表示属性值/对最终伤害的加成类型
     * */
    enum class BonusType: Type {
        FIREPOWER,
        TORPEDO,
        ANTI_AIRCRAFT,
        HEALTH,
        RELOAD,
        LUCKY,
        AVIATION,
        ACCURACY,
        SPEED,
        EVASION,
        ANTI_SUBMARINE,
        DAMAGE
    }

}

