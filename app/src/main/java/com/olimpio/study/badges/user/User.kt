package com.olimpio.study.badges.user

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import com.olimpio.study.badges.badges.Badge
import kotlinx.android.parcel.RawValue

@Parcelize
data class User(
        var id: Int,
        var picture: Int,
        var name: String,
        var project: String,
        var badgeList: @RawValue ArrayList<Badge>
): Parcelable