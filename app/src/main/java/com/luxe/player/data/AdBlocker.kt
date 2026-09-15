package com.luxe.player.data
object AdBlocker {
  private val blocked = listOf(
    "doubleclick.net",
    "popads.net",
    "exoclick.com",
    "adsterra.com"
  )
  fun shouldBlock(url: String): Boolean {
    return blocked.any { url.contains(it) }
  }
}
