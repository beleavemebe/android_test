package com.sirius.test_app

class DataModel(
    val image: String = "https://i.ibb.co/37KzF03/img-background.png",
    val logo: String = "https://i.ibb.co/56RYwXW/dotkalogo.png",
    val name: String = "DoTA 2",
    val rating: Float = 4.9f,
    val gradeCnt: String = "70M",
    val tags: List<String> = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
    val description: String = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
    val reviews: List<ReviewModel> = listOf(
        ReviewModel(
            userImage = "https://i.ibb.co/Hr8b3ms/img-user-1.png",
            userName = "Auguste Conte",
            date = "February 14, 2019",
            message = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        ),
        ReviewModel(
            userImage = "https://i.ibb.co/mRph0tF/img-user-2.png",
            userName = "Jang Marcelino",
            date = "February 14, 2019",
            message =
            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    ),
    val action: ActionModel = ActionModel(
        name = "Install",
        action = "action_install"
    )

)

class ReviewModel(
    val userImage: String,
    val userName: String,
    val date: String,
    val message: String
)

class ActionModel(
    val name: String,
    val action: String
)