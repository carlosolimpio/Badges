package com.olimpio.study.badges.user

import com.olimpio.study.badges.badges.Badge

data class User(
        var id: Int,
        var picture: Int,
        var name: String,
        var project: String,
        var badgeList: ArrayList<Badge>
)