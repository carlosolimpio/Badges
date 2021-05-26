package com.olimpio.study.badges.badges

data class Badge(
        var id: Int,
        var name: String,
        var category: String,
        var rarity: String,
        var description: String,
        var requisites: String,
        var picture: Int
)