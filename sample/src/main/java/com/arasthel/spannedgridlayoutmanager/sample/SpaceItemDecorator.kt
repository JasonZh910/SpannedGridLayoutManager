package com.arasthel.spannedgridlayoutmanager.sample

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Jorge Martín on 2/6/17.
 */

class SpaceItemDecorator(val left: Int,
                         val top: Int,
                         val right: Int,
                         val bottom: Int): RecyclerView.ItemDecoration() {


    constructor(rect: Rect): this(rect.left, rect.top, rect.right, rect.bottom)

    constructor(space: Int): this(space, space, space, space)

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.left = this.left
        outRect.top = this.top
        outRect.right = this.right
        outRect.bottom = this.bottom
    }

}
