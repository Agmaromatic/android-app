/*
 * Copyright (C) 2018 The Tachiyomi Open Source Project
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package tachiyomi.domain.category

data class Category(
  val id: Long = -1,
  val name: String = "",
  val order: Int = 0,
  val flags: Int = 0
) {

  val isUncategorized get() = id == UNCATEGORIZED_ID
  val isAll get() = id == ALL_ID

  val isSystemCategory get() = isUncategorized || isAll

  companion object {
    const val ALL_ID = -2L
    const val UNCATEGORIZED_ID = 0L
  }

}