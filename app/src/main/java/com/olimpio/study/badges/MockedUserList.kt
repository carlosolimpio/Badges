package com.olimpio.study.badges

import com.olimpio.study.badges.user.badges.Badge
import com.olimpio.study.badges.user.User

class MockedUserList {

    companion object {
        val userList = getMockedUserList()

        private fun getMockedUserList() : ArrayList<User> {
            return arrayListOf(
                    User(1, R.drawable.gon, "Gon Freeccs", "Chimera Ant Hunt", getMockedBadgeList()),
                    User(2, R.drawable.levi, "Levi Ackerman", "Free Eldia", getMockedBadgeList()),
                    User(3, R.drawable.gon, "Gon Freeccs", "Chimera Ant Hunt", getMockedBadgeList()),
                    User(4, R.drawable.levi, "Levi Ackerman", "Free Eldia", getMockedBadgeList()),
                    User(5, R.drawable.gon, "Gon Freeccs", "Chimera Ant Hunt", getMockedBadgeList()),
                    User(6, R.drawable.levi, "Levi Ackerman", "Free Eldia", getMockedBadgeList()),
                    User(7, R.drawable.gon, "Gon Freeccs", "Chimera Ant Hunt", getMockedBadgeList()),
                    User(8, R.drawable.levi, "Levi Ackerman", "Free Eldia", getMockedBadgeList()),
                    User(9, R.drawable.gon, "Gon Freeccs", "Chimera Ant Hunt", getMockedBadgeList()),
                    User(10, R.drawable.levi, "Levi Ackerman", "Free Eldia", getMockedBadgeList())
            )
        }

        private fun getMockedBadgeList() : ArrayList<Badge> {
            return arrayListOf(
                    Badge(1, "Survey Corps", "CAT1", "PRO", "o cara eh bom memo", "REQ1", R.drawable.survey_badge),
                    Badge(2, "Hunter Licensed", "CAT1", "PRO", "o cara eh bom memo", "REQ1", R.drawable.hunter),
                    Badge(3, "Survey Corps 2", "CAT2", "PRO", "o cara eh bom memo", "REQ1", R.drawable.survey_badge),
                    Badge(4, "Hunter Licensed 2", "CAT2", "PRO", "o cara eh bom memo", "REQ1", R.drawable.hunter),
                    Badge(5, "Survey Corps 3", "CAT3", "PRO", "o cara eh bom memo", "REQ1", R.drawable.survey_badge),
                    Badge(6, "Hunter Licensed 3", "CAT3", "PRO", "o cara eh bom memo", "REQ1", R.drawable.hunter)
            )
        }
    }
}