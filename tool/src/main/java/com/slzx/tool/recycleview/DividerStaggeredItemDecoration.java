package com.slzx.tool.recycleview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/**
 * Content 瀑布流
 * Created by yxa512 on 2017/10/27.
 */

public class DividerStaggeredItemDecoration extends RecyclerView.ItemDecoration {

    private int space = 0;
    private int num;

    public DividerStaggeredItemDecoration(int space, int num) {
        this.space = space;
        this.num = num;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        outRect.top = space;

        StaggeredGridLayoutManager.LayoutParams params = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        /**
         * 根据params.getSpanIndex()来判断左右边确定分割线
         * 第一列设置左边距为space，右边距为space/2  （第二列反之）
         */
        if (params.getSpanIndex() % num == 0) {
            outRect.left = space;
            outRect.right = space / num;
        } else {
            outRect.left = space / num;
            outRect.right = space;
        }
    }
}
