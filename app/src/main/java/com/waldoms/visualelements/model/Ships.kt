package com.waldoms.visualelements.model

import com.waldoms.visualelements.R

data class Ship(
    val name: String,
    val imageId: Int,
    val desc: String
)

fun getShips(): List<Ship>
{
    val ships = arrayListOf<Ship>()
    for (i in 0..5)
    {
        ships.add(Ship(names[i], imageIds[i], desc[i]))
    }

    return ships
}

val names = listOf(
    "Enterprise",
    "Defiant",
    "Discovery",
    "Reliant",
    "Star Gazer",
    "Delta Flyer"
)

val imageIds = listOf(
    R.drawable.enterpriserefit_900x596,
    R.drawable.maxresdefault,
    R.drawable.starships_star_trek_discovery_1628012114728,
    R.drawable.large_thumbnail,
    R.drawable.uss_stargazer,
    R.drawable.delta_flyer
)

val desc = listOf(
    "The starship Enterprise: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Neque egestas congue quisque egestas. Volutpat ac tincidunt vitae semper quis lectus nulla at. A iaculis at erat pellentesque. Consequat id porta nibh venenatis cras sed felis. Purus sit amet luctus venenatis lectus magna fringilla urna. Velit egestas dui id ornare arcu odio. Ut sem nulla pharetra diam. Leo vel fringilla est ullamcorper eget. Amet dictum sit amet justo donec enim. Dolor magna eget est lorem ipsum dolor sit amet. Pharetra vel turpis nunc eget lorem dolor sed. Cursus turpis massa tincidunt dui ut ornare. Risus ultricies tristique nulla aliquet enim tortor at. Sit amet est placerat in egestas erat imperdiet sed euismod. Proin libero nunc consequat interdum varius sit. Et tortor consequat id porta. Laoreet non curabitur gravida arcu ac.\n",
    "The starship Defiant: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Neque egestas congue quisque egestas. Volutpat ac tincidunt vitae semper quis lectus nulla at. A iaculis at erat pellentesque. Consequat id porta nibh venenatis cras sed felis. Purus sit amet luctus venenatis lectus magna fringilla urna. Velit egestas dui id ornare arcu odio. Ut sem nulla pharetra diam. Leo vel fringilla est ullamcorper eget. Amet dictum sit amet justo donec enim. Dolor magna eget est lorem ipsum dolor sit amet. Pharetra vel turpis nunc eget lorem dolor sed. Cursus turpis massa tincidunt dui ut ornare. Risus ultricies tristique nulla aliquet enim tortor at. Sit amet est placerat in egestas erat imperdiet sed euismod. Proin libero nunc consequat interdum varius sit. Et tortor consequat id porta. Laoreet non curabitur gravida arcu ac.\n",
    "The starship Discovery: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Neque egestas congue quisque egestas. Volutpat ac tincidunt vitae semper quis lectus nulla at. A iaculis at erat pellentesque. Consequat id porta nibh venenatis cras sed felis. Purus sit amet luctus venenatis lectus magna fringilla urna. Velit egestas dui id ornare arcu odio. Ut sem nulla pharetra diam. Leo vel fringilla est ullamcorper eget. Amet dictum sit amet justo donec enim. Dolor magna eget est lorem ipsum dolor sit amet. Pharetra vel turpis nunc eget lorem dolor sed. Cursus turpis massa tincidunt dui ut ornare. Risus ultricies tristique nulla aliquet enim tortor at. Sit amet est placerat in egestas erat imperdiet sed euismod. Proin libero nunc consequat interdum varius sit. Et tortor consequat id porta. Laoreet non curabitur gravida arcu ac.\n",
    "The starship Reliant: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Neque egestas congue quisque egestas. Volutpat ac tincidunt vitae semper quis lectus nulla at. A iaculis at erat pellentesque. Consequat id porta nibh venenatis cras sed felis. Purus sit amet luctus venenatis lectus magna fringilla urna. Velit egestas dui id ornare arcu odio. Ut sem nulla pharetra diam. Leo vel fringilla est ullamcorper eget. Amet dictum sit amet justo donec enim. Dolor magna eget est lorem ipsum dolor sit amet. Pharetra vel turpis nunc eget lorem dolor sed. Cursus turpis massa tincidunt dui ut ornare. Risus ultricies tristique nulla aliquet enim tortor at. Sit amet est placerat in egestas erat imperdiet sed euismod. Proin libero nunc consequat interdum varius sit. Et tortor consequat id porta. Laoreet non curabitur gravida arcu ac.\n",
    "The starship Star Gazer: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Neque egestas congue quisque egestas. Volutpat ac tincidunt vitae semper quis lectus nulla at. A iaculis at erat pellentesque. Consequat id porta nibh venenatis cras sed felis. Purus sit amet luctus venenatis lectus magna fringilla urna. Velit egestas dui id ornare arcu odio. Ut sem nulla pharetra diam. Leo vel fringilla est ullamcorper eget. Amet dictum sit amet justo donec enim. Dolor magna eget est lorem ipsum dolor sit amet. Pharetra vel turpis nunc eget lorem dolor sed. Cursus turpis massa tincidunt dui ut ornare. Risus ultricies tristique nulla aliquet enim tortor at. Sit amet est placerat in egestas erat imperdiet sed euismod. Proin libero nunc consequat interdum varius sit. Et tortor consequat id porta. Laoreet non curabitur gravida arcu ac.\n",
    "The spacecraft Delta Flyer: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Neque egestas congue quisque egestas. Volutpat ac tincidunt vitae semper quis lectus nulla at. A iaculis at erat pellentesque. Consequat id porta nibh venenatis cras sed felis. Purus sit amet luctus venenatis lectus magna fringilla urna. Velit egestas dui id ornare arcu odio. Ut sem nulla pharetra diam. Leo vel fringilla est ullamcorper eget. Amet dictum sit amet justo donec enim. Dolor magna eget est lorem ipsum dolor sit amet. Pharetra vel turpis nunc eget lorem dolor sed. Cursus turpis massa tincidunt dui ut ornare. Risus ultricies tristique nulla aliquet enim tortor at. Sit amet est placerat in egestas erat imperdiet sed euismod. Proin libero nunc consequat interdum varius sit. Et tortor consequat id porta. Laoreet non curabitur gravida arcu ac.\n"
)