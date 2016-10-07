/*
 * Copyright 2016 eneim@Eneim Labs, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.ene.toro.sample.presentation.basic3;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import im.ene.toro.ToroAdapter;

/**
 * Created by eneim on 6/29/16.
 *
 * A sample {@link RecyclerView.ViewHolder} skeleton.
 */
public abstract class Basic3ViewHolder extends ToroAdapter.ViewHolder {

  static int TYPE_VIDEO = 1;

  static int TYPE_NORMAL = 2;

  public Basic3ViewHolder(View itemView) {
    super(itemView);
  }

  public abstract void bind(RecyclerView.Adapter adapter, Object item);

  /**
   * Setup click listener to current ViewHolder. {@link RecyclerView.ViewHolder#itemView} will
   * catch the event by default. Override this to setup proper Views to receive the click event.
   */
  public void setOnItemClickListener(View.OnClickListener listener) {
    this.itemView.setOnClickListener(listener);
  }

  /**
   * Setup long click listener to current ViewHolder. {@link RecyclerView.ViewHolder#itemView} will
   * catch the event by default. Override this to setup proper Views to receive the click event.
   */
  public void setOnItemLongClickListener(View.OnLongClickListener listener) {
    this.itemView.setOnLongClickListener(listener);
  }
}